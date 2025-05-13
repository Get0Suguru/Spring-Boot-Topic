package com.learning.audit.learning_audit_project;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//@Component
//@Order(1)
public class TryingCLRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello, CLRunner did its job!");
        for(String arg: args){
            System.out.println("hey," + arg);
        }

    }
}
