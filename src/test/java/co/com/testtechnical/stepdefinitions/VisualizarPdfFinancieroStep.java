package co.com.testtechnical.stepdefinitions;

import co.com.testtechnical.interactions.SegundaVentana;
import co.com.testtechnical.questions.TituloPDF;
import co.com.testtechnical.tasks.VisualizarPdfFinanciero;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class VisualizarPdfFinancieroStep {

    @Given("^que (.*) ha ingresado a la pagina de aerocivil$")
    public void abrirPagina(String actor) {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.aerocivil.gov.co/"));
        theActorCalled(actor);
    }

    @When("^el seleccione el pdf a descargar")
    public void elSeleccioneElPdfADescargar() {
        OnStage.theActorInTheSpotlight().attemptsTo(VisualizarPdfFinanciero.ya());
        OnStage.theActorInTheSpotlight().attemptsTo(SegundaVentana.a("Estado de Situacion Financiera a 30 de Abril de 2021.pdf"));
    }

    @Then("^el debera visualizar el archivo$")
    public void elDeberaVisualizarElArchivo() {
        OnStage.theActorInTheSpotlight().should(seeThat(TituloPDF.es(),
                is(equalTo(true))));
    }

}
