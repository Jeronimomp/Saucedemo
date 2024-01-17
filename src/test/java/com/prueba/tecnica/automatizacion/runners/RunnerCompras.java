package com.prueba.tecnica.automatizacion.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/ComprasOnline.feature",
        glue = {"com.prueba.tecnica.automatizacion.stepdefinitions",
                "com.prueba.tecnica.automatizacion.setup"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        publish = false)

public class RunnerCompras {

}
