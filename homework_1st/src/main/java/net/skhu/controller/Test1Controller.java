package net.skhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Test1Controller {
	
	@GetMapping("homework/test1")
	public String test1(Model model) {
		model.addAttribute("num", 0);
		return "homework/test1";
	}
	
	@PostMapping("homework/test1")
	public String test1(Model model, Integer num) {
		++num;
		model.addAttribute("num", num);
		return "homework/test1";
	}
	
	@GetMapping("homework/test2")
	public String test2(Model model) {
		return "homework/test2";
	}
	
	@PostMapping("homework/test2")
	public String test2(Model model, String value) {
		model.addAttribute("value", value);
		return "homework/test2";
	}

}
