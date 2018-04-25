package com.sinu.sinu.service;

import com.sinu.sinu.entity.Registration;
import com.sinu.sinu.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    @Autowired
    private RegistrationRepository registrationRepository;

    public Registration save(Registration registration) {
        return this.registrationRepository.save(registration);
    }

}
