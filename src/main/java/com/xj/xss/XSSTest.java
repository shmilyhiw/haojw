package com.xj.xss;


import org.apache.commons.text.StringEscapeUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class XSSTest extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String encoding = req.getCharacterEncoding();


        super.doPost(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setHeader("Content-type", "text/html;charset=UTF-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");


        String data = req.getParameter("data");

        data = StringEscapeUtils.escapeHtml4(data);// < =》 &lt;  > =》 &gt;
        data = StringEscapeUtils.escapeEcmaScript(data);//对js脚本的转义


//        Cookie username1 = new Cookie("username", username);
//        Cookie password1 = new Cookie("password", password);
//
//        resp.addCookie(username1);
//        resp.addCookie(password1);

//        Cookie[] cookies = req.getCookies();
//
//        if (cookies != null) {
//            Cookie cookie = cookies[0];
//            if (cookie != null) {
//                String value = cookie.getValue();
//                StringBuilder builder = new StringBuilder();
//                builder.append("JSESSIONID=" + value + "; ");
//                builder.append("username=" + username + "; ");
//                builder.append("password=" + password + "; ");
//                builder.append("Secure; ");
//                builder.append("HttpOnly; ");
//                resp.setHeader("Set-Cookie", builder.toString());
//            }
//        }
        resp.getWriter().print(data);
        resp.getWriter().print("登录成功");

        //resp.sendRedirect("~~~~~~~~~~~~~~~");
    }
}
