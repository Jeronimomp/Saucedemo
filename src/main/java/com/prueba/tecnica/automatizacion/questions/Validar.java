package com.prueba.tecnica.automatizacion.questions;

import com.prueba.tecnica.automatizacion.userinterfaces.OrdenCompletadaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Validar implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        String mensajeFinal= OrdenCompletadaPage.TEXTO_GRACIAS.resolveFor(actor).getText();

        return  mensajeFinal;
    }

    public static Validar texto(){

        return new Validar();
    }
}
