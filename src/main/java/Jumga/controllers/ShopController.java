package Jumga.controllers;


import Jumga.models.Shop;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/shop")
public class ShopController {
    @GetMapping
    public String getNewShopPage(HttpSession session, Model model){
        model.addAttribute("Shop", new Shop());
        return "merchant/create-shop";
    }
}
