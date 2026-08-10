package br.com.etec.ingresso.controller;

import br.com.etec.ingresso.enums.SimNaoEnum;
import br.com.etec.ingresso.entity.Filme;

import br.com.etec.ingresso.enums.ClassificacaoIndicativaEnum;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/filmes")

public class FilmeController {
    @GetMapping
    public List<Filme> listar(){
        Filme filme1 = Filme.builder().id(1L).nome("Matrix").classificacao(ClassificacaoIndicativaEnum.A16).emCartaz(SimNaoEnum.S).build();
        Filme filme2 = Filme.builder().id(1L).nome("Homem Aranha").classificacao(ClassificacaoIndicativaEnum.A16).emCartaz(SimNaoEnum.S).build();
        return List.of(filme1, filme2);
    }
    @GetMapping("/{id}")
    public Filme buscarPorId(@PathVariable Long id){
        Filme filme1 = Filme.builder().id(1L).nome("Matrix").classificacao(ClassificacaoIndicativaEnum.A16).emCartaz(SimNaoEnum.S).build();
        return filme1;
    }
    @PostMapping
    public Filme cadastrar(@RequestBody Filme filme){
        filme.setId(67L);
        return filme;
    }
}
