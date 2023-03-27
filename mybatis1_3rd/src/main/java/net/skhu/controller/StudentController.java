package net.skhu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.skhu.dto.Student;
import net.skhu.mapper.StudentMapper;

@Controller
@RequestMapping("student")
public class StudentController {

	@Autowired StudentMapper studentMapper;
	
	@RequestMapping("list")
	public String list(Model model) {
		List<Student> students = studentMapper.findAll();
		model.addAttribute("students", students);
		return "student/list";
	}
	
	@GetMapping("create")
	public String create(Model model) {
		model.addAttribute("student", new Student());
		return "student/edit";
	}
	
	@PostMapping("create")
	public String create(Model model, Student student) {
		studentMapper.insert(student);
		return "redirect:list";
	}
	
	@GetMapping("edit")
	public String edit(Model model, int id) {
		Student student = studentMapper.findOne(id);
		model.addAttribute("student", student);
		return "student/edit";
	}
	
	@PostMapping("edit")
	public String edit(Model model, Student student) {
		studentMapper.update(student);
		return "redirect:list";
	}
	
	@RequestMapping("delete")
	public String delete(Model model, int id) {
		studentMapper.delete(id);
		return "redirect:list";
	}
}
