package co.com.orangeHRM.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.orangeHRM.utils.Constantes.WEB_URL;

public class abrirUrl implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(WEB_URL));

    }

public static abrirUrl abrirUrl() {return Tasks.instrumented(abrirUrl.class);
    }
}

