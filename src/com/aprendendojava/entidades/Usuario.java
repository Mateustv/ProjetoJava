package com.aprendendojava.entidades;

import com.aprendendojava.dominios.Matricula;
import com.aprendendojava.dominios.Nome;
import com.aprendendojava.dominios.Senha;

public class Usuario {
    private Nome nome;
    private Senha senha;
    private Matricula matricula;

    public Nome getNome() {
        return nome;
    }

    public void setNome(Nome nome) {
        this.nome = nome;
    }

    public Senha getSenha() {
        return senha;
    }

    public void setSenha(Senha senha) {
        this.senha = senha;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }
}
