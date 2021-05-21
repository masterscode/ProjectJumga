package Jumga.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping
    public String getCustomerIndex(HttpSession session){
        return "products";
    }

}
