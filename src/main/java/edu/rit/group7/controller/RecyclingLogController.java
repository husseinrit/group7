package edu.rit.group7.controller;

import edu.rit.group7.model.RecyclingLog;
import edu.rit.group7.service.SustainabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@Controller
public class RecyclingLogController {

    @Autowired
    private SustainabilityService service;

    @GetMapping("/recyclinglog")
    public String viewLogs(Model model) {
        model.addAttribute("logs", service.getAllLogs());
        model.addAttribute("items", service.getAllItems());
        return "recyclinglog";
    }

    @GetMapping("/recyclinglog/add")
    public String addLogPage(Model model) {
        model.addAttribute("items", service.getAllItems());
        return "recyclinglog-add";
    }

    @PostMapping("/recyclinglog/add")
    public String addLog(RecyclingLog log) {
        log.setDate(LocalDate.now());
        service.addLog(log);
        return "redirect:/add/success/recyclinglog";
    }

    @GetMapping("/add/success/{entityName}")
    public String successPage(@PathVariable String entityName, Model model) {
        model.addAttribute("entityName", entityName);
        return "success";
    }
}
