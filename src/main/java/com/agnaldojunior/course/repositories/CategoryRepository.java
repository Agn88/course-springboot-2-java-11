package com.agnaldojunior.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agnaldojunior.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
