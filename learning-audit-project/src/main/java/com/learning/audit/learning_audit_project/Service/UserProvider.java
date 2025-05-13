package com.learning.audit.learning_audit_project.Service;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserProvider implements AuditorAware<String> {


    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("User is bitch");            //return me send the current user (in the format ur using/want)
    }
}


