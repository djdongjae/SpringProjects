package net.skhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.skhu.dto.Student;

@Controller
@RequestMapping("third")
public class ThirdController {

    @RequestMapping("test1")
    public String test2(Model model) {
        Student student = new Student(1234, "201914089", "오동재", "jk47wee@gmail.com");
        model.addAttribute("student", student);
        return "third/test1";
    }

}