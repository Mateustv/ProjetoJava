package com.aprendendojava.dominios;

public class Codigo {
    private String codigo;
    private void validar (String codigo) {
        if (codigo == null || codigo.length() == 0) {
            throw new IllegalArgumentException("Código inválido");
        }
        if (codigo.length() != 6) {
            throw new IllegalArgumentException("Código inválido");
        }
        if (!codigo.matches("[A-Z]{3}[0-9]{3}")) {
            throw new IllegalArgumentException("Código inválido");
        }
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        validar(codigo);
        this.codigo = codigo;
    }
}
