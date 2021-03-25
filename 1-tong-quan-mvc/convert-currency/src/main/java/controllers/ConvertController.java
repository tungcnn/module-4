package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/convert")
public class ConvertController {
    @PostMapping("/go")
    public ModelAndView showList(@ModelAttribute("vnd") double vnd) {
        ModelAndView modelAndView = new ModelAndView("after");
        double usd = vnd/23000;
        modelAndView.addObject("usd", usd);
        return modelAndView;
    }

}
