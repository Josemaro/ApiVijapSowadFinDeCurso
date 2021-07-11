package com.vijap.api.repositories;

import com.vijap.api.models.VentaModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentaRepository extends JpaRepository<VentaModel,Long> {
    
}
