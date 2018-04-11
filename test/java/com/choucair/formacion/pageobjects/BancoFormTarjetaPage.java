package com.choucair.formacion.pageobjects;

import org.openqa.selenium.By;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.Matchers.*;

@DefaultUrl("https://www.grupobancolombia.com/wps/portal/personas")
public class BancoFormTarjetaPage extends PageObject {

	//productos y servicios
	@FindBy(xpath="//*[@id=\"main-menu\"]/div[2]/ul[1]/li[3]/a")
	public WebElementFacade linkproductosservicos;
	
	//tarjetas de crédito
	@FindBy(xpath="//*[@id=\"productosPersonas\"]/div/div[1]/div/div/div[7]/div/a")
	public WebElementFacade tarjetasCredito;

	//Información Amex Green***
	@FindBy(xpath="//*[@id=\"card_0\"]/div[3]/ul")
	public WebElementFacade infoAmexGreen;
	
	//Información MasterCard Black***
	@FindBy(xpath="//*[@id=\"card_1\"]/div[3]/ul")
	public WebElementFacade infoMasterBlack;
	
	//Botón Solicitar Aquí
	@FindBy(css="a.action-aunClic.btn.btn-primary.ng-binding")
	public WebElementFacade solicitarTC;
	
	//Campos Formulario Solicitud Tarjeta
	@FindBy(id="nombresReq")
	public WebElementFacade nombres;
	
	@FindBy(name="apellidosReq")
	public WebElementFacade apellidos;
	
	@FindBy(name="typedocreq")
	public WebElementFacade tipoDocumento;
	
	@FindBy(name="numeroPasaporte")
	public WebElementFacade nroDocumento;
	
	@FindBy(name="fechaNacimientoReq")
	public WebElementFacade fechaNacimiento;
	
	@FindBy(name="ingresos")
	public WebElementFacade ingresos;
	
	@FindBy(name="reqCiuidadDpto")
	public WebElementFacade ciudadDepartamento;
	
	@FindBy(css="div.angucomplete-holder")
	public WebElementFacade medellinAntioquia;
	
	@FindBy(css="button.btn.btn-primary.bc.btn-block")
	public WebElementFacade continuar;


	public void ingresoForm() {
		linkproductosservicos.click();
		tarjetasCredito.click();
		imprimirInfoTarjetas();
		solicitarTC.click();
	}
	
	
	public void diligenciarNombres(String datosTabla)throws InterruptedException {
		getDriver().switchTo().frame(getDriver().findElement(By.tagName("iframe"))); 
		nombres.click();
		nombres.clear();
		nombres.sendKeys(datosTabla);
		
	}
	
	public void diligenciarApellidos(String datosTabla) {
		apellidos.click();
		apellidos.clear();
		apellidos.sendKeys(datosTabla);
		
	}
	
	public void diligenciarTipoDocumento(String datosTabla) {
		tipoDocumento.selectByVisibleText(datosTabla);
	}
	
	public void diligenciarDocumento(String datosTabla) {
		nroDocumento.click();
		nroDocumento.clear();
		nroDocumento.sendKeys(datosTabla);
		
	}

	public void diligenciarFechaNacimiento(String datosTabla) {
		fechaNacimiento.click();
		fechaNacimiento.clear();
		fechaNacimiento.sendKeys(datosTabla);
		
	}
	
	public void diligenciarIngresos(String datosTabla) {
		ingresos.click();
		ingresos.clear();
		ingresos.sendKeys(datosTabla);
		
	}
	
	public void diligenciarCiudadDpto(String datosTabla) {
		ciudadDepartamento.click();
		ciudadDepartamento.clear();
		ciudadDepartamento.sendKeys(datosTabla);
		medellinAntioquia.click();
	}
	
	public void botonContinuar() {
		continuar.click();
	}
	
	public void imprimirInfoTarjetas() {
		System.out.println("American Express Green" +"\n" + infoAmexGreen.getText()+"\n");
		System.out.println("MasterCard Black"+"\n" + infoMasterBlack.getText()+"\n");
	}
	
	public void tiempoEspera(int segundos) throws InterruptedException {
		Thread.sleep(segundos * 1000);
	}
		
		
	
}
