package com.liuwei.service.impl;

import java.util.ArrayList;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("myUserDetailsService")  
public class MyUserDetailsService implements UserDetailsService {  
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {  
        ArrayList<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();  
        authorities.add(new SimpleGrantedAuthority("ROLE_USER"));  
        if(s.compareTo("lipore")==0){  
            return new User(s,"123456",authorities);  
        }else if(s.compareTo("admin")==0){  
            authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));  
            return new User(s,"123456",authorities);  
        }  
        return null;  
    }  
}  