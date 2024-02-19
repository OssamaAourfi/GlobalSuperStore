package com.ltp.GlobalSuperStore;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StoreController {
    @GetMapping("/")
    public String getForm(Model model){
        model.addAttribute("categories",Constants.Categories);
        return "form";
    }
    @GetMapping("/inventory")
    public String getInventory(){
        return "inventory";
    }
}
