// DemographicsRepository.java
package com.luv2code.springboot.thymeleafdemo.repository;

import com.luv2code.springboot.thymeleafdemo.entity.Demographics;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemographicsRepository extends JpaRepository<Demographics, Integer> {
    // Define custom query methods if needed
}
