package com.books.OnlineBookstore.controllers;

import com.books.OnlineBookstore.utils.Constants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {

    @GetMapping("/version")
    public String getVersion(){
        return Constants.version;
    }
}
