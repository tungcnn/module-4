package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;

@Controller
@RequestMapping("/sandwich")
public class SandwichController {
    @GetMapping
    public String show() { return "sandwich"; }
    @PostMapping
    public ModelAndView save(@RequestParam("condiment") String[] condiments) {
        ModelAndView model = new ModelAndView("sandwich");
        model.addObject("condiments", condiments);
        return model;
    }
}
