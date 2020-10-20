package com.vku.ktx.service;

import java.util.List;

import com.vku.ktx.model.Register;
import com.vku.ktx.repository.RegisterRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KTXService {
    
    @Autowired
    private RegisterRepository registerRepository;

    public List<Register> getAll(){
        return registerRepository.findAll();
    }

}
