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
        String pageSize = request.getParameter("pageSize");
        PageBean<Content> pageBean = new PageBean<>();
        pageBean.setCurrentPage(new Integer(currentPage));
        pageBean.setPageSize(new Integer(pageSize));

        HttpSession session = request.getSession();
        UserLoginDTO userLoginDTO = (UserLoginDTO) session.getAttribute("User");
        if ("1".equals(userLoginDTO.getRoleId())) {
            pageBean = contentService.getUserAllContent(userLoginDTO.getUserId(), pageBean);
            request.setAttribute("pageBean", pageBean);
        }
        if ("2".equals(userLoginDTO.getRoleId())) {
            pageBean = contentService.getAllContent(pageBean);
            request.setAttribute("pageBean", pageBean);
        }
        request.getRequestDispatcher("/portfolio.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
