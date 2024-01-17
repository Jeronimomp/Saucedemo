package com.prueba.tecnica.automatizacion.setup;

import com.prueba.tecnica.automatizacion.utils.HisDriver;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class Main {

    @Before
    public void config(){
        OnStage.setTheStage(new OnlineCast()) ;
        OnStage.theActorCalled("Angel");
    }
}
