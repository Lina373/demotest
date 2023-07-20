package com.example.demotest.registration.service;


import com.example.demotest.registration.model.Register;
import org.springframework.stereotype.Component;

import java.util.List;


public interface RegisterService {
    public Register saveRegister(Register register);
    public List<Register> getAllRegisters();
}