package co.com.orangeHRM.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.com.orangeHRM.userinterface.AgregarEmpleado_Page.*;
import static co.com.orangeHRM.userinterface.PaginaPrincipal_Page.LABEL_ADMIN_SYSTEM_USERS;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class AgregarEmpleado_tasks implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.wasAbleTo(
                Click.on(BTN_ADMIN),
                Click.on(BTN_ADD),
                Click.on(SELECT_USER_ROLE),
                SendKeys.of(Keys.ARROW_DOWN).into(SELECT_USER_ROLE),
                SendKeys.of(Keys.ENTER).into(SELECT_USER_ROLE),
                Enter.theValue("a").into(INPUT_EMPLOYEE_NAME),
                WaitUntil.the(CLIC_NAME,isVisible()).forNoMoreThan(5).seconds(),
                Click.on(CLIC_NAME),
                Click.on(CLIC_STATUS),
                Click.on(SELECT_STATUS),
                Enter.theValue("Pepito").into(USERNAME_EMPLOYEE),
                Enter.theValue("prueba1234").into(PASSWORD_EMPLOYEE),
                Enter.theValue("prueba1234").into(CONFIRM_PASSWORD_EMPLOYEE),
                Click.on(BTN_SAVE),
                WaitUntil.the(LABEL_ADMIN_SYSTEM_USERS,
                        isVisible()).forNoMoreThan(5).seconds()
        );

    }
    public static AgregarEmpleado_tasks agregarEmpleado () {
        return Tasks.instrumented(AgregarEmpleado_tasks.class);
    }
}
