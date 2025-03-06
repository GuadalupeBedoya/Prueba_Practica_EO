package co.com.orangeHRM.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

import static co.com.orangeHRM.userinterface.PaginaAdmin_Page.LABEL_USERNAME;
import static co.com.orangeHRM.userinterface.PaginaAdmin_Page.LABEL_USER_ROLE;

public class VerificarConsultaEmpleado implements Question <Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean usernameVisible = Visibility.of(LABEL_USERNAME).answeredBy(actor);
        boolean userRoleVisible = Visibility.of(LABEL_USER_ROLE).answeredBy(actor);
        return usernameVisible && userRoleVisible;
    }

    public static VerificarConsultaEmpleado esVisible() {
        return new VerificarConsultaEmpleado();
    }
}




