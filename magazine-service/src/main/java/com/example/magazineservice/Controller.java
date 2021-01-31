package com.example.magazineservice;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping
public class Controller {
    @GetMapping
    public Magazine getOne() {
        return new Magazine();
    }
}
