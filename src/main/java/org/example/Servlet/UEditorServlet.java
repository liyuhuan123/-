//package org.example.Servlet;
//
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.net.URL;
//import java.net.URLDecoder;
//
///**
// * ueditor富文本表及其图片上传
// * 1.修改idea中Tomcat配置的应用上下文路径,maven中的finalName
// * 2.修改webapp/static/ueditor.config.is,3行修改
// * (应用上下文路径+服务路径)
// * 3.实现后端接口(和第二步的服务路径一致)
// * 4.修改config.json配置:上传图片到服务器本地的路径,及访问的主机ip,port,应用上下文路径
// * 5.idea运行时,需要噢诶之Tomcat,将Tomcat/webapps路径下的项目都部署
// */
//@WebServlet("/ueditor")
//public class UEditorServlet extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        doPost(req, resp);
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//       URL url = UEditorServlet.class.getClassLoader().getResource("config.json");
//       //URL
//        String path = URLDecoder.decode(url.getPath(),"UTF-8");
//        MyActionEnter enter = new MyActionEnter(req,path);
//        String exec = enter.exec();
//        PrintWriter pw = resp.getWriter();
//        pw.println(exec);
//        pw.flush();
//        pw.close();
//    }
//}
