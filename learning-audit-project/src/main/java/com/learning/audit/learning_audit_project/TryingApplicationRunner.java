package com.learning.audit.learning_audit_project;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//@Component
//@Order(2)
public class TryingApplicationRunner implements ApplicationRunner {

    @Override

    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Hello, ApplicationRunner did its job!");


        // they do give array of strings (parsed but)
        for(String argName: args.getOptionNames()) {

            System.out.println("hey," + args.getOptionValues(argName));}

        System.out.println(args.getNonOptionArgs());

    }
}
