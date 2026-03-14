package edu.rit.group7.Controller;
import edu.rit.group7.Service.SustainabilityService;
import edu.rit.group7.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PortalController {

    @Autowired
    private SustainabilityService service;

    // Keep static landing
    @GetMapping("/")
    public String landing() {
        return "index";
    }

    // GET /user: list from service
    @GetMapping("/user")
    public String displayUsers(Model model) {
        model.addAttribute("users", service.getAllUsers());
        return "user";
    }

    // GET /user/add: form
    @GetMapping("/user/add")
    public String addUserForm(Model model) {
        model.addAttribute("user", new User());
        return "user-add";
    }

    // POST /user/add: save + redirect
    @PostMapping("/user/add")
    public String saveUser(@ModelAttribute User user) {
        service.addUser(user);
        return "redirect:/add/success/user";
    }

    // GET /add/success/{entity-name}: confirmation
    @GetMapping("/add/success/{entity-name}")
    public String success(@PathVariable("entity-name") String entityName, Model model) {
        model.addAttribute("entity-name", entityName);
        return "success";
    }
}


