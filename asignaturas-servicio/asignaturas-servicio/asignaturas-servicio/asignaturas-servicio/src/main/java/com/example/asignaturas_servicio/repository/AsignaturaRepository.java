package com.example.asignaturas_servicio.repository;
import com.example.asignaturas_servicio.model.Asignatura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AsignaturaRepository extends JpaRepository<Asignatura, Long> {
}
