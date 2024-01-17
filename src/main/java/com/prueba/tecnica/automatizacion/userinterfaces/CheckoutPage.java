package com.prueba.tecnica.automatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CheckoutPage {

    public static final Target BTN_CHECKOUT=Target.the("checkout").locatedBy("//button[@id='checkout']");
    public static final Target NOMBRE=Target.the("nombre").locatedBy("//input[@id='first-name']");
    public static final Target APELLIDO=Target.the("apellido").locatedBy("//input[@id='last-name']");
    public static final Target CODIGO_POSTAL=Target.the("codigo postal").locatedBy("//input[@id='postal-code']");
    public static final Target BTN_CONTINUAR=Target.the("continuar").locatedBy("//input[@id='continue']");
    public static final Target BTN_FINALIZAR=Target.the("finalizar").locatedBy("//button[@id='finish']");

}
