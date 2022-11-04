package com.example.wanchengdemo.util;


import com.example.wanchengdemo.entity.Site;

import java.io.*;


import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Txttest {
    /**
     * 读取txt文件的内容
     * @param file 想要读取的文件对象
     * @return 返回文件内容
     */
/*    public static String txt2String(File file){
        StringBuilder result = new StringBuilder();
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));//构造一个BufferedReader类来读取文件
            String s = null;
            while((s = br.readLine())!=null){//使用readLine方法，一次读一行
                result.append(System.lineSeparator()+s);
            }
            br.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return result.toString();
    }

    public static void main(String[] args){
//        File file = new File("C:\\Users\\young\\OneDrive\\桌面\\弯沉\\测试数据\\赫六6标.txt");
          File file = new File("D:\\歌词\\江湖流.txt");
        System.out.println(txt2String(file));
    }*/

    public static String txt2String(File file){
        StringBuilder result = new StringBuilder();
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file),"UTF-8"));//构造一个BufferedReader类来读取文件
            String s = null;
            while((s = br.readLine())!=null){//使用readLine方法，一次读一行
                result.append(System.lineSeparator()+s);
            }
            br.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return result.toString();
    }

    public static void main(Site site){
        File file = new File("D:\\Project\\source\\赫六5标2.txt");

        String data = txt2String(file);


        //获得检测合同
        String regSection = "文件名.*弯沉测试数据.(.*).txt";
        //获得检测日期
        String regDate= "检测日期：(.*)";
        //获得检测人员
        String regMan= "检测人员：(.*)";
        //获得检测段落
        String regSegment= "检测段落：([a-zA-Z0-9+-]*)";
        //获得路幅
        String regRoadWay = "路幅：([左右]幅)";
        //获得桩号处理
        String regRoadHandle = "桩号处理：([顺逆]桩号)";
        //获得交工验收弯沉值
        String regDesign= "交工验收弯沉值（0.01mm）：([0-9]*)";
        //获得路面温度
        String regPavement_tp = "路面温度（°C）：([0-9]*)";
        //获得弯沉数据
        String regData= "([A-Z][0-9]{4}[+][0-9]{3}\t[m]\t[0-9]*\t[0-9]*\t[0-9]*\t[0-9]*\t[0-9]*\t[0-9]*)";

        String[] regArgs = {regSection,regDate,regMan,regSegment,regRoadWay,regRoadHandle,regDesign,regPavement_tp};

        for (String reg : regArgs) {
            Pattern pattern = Pattern.compile (reg);
            Matcher matcher = pattern.matcher (data);

            while (matcher.find()){
                System.out.println(matcher.group(1));

            }
        }


    }




}

