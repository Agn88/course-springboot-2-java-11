package com.agnaldojunior.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agnaldojunior.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
