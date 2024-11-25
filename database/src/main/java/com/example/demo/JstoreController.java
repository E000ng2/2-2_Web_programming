package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JstoreController {
    @Autowired
    private jstoreRep jrep;

    @GetMapping("/jstore")
    public String jstore(Model mo){
        mo.addAttribute("arr", jrep.findAll());
        return "jstore";
    }


    
}
