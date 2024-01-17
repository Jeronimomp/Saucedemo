package com.prueba.tecnica.automatizacion.exceptions;

public class CouldNotReadTheJsonException extends Exception{
    public CouldNotReadTheJsonException(String message, Throwable e) {
        super(message, e);
    }
}
