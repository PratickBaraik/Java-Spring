package com.example.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @Autowired
    private FeedbackRepository repository;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/feedback")
    public String saveFeedback(Feedback feedback) {
        repository.save(feedback);
        return "success";
    }
}
