package com.vku.ktx.repository;

import com.vku.ktx.model.Register;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisterRepository extends JpaRepository<Register,Integer> {
    
    
}
