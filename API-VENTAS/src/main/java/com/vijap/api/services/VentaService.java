package com.vijap.api.services;

import java.lang.reflect.Array;
import java.util.ArrayList;

import com.vijap.api.models.VentaModel;
import com.vijap.api.repositories.VentaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaService {
    @Autowired
    VentaRepository ventaRepository;

    public ArrayList<VentaModel> obtenerVentas(){
        return(ArrayList<VentaModel>)ventaRepository.findAll();
    }

    public ArrayList<VentaModel> obtenerPorTipoComprobante(String tipocomprobante){
        return(ArrayList<VentaModel>)ventaRepository.findByTipocomprobante(tipocomprobante);
    }

    public ArrayList<VentaModel> obtenerPorNumeroComprobante(String numerocomprobante){
        return(ArrayList<VentaModel>)ventaRepository.findByNumcomprobante(numerocomprobante);
    }

    

}
