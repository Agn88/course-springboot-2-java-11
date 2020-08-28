package com.agnaldojunior.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agnaldojunior.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
