package com.choucair.formacion.definition;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

import java.util.List;
import com.choucair.formacion.steps.IngresoSimuladorSteps;

public class DefincionSimulaCredito {

	
	@Steps
	IngresoSimuladorSteps ingresosimulador;
	
	
	@Given("^ingresar al simulador$")
	public void ingresar_al_simulador() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		ingresosimulador.ingresarurl();
		
	}

	@When("^ingreso datos de credito$")
	public void ingreso_datos_de_credito(DataTable dtDatosForm) throws InterruptedException {
		List<List<String>> data = dtDatosForm.raw();
		for(int i=1; i<data.size(); i++) {
			ingresosimulador.DiligenciarFormSimulador_datos_tabla(data, i);
			try {
				Thread.sleep(5000);
			}
			catch			
				(InterruptedException e){
					
				}
			}
		
	}

	@Then("^verifico resultado simulacion$")
	public void verifico_resultado_simulacion() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}
	
}
