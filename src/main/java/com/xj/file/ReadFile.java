package com.xj.file;




import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * 任意读取文件漏洞
 */
//@WebServlet("/readFile")
public class ReadFile extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("~~~~~~~~~~doPost~~~~~~拦截~~~~~~~~~~~~~");
    }


    //遍历当前目录下的所有文件
    private static void listAll(File file,int level, HttpServletResponse resp) throws IOException {
        resp.setHeader("Content-type", "text/html;charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");
        System.out.println(getSapce(level, resp)+file.getName());
        //获取指定目录下，所有的文件对象和文件名
        File[] f = file.listFiles();
        level++;
        for(File ff : f){
            if(ff.isDirectory()){
                listAll(ff,level, resp);
            }else
                resp.getWriter().print(getSapce(level, resp) + ff.getAbsolutePath() + "<br>");
                System.out.println(getSapce(level, resp) + ff.getAbsolutePath());
        }
    }

    public static String getSapce(int level, HttpServletResponse resp) throws IOException {
        StringBuilder sb = new StringBuilder();
        for(int x=0;x<level;x++){
            sb.append("|----");
        }
        return sb.toString();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setHeader("Content-type", "text/html;charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");
        System.out.println("~~~~~~~~~doGet~~~~~~~拦截~~~~~~~~~~~~~");

        //String fileName = req.getParameter("fileName");
        String fileName = req.getParameter("fileName").replace("../", "");
        System.out.println(fileName);

        File file = new File(fileName);

        System.out.println(file.getAbsolutePath());


        //重命名文件
        if(file.exists()){
            file.renameTo(new File("D:\\file\\aaa\\bbb\\333.txt"));
            resp.getWriter().print("重命名文件成功！");
        }










        //目录创建
//        if(!file.exists()){
//            file.mkdirs();
//            resp.getWriter().print("创建成功！");
//        }







        //遍历所有文件
        //listAll(new File(fileName), 0, resp);










        //删除文件或者目录
//        if(file.exists()){
//            file.delete();
//            resp.getWriter().print("删除成功！");
//        } else {
//            resp.getWriter().print("请输入正确的文件地址！");
//        }














//        //读取文件
//        BufferedInputStream bis = null;
//        try {
//            bis = new BufferedInputStream(new FileInputStream(fileName));
//        } catch (FileNotFoundException e) {
//            resp.getWriter().print("aaa请出入正确的路径！");
//        }
//        //读取数据
//        //一次性读取多少个数据
//        byte[] bytes = new byte[1024];
//        int len;
//        //循环读取数据
//        while ((len = bis.read(bytes, 0, bytes.length)) != -1) {
//            String str = new String(bytes, 0, len, "UTF-8");
//            System.out.println(str);
//
//            //返回给页面
//            resp.getWriter().print(str);
//
//            bis.close();
//        }



    }


}
