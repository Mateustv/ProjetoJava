package com.aprendendojava.entidades;

import com.aprendendojava.dominios.Codigo;
import com.aprendendojava.dominios.Matricula;
import com.aprendendojava.dominios.Texto;

public class Projeto {
    private Texto nome;
    private Texto descricao;
    private Codigo codigo;
    private Matricula matricula_usario;

    public Texto getNome() {
        return nome;
    }

    public void setNome(Texto nome) {
        this.nome = nome;
    }

    public Texto getDescricao() {
        return descricao;
    }

    public void setDescricao(Texto descricao) {
        this.descricao = descricao;
    }

    public Codigo getCodigo() {
        return codigo;
    }

    public void setCodigo(Codigo codigo) {
        this.codigo = codigo;
    }

    public Matricula getMatricula_usario() {
        return matricula_usario;
    }

    public void setMatricula_usario(Matricula matricula_usario) {
        this.matricula_usario = matricula_usario;
    }
}
