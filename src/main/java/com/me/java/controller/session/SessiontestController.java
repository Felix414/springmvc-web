package com.me.java.controller.session;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.me.java.util.WebUtils;

@Controller
@RequestMapping("/session")
public class SessiontestController {

	@RequestMapping("/login")
	public String login(){
		
		return "session/login";
	}
	
	
	@RequestMapping("/dologin")
	public String dologin(){
		String username = WebUtils.getParameter("username");
		String password = WebUtils.getParameter("password");
		
		WebUtils.getSession().setAttribute("userName", username);
		WebUtils.getSession().setAttribute("passWord", password);
		
		return "redirect:/session/getsession";
	}
	
	@RequestMapping("/getsession")
	public String getsession(Model model){
		model.addAttribute("username", WebUtils.getSession().getAttribute("userName"));
		return "session/online";
	}
}
