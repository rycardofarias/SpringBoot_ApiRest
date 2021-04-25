package io.github.rycardofarias.rest;

import io.github.rycardofarias.UsuarioService;
import io.github.rycardofarias.entity.model.Usuario;
import io.github.rycardofarias.entity.repository.UsuarioRepository;
import io.github.rycardofarias.exception.UsuarioCadastradoException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void salvar(@RequestBody @Valid Usuario usuario){
        try{
            usuarioService.salvar(usuario);
        }catch (UsuarioCadastradoException e){
            throw  new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }
    }
}

