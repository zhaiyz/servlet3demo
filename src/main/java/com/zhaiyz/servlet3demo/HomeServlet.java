package com.zhaiyz.servlet3demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 首页Servlet
 * 
 * @author zhaiyz
 */
@WebServlet(name = "home", urlPatterns = { "/home" })
public class HomeServlet extends HttpServlet {

    private static final long serialVersionUID = 9034504782748059507L;

    /*
     * (non-Javadoc)
     * 
     * @see
     * javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest
     * , javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("Servlet annotation work!");
    }

}
