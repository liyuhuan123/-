package org.example.Servlet;

import org.example.dao.ArticleDAO;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/articleDelete")
public class ArticleDeleteServlet extends AbstractBaseServlet{

    @Override
    protected Object process(HttpServletRequest req, HttpServletResponse resp) throws IOException, Exception {
        String ids = req.getParameter("ids");
        int num = ArticleDAO.delete(ids.split(","));
        return null;
    }
}
