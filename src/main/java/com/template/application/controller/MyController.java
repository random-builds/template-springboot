package com.template.application.controller;

import com.template.application.core.Logic;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private final Logic logic;

    public MyController(Logic logic) {
        this.logic = logic;
    }

    @GetMapping("/test")
    public String test() {
        return logic.getString();
    }
}
