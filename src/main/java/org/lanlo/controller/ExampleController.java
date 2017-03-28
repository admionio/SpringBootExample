package org.lanlo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * Created by LANLO on 3/27/2017.
 * SpringBootExample
 */
@Controller
public class ExampleController{

    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("date", new Date());
        return "index";
    }

}
