package com.aprendendojava.dominios;

public class Texto {
    private String texto;
    private void validar (String texto) {
        if (texto == null || texto.length() == 0 || texto.length() > 255) {
            throw new IllegalArgumentException("Texto inválido");
        }
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        validar(texto);
        this.texto = texto;
    }
}
