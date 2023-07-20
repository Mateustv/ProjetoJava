package com.aprendendojava.dominios;

import java.util.HashMap;
import java.util.Map;

public class Disciplina {
    private String nome;
    private void validar (String nome) {
        if (nome == null || nome.length() == 0) {
            throw new IllegalArgumentException("Nome inválido");
        }
        Map<String, Integer> allowed_values =  new HashMap<>();
        allowed_values.put("Arquitetura", 1);
        allowed_values.put("Desenvolvimento", 2);
        allowed_values.put("Gerenciamento", 3);
        allowed_values.put("Implantacao", 4);
        allowed_values.put("Requisitos", 5);
        allowed_values.put("Teste", 6);
        if (!allowed_values.containsKey(nome)) {
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
