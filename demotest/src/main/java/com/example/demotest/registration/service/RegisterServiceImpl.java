package com.example.demotest.registration.service;

import com.example.demotest.registration.model.Register;
import com.example.demotest.registration.repository.RegisterRepo;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
@ComponentScan("com.example.demotest.registration.repository")
public class RegisterServiceImpl implements RegisterService{

//@Autowired
    private RegisterRepo registerRepo;

    @Override
    public Register saveRegister(Register register) {
        return registerRepo.save(register);
    }

    @Override
    public List<Register> getAllRegisters() {
        return registerRepo.findAll();
    }
}
