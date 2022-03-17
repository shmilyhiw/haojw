package com.xj.http;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Map;

public class HttpTest extends HttpServlet {



    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setHeader("Content-type", "text/html;charset=UTF-8");


        StringBuilder sb = new StringBuilder();
        BufferedReader reader = req.getReader();
        String str;
        while((str = reader.readLine()) != null){
            sb.append(str);
        }
        reader.close();

        resp.getWriter().print(sb.toString());
        resp.getWriter().print("测试获取http请求的body数据");
    }



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //Map<String, String> getenv = System.getenv();

        //String add = System.getenv("ADD");

        String data = req.getParameter("data");

        data = data.replaceAll("%0a", "").replaceAll("%0d", "");

        resp.addHeader("Location", "http://localhost:8080/success.jsp?lang=" + data);

        //System.out.println(add);
        System.out.println(data);
        resp.getWriter().print(data);

    }



}
