package com.example.wanchengdemo.controller.data;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.wanchengdemo.commom.IdGetSnowflake;
import com.example.wanchengdemo.commom.R;
import com.example.wanchengdemo.entity.Project;
import com.example.wanchengdemo.entity.Section;
import com.example.wanchengdemo.entity.Segment;
import com.example.wanchengdemo.entity.Site;
import com.example.wanchengdemo.service.dataService.SectionService;
import com.example.wanchengdemo.service.dataService.SegmentService;
import com.example.wanchengdemo.service.dataService.SiteService;
import com.example.wanchengdemo.util.FileRead;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

@RestController
@RequestMapping("/common")
@Slf4j
public class CommonController {

    @Autowired
    SectionService sectionService;

    @Autowired
    SegmentService segmentService;

    @Autowired
    SiteService siteService;


    /*
    * 文件上传
    *
    */
    //值在application.yml 中， 此 为文件上传 后保存路径
    @Value("${file.upload.path}")
    private String path;

    @GetMapping("/")
    public String uploadPage() {
        return "upload";
    }

    @PostMapping("/upload")
    @ResponseBody
    public String create(@RequestPart MultipartFile file,Project project,  Section section, Segment segment, Site site) throws IOException {
        //将文件保存至本地
        String fileName = file.getOriginalFilename();
        String filePath = path + fileName;

        File dest = new File(filePath);
        Files.copy(file.getInputStream(), dest.toPath());

        //读取本地文件
        String sourceData = FileRead.txt2String(dest);

        //清洗 section 数据,传入pid
        //预设pid = 1584087247165063168
        project.setPid("1584087247165063168");
        Section sectionClean = FileRead.sectionClean(sourceData);
        sectionClean.setSpid(project.getPid());

        //清洗 segment 数据
        Segment segmentClean = FileRead.segmentClean(sourceData);

        //清洗 site 数据
        List siteClean = FileRead.siteClean(sourceData);
        System.out.println(siteClean);  //显示返回site信息



        //插入数据库


        //section导入,随后返回sectionid
        //雪花生成section主键
        IdGetSnowflake idGetSnowflake = new IdGetSnowflake();
        long snowflakeId = idGetSnowflake.snowflakeId();
        sectionClean.setSid(String.valueOf(snowflakeId));
        sectionService.save(sectionClean);

        //返回sectionId
        LambdaQueryWrapper<Section> sectionLambdaQueryWrapper = new LambdaQueryWrapper<>();
        sectionLambdaQueryWrapper.eq(Section::getSname,sectionClean.getSname());
        Section one = sectionService.getOne(sectionLambdaQueryWrapper);
        String sectionId = one.getSid();

        //segment导入,雪花生成id
        segmentClean.setSegid(String.valueOf(snowflakeId));
        segmentClean.setSegsid(sectionId);
        segmentService.save(segmentClean);




        return "Upload file success : " + dest.getAbsolutePath();
    }




    /*
    * 文件导入数据库
    * */
/*    @PostMapping("/up2Mysql")
    public R<String> fileUp2Mysql(String pid, Section section, Segment segment, Site site){

        String filePaht = "";
        File file = new File(filePaht);
        String txt2String = FileRead.txt2String(file);



        return null;
    }*/
}
