package com.liuwei.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FilterChainDemo implements FilterChain {

	int i = 5;
	@Override
	public void doFilter(ServletRequest req, ServletResponse res) throws IOException, ServletException {
		if(i > 0) {
			System.out.println("���ǹ�������"+i);
			Demo2Filer demo2 = new Demo2Filer();
			System.out.println("ִ�й���ǰ");
			i--;
			demo2.doFilter(req, res, this);
			System.out.println("ִ�й��˺�");
			
		}
			
		
	}

}
