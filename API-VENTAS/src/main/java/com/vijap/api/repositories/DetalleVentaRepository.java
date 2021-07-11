package com.vijap.api.repositories;

import com.vijap.api.models.DetalleVentaModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleVentaRepository extends JpaRepository<DetalleVentaModel,Long>  {
    
}
