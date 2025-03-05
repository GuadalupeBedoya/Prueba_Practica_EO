package co.com.orangeHRM.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

import static co.com.orangeHRM.userinterface.inicioSesionPage.LABEL_INVALID_CREDENCIALS;


public class MensajeCredencialesInvalidas implements Question <Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(LABEL_INVALID_CREDENCIALS).answeredBy(actor);
    }
    public static MensajeCredencialesInvalidas mensajeCredencialesInvalidas() {
        return new MensajeCredencialesInvalidas();
    }

}
