package net.skhu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.skhu.entity.Engineer;
import net.skhu.repository.EngineerRepository;

@RestController
public class EngineerController {
	
	@Autowired EngineerRepository engineerRepository;
	
    @RequestMapping("exam1")
    public List<Engineer> exam1() {
        return engineerRepository.findAll();
    }
    
    @RequestMapping("exam2")
    public List<Engineer> exam2(int id) {
    	return engineerRepository.findByRoleId(id);
    }
    
    @RequestMapping("exam3")
    public List<Engineer> exam3(String name) {
    	return engineerRepository.findByNameStartsWith(name);
    }
    
    @RequestMapping("exam4")
    public List<Engineer> exam4(int id) {
    	return engineerRepository.findByProjectId(id);
    }
    
    @RequestMapping("exam5")
    public List<Engineer> exam5(int id) {
    	return engineerRepository.findByManagerId(id);
    }

}
