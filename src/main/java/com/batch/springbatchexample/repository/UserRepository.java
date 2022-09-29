package com.batch.springbatchexample.repository;

import com.batch.springbatchexample.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
