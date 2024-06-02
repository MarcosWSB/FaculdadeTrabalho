package com.faculdade.facul.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.faculdade.facul.dto.UsuarioDto;

public class SwaggerController {
    @GetMapping("/mostrar-nome")
    public String MostrarNome(@RequestParam String nome){
        return "O nome é: " + nome;
    }

    @PostMapping("/listar-nomes")
    public List<UsuarioDto> ExibirListaDeNomes(@RequestBody List<UsuarioDto> listaNomes) {
        return listaNomes;
    }
    @GetMapping("/listar-idade")
    public String MostrarIdade(@RequestParam int idade) {
        return "A idade é: " + idade;
    }
}
