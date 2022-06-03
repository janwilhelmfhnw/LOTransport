package ch.fhnw.acrm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order")
public class OrderController {


    @GetMapping
    String getOrder(Model model){
        model.addAttribute("Object", "1,2,3,4,5,6,7");
                return "order";
    }





}
