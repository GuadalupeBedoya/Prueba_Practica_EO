package com.orangeHRM.stepsdefinitions;

import co.com.orangeHRM.questions.MensajeCredencialesInvalidas;
import co.com.orangeHRM.questions.VerificarPaginaPrincipal;
import co.com.orangeHRM.tasks.AbrirUrl_tasks;
import co.com.orangeHRM.tasks.IngresarCredenciales_tasks;
import co.com.orangeHRM.utils.Constantes;
import com.orangeHRM.stepsdefinitions.setup.setupFront;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.equalTo;

public class InicioSesion_stepsdefinitions extends setupFront {
    @Before
    public void prepararTest() { setUpTest(); }

    @Dado("que el usuario accede a la pagina de inicio de sesion de OrangeHRM")
    public void queElUsuarioAccedeALaPaginaDeInicioDeSesionDeOrangeHRM() {
        theActorInTheSpotlight().wasAbleTo(AbrirUrl_tasks.abrirUrl());
    }

    @Cuando("el usuario ingresa los datos de usuario y contraseña y de clic en Login")
    public void elUsuarioIngresaLosDatosDeUsuarioYContraseñaYDeClicEnLogin() {
        theActorInTheSpotlight()
                .wasAbleTo(IngresarCredenciales_tasks.con(Constantes.USERNAME_LOGIN, Constantes.PASSWORD_LOGIN));
    }

    @Entonces("debería ver la página de inicio del sistema")
    public void deberíaVerLaPáginaDeInicioDelSistema() {
        theActorInTheSpotlight().should(seeThat(VerificarPaginaPrincipal.verificarPaginaPrincipal(),
                Matchers.is(equalTo(true))));
    }

    @Cuando("el usuario ingresa el usuario o la contraseña de forma incorrecta")
    public void elUsuarioIngresaElUsuarioOLaContraseñaDeFormaIncorrecta() {
        theActorInTheSpotlight().wasAbleTo(
                AbrirUrl_tasks.abrirUrl());
        theActorInTheSpotlight().wasAbleTo(
                IngresarCredenciales_tasks.con(Constantes.USERNAME_LOGIN, Constantes.PASSWORD_LOGIN_INCORRECT));
    }

    @Entonces("debería ver un mensaje de error")
    public void debería_ver_un_mensaje_de_error() {
        theActorInTheSpotlight().should(
                seeThat(MensajeCredencialesInvalidas.mensajeCredencialesInvalidas(), equalTo(true))
        );
    }
}



