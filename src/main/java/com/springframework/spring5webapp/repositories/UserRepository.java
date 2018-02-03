package com.springframework.spring5webapp.repositories;

import com.springframework.spring5webapp.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
