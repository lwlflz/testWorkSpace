package com.liuwei.control;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Login {
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login() {
		return "login";
	}
	
	@RequestMapping("welcome")
	public String welcome(Model model) {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String username = principal instanceof String ?  
                (String) principal :  "名臣不是String"
                ;  
        model.addAttribute("username",username);  
        return "welcome";
	}
	
	
	@RequestMapping("/user")  
    @ResponseBody  
    public String userInfo() {  
        return "you have user role";  
    }  
  
    @RequestMapping("/admin/info")  
    @ResponseBody  
    public String info(){  
        return "you have role admin";  
    }  
}