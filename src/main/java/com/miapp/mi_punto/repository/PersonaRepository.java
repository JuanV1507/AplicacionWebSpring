/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.miapp.mi_punto.repository;

import com.miapp.mi_punto.model.persona;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author USUARIO
 */
public interface PersonaRepository extends JpaRepository<persona,Long> {
    
}
