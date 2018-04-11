package com.choucair.formacion.definition;

import java.util.List;

import com.choucair.formacion.steps.BusquedaOficinasSteps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class BusquedaOficinasDefinition {
	
	@Steps
	BusquedaOficinasSteps busquedaOficinasSteps;
	

	@Given("^Ingresar opción Visitanos para  búsqueda de oficinas$")
	public void ingresar_opción_Visitanos_para_búsqueda_de_oficinas() throws Throwable {
	   	    busquedaOficinasSteps.ingresarBusquedaOficina();
	}


	@When("^Buscar la oficina$")
	public void buscar_la_oficina(DataTable datos ) throws Throwable {
		
			List<List<String>> data = datos.raw();
			for(int i=1; i<data.size(); i++) {
				busquedaOficinasSteps.ingresarDireccionOficina(data, i);
				try {
					Thread.sleep(5000);
				}
				catch			
					(InterruptedException e){
						
					}
				}
	}

	@Then("^Verificar ubicación oficina en el mapa de la página$")
	public void verificar_ubicación_oficina_en_el_mapa_de_la_página() throws Throwable {
		busquedaOficinasSteps.imprimirInfoConsola();
	    
	}
	
}
