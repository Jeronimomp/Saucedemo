package com.prueba.tecnica.automatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static final Target USUARIO=Target.the("Usuario").locatedBy("//input[@id='user-name']");
    public static final Target CONTRASENA=Target.the("Contraseña").locatedBy("//input[@id='password']");
    public static final Target BTN_LOGIN=Target.the("lOGIN").locatedBy("//input[@id='login-button']");
}
