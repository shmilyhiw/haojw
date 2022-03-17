package com.xj.file;

public class Test1 {
    public static void main(String[] args) {
//        String regex = "..\\" + "";
//        System.out.println(regex);
//        System.out.println("!!!!!!!!!!!!!!!!!!!");

        String str = "haojw%0d%0aContent-Length:%200%0d%0a%0d%0aHTTP/1.1%20200%20OK%0d%0aContent-Type:%20text/html%0d%0aContent-Length:%2019%0d%0a%0d%0a<html>Shamaz</html>";
        System.out.println(str.replaceAll("%0a", "").replaceAll("%0d", ""));
        System.out.println(str.replaceAll("%0d", ""));

        String data = "%0a123%0d456";

        data.replaceAll("%0d", "");//\r
        data.replaceAll("%0a", "");//\n

        //resp.addHeader("Location", "http://localhost:8080/success.jsp?lang=" + data);


        System.out.println(data);



    }
}
