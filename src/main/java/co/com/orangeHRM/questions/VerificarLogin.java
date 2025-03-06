package co.com.orangeHRM.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

import static co.com.orangeHRM.userinterface.InicioSesion_Page.LABEL_LOGIN;


public class VerificarLogin implements Question <Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(LABEL_LOGIN).answeredBy(actor);}

    public static VerificarLogin verificarLogin() {
        return new VerificarLogin();
    }

}

