package com.guotao.www.controller;

import com.guotao.www.entity.UserInformation;
import com.guotao.www.service.UserInformationService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 进行注册操作的Servlet
 * GuoT 19.4.3
 */
public class UserRegisterServlet extends HttpServlet {

    UserInformationService userInformationService = new UserInformationService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String imageCode = request.getParameter("imageCode");
        String email = request.getParameter("email");
        HttpSession session = request.getSession();
        String code = (String) session.getAttribute("imageCode");
        if(code.equals(imageCode)) {
        // 测试时使用
//            if(1 == 1) {
            UserInformation userInformation = new UserInformation(username, password, email);
            userInformationService.insertUserInformation(userInformation);
            response.sendRedirect(request.getContextPath() + "/orderLogin.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
