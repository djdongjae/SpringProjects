package net.skhu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.skhu.mapper.StudentMapper;

@Controller
public class StudentController {
	
	@Autowired StudentMapper studentMapper;
	
	@RequestMapping("student/list")
	public String list(Model model) {
		model.addAttribute("students", studentMapper.findAll());
		return "student/list";
	}
	
	@RequestMapping("student/detail")
	public String detail(Model model, Integer id) {
		if (id == null) id = 5;
		model.addAttribute("student", studentMapper.findById(id));
		return "student/detail";
	}

}
