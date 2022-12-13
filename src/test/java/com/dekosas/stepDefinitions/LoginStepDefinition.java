package com.dekosas.stepDefinitions;

import com.dekosas.steps.PaginaIniciosteps;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class LoginStepDefinition {

    @Steps
    PaginaIniciosteps paginaIniciosteps;

    @Step
    @Dado("^el usuario se encuentre en la pagina web Dekosas$")
    public void elUsuarioSeEncuentreEnLaPaginaWebDekosas() {
        paginaIniciosteps.abrirNavegador();
    }


    @Cuando("^el ingrese el usuario$")
    public void elIngreseElUsuario() {

    }

    @Cuando("^la clave$")
    public void laClave() {

    }

    @Entonces("^el visualizara Inicio de cuenta exitoso$")
    public void elVisualizaraInicioDeCuentaExitoso() {

    }

}
