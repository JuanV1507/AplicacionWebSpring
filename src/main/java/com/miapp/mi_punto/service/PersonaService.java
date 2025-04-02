/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miapp.mi_punto.service;

import com.miapp.mi_punto.model.persona;
import com.miapp.mi_punto.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//SE CREA EL SERVICIO QUE VA A LLEVAR ACABO TODAS LAS OPERACIONES CRUD
@Service
public class PersonaService {
    
    @Autowired
    private PersonaRepository personaRepository;
    //lista a todas las personas persona es el modelo con los getters y setters y personaRepository es para la interfaz
    //find ALL es de spring para mostrar todo al igual que los demas 
    public List<persona> listarTodas(){
        return personaRepository.findAll();
    }
    //Guarda a la persona 
    public persona Guardar (persona persona){
        return personaRepository.save(persona);
    }
    //Obtiene a la persona por su id LONG es donde se guarda
    public persona obtenerPorId(Long id){
        return personaRepository.findById(id).orElse(null);
    }
    //Elimina a la persona busca el id guardado en long
    public void eliminar (Long id){
        personaRepository.deleteById(id);
    }
    
}
