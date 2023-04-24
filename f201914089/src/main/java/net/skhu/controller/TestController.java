package net.skhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class TestController {
	
	@GetMapping("exam2/test4")
	public String test4(Model model) {
		model.addAttribute("param1", "201914089");
		model.addAttribute("param2", "오동재");
		return "exam2/test4";
	}
	
	@GetMapping("exam2/test5")
	public String test5(Model model) {
		model.addAttribute("param1", "201914089");
		model.addAttribute("param2", "오동재");
		return "exam2/test5";
	}
	
	@PostMapping("exam2/test5")
	public String test5(Model model, String param1, String param2) {
		model.addAttribute("param1", param1);
		model.addAttribute("param2", param2);
		return "exam2/test5";
	}
	
	@GetMapping("exam2/test6")
	public String test6(Model model) {
		model.addAttribute("param1", "");
		model.addAttribute("param2", "");
		return "exam2/test6";
	}
	
	@PostMapping("exam2/test6")
	public String test6(Model model, String param1, String param2, HttpSession session) {
		String errorMsg = null;
		if(param1 == null || param1.length() == 0)
			errorMsg = "학번을 입력하세요";
		else if(param2 == null || param2.length() == 0)
			errorMsg = "이름을 입력하세요";
		else {
			session.setAttribute("param1", param1);
			session.setAttribute("param2", param2);
			return "redirect:test4";
		}
		model.addAttribute("param1", param1);
		model.addAttribute("param2", param2);
		model.addAttribute("errorMsg", errorMsg);
		return "exam2/test6";
	}
	
	@GetMapping("exam2/test7")
	public String test7(Model model) {
		model.addAttribute("param1", "0");
		model.addAttribute("param2", "2");
		return "exam2/test7";
	}
	
	@PostMapping("exam2/test7")
	public String test7(Model model, Integer param1, Integer param2) {
		param1 += param2;
		model.addAttribute("param1", param1);
		model.addAttribute("param2", param2);
		return "exam2/test7";
	}

}
