package com.vijap.api.controllers;

import java.util.ArrayList;

import com.vijap.api.models.VentaModel;
import com.vijap.api.services.VentaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/venta")
public class VentaController {
    @Autowired
    VentaService ventaService;

    @GetMapping("/listar")
    public ArrayList<VentaModel> obtenerVentas(){
        return ventaService.obtenerVentas();
    }

}
