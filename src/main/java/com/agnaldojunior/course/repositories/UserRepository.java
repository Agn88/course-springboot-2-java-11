package com.agnaldojunior.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agnaldojunior.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
