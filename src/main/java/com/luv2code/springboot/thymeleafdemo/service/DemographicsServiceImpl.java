// DemographicsServiceImpl.java
package com.luv2code.springboot.thymeleafdemo.service;

import com.luv2code.springboot.thymeleafdemo.entity.Demographics;
import com.luv2code.springboot.thymeleafdemo.repository.DemographicsRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class DemographicsServiceImpl implements DemographicsService {

    private final DemographicsRepository demographicsRepository;

    public DemographicsServiceImpl(DemographicsRepository demographicsRepository) {
        this.demographicsRepository = demographicsRepository;
    }

    @Override
    @Transactional
    public List<Demographics> findAll() {
        return demographicsRepository.findAll();
    }

    @Override
    @Transactional
    public Demographics findById(int empid) {
        Optional<Demographics> result = demographicsRepository.findById(empid);
        Demographics demographics;
        if (result.isPresent()) {
            demographics = result.get();
        } else {
            throw new RuntimeException("Demographics not found for empid: " + empid);
        }
        return demographics;
    }

    @Override
    @Transactional
    public void save(Demographics demographics) {
        demographicsRepository.save(demographics);
    }

    @Override
    @Transactional
    public void deleteById(int empid) {
        demographicsRepository.deleteById(empid);
    }
}