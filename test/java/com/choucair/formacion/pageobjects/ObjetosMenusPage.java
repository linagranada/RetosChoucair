package com.choucair.formacion.pageobjects;



import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;




@DefaultUrl("https://www.grupobancolombia.com/wps/portal/personas")

public class ObjetosMenusPage extends PageObject{

	@FindBy(xpath="//*[@id=\"main-menu\"]/div[2]/ul[1]/li[3]/a")
	public WebElementFacade linkproductosservicos;
	
	@FindBy(xpath="//*[@id=\"productosPersonas\"]/div/div[1]/div/div/div[2]/div/a")
	public WebElementFacade linkleasing;
	
	@FindBy(xpath="//*[@id=\"category-detail\"]/div/div/div[2]/div/div[2]/h2/a")
	public WebElementFacade linkleasingHabitacional;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/div[4]/div/div/div/div/div[1]/div/div/div[1]/a")
	public WebElementFacade btnSimularCanon;
	
	//Campos Formulario Simulador
	@FindBy(xpath="//*[@id=\"sim-detail\"]/form/div[1]/input")
	public WebElementFacade ValorConIVA;
		
	@FindBy(xpath="//*[@id=\"sim-detail\"]/form/div[2]/input")
	public WebElementFacade plazo;
	
	@FindBy(xpath="//*[@id=\"sim-detail\"]/form/div[3]/input")
	public WebElementFacade porcentaje;
	
	@FindBy(xpath="//*[@id=\"sim-detail\"]/form/div[4]/select")
	public WebElementFacade tipoTasa;
	
	//Campo Modalidad Vencida por defecto
	@FindBy (xpath = "//*[@id=\"sim-detail\"]/form/div[5]/input")
	public WebElementFacade modalidad;
	
	@FindBy(xpath = "//*[@id=\"sim-detail\"]/form/div[6]/button")
	public WebElementFacade btnSimular;
	
	//Resultado Simulador
	@FindBy (xpath = "//*[@id=\"resultado\"]/div/table/tbody/tr[1]/td[2]")
	public WebElementFacade ValorCanonMensual;
	
	@FindBy(xpath="//*[@id=\"resultado\"]/div/table/tbody/tr[2]/td[2]")
	public WebElementFacade TasaEfectivaAnual;
	
	@FindBy(xpath="//*[@id=\"resultado\"]/div/table/tbody/tr[3]/td[2]")
	public WebElementFacade TasaNominalMVencida;
	
	@FindBy(xpath = "//*[@id=\"resultado\"]/div/table/tbody/tr[4]/td[2]")
	public WebElementFacade ValorOpcCompra;
	
	@FindBy(xpath="//*[@id=\"resultado\"]/div/table/tbody/tr[5]/td[2]")
	public WebElementFacade PorcentajeCompra;
	
	public void ingresouurl() {
		linkproductosservicos.click();
		linkleasing.click();
		linkleasingHabitacional.click();
		btnSimularCanon.click();
	}
	
	
	public void diligenciarValorConIVA(String datosTabla) {
		ValorConIVA.click();
		ValorConIVA.clear();
		ValorConIVA.sendKeys(datosTabla);
		
	}
	
	public void diligenciarPlazo(String datosTabla) {
		plazo.click();
		plazo.clear();
		plazo.sendKeys(datosTabla);
		
	}
	
	public void diligenciarPorcentaje(String datosTabla) {
		porcentaje.click();
		porcentaje.clear();
		porcentaje.sendKeys(datosTabla);
		
	}
	
	public void diligenciarTipoTasa(String datosTabla) {
		tipoTasa.selectByVisibleText(datosTabla);
	}
	
	public void Simular() {
		btnSimular.click();
	}
	
	public void modalidadVencida() {
		
		String toCompare = "Vencida";
		System.out.println("IMPRIME VALOR "+toCompare);
		
		if(modalidad.getValue().equalsIgnoreCase(toCompare)) {
			System.out.println("Sí es modalidad Vencida");	
			
		}else {
			System.out.println("No es modalidad Vencida");
			
		}
		
		
		
	}
	
}
