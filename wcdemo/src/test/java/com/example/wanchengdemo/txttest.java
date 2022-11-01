package com.example.wanchengdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class txttest {
    /**
     * 读取txt文件的内容
     * @param file 想要读取的文件对象
     * @return 返回文件内容
     */
    public static String txt2String(File file){
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
        File file = new File("C:\\Users\\young\\OneDrive\\桌面\\弯沉\\测试数据\\赫六6标.txt");
        System.out.println("你好");
        System.out.println(txt2String(file));
    }
}
