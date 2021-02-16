package com.mydomain.springbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mydomain.springbootjpa.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
