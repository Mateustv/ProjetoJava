package com.aprendendojava.dominios;

public class Nome {
    private String nome;
    private void validar (String nome) {
        if (nome == null || nome.length() == 0) {
            throw new IllegalArgumentException("Nome inválido");
        }
        if (nome.length() < 3 || nome.length() > 50) {
            throw new IllegalArgumentException("Nome inválido");
        }
        if (!nome.matches("[A-Z][a-z]+( [A-Z][a-z]+)*")) {
            throw new IllegalArgumentException("Nome inválido");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        validar(nome);
        this.nome = nome;
    }
}
