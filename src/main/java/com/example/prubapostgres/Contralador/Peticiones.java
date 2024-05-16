
package com.example.prubapostgres.Contralador;

import com.example.prubapostgres.Entidad.Animal;
import com.example.prubapostgres.Repositorio.RepoAnimal;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/animales")
public class Peticiones {
    
    @Autowired
    RepoAnimal ranimal;
    
    @GetMapping("")
    public List<Animal> obtenerTodos(){
        return ranimal.findAll();
    }
    
    @PostMapping("")
    public List<Animal> insertarAnimal(int id, String nombre, int numpatas){
        Animal a = new Animal();
        a.setId(id);
        a.setNombre(nombre);
        a.setNumpatas(numpatas);
        ranimal.save(a);
        return ranimal.findAll();
    }
    
}