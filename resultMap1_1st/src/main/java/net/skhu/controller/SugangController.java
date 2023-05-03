package net.skhu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.skhu.mapper.SugangMapper;

@Controller
@RequestMapping("sugang")
public class SugangController {
	
	@Autowired SugangMapper sugangMapper;
	
	@RequestMapping("list")
	public String list(Model model) {
		model.addAttribute("sugangs", sugangMapper.findAll());
		return "sugang/list";
	}
}
