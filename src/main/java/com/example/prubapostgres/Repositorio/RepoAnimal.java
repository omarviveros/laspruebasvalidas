
package com.example.prubapostgres.Repositorio;

import com.example.prubapostgres.Entidad.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RepoAnimal extends JpaRepository <Animal, Integer>{
    
}