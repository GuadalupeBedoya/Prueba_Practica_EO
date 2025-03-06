package co.com.orangeHRM.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.orangeHRM.userinterface.AgregarEmpleado_Page.BTN_ADMIN;
import static co.com.orangeHRM.userinterface.PaginaAdmin_Page.BTN_SEARCH_ADMIN;
import static co.com.orangeHRM.userinterface.PaginaAdmin_Page.INPUT_USERNAME;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ConsultarEmpleado_tasks implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_ADMIN),
                Click.on(INPUT_USERNAME),
                Enter.theValue("Pepito").into(INPUT_USERNAME),
                Click.on(BTN_SEARCH_ADMIN),
                WaitUntil.the(BTN_SEARCH_ADMIN,isVisible()).forNoMoreThan(20).seconds()
        );
    }

    public static ConsultarEmpleado_tasks consultarEmpleado () {
        return Tasks.instrumented(ConsultarEmpleado_tasks.class);
    }
}
