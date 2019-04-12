package com.guotao.www.controller;

import com.guotao.www.entity.Content;
import com.guotao.www.service.ContentService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 获取单篇博文操作的Servlet
 * GuoT 19.4.3
 */
public class GetOneContentServlet extends HttpServlet {

    ContentService contentService = new ContentService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String contentId = request.getParameter("contentId");
        String currentPage = request.getParameter("currentPage");
        String flag = request.getParameter("flag");
        Content oneContent = contentService.getOneContent(contentId);
        //TODO 返回给前端 19.4.3 之后
        request.setAttribute("oneContent", oneContent);
        request.setAttribute("currentPage", currentPage);
        request.setAttribute("flag", flag);
        request.getRequestDispatcher("/contentDetail.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
