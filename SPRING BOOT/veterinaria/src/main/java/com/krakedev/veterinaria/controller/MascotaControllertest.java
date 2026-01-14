/*
 * package com.krakedev.veterinaria.controller;
 * 
 * import java.util.List;
 * import java.util.Optional;
 * 
 * import org.springframework.http.HttpStatus;
 * import org.springframework.http.ResponseEntity;
 * import org.springframework.web.bind.annotation.DeleteMapping;
 * import org.springframework.web.bind.annotation.GetMapping;
 * import org.springframework.web.bind.annotation.PathVariable;
 * import org.springframework.web.bind.annotation.PostMapping;
 * import org.springframework.web.bind.annotation.PutMapping;
 * import org.springframework.web.bind.annotation.RequestBody;
 * import org.springframework.web.bind.annotation.RequestMapping;
 * import org.springframework.web.bind.annotation.RestController;
 * 
 * import com.krakedev.veterinaria.entity.Mascota;
 * import com.krakedev.veterinaria.service.MascotaService;
 * 
 * import lombok.RequiredArgsConstructor;
 * 
 * @RestController
 * 
 * @RequestMapping("/api/mascotas")
 * 
 * @RequiredArgsConstructor
 * public class MascotaController {
 * 
 * private final MascotaService mascotaService;
 * 
 * @GetMapping
 * public ResponseEntity<List<Mascota>> obtenerMascotas() {
 * List<Mascota> mascotas = mascotaService.listarMascotas();
 * return ResponseEntity.ok(mascotas);
 * }
 * 
 * @GetMapping("/{id}")
 * public ResponseEntity<Mascota> obtenerMascotaPorId(@PathVariable Long id) {
 * Optional<Mascota> mascota = mascotaService.buscarPorId(id);
 * return mascota.map(ResponseEntity::ok)
 * .orElse(ResponseEntity.notFound().build());
 * }
 * 
 * @GetMapping("/nombre/{nombre}")
 * public ResponseEntity<Mascota> obtenerMascotaPorNombre(@PathVariable String
 * nombre) {
 * Optional<Mascota> mascota = mascotaService.buscarPorNombre(nombre);
 * return mascota.map(ResponseEntity::ok)
 * .orElse(ResponseEntity.notFound().build());
 * }
 * 
 * @PostMapping
 * public ResponseEntity<Mascota> crearMascota(@RequestBody Mascota mascota) {
 * Mascota nuevaMascota = mascotaService.registrarMascota(mascota);
 * return ResponseEntity.status(HttpStatus.CREATED).body(nuevaMascota);
 * }
 * 
 * @PutMapping("/{id}")
 * public ResponseEntity<Mascota> actualizarMascota(@PathVariable Long
 * id, @RequestBody Mascota mascota) {
 * try {
 * Mascota mascotaActualizada = mascotaService.actualizarMascota(id, mascota);
 * return ResponseEntity.ok(mascotaActualizada);
 * } catch (RuntimeException e) {
 * return ResponseEntity.notFound().build();
 * }
 * }
 * 
 * @DeleteMapping("/{id}")
 * public ResponseEntity<Void> eliminarMascota(@PathVariable Long id) {
 * try {
 * mascotaService.eliminarMascota(id);
 * return ResponseEntity.noContent().build();
 * } catch (RuntimeException e) {
 * return ResponseEntity.notFound().build();
 * }
 * }
 * }
 */