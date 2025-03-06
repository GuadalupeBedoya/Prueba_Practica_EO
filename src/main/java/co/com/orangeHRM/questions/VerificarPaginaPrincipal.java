package co.com.orangeHRM.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

import static co.com.orangeHRM.userinterface.PaginaPrincipal_Page.LABEL_AVISO_DASHBOARD;

public class VerificarPaginaPrincipal implements Question <Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(LABEL_AVISO_DASHBOARD).answeredBy(actor);}

    public static VerificarPaginaPrincipal verificarPaginaPrincipal() {
        return new VerificarPaginaPrincipal();
    }

}
