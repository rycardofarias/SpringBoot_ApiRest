package io.github.rycardofarias.entity.repository;

import io.github.rycardofarias.entity.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Optional<Usuario> findByUsername( String username );
}
