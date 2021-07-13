package com.vijap.api.repositories;
import java.util.ArrayList;

import com.vijap.api.models.ExamenModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ExamenRepository extends JpaRepository<ExamenModel,Long> {
    
}
