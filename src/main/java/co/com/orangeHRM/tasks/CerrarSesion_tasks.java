package co.com.orangeHRM.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;



import static co.com.orangeHRM.userinterface.PaginaPrincipal_Page.*;

public class CerrarSesion_tasks implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                Click.on(USER_MENU),
                Click.on(BTN_LOGOUT)
        );

    }
    public static CerrarSesion_tasks cerrarSesionTasks () {
        return Tasks.instrumented(CerrarSesion_tasks.class);
    }
}
