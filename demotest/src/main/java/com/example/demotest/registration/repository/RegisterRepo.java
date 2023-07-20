package com.example.demotest.registration.repository;

import com.example.demotest.registration.model.Register;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegisterRepo extends JpaRepository<Register, Integer> {
    List<Register> findAll();
}
