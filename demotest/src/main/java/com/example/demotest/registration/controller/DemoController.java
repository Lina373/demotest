package com.example.demotest.registration.controller;


import com.example.demotest.registration.model.Register;
import com.example.demotest.registration.service.RegisterService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@Controller
@AllArgsConstructor
@RestController
@RequestMapping("/login")
public class DemoController {

//    @GetMapping("/main")
//    public String main(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
//        model.addAttribute("name", name);
//        return "app";
//    }

    private RegisterService registerService;

    @GetMapping("/main")
    public String main(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "main";
    }
//
//    @GetMapping
//    public String reg(Map<String, String> model){
//        Iterable<Register> registers = registerRepo.findAll();
//        model.put("registers", "go go");
//        return "main";
//    }
//
//    @PostMapping
//    public String add(@RequestParam String username, @RequestParam String userlogin, Map<String, String> model){
//        Register register = new Register(username, userlogin);
//        Iterable<Register> registers = registerRepo.findAll();
//        registerRepo.save(register);
//        return "main";
//    }
    @GetMapping("/hi")
    public ResponseEntity hi(){
        Map<Object, Object> response = new HashMap<>();
        response.put("message", "hi2");
        return new ResponseEntity(response, HttpStatus.OK);
    }
    @PostMapping("/app")
    public ResponseEntity add(@RequestBody Register register){
        Map<Object, Object> response = new HashMap<>();
        registerService.saveRegister(register);
        response.put("message", "ok");
        return new ResponseEntity(response, HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public List<Register> list(){
        return registerService.getAllRegisters();
    }

}
