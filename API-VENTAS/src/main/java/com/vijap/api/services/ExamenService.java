package com.vijap.api.services;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


import com.vijap.api.models.ExamenModel;
import com.vijap.api.repositories.ExamenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExamenService {
    @Autowired
    ExamenRepository examenRepository;

    public ArrayList<ExamenModel> obtenerExamenes(){
        return(ArrayList<ExamenModel>)examenRepository.findAll();
    }
}
