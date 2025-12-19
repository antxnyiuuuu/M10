package com.krakedev.veterinaria.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.krakedev.veterinaria.entity.mascota;
@RestController
@RequestMapping("/api/mascotas")
public class MascotaController {

    
    private List<mascota> mascotas = new ArrayList<>();

    private MascotaController() {
        mascotas.add(new mascota(1, "Firulais", "Perro", 3, "Juan Perez"));
        mascotas.add(new mascota(2, "Michi", "Gato", 2, "Ana Gomez"));
        mascotas.add(new mascota(3, "Nemo", "Pez", 1, "Carlos Ruiz"));
        mascotas.add(new mascota(4, "Bobby", "Perro", 4, "Laura Martinez"));
        mascotas.add(new mascota(5, "Luna", "Gato", 5, "Sofia Lopez"));
    }
    @GetMapping
    public List<mascota> obtenerMascotas() {
        return mascotas;
    }

    @GetMapping("/{id}")
    public mascota obtenerMascotaPorId(@PathVariable int id) {
        Optional<mascota> mascotaEncontrada = mascotas.stream()
        .filter(m -> m.getId() == id).
        findFirst();
        return mascotaEncontrada.orElse(null);
    }
}
