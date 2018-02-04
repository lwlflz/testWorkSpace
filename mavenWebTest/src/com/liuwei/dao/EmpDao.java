package com.liuwei.dao;

import java.util.List;

import com.liuwei.testEntity.Emp;

public interface EmpDao {
	List<Emp> getAllUser();
	void addEmp(Emp emp);
	
	void updateEmp(Emp emp);
}
