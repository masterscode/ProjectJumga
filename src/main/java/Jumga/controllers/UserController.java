package Jumga.controllers;

import Jumga.models.User;
import Jumga.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService service;

    @PostMapping
    public String doRegistration(User user, Model model){
        User checkIfUserIsRegistered = service.getUserByEmail(user);
        User userToRegister = service.createUser(user);
        if (checkIfUserIsRegistered != null) {
            model.addAttribute("error", "User with that email already exists");
            return "redirect:/register";
        }
        if (userToRegister != null)    return "redirect:/";
        return "redirect:/register";
    }


}
