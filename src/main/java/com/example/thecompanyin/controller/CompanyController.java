package com.example.thecompanyin.controller;

import com.example.thecompanyin.model.Company;
import com.example.thecompanyin.service.CompanyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;

@Slf4j
@Controller
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping("/index")
    public String showCompanyList(Model model) {
        model.addAttribute("companies", companyService.getAllCompanies());
        return "index";
    }

    @GetMapping("/addcompany")
    public String addCompany(String domain, Model model){
        //TODO validation on domain
        companyService.getCompanyByDomain(domain);
        model.addAttribute("companies", companyService.getAllCompanies());
        return "index";
    }
}
