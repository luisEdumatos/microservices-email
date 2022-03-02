package com.microservice.email.application.ports;

import com.microservice.email.application.domain.Email;
import com.microservice.email.application.domain.PageInfo;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface EmailRepositoryPort {

    Email save(Email emailModel);
    List<Email> findAll(PageInfo pageInfo);
    Optional<Email> findById(UUID emailId);
}
