package com.vijap.api.controllers;

import java.util.ArrayList;


import com.vijap.api.models.ExamenModel;
import com.vijap.api.services.ExamenService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/examen")
public class ExamenController {
    @Autowired
    ExamenService examenService;

    @GetMapping("/listar")
    public ArrayList<ExamenModel> obtenerExamenes(){
        return (ArrayList<ExamenModel>) examenService.obtenerExamenes();
    }

}
