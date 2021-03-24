package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/users")
public class UserController {
    @PostMapping("/login")
    public ModelAndView login(@ModelAttribute("username") String uname, @ModelAttribute("pwd") String pwd) {
        ModelAndView mav = new ModelAndView("redirect:/user/login");
        if (uname.equals("admin") && pwd.equals("123"))  {
            mav = new ModelAndView("redirect:/products");
            return mav;
        }
        return mav;
    }
    @GetMapping("/login")
    public String login() {
        return "/user/login";
    }
}
