package com.mpfr.vcard.Controller;

import java.util.List;

import com.mpfr.vcard.Model.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @Autowired
    private List<Employee> employees;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("employees", employees);
        model.addAttribute("title", "Lista de Empleados");

        return "index";
    }

}
