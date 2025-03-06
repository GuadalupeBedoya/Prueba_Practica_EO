package com.orangeHRM.stepsdefinitions;

import co.com.orangeHRM.questions.VerificarConsultaEmpleado;
import co.com.orangeHRM.questions.VerificarLogin;
import co.com.orangeHRM.tasks.*;
import co.com.orangeHRM.utils.Constantes;
import com.orangeHRM.stepsdefinitions.setup.setupFront;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ConsultarEmpleado_stepsdefinitions extends setupFront {
    public void prepararTest() { setUpTest(); }


    @Dado("que el usuario administrador esta en la pagina de Admin de OrangeHRM")
    public void queElUsuarioAdministradorEstaEnLaPaginaDeAdminDeOrangeHRM() {
        theActorInTheSpotlight().wasAbleTo(AbrirUrl_tasks.abrirUrl());
        theActorInTheSpotlight()
                .wasAbleTo(IngresarCredenciales_tasks.con(Constantes.USERNAME_LOGIN, Constantes.PASSWORD_LOGIN));

   }

    @Cuando("busca al empleado previamente registrado con el Username")
    public void buscaAlEmpleadoPreviamenteRegistradoConElUsername() {
        theActorInTheSpotlight().wasAbleTo(ConsultarEmpleado_tasks.consultarEmpleado());
    }

    @Entonces("el sistema debe mostrar los datos correctos del empleado")
    public void elSistemaDebeMostrarLosDatosCorrectosDelEmpleado() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                VerificarConsultaEmpleado.esVisible(),
                Matchers.is(true)));
    }

    @Entonces("despues de visualizar los datos el administrador elimina al empleado")
    public void despuesDeVisualizarLosDatosElAdministradorEliminaAlEmpleado() {
        theActorInTheSpotlight().wasAbleTo(EliminarEmpleado_tasks.eliminarEmpleadoTasks());

    }
    @Entonces("finalmente el administrador cierra sesion")
    public void finalmenteElAdministradorCierraSesion() {
        theActorInTheSpotlight().wasAbleTo(CerrarSesion_tasks.cerrarSesionTasks());
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarLogin.verificarLogin(),
                Matchers.is(true)));


    }

}
