package com.golusko.demoOauth2;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String sayHello(){
        return "hi, its me golu alomst gonna end the spring boot course 1 (one day i'll get a job and that day is not far)" +
                "\n i also want to thank my bro once i got the job it won't be possible without him (lets work now)";

    }
}
