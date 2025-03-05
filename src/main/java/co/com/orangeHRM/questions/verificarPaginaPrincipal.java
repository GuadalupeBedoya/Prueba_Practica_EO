package co.com.orangeHRM.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

import static co.com.orangeHRM.userinterface.paginaPrincipalPage.LABEL_AVISO_DASHBOARD;

public class verificarPaginaPrincipal implements Question <Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) { return Visibility.of(LABEL_AVISO_DASHBOARD).answeredBy(actor);}
    public static verificarPaginaPrincipal verificarPaginaPrincipal() {return new verificarPaginaPrincipal();}

}
