package com.demo.demo.Repository;

import com.demo.demo.Domain.User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

}