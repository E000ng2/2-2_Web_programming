package com.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.servlet.http.HttpSession;

@Controller
public class SurveyController {

    @Autowired private surveyRep srep;

    @GetMapping("/start")
    public String start()
    {
        return "start";
    }
    
    @PostMapping("/food")
    public String survey1( HttpSession se, @RequestParam("id") String id)
    {
        se.setAttribute("id", id);
        return "survey1";
    }

    @PostMapping("/season")
    public String survey2( HttpSession se, @RequestParam("food") String food)
    {
        se.setAttribute("food", food);
        return "survey2";
    }

    @PostMapping("/thanks")
    public String surveythanks( HttpSession se, @RequestParam("season") String season)
    {
        se.setAttribute("season", season);
        return "surveythanks";
    }

    @GetMapping("/end")
    public String surveyend( HttpSession se, Model mo)
    {
        String id = (String)se.getAttribute("id");
        String food = (String)se.getAttribute("food");
        String season = (String)se.getAttribute("season");
        mo.addAttribute("id", id);
        mo.addAttribute("food", food);
        mo.addAttribute("season", season);
        survey m = new survey();
        m.id = id;
        m.food = food;
        m.season = season;
        srep.save(m);
        return "surveyend";
    }

    @GetMapping("/survey/list")
    public String surveylist(Model mo) {
        mo.addAttribute("arr", srep.findAll());
        return "surveylist";
    }
    
}
