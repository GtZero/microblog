package com.guotao.www.controller;

import com.guotao.www.dto.UserLoginDTO;
import com.guotao.www.entity.Content;
import com.guotao.www.service.ContentService;
import com.guotao.www.util.PageBean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 获取特定用户的所有博文的Servlet
 * GuoT 19.4.3
 */
public class GetUserAllContentServlet extends HttpServlet {

    ContentService contentService = new ContentService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String currentPage = request.getParameter("currentPage");
        PageBean<Content> pageBean = new PageBean<>();
        pageBean.setCurrentPage(new Integer(currentPage));

        HttpSession session = request.getSession();
        UserLoginDTO userLoginDTO = (UserLoginDTO) session.getAttribute("UserLogin");
        pageBean = contentService.getUserAllContent(userLoginDTO.getUserId(), pageBean);
        //TODO 返回给前端 19.4.3 之后
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
