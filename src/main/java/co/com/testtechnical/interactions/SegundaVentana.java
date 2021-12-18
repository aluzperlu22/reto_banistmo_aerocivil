package co.com.testtechnical.interactions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class SegundaVentana implements Interaction {
    private String encabezado;
    public SegundaVentana(String encabezado) {
        this.encabezado = encabezado;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver=BrowseTheWeb.as(actor).getDriver();
        Set<String> listadepestanias;
        listadepestanias=driver.getWindowHandles();
        for(String pestania:listadepestanias){
            driver.switchTo().window(pestania);
            if(driver.getTitle().contains(encabezado)){
                break;
            }
        }
          }

    public static SegundaVentana a(String encabezado){

        return Tasks.instrumented(SegundaVentana.class,encabezado);
    }
}