package edu.rit.group7.Controller;

import edu.rit.group7.Service.RecyclingService;
import edu.rit.group7.model.RecyclingLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@Controller
public class RecyclingLogController {

    @Autowired
    private RecyclingService Service;

    @GetMapping("/recyclinglog")
    public String viewLogs(Model model) {
        model.addAttribute("logs", Service.getAllLogs());
        model.addAttribute("items", Service.getAllItems());
        return "recyclinglog";
    }

    @GetMapping("/recyclinglog/add")
    public String addLogPage(Model model) {
        model.addAttribute("items", Service.getAllItems());
        return "recyclinglog-add";
    }

    @PostMapping("/recyclinglog/add")
    public String addLog(RecyclingLog log) {
        log.setDate(LocalDate.now());
        Service.addLog(log);
        return "redirect:/add/success/recyclinglog";
    }



    @GetMapping("/add/success/{entityName}")
    public String successPage(@PathVariable String entityName, Model model) {
        model.addAttribute("entityName", entityName);
        return "success";
    }
}
