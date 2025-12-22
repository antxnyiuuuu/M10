package com.krakedev.veterinaria.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krakedev.veterinaria.entity.mascota;
import java.util.List;

@Repository
public interface MascotaRepository extends JpaRepository<mascota, Long> {
    Optional<mascota> findById(Long id);

    Optional<mascota> findByNombre(String nombre);
}
