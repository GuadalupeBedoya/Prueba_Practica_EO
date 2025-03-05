package com.orangeHRM.stepsdefinitions.setup;


import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import org.openqa.selenium.WebDriver;

import static co.com.orangeHRM.utils.Constantes.ACTOR_NAME;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class setupFront {
    @Managed
    private WebDriver webDriver;

    private  void setActorAndStage(){
        setTheStage(Cast.ofStandardActors());
        theActorCalled(ACTOR_NAME);
        theActorInTheSpotlight().can(BrowseTheWeb.with(webDriver));

    }

    protected void setUpTest(){
        setActorAndStage();
    }
}
