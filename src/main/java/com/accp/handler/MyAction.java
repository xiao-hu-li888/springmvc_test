package com.accp.handler;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.accp.pojo.User;

@Controller
public class MyAction {
	
	@RequestMapping(value="/loginin",method = RequestMethod.POST)
	public String Cha(Model model,User us) {
		if (us.getName()=="" || us.getCity()=="" || us.getLanguage()==null) {
			System.out.println("jinlaile");
			model.addAttribute("info","列必须填写，不允许为空");
			return "/WEB-INF/view/test.jsp";
		}else {
			model.addAttribute("name",us.getName());
			model.addAttribute("city",us.getCity());
			model.addAttribute("language",us.getLanguage());
			return "/WEB-INF/view/info.jsp";
		}
	}
}
