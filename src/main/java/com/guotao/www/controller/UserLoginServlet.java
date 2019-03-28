package com.guotao.www.controller;

import com.guotao.www.dto.UserLoginDTO;
import com.guotao.www.entity.UserInformation;
import com.guotao.www.service.UserInformationService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * GuoT 19.3.28
 * 用于处理用户登陆请求
 */
public class UserLoginServlet extends HttpServlet {

    UserInformationService userInformationService = new UserInformationService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if ("".equals(username) || username == null){
            req.setAttribute("message","用户名不能为空");
            return;
        }
        if ("".equals(password) || password == null){
            req.setAttribute("message","密码不能为空");
            return;
        }
        UserLoginDTO userLoginDTO = userInformationService.getUserInformationByLogin(username, password);
        if(userLoginDTO == null){
            req.setAttribute("message","用户名或密码填写错误");
            return;
        }
        HttpSession session = req.getSession();
        session.setAttribute("User", userLoginDTO);
        //TODO 写博客首页地址 19.3.27 19.4.5
        resp.sendRedirect("");
    }
}
