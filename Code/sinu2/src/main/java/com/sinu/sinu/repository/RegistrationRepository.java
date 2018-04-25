package com.sinu.sinu.repository;

import com.sinu.sinu.entity.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Long> {

    public Registration save(Registration registration);
}
