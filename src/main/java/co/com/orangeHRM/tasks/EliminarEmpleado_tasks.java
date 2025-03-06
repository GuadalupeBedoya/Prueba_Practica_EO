package co.com.orangeHRM.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.orangeHRM.userinterface.PaginaAdmin_Page.BTN_DELETE_EMPLOYEE;
import static co.com.orangeHRM.userinterface.PaginaAdmin_Page.LABEL_CONFIRM_DELETE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class EliminarEmpleado_tasks implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                Click.on(BTN_DELETE_EMPLOYEE),
                WaitUntil.the(LABEL_CONFIRM_DELETE, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(LABEL_CONFIRM_DELETE)

        );
    }

    public static EliminarEmpleado_tasks eliminarEmpleadoTasks () {
        return Tasks.instrumented(EliminarEmpleado_tasks.class);
    }
}
