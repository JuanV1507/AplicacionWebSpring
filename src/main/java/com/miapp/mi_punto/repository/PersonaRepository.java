package com.miapp.mi_punto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miapp.mi_punto.model.Persona; // ✅ CORRECTO

public interface PersonaRepository extends JpaRepository<Persona, Long> {
    Persona findByNombre(String nombre); // ✅ También aquí
}
