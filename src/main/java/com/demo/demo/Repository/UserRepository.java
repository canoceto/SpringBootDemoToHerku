package com.demo.demo.Repository;

import com.demo.demo.Domain.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}