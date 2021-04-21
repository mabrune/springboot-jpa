package com.mydomain.springbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mydomain.springbootjpa.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
