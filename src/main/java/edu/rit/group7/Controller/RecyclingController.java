package edu.rit.group7.Controller;

import edu.rit.group7.Service.RecyclingService;
import edu.rit.group7.model.RecyclingItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RecyclingController {

    @Autowired
    private RecyclingService service;

    @GetMapping("/recycling")
    public String viewItems(Model model) {
        model.addAttribute("items", service.getItems());
        return "recycling-list";
    }

    @GetMapping("/recycling/add")
    public String addItemForm(Model model) {
        model.addAttribute("item", new RecyclingItem());
        return "recycling-add";
    }

    @PostMapping("/recycling/add")
    public String saveItem(@ModelAttribute RecyclingItem item) {
        service.addItem(item);
        return "redirect:/add/success/recycling-item";
    }

    @GetMapping("/add/success/{entity-name}")
    public String success(@PathVariable("entity-name") String entityName, Model model) {
        model.addAttribute("entity-name", entityName);
        return "success";
    }
}