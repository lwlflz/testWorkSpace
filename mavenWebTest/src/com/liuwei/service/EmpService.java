package com.liuwei.service;

import java.util.List;

import com.liuwei.testEntity.Emp;

public interface EmpService {
	
	List<Emp> selectAllEmp();
	
	void testTransation();
}
