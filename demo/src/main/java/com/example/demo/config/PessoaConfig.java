package com.example.demo.config;

import com.example.demo.entity.Pessoa;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PessoaConfig {

    @Value("${pessoa.nome}")
    private String nome;

    @Value("${pessoa.idade}")
    private Integer idade;

    @Value("${pessoa.sexo}")
    private String sexo;

    @Value("${pessoa.estado-civil}")
    private String estadoCivil;

    @Value("${pessoa.profissao}")
    private String profissao;

    @Bean
    public Pessoa pessoaBean() {
        return new Pessoa(nome, idade, sexo, estadoCivil, profissao);
    }
}