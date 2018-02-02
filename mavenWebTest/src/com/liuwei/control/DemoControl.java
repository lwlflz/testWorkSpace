package com.liuwei.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.liuwei.service.EmpService;
import com.liuwei.testEntity.Emp;

@Controller
@RequestMapping("/demo")
public class DemoControl {

	@Autowired
	private EmpService empService;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String listTeacher(Model model,HttpServletResponse response) throws IOException{
//        model.addAttribute("teachers",teacherService.getTeachers());
//        response.getWriter().write("springMVC ���ʳ¹�");
    	empService.testTransation();
    	
    	List<Emp> selectAllEmp = empService.selectAllEmp();
    	System.out.println("springMVC 访问陈宫");
    	for (Emp emp : selectAllEmp) {
    		System.out.println("springMVC 访问陈宫");
			System.out.println(emp.getEname());
		}
        return "NewFile";
    }

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String addTeacher(){
        return "addTeacher";
    }
}