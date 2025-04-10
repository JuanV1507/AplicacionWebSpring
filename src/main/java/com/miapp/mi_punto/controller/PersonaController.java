package com.miapp.mi_punto.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.miapp.mi_punto.model.Persona;
import com.miapp.mi_punto.service.PersonaService;


@Controller
@RequestMapping("/personas")
@CrossOrigin(origins = "*")
public class PersonaController {
    // Inyección del servicio Persona para realizar operaciones CRUD
    @Autowired
    private PersonaService personaService;
    
    @GetMapping
    public String listarPersonas(Model model){
       model.addAttribute("personas", personaService.listarTodas());
       return "persona-list";
    }
    
    @GetMapping("/Nuevo")
    public String mostrarFormularioPersona(Model model){
        model.addAttribute("persona", new Persona());
        return "persona-form";
    }
    
    @PostMapping
    public String guardarPersona(Persona persona){
       personaService.Guardar(persona);
       return "redirect:/personas";
    }
    
    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditarPersona(@PathVariable Long id, Model model){
       model.addAttribute("persona", personaService.obtenerPorId(id));
       return "persona-form";
    }
    
    @GetMapping("/eliminar/{id}")
    public String eliminarPersona(@PathVariable Long id){
    personaService.eliminar(id);
    return "redirect:/personas";
}
    
}