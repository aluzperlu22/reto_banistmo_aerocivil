package co.com.testtechnical.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaInicio {

    public static final Target BTN_TRANSPARENCIA=Target.the("boton para ir a Transparencia").locatedBy("/html[1]/body[1]/form[1]/div[13]/div[1]/div[2]/div[4]/nav[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[7]/a[1]/span[1]/span[1]");
    public static final Target PRESUPUESTO=Target.the("Clic en Presupuesto").locatedBy("//span[contains(text(),'Presupuesto')]");
    public static final Target ESTADOS_FINANCIEROS=Target.the("Clic en Estados Financieros").locatedBy("//A[@title='Estados financieros'][text()='Estados financieros']");
    public static final Target BALANCES=Target.the("Clic en Balances").locatedBy("//div[contains(text(),'Balances')]");
    public static final Target ESTADO_FINANCIERO_NOVIEMBRE=Target.the("PDF a Visualizar").locatedBy("(//IMG[@src='/Style Library/Aerocivil/img/ico-ver-doc.svg'])[7]");
    public static final Target EVIDENCIA=Target.the("pdf a Visualizar evidencia").locatedBy("//body[@style='height: 100%; width: 100%; overflow: hidden; margin:0px; background-color: rgb(82, 86, 89);']");



}