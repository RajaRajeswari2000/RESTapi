package com.rajarajeswari.spring.boot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rajarajeswari.spring.boot.entity.User;
import com.rajarajeswari.spring.boot.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService service;

	/*@RequestMapping("product")
	public String userRegistration() {
		return "register";
	}*/
	
	@RequestMapping("/userDetails" )
	public String details(@ModelAttribute User user,ModelMap m) {
		m.addAttribute("detail", user);
	    service.saveDetails(user);
		
		return "register";
	}

}
