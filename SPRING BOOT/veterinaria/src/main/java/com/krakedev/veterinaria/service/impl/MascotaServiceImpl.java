package com.krakedev.veterinaria.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.krakedev.veterinaria.entity.EstadoMascota;
import com.krakedev.veterinaria.entity.Mascota;
import com.krakedev.veterinaria.repository.MascotaRepository;
import com.krakedev.veterinaria.service.MascotaService;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

@Service
@RequiredArgsConstructor
public class MascotaServiceImpl implements MascotaService {

    private final MascotaRepository mascotaRepository;

    @Override
    @SneakyThrows
    public Mascota registrarMascota(Mascota mascota) {
        return mascotaRepository.save(mascota);
    }

    @Override
    public List<Mascota> listarMascotas() {
        return mascotaRepository.findAll();
    }

    @Override
    public Optional<Mascota> buscarPorNombre(String nombre) {
        return mascotaRepository.findByNombre(nombre);
    }

    @Override
    public Optional<Mascota> buscarPorId(Long id) {
        return mascotaRepository.findById(id);
    }

    @Override
    @SneakyThrows
    public Mascota actualizarMascota(Long id, Mascota mascota) {
        Mascota mascotaExistente = mascotaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Mascota no encontrada con id: " + id));

        mascotaExistente.setNombre(mascota.getNombre());
        mascotaExistente.setEspecie(mascota.getEspecie());
        mascotaExistente.setEdad(mascota.getEdad());
        mascotaExistente.setNombreDueño(mascota.getNombreDueño());

        return mascotaRepository.save(mascotaExistente);
    }

    @Override
    @SneakyThrows
    public void eliminarMascota(Long id) {
        if (!mascotaRepository.existsById(id)) {
            throw new RuntimeException("Mascota no encontrada con id: " + id);
        }
        mascotaRepository.deleteById(id);
    }

    @Override
    @SneakyThrows
    public Mascota cambiarEstado(Long id, EstadoMascota estado) {
        Mascota mascota = mascotaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Mascota no encontrada con id: " + id));

        mascota.setEstado(estado);
        return mascotaRepository.save(mascota);
    }

    @Override
    public List<Mascota> listarPorEstado(EstadoMascota estado) {
        return mascotaRepository.findByEstado(estado);
    }
}
