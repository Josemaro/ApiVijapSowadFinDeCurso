package com.vijap.api.controllers;

import java.util.ArrayList;
import java.util.List;

import com.vijap.api.dto.DetalleVentaDto;
import com.vijap.api.models.DetalleVentaModel;
import com.vijap.api.services.DetalleVentaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/detalleventa")
public class DetalleVentaController {
    @Autowired
    DetalleVentaService detalleVentaService;

    @GetMapping("/listar")
    public List<DetalleVentaDto> obtenerDetalleVentas(){
        return detalleVentaService.obtenerDetalleVentas();
    }
    
}
