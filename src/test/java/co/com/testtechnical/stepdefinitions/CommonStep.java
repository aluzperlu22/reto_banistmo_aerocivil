package co.com.testtechnical.stepdefinitions;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class CommonStep {

    @Managed
    WebDriver myDriver;

    @Before
    public void setUp(){

        OnStage.setTheStage(Cast.ofStandardActors());
        theActorCalled("Ada").can(BrowseTheWeb.with(myDriver));
    }

}
