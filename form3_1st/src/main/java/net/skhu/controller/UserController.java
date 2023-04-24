package net.skhu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.validation.Valid;
import net.skhu.dto.User;
import net.skhu.model.UserSignUp;
import net.skhu.service.DepartmentService;
import net.skhu.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
	
	@Autowired UserService userService;
	@Autowired DepartmentService departmentService;
	
	@GetMapping("list")
	public String list(Model model) {
		model.addAttribute("users", userService.findAll());
		return "user/list";
	}
	
	@GetMapping("signUp")
	public String signUp(Model model) {
		model.addAttribute("userSignUp", new UserSignUp());
		model.addAttribute("departments", departmentService.findAll());
		return "user/signUp";
	}
	
	@PostMapping("signUp")
	public String signUp(Model model, @Valid UserSignUp userSignUp, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			model.addAttribute("departments", departmentService.findAll());
			return "user/signUp";
		}
		User user = userService.findByLoginName(userSignUp.getLoginName());
		if(user != null) {
			bindingResult.rejectValue("loginame", null, "로그인 네임이 중복됩니다.");
			model.addAttribute("departments", departmentService.findAll());
			return "user/signUp";
		}
		userService.insert(userSignUp);
		return "redirect:list";
	}

}
