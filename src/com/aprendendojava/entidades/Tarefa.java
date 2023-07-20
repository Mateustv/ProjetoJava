package com.aprendendojava.entidades;

import com.aprendendojava.dominios.Codigo;
import com.aprendendojava.dominios.Data;
import com.aprendendojava.dominios.Disciplina;
import com.aprendendojava.dominios.Texto;

public class Tarefa {
    private Texto nome;

    public Texto getNome() {
        return nome;
    }

    public void setNome(Texto nome) {
        this.nome = nome;
    }

    public Data getInicio() {
        return inicio;
    }

    public void setInicio(Data inicio) {
        this.inicio = inicio;
    }

    public Data getTermino() {
        return termino;
    }

    public void setTermino(Data termino) {
        this.termino = termino;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Codigo getCodigo() {
        return codigo;
    }

    public void setCodigo(Codigo codigo) {
        this.codigo = codigo;
    }

    public Codigo getCodigoProjeto() {
        return codigoProjeto;
    }

    public void setCodigoProjeto(Codigo codigoProjeto) {
        this.codigoProjeto = codigoProjeto;
    }

    private Data inicio;
    private Data termino;
    private Disciplina disciplina;
    private Codigo codigo;
    private Codigo codigoProjeto;


}
