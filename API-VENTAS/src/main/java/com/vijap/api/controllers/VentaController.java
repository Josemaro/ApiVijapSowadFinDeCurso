package com.vijap.api.controllers;

import java.util.ArrayList;

import com.vijap.api.dto.VentaDto;
import com.vijap.api.models.VentaModel;
import com.vijap.api.services.VentaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/venta")
public class VentaController {
    @Autowired
    VentaService ventaService;

    @GetMapping("/listar")
    public ArrayList<VentaDto> obtenerVentas(){
        return (ArrayList<VentaDto>) ventaService.obtenerVentas();
    }

}
