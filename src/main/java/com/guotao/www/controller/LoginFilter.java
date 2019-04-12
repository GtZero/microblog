package com.guotao.www.controller;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginFilter implements Filter{

	public void destroy()
		{
			
		}

	public void doFilter(ServletRequest arg0, ServletResponse arg1,
						 FilterChain arg2) throws IOException, ServletException
		{
			HttpServletRequest req = (HttpServletRequest)arg0;
			HttpSession session = req.getSession();
			String requestURI = req.getRequestURI();
			if(requestURI.endsWith("register.jsp")||requestURI.endsWith("userLogin.jsp")
					||requestURI.endsWith("orderLogin.jsp")||requestURI.endsWith("/user/login/code")
					||requestURI.endsWith("/user/login")||requestURI.endsWith("/user/register")
                    ||requestURI.contains("/css")||requestURI.contains("/js")||requestURI.contains("/fonts")||requestURI.contains("/images")){
				arg2.doFilter(arg0,arg1);
				return;
			}
			
			if(null==session.getAttribute("User")){
				((HttpServletResponse)arg1).sendRedirect(req.getContextPath()+"/userLogin.jsp");
				return;
			}
			else{
				arg2.doFilter(arg0,arg1);
				return;
			}
		}

	public void init(FilterConfig arg0) throws ServletException
		{
			
		}

}