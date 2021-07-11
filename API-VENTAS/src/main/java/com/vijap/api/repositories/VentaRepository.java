package com.vijap.api.repositories;

import java.util.ArrayList;

import com.vijap.api.models.VentaModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentaRepository extends JpaRepository<VentaModel,Long> {
    public abstract ArrayList<VentaModel> findByTipocomprobante(String tipocomprobante);
    public abstract ArrayList<VentaModel> findByNumcomprobante(String numcomprobante);
}
