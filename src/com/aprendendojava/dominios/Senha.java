package com.aprendendojava.dominios;

public class Senha {
    private String senha;
    private void validar (String senha) {
        if (senha == null || senha.length() == 0) {
            throw new IllegalArgumentException("Senha inválida");
        }
        if (senha.length() < 8) {
            throw new IllegalArgumentException("Senha inválida");
        }
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        validar(senha);
        this.senha = senha;
    }
}
