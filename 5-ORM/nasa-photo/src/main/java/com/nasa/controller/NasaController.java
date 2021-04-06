package com.nasa.controller;

import com.nasa.model.FeedBack;
import com.nasa.service.FeedBackService;
import com.nasa.service.IFeedBackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Iterator;

@Controller
public class NasaController {
    @Autowired
    private IFeedBackService feedBackService;

    @ModelAttribute("feedBacks")
    public Iterable<FeedBack> feedBacks () {
        Iterable<FeedBack> fbs = feedBackService.getAllFB();
        return fbs;
    }
    @GetMapping("/")
    public ModelAndView feedBack() {
        return new ModelAndView("/index", "feedBack", new FeedBack());
    }
    @PostMapping("/create")
    public ModelAndView addFB(FeedBack feedBack) {
        feedBackService.save(feedBack);
        return new ModelAndView("redirect:/");
    }
}
