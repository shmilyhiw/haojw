package com.xj.test;

/**
 * @Author Hao, Jiawei
 * @Date 2022/4/7 17:30
 */
public class Test {
    public static void main(String[] args) {

        String filePath = "F:\\\\workspace\\\\JAVA\\\\workspace3\\\\";

        String path = "F:\\workspace\\JAVA\\workspace3\\report\\4fd38b6693db4c5e8e8c0fb37c41fd18\\2132.docx";

        String result = path.replaceAll(filePath, "");

        System.out.println(result);


    }
}
