package com.liuwei.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.liuwei.service.SecurityTestService;

public class DemoTestServlet extends HttpServlet{
	
	@Autowired
	private SecurityTestService securityTestService;
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		System.out.println("创建时间");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("我是分界线： --------------------------------");
		if(securityTestService != null) {
			securityTestService.sayGoodBye("刘伟");
			securityTestService.sayHello("小样儿");
		}else {
			System.out.println("获取不到注入的bean");
			ApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(request.getServletContext());
			SecurityTestService securityTestService = (SecurityTestService) ac.getBean("securityTestService");
			securityTestService.sayGoodBye("刘伟");
			securityTestService.sayHello("小样儿");
		}
		System.out.println("我是收割线： --------------------------------");
		response.getWriter().write("DemoTestServlet");
	}
}
