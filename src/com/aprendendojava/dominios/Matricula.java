package com.aprendendojava.dominios;

public class Matricula {
    private String matricula;
    private void validar (String matricula) {
        if (matricula == null || matricula.length() == 0) {
            throw new IllegalArgumentException("Matrícula inválida");
        }
        if (matricula.length() != 6) {
            throw new IllegalArgumentException("Matrícula inválida");
        }
        if (!matricula.matches("[A-Z]{3}[0-9]{3}")) {
            throw new IllegalArgumentException("Matrícula inválida");
        }
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        validar(matricula);
        this.matricula = matricula;
    }
}
