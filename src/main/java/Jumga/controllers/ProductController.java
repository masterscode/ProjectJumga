package Jumga.controllers;

import Jumga.models.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/products")
public class ProductController {
    @GetMapping
    public String getAllProducts(HttpSession session, Model model){
        return "merchant/products";
    }

    @GetMapping("/new")
    public String getProductForm(Model model){
        model.addAttribute("Product", new Product());
        return "merchant/add-product";
    }
}
