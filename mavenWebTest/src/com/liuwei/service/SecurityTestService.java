package com.liuwei.service;

import org.springframework.security.access.annotation.Secured;

public interface SecurityTestService {
	
	@Secured("ROLE_ADMIN")
	public void sayHello(String name);
	@Secured({"ROLE_USER","ROLE_ADMIN"})
	public void sayGoodBye(String name);
}
