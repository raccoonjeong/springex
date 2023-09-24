package org.raccoon.springex.controller;

import lombok.extern.log4j.Log4j2;
import org.raccoon.springex.dto.TodoDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/todo")
@Log4j2
public class TodoController {

    @RequestMapping("/list")
    public void list() {
        log.info("todo list......");
    }

    @GetMapping("/register")
    public void register() {
        log.info("GET todo register...");
    }

    @PostMapping("/register")
    public void registerPost(TodoDTO todoDTO) {
        log.info("POST todo register...");
        log.info(todoDTO);
    }
}
