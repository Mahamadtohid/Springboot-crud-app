package com.example.myFirst;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class MyController {


    @RequestMapping("m")
    public static String Mymethod(){
        return "static methos from the MyController class";
    }
    
}
