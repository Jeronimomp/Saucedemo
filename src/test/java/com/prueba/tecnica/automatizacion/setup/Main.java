package com.prueba.tecnica.automatizacion.setup;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class Main {

    @Before
    public void config(){
        OnStage.setTheStage(new OnlineCast()) ;
        OnStage.theActorCalled("Angel");
    }
}
