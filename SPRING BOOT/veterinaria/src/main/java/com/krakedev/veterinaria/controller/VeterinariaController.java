package com.krakedev.veterinaria.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/*  
    Controlador REST: Es una clase en Java que expone rutas HTTP (URLS) para que otros sistemas puedan enviarle peticiones
    y recibir respuestasen formato JSON.
*/

@RestController //Indica que esta clase es un controlador REST
@RequestMapping("/veterinaria") // Prefijo de la ruta para todas las rutas en este controlador
public class VeterinariaController {
    @GetMapping("/bienvenida") // Ruta: /veterinaria/bienvenida
    public String saludar(){
        return "Bienvenido al Sistema de Gestión Veterinaria";
    }
    
}
