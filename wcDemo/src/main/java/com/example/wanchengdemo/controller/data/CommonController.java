package com.example.wanchengdemo.controller.data;

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
    public String create(@RequestPart MultipartFile file, String pid, Section section, Segment segment, Site site) throws IOException {
        //将文件保存至本地
        String fileName = file.getOriginalFilename();
        String filePath = path + fileName;

        File dest = new File(filePath);
        Files.copy(file.getInputStream(), dest.toPath());

        //读取本地文件
        String sourceData = FileRead.txt2String(dest);

        //清洗 section 数据
        Section sectionClean = FileRead.sectionClean(sourceData);

        //清洗 segment 数据
        Segment segmentClean = FileRead.segmentClean(sourceData);


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
