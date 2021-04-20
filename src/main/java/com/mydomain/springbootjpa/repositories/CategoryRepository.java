package com.mydomain.springbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mydomain.springbootjpa.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
