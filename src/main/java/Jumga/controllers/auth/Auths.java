package Jumga.controllers.auth;

import Jumga.models.User;
import Jumga.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/auth")
public class Auths {
    @Autowired
    UserService service;

    @GetMapping("/login")
    public String getLogin(Model model){
        return "redirect:/";
    }

    @PostMapping("/login")
    public String doLogin(User user, Model model, HttpSession session){
        User loggedInUser = service.getUserByEmail(user);
        if(loggedInUser == null) return "redirect:/";

        session.setAttribute("loggedInUser", loggedInUser);
        String userType = loggedInUser.getUserType();
//        if (userType.equalsIgnoreCase("customer")) return "redirect:/products";
//        else if (userType.equalsIgnoreCase("merchant")) return "redirect:/merchant";
        return String.format("redirect:/%s",userType);
    }

    @GetMapping("/logout")
    public String doLogOut(HttpSession session){
        if (session.getAttribute("loggedInUser") != null){
            session.removeAttribute("loggedInUser");
        }
        session.invalidate();
        return "redirect:/";
    }

}
