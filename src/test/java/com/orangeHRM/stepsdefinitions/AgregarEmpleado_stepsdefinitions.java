package com.orangeHRM.stepsdefinitions;

import co.com.orangeHRM.questions.VerificarPaginaAdmin;
import co.com.orangeHRM.tasks.AgregarEmpleado_tasks;
import co.com.orangeHRM.tasks.AbrirUrl_tasks;
import co.com.orangeHRM.tasks.IngresarCredenciales_tasks;
import co.com.orangeHRM.utils.Constantes;
import com.orangeHRM.stepsdefinitions.setup.setupFront;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AgregarEmpleado_stepsdefinitions extends setupFront {
    @Before
    public void prepararTest() { setUpTest(); }

    @Dado("que el usuario inicia sesion en OrangeHRM")
    public void queElUsuarioIniciaSesionEnOrangeHRM() {
        theActorInTheSpotlight().wasAbleTo(AbrirUrl_tasks.abrirUrl());
        theActorInTheSpotlight()
                .wasAbleTo(IngresarCredenciales_tasks.con(Constantes.USERNAME_LOGIN, Constantes.PASSWORD_LOGIN));
    }

    @Cuando("agrega un nuevo empleado con informacion valida")
    public void agregaUnNuevoEmpleadoConInformacionValida() {
        theActorInTheSpotlight().wasAbleTo(AgregarEmpleado_tasks.agregarEmpleado());

    }

    @Entonces("el sistema redirige al usuario a la pagina de administracion")
    public void elSistemaRedirigeAlUsuarioALaPaginaDeAdministracion() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarPaginaAdmin.verificarPaginaAdmin(),
                Matchers.is(Matchers.equalTo(true))));
    }


}
