package com.prueba.tecnica.automatizacion.tasks;

import com.prueba.tecnica.automatizacion.interactions.WaitTime;
import com.prueba.tecnica.automatizacion.userinterfaces.CheckoutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actors.OnStage;

public class Verificacion implements Task {
    private String nombre, apellido, codigoPostal;

    public Verificacion(String nombre, String apellido, String codigoPostal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoPostal = codigoPostal;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CheckoutPage.BTN_CHECKOUT),
                Enter.theValue(nombre).into(CheckoutPage.NOMBRE),
                Enter.theValue(apellido).into(CheckoutPage.APELLIDO),
                Enter.theValue(codigoPostal).into(CheckoutPage.CODIGO_POSTAL),
                Click.on(CheckoutPage.BTN_CONTINUAR),
                Click.on(CheckoutPage.BTN_FINALIZAR),
                WaitTime.inSeconds(3)

        );
    }

    public static Verificacion delproducto(String nombre, String apellido, String codigoPostal){
        return Tasks.instrumented(Verificacion.class, nombre, apellido, codigoPostal);
    }
}
