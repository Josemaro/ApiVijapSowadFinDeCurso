package com.vijap.api.services;

import java.util.ArrayList;
import java.util.List;

import com.vijap.api.dto.DetalleVentaDto;
import com.vijap.api.models.DetalleVentaModel;
import com.vijap.api.repositories.DetalleVentaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class DetalleVentaService {
    @Autowired
    DetalleVentaRepository detalleVentaRepository;

    public List<DetalleVentaDto> obtenerDetalleVentas(){
        //DetalleVentaDto d;
        List<DetalleVentaDto> detalleVentasDto = new ArrayList<>();

        for (DetalleVentaModel d : detalleVentaRepository.findAll()){
            DetalleVentaDto detalleAux = new DetalleVentaDto();
            detalleAux.setIddetalleventa(d.getIddetalleventa());
            detalleAux.setIdarticulo(d.getIdarticulo());
            detalleAux.setCantidad(d.getCantidad());
            detalleAux.setPrecio(d.getPrecio());
            detalleAux.setDescuento(d.getDescuento());
            detalleAux.setIdventa(d.getVenta().getIdventa());
            detalleVentasDto.add(detalleAux);
        }
        return(detalleVentasDto);
    }
}