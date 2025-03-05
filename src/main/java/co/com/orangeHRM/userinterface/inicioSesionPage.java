package co.com.orangeHRM.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class inicioSesionPage extends PageObject {

    public static final Target USUARIO = Target.the("usuario")
            .locatedBy("//input[@placeholder=\"Username\"]");

    public static final Target CONTRASENA = Target.the("constrasena")
            .locatedBy("//input[@type=\"password\"]");

    public static final Target BTN_LOGIN = Target.the("btn_login")
            .locatedBy("//button[@type=\"submit\"]");

    public static final Target LABEL_INVALID_CREDENCIALS = Target.the("label_invalid_Credencials")
            .locatedBy("//p[contains(normalize-space(), 'Invalid credentials')]");



}



