package com.example.wikitaller.controllerd;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@RequestMapping("/wiki")
@Controller
public class Wiki {
    
    @GetMapping("/page")
     public ModelAndView wikiModelAndView() {
         return new ModelAndView("index");
     }
    
}
