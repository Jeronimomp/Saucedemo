package com.prueba.tecnica.automatizacion.tasks;

import com.prueba.tecnica.automatizacion.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    private String user, pass;

    public Login(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
   actor.attemptsTo(
           Enter.theValue(user).into(LoginPage.USUARIO),
           Enter.theValue(pass).into(LoginPage.CONTRASENA),
           Click.on(LoginPage.BTN_LOGIN)
   );
    }

public static Login conCredenciales(String user, String pass){
        return Tasks.instrumented(Login.class, user,pass );
}
}
