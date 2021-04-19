package io.github.rycardofarias.entity.repository;

import io.github.rycardofarias.entity.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
