package com.prueba.tecnica.automatizacion.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class WaitTime implements Interaction {
    private int time;

    public WaitTime(int time) {
        this.time = time;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(time*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static WaitTime inSeconds(int time){
        return Tasks.instrumented(WaitTime.class, time);
    }
}
