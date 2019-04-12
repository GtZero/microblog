package com.guotao.www.controller;

import com.guotao.www.entity.Content;
import com.guotao.www.service.ContentService;
import com.guotao.www.util.PageBean;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 获取所有用户的所有博文的Servlet
 * GuoT 19.4.3
 */
public class GetAllContentInLoginServlet extends HttpServlet {

    ContentService contentService = new ContentService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String currentPage = request.getParameter("currentPage");
        String pageSize = request.getParameter("pageSize");
        PageBean<Content> pageBean = new PageBean<>();
        pageBean.setCurrentPage(new Integer(currentPage));
        pageBean.setPageSize(new Integer(pageSize));
        pageBean = contentService.getAllContent(pageBean);
        request.setAttribute("pageBean", pageBean);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
