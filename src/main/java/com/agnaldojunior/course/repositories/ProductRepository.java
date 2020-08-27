package com.agnaldojunior.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agnaldojunior.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
