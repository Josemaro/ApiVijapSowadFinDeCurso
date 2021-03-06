package com.vijap.api.repositories;

//import java.util.ArrayList;
import java.util.Optional;

import com.vijap.api.models.UsuarioModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel,Long>{
    public abstract Optional<UsuarioModel> findByEmail(String email);
    public abstract Optional<UsuarioModel> findByIdusuario(Long idusuario);
    public abstract void deleteById(Long id);
    public abstract void deleteByEmail(String email);
    public abstract boolean existsByEmail(String email);
}
