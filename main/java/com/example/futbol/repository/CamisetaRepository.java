package com.example.futbol.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.futbol.model.Camiseta;

public interface CamisetaRepository extends JpaRepository<Camiseta, Long> {
}
