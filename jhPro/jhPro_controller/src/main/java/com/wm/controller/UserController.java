package com.wm.controller;

import com.wm.bean.User;
import com.wm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class UserController {
    
	@Autowired
    UserService us;
	
	@RequestMapping("getu")
	public String getU(Model m,int id) {
		User user = us.getUserBYId(id);
		m.addAttribute("u", user);
		return "index";
	}
	
}
