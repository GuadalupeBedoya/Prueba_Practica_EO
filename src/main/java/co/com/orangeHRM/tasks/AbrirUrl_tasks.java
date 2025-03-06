package co.com.orangeHRM.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.orangeHRM.utils.Constantes.WEB_URL;

public class AbrirUrl_tasks implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(WEB_URL));
    }

public static AbrirUrl_tasks abrirUrl() {
        return Tasks.instrumented(AbrirUrl_tasks.class);
    }
}

