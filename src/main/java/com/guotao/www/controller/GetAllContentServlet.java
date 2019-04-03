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
public class GetAllContentServlet extends HttpServlet {

    ContentService contentService = new ContentService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String currentPage = request.getParameter("currentPage");
        PageBean<Content> pageBean = new PageBean<>();
        pageBean.setCurrentPage(new Integer(currentPage));
        pageBean = contentService.getAllContent(pageBean);
        //TODO 返回给前端 19.4.3 之后
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
