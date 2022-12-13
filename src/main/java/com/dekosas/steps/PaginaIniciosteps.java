package com.dekosas.steps;

import com.dekosas.pageObjects.PaginaInicioPageObjects;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class PaginaIniciosteps {


    @Steps
    PaginaInicioPageObjects paginaInicioPageObjects = new PaginaInicioPageObjects();


    @Step
    public void abrirNavegador () {
       paginaInicioPageObjects.open();
    }
}
