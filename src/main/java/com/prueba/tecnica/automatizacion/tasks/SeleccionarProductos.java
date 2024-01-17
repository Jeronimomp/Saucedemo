package com.prueba.tecnica.automatizacion.tasks;

import com.prueba.tecnica.automatizacion.interactions.WaitTime;
import com.prueba.tecnica.automatizacion.userinterfaces.ProductosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarProductos implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ProductosPage.ADD_BOLSO),
                Click.on(ProductosPage.ADD_BIKE_LIGHT),
                Click.on(ProductosPage.BTN_VER_CARRITO),
                WaitTime.inSeconds(3)
        );
    }

    public static SeleccionarProductos yVisualizarlos(){
        return Tasks.instrumented(SeleccionarProductos.class);
    }
}
