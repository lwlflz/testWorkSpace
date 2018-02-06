package com.liuwei.control;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
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
	
	@RequestMapping(value="/loginOut",method=RequestMethod.GET)
	public String loginOut() {
		return "login";
	}
	
	
	@RequestMapping("welcome")
	public String welcome(Model model,HttpServletRequest req) {
		SecurityContext context = SecurityContextHolder.getContext();
		Authentication authentication = context.getAuthentication();
		Object principal = authentication.getPrincipal();
		if(principal instanceof UserDetails) {
			UserDetails userDetails = (UserDetails) principal;
			String username = userDetails.getUsername();
			String password = userDetails.getPassword();
			Collection<? extends GrantedAuthority> authorities = userDetails.getAuthorities();
			Class<? extends UserDetails> class1 = userDetails.getClass();
			System.out.println("username="+username);
			System.out.println("password="+password);
			System.out.println("authorities="+authorities);
			System.out.println("class1="+class1);
			  req.setAttribute("username",username);
		}else {
			System.out.println("获取用户信息失败了");
		}
		
		
//		Object principal = principal;
//		SecurityContextHolder.getContext();
		
		//		String username = principal instanceof String ?  
//                (String) principal :  "名臣不是String";  
//         req.setAttribute("username",username);
//        model.addAttribute("username",username);  
//        System.out.println("----------当前系统用户的名字="+username);
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
