package com.miapp.mi_punto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miapp.mi_punto.model.Persona;
import com.miapp.mi_punto.repository.PersonaRepository;

@Service
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    // Lista a todas las personas
    public List<Persona> listarTodas() {
        return personaRepository.findAll();
    }

    // Guarda a la persona
    public Persona Guardar(Persona persona) {
        return personaRepository.save(persona);
    }

    // Obtiene a la persona por su ID
    public Persona obtenerPorId(Long id) {
        return personaRepository.findById(id).orElse(null);
    }

    // Elimina a la persona por ID
    public void eliminar(Long id) {
        personaRepository.deleteById(id);
    }

    // Busca a la persona por nombre
    public Persona buscarPorNombre(String nombre) {
        return personaRepository.findByNombre(nombre);
    }
}
