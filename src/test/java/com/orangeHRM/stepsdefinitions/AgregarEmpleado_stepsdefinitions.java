package com.orangeHRM.stepsdefinitions;

import co.com.orangeHRM.tasks.AgregarEmpleado;
import co.com.orangeHRM.tasks.abrirUrl;
import co.com.orangeHRM.tasks.ingresarCredenciales;
import co.com.orangeHRM.utils.Constantes;
import com.orangeHRM.stepsdefinitions.setup.setupFront;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AgregarEmpleado_stepsdefinitions extends setupFront {
    @Before
    public void prepararTest() { setUpTest(); }

    @Dado("que el usuario inicia sesión en OrangeHRM")
    public void queElUsuarioIniciaSesiónEnOrangeHRM() {
        theActorInTheSpotlight().wasAbleTo(abrirUrl.abrirUrl());
        theActorInTheSpotlight()
                .wasAbleTo(ingresarCredenciales.con(Constantes.USERNAME_LOGIN, Constantes.PASSWORD_LOGIN));
    }

    @Cuando("agrega un nuevo empleado con informacion valida")
    public void agregaUnNuevoEmpleadoConInformacionValida() {
        theActorInTheSpotlight().wasAbleTo(AgregarEmpleado.agregarEmpleado());

    }
    @Entonces("el sistema confirma el registro con un mensaje de exito")
    public void elSistemaConfirmaElRegistroConUnMensajeDeExito() {

    }



}
