package org.example.Servlet;

import org.example.dao.ArticleDAO;
import org.example.model.Article;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/articleDetail")
public class ArticleDetailServlet extends AbstractBaseServlet{

    @Override
    protected Object process(HttpServletRequest req, HttpServletResponse resp) throws IOException, Exception {
        String id = req.getParameter("id");
        Article a = ArticleDAO.query(Integer.parseInt(id));
        return a;
    }
}
