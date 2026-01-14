package com.krakedev.veterinaria.service;

import java.util.List;
import java.util.Optional;

import com.krakedev.veterinaria.entity.Mascota;

public interface VeterinariaService {
    Mascota registrarMascota(Mascota mascota);

    Optional<Mascota> buscarMascotaPorId(Long id);

    List<Mascota> buscarTodasLasMascotas();

    void eliminarMascota(Long id);

    Mascota actualizarMascota(Long id, Mascota mascota);

}
