package com.liuwei.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.liuwei.dao.EmpDao;
import com.liuwei.service.EmpService;
import com.liuwei.testEntity.Emp;

@Service("empService")
public class EmpServiceImpl implements EmpService{

	@Autowired
	private EmpDao empDao;
	
	@Override
	public List<Emp> selectAllEmp() {
		// TODO Auto-generated method stub
		System.out.println();
		return empDao.getAllUser();
	}
	@Override
	@Transactional
	public void testTransation() {
		// TODO Auto-generated method stub
		Emp emp = new Emp();
		emp.setEmpno((int)Math.random()*1000);
		emp.setEname("test");
		emp.setJob("test");
		emp.setHiredate(new Date());
		emp.setSal(888f);
		empDao.addEmp(emp);
//		throw new RuntimeException();
	}

}
