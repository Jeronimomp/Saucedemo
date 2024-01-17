package com.prueba.tecnica.automatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ProductosPage {
    public static final Target ADD_BOLSO=Target.the("Bolso").locatedBy("//button[@id='add-to-cart-sauce-labs-backpack']");
    public static final Target ADD_BIKE_LIGHT=Target.the("Contraseña").locatedBy("//button[@id='add-to-cart-sauce-labs-bike-light']");
    public static final Target BTN_VER_CARRITO=Target.the("Carrito").locatedBy("//a[@class='shopping_cart_link']");

}
