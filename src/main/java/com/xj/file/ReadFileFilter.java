//package com.xj.file;
//
//import jakarta.servlet.*;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.Enumeration;
//
////@WebFilter("/readFile")
//public class ReadFileFilter implements Filter {
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//        System.out.println("~~~~~~~~~~过滤器拦截~~~~~~~");
//    }
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//
//        System.out.println("~~~~~~~~~~过滤器拦截~~~~~~~");
//
//
//        HttpServletRequest req = (HttpServletRequest) servletRequest;
//        HttpServletResponse resp = (HttpServletResponse) servletResponse;
//
//        //获得所有请求参数名
//        Enumeration<String> names = req.getParameterNames();
//
//        //用于拼接参数值
//        StringBuffer content = new StringBuffer("");
//        while(names.hasMoreElements()){
//            //得到参数名
//            String name = names.nextElement();
//            String value = req.getParameter(name);
//            content.append(value);
//        }
//
//        System.out.println(content);
//
//        filterChain.doFilter(req, resp);
//    }
//
//    @Override
//    public void destroy() {
//
//    }
//}
