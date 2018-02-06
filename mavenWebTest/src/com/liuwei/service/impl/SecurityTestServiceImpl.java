package com.liuwei.service.impl;

import org.springframework.stereotype.Service;

import com.liuwei.service.SecurityTestService;

@Service("securityTestService")
public class SecurityTestServiceImpl implements SecurityTestService {


	public void sayHello(String name) {
		System.out.println("hello: "+name);
		
	}

	public void sayGoodBye(String name) {
		System.out.println("GoodBye: "+name);
		
	}

}
