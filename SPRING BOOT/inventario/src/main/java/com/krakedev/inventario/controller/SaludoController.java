package com.krakedev.inventario;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/*  
    Controlador REST: Es una clase en Java que expone rutas HTTP (URLS) para que otros sistemas puedan enviarle peticiones
    y recibir respuestasen formato JSON.
*/


@RestController //Indica que esta clase es un controlador REST
@RequestMapping("/micontroller") // Prefijo de la ruta para todas las rutas en este controlador

public class SaludoController {
    @GetMapping("/saludo") // Ruta: /micontroller/saludo
    public String saludar(){
        return "Hola desde Spring Boot";
    }

}
