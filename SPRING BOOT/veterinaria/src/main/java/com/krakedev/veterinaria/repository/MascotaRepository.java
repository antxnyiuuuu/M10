package com.krakedev.veterinaria.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krakedev.veterinaria.entity.Mascota;
import java.util.List;

@Repository
public interface MascotaRepository extends JpaRepository<Mascota, Long> {
    Optional<Mascota> findById(Long id);

    Optional<Mascota> findByNombre(String nombre);

    List<Mascota> findAll();
}
