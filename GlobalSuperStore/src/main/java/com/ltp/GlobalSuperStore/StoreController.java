package com.ltp.GlobalSuperStore;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StoreController {
    List<Item> items = new ArrayList<>();
    @GetMapping("/")
    public String getForm(Model model){
        model.addAttribute("item",new Item());
        model.addAttribute("categories",Constants.Categories);
        return "form";
    }
    @PostMapping("/submitItem")
    public String handleSubmit(Item item){
        items.add(item);
        return "redirect:/inventory";
    }
    @GetMapping("/inventory")
    public String getInventory(){
        return "inventory";
    }
}
