package com.krakedev.inventario.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.krakedev.inventario.entity.Message;

@RestController
@RequestMapping("/api/messages")

public class MessageController {
    
    private List<Message> mensajes = new ArrayList<>();

    private MessageController(){
        mensajes.add(new Message(1,"Krake Dev escuela de programacion"));
        mensajes.add(new Message(2,"Spring Boot desde cero"));    
    }
    @GetMapping
    public List<Message> listarMensajes(){
        return mensajes;
    }

    /// Mensajes/id(2)
    @GetMapping("/{id}")
    public Message obtenerMensajePorID(@PathVariable int id){
        Optional<Message> menssaje = mensajes.stream()
        .filter(m -> m.getId()== id).
        findFirst();

    return menssaje.orElse(null);
    }


    @PostMapping
    public Message crearMensaje (@RequestBody Message message) {
        mensajes.add(message);
        return message;
    }

}

