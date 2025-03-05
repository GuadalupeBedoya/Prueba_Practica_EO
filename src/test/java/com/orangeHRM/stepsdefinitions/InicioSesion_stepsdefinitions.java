package com.orangeHRM.stepsdefinitions;

import co.com.orangeHRM.questions.MensajeCredencialesInvalidas;
import co.com.orangeHRM.questions.verificarPaginaPrincipal;
import co.com.orangeHRM.tasks.abrirUrl;
import co.com.orangeHRM.tasks.ingresarCredenciales;
import co.com.orangeHRM.utils.Constantes;
import com.orangeHRM.stepsdefinitions.setup.setupFront;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class InicioSesion_stepsdefinitions extends setupFront {
    @Before
    public void prepararTest() { setUpTest(); }

    @Dado("que el usuario accede a la pagina de inicio de sesion de OrangeHRM")
    public void queElUsuarioAccedeALaPaginaDeInicioDeSesionDeOrangeHRM() {
        theActorInTheSpotlight().wasAbleTo(abrirUrl.abrirUrl());
    }

    @Cuando("el usuario ingresa los datos de usuario y contraseña y de clic en Login")
    public void elUsuarioIngresaLosDatosDeUsuarioYContraseñaYDeClicEnLogin() {
        theActorInTheSpotlight()
                .wasAbleTo(ingresarCredenciales.con(Constantes.USERNAME_LOGIN, Constantes.PASSWORD_LOGIN));
    }

    @Entonces("debería ver la página de inicio del sistema")
    public void deberíaVerLaPáginaDeInicioDelSistema() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(verificarPaginaPrincipal.verificarPaginaPrincipal(),
                Matchers.is(Matchers.equalTo(true))));
    }

    @Cuando("el usuario ingresa el usuario o la contraseña de forma incorrecta")
    public void elUsuarioIngresaElUsuarioOLaContraseñaDeFormaIncorrecta() {
        theActorInTheSpotlight().wasAbleTo(abrirUrl.abrirUrl());
        theActorInTheSpotlight().wasAbleTo(ingresarCredenciales.con(Constantes.USERNAME_LOGIN, Constantes.PASSWORD_LOGIN_INCORRECTO));

    }

    @Entonces("debería ver un mensaje de error")
    public void debería_ver_un_mensaje_de_error() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(MensajeCredencialesInvalidas.mensajeCredencialesInvalidas(),
                Matchers.is(Matchers.equalTo(true))));

    }
}



