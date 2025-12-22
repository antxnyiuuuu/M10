package com.krakedev.inventario.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krakedev.inventario.entity.producto;

@Repository
public interface ProductoRepository extends JpaRepository<producto, Long> {

    Optional<producto> findByIdproducto(long idproducto);

    Optional<producto> findByNombreProducto(long nombreProducto);

}
