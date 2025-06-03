package com.springmvc.BindingEmployee.controller;

import com.springmvc.BindingEmployee.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;
import java.util.Random;

@Controller
public class EmployeeController{
    @GetMapping("/home")
    public String home()
    {
        return "home";
    }



    @PostMapping("/register")
    public String register(Map<String,Object> map, @ModelAttribute("emp") Employee emp)
    {
        System.out.println(emp);
        map.put("id", new Random().nextInt(100,10000));
        return "register";
    }

    @GetMapping("/register")
    public String formRegistration(@ModelAttribute("emp") Employee emp)
    {
//        Employee emp = new Employee();
//        emp.setEmpName(null);
//        emp.setEmpAdd(null);
//        emp.setEmpSal(null);
//        model.addAttribute("emp",emp);
        return "formRegistration";
    }


    @GetMapping("/get")
    public String get(Map<String,Object> map,
                      @RequestParam String name,
                      @RequestParam String college,
                      @RequestParam int salary)
    {
        map.put("name",name);
        map.put("college",college);
        map.put("salary",salary);
        return "get";
    }

    @GetMapping("/success")
    public String registered()
    {
        return "registered";
    }





}
