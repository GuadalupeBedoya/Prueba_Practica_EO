package co.com.orangeHRM.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.com.orangeHRM.userinterface.AgregarEmpleadoPage.*;
import static co.com.orangeHRM.utils.Constantes.NAME_EMPLOYEE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;


public class AgregarEmpleado implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                Click.on(BTN_ADMIN),
                Click.on(BTN_ADD),
                Click.on(USER_ROLE),
                SendKeys.of(Keys.ARROW_DOWN).into(USER_ROLE),
                SendKeys.of(Keys.ENTER).into(USER_ROLE),
                Enter.theValue(NAME_EMPLOYEE).into(EMPLOYEE_NAME),
                WaitUntil.the(EMPLOYEE_NAME,isClickable()).forNoMoreThan(20).seconds(),
                SendKeys.of(Keys.ARROW_DOWN).into(EMPLOYEE_NAME),
                SendKeys.of(Keys.ARROW_DOWN).into(EMPLOYEE_NAME),
                SendKeys.of(Keys.ENTER).into(EMPLOYEE_NAME),
                Click.on(STATUS),
                SendKeys.of(Keys.ARROW_DOWN).into(STATUS),
                WaitUntil.the(STATUS_ENABLED,isClickable()).forNoMoreThan(10).seconds(),
                Click.on(STATUS_ENABLED),
                Enter.theValue("Pepito").into(USERNAME_EMPLOYEE),
                Enter.theValue("prueba1234").into(PASSWORD_EMPLOYEE),
                Enter.theValue("prueba1234").into(CONFIRM_PASSWORD_EMPLOYEE),
                Click.on(BTN_SAVE)

        );

    }

    public static AgregarEmpleado agregarEmpleado () {
        return Tasks.instrumented(AgregarEmpleado.class);
    }
}
