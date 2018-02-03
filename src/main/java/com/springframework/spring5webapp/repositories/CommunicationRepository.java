package com.springframework.spring5webapp.repositories;

import com.springframework.spring5webapp.model.Communication;
import org.springframework.data.repository.CrudRepository;

public interface CommunicationRepository extends CrudRepository<Communication, Long> {
}
