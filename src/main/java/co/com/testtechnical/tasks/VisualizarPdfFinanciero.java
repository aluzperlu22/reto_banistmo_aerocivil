package co.com.testtechnical.tasks;

import co.com.testtechnical.userinterfaces.PaginaInicio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Scroll;

public class VisualizarPdfFinanciero implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(MoveMouse.to(PaginaInicio.BTN_TRANSPARENCIA),
                Click.on(PaginaInicio.PRESUPUESTO),
                Click.on(PaginaInicio.ESTADOS_FINANCIEROS),
                Click.on(PaginaInicio.BALANCES),
                Click.on(PaginaInicio.ESTADO_FINANCIERO_NOVIEMBRE)

        );

    }

    public static VisualizarPdfFinanciero ya(){
        return Tasks.instrumented(VisualizarPdfFinanciero.class);
    }
}
