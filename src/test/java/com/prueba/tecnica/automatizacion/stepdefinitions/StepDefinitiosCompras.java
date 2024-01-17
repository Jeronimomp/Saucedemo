package com.prueba.tecnica.automatizacion.stepdefinitions;

import com.prueba.tecnica.automatizacion.questions.Validar;
import com.prueba.tecnica.automatizacion.tasks.Login;
import com.prueba.tecnica.automatizacion.tasks.SeleccionarProductos;
import com.prueba.tecnica.automatizacion.tasks.Verificacion;
import com.prueba.tecnica.automatizacion.utils.DataLogin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import org.assertj.core.error.ShouldBeAfterOrEqualTo;
import static org.hamcrest.Matchers.equalTo;

public class StepDefinitiosCompras {

    @Given("el cliente se loguea en la pagina de compras")
    public void elClienteSeLogueaEnLaPaginaDeCompras() {

      OnStage.theActorInTheSpotlight().wasAbleTo(
                Open.url("https://www.saucedemo.com/checkout-complete.html"),
                Login.conCredenciales(DataLogin.USER.getPath(), DataLogin.PASS.getPath())

        );

    }
    @When("selecciona los productos a comprar")
    public void seleccionaLosProductosAComprar() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarProductos.yVisualizarlos()
        );

    }
    @When("completa el formulario de compras {string} {string} {string}")
    public void completaElFormularioDeCompras(String nombre, String apellido, String codigoPostal) {
    OnStage.theActorInTheSpotlight().attemptsTo(
            Verificacion.delproducto(nombre,apellido,codigoPostal)
    );
    }
    @Then("puede ver el mensaje {string}")
    public void puedeVerElMensaje(String mensaje) {
   OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Validar.texto(),equalTo(mensaje)));
    }

}
