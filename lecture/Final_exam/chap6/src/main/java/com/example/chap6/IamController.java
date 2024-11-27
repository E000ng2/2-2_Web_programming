package com.example.chap6;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class IamController {
    @GetMapping("/iam")
    public String iam() {
        return "iam";
    }
    
    @PostMapping("/animal/report")
    public String report(@RequestParam("gender") String gender, @RequestParam("age") Integer age,
    @RequestParam(value = "animal", required = false) String[] animal, @RequestParam("confidence1") Integer confidence1,
    @RequestParam("confidence2") Integer confidence2, @RequestParam("confidence3") Integer confidence3,@RequestParam("commits") String commits, Model mo) {
        if (animal == null)
        {
            animal = new String [] {"값이 없습니다."};
            mo.addAttribute("animal", animal);
        }

        mo.addAttribute("animal", animal);            
        mo.addAttribute("gender", gender);
        mo.addAttribute("age", age);
        mo.addAttribute("confidence1", confidence1);
        mo.addAttribute("confidence2", confidence2);
        mo.addAttribute("confidence3", confidence3);
        mo.addAttribute("commits", commits);
        
        return "iamAnswer";
    }
    
}
