package com.aprendendojava.dominios;

public class Data {
    private String data;
    private void validar (String data) {
        if (data == null || data.length() == 0) {
            throw new IllegalArgumentException("Data inválida");
        }
        if (data.length() != 10) {
            throw new IllegalArgumentException("Data inválida");
        }
        if (!data.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}")) {
            throw new IllegalArgumentException("Data inválida");
        }
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        validar(data);
        this.data = data;
    }
}
