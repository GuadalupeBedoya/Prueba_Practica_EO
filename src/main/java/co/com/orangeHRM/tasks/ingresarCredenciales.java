package co.com.orangeHRM.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.orangeHRM.userinterface.inicioSesionPage.*;

public class ingresarCredenciales implements Task {


    private final String usuario;
    private final String contrasena;

    public ingresarCredenciales(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                Enter.theValue(usuario).into(USUARIO),
                Enter.theValue(contrasena).into(CONTRASENA),
                Click.on(BTN_LOGIN)

        );
    }
    public static ingresarCredenciales con(String usuario, String contrasena){
        return Tasks.instrumented(ingresarCredenciales.class, usuario,contrasena);
    }
}
