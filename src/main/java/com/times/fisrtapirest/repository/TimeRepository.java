package com.times.fisrtapirest.repository;

import com.times.fisrtapirest.model.Times;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeRepository extends JpaRepository<Times, Long>{
    
    Times findById(long id);

}
