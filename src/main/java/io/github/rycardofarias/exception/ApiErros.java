package io.github.rycardofarias.exception;

import lombok.Getter;

import java.util.Arrays;
import java.util.List;

public class ApiErros {

    @Getter
    private List<String> erros;

    public ApiErros (List<String> erros){
        this.erros = erros;
    }
    public ApiErros(String message){
        this.erros = Arrays.asList(message);
    }
}
