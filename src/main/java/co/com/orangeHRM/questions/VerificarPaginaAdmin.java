package co.com.orangeHRM.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

import static co.com.orangeHRM.userinterface.PaginaPrincipal_Page.LABEL_ADMIN_SYSTEM_USERS;

public class VerificarPaginaAdmin implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {

        return Visibility.of(LABEL_ADMIN_SYSTEM_USERS).answeredBy(actor);
    }

    public static VerificarPaginaAdmin verificarPaginaAdmin () {
        return new VerificarPaginaAdmin();
    }
}

