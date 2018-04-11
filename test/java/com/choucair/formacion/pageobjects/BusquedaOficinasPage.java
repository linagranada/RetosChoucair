package com.choucair.formacion.pageobjects;

import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.grupobancolombia.com/wps/portal/personas")
public class BusquedaOficinasPage extends PageObject{
	
	//Opción Visitanos
	@FindBy(xpath="//*[@id=\"footer-content\"]/div[1]/div/div/div[4]/div/a/img")
	public WebElementFacade opcvisitanos;
	
	@FindBy(id="srch-term")
	public WebElementFacade txtUbicación;
	
	@FindBy(css="button.btn.search-sucursal")
	public WebElementFacade btnBuscar;
	
	@FindBy(css="div.col-xs-2.text-center")
	public List<WebElementFacade> ubicarOficinaMapa;
	
	@FindBy(css="div.infoBox")
	public WebElementFacade infoOficina;
	
	public void opcionVisitanos() {
		opcvisitanos.click();
	}
	
	public void diligenciarDireccion(String datosTabla) {
		txtUbicación.click();
		txtUbicación.clear();
		txtUbicación.sendKeys(datosTabla);
	}
	
	public void buscarOficinasCercanas() {
		btnBuscar.click();
	}
	
	public void ubicarOficinaMapa() {
		ubicarOficinaMapa.get(0).click();
	}
	
	public void imprimirInfoOficina() throws InterruptedException {
		tiempoEspera(5);
		System.out.println("Información oficina:" +"\n" + infoOficina.getText()+"\n");
		//System.out.println("Horario Regular"+"\n" + horario.getText()+"\n");
	}

	public void tiempoEspera(int segundos) throws InterruptedException {
		Thread.sleep(segundos * 1000);
	}
		
}
