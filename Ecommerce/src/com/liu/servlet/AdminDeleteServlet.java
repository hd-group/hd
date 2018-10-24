package com.liu.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/AdminDeleteServlet.do")
public class AdminDeleteServlet extends HttpServlet {
    private String encoding;

    @Override
    public void init(ServletConfig config) throws ServletException {
        encoding = config.getServletContext().getInitParameter("encoding");
        if (encoding == null) {
            encoding = "UTF-8";
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
