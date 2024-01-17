package com.prueba.tecnica.automatizacion.utils;

public enum DataLogin {
    USER("standard_user"),
    PASS("secret_sauce");

    private final String path;

    DataLogin(String path) {
        this.path = path;
    }


    public String getPath() {
        return path;
    }
}
