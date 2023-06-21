package net.skhu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.skhu.dto.City;
import net.skhu.mapper.DistrictMapper;
import net.skhu.mapper.CityMapper;

@Controller
public class CityController {

    @Autowired CityMapper cityMapper;
    @Autowired DistrictMapper districtMapper;

    @RequestMapping("city/list")
    public String list(Model model) {
        List<City> cities = cityMapper.findAll();
        model.addAttribute("cities", cities);
        return "city/list";
    }

    @GetMapping("city/create")
    public String create(Model model) {
        City city = new City();
        model.addAttribute("city", city);
        model.addAttribute("districts", districtMapper.findAll());
        return "city/edit";
    }

    @PostMapping("city/create")
    public String create(Model model, City city) {
        cityMapper.insert(city);
        return "redirect:list";
    }

    @GetMapping("city/edit")
    public String edit(Model model, int id) {
        City city = cityMapper.findById(id);
        model.addAttribute("city", city);
        model.addAttribute("districts", districtMapper.findAll());
        return "city/edit";
    }

    @PostMapping("city/edit")
    public String edit(Model model, City city) {
        cityMapper.update(city);
        return "redirect:list";
    }

    @RequestMapping("city/delete")
    public String delete(int id) {
        cityMapper.delete(id);
        return "redirect:list";
    }
}


