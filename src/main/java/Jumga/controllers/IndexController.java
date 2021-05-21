package Jumga.controllers;

import Jumga.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/")
    public String getIndex(Model model){
        model.addAttribute("User", new User());
        return "auth-login";
    }

    @GetMapping("/register")
    public String getRegistration(Model model){
        model.addAttribute("User", new User());
        return "auth-register";
    }
}
