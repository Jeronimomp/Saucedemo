package com.prueba.tecnica.automatizacion.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter

@AllArgsConstructor
@NoArgsConstructor
public class UserLoginModel implements Serializable {
    @JsonProperty("user")
    private String user;

    @JsonProperty("pass")
    private String pass;
}
