package com.demo.demo.Repository;

import com.demo.demo.Domain.User;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findByLastName(String lastName);
}