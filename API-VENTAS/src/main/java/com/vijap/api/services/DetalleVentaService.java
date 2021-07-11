package com.vijap.api.services;

import java.util.ArrayList;

import com.vijap.api.models.DetalleVentaModel;
import com.vijap.api.repositories.DetalleVentaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class DetalleVentaService {
    @Autowired
    DetalleVentaRepository detalleVentaRepository;

    public ArrayList<DetalleVentaModel> obtenerDetalleVentas(){
        return(ArrayList<DetalleVentaModel>)detalleVentaRepository.findAll();
    }
}