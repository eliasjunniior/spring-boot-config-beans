package com.example.demo.entity;

public class Pessoa {
    private String nome;
    private Integer idade;
    private String sexo;
    private String estadoCivil;
    private String profissao;

    public Pessoa() {
    }

    public Pessoa(String nome, Integer idade, String sexo, String estadoCivil, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.profissao = profissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                ", profissao='" + profissao + '\'' +
                '}';
    }
}