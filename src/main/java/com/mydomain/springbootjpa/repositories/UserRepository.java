package com.mydomain.springbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mydomain.springbootjpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
