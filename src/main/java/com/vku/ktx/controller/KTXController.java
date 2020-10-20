package com.vku.ktx.controller;

import java.util.List;
import java.util.Optional;

import com.vku.ktx.model.Register;
import com.vku.ktx.repository.RegisterRepository;
import com.vku.ktx.service.KTXService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KTXController {

    @Autowired
    private KTXService ktxService;

    @Autowired
    private RegisterRepository registerRepository;

    @GetMapping("/register/{id}")
    public Optional<Register> getAll(@PathVariable("id") Integer id) {
        return registerRepository.findById(id);
    }
    
    @GetMapping("/register")
    public List<Register> add() {
        return registerRepository.findAll();
    }
}
