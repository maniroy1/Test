package com.awantunai.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.awantunai.test.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
