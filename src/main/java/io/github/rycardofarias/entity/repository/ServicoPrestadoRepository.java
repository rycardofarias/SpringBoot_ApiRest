package io.github.rycardofarias.entity.repository;

import io.github.rycardofarias.entity.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoPrestadoRepository extends JpaRepository<Cliente, Integer>{
}
