package com.mydomain.springbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mydomain.springbootjpa.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
