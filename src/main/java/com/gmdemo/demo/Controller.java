package com.gmdemo.demo;

import org.apache.http.util.TextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
public class Controller {
    private Environment env;  

    @Autowired
    public Controller(Environment env) {
        this.env = env;
    }

    @GetMapping("/health-check")
    public String status() {
        return String.format("Gentle Monster Demo - Port: %s", env.getProperty("local.server.port"));
    }
}
