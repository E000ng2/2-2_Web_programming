package com.example.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class My_Controller {
    
    @GetMapping("/")
    public String home()
    {
        return "Home";
    }

    @GetMapping("/ex01")
    public String ex01()
    {
        return "ex01";
    }

    @PostMapping("/ex01/answer")
    public String ex01Answer(@RequestParam("mid") String mid,
     @RequestParam("mpw") String mpw, Model mo)
     {
        mo.addAttribute("mid", mid);
        mo.addAttribute("mpw", mpw);
        return "ex01Answer";
     }

     @GetMapping("/ex02")
     public String ex02()
     {
        return "ex02";
     }

     @PostMapping("/ex02/answer")
     public String ex02Answer(@RequestParam("mid") String mid,
      @RequestParam("po") String po, Model mo)
     {
        mo.addAttribute("mid", mid);
        mo.addAttribute("po", po);
        int salary = 0;
        switch(po)
        {
            case "사원" -> salary = 3500;
            case "대리" -> salary = 5000;
            case "팀장" -> salary = 7000;
            case "임원" -> salary = 9900;
        }
        mo.addAttribute("salary", salary);
        return "ex02Answer";
     }

     @GetMapping("/ex03")
     public String ex03()
     {
        return "ex03";
     }

     @PostMapping("/ex03/answer")
     public String ex03Answer(@RequestParam("mid") String mid, @RequestParam("color") String color, Model mo)
     {
        mo.addAttribute("mid", mid);
        mo.addAttribute("color", color);
        return "ex03Answer";
     }

     // 테스트 주석

     // 테스트 주석 by Seok
}
