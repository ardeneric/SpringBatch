package com.springBatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springBatch.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
