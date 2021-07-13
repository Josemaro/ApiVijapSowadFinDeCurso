package com.vijap.api.controllers;

import java.util.ArrayList;

import com.vijap.api.dto.Message;
import com.vijap.api.models.ExamenModel;
import com.vijap.api.services.ExamenService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping("/guardar")
    public ResponseEntity<?> guardarExamen(@RequestBody ExamenModel examen){
        this.examenService.guardarExamen(examen);
        return new ResponseEntity(new Message("Usuario Insertado"), HttpStatus.OK);
    }

}
