package com.choucair.formacion.definition;

import java.util.List;

import com.choucair.formacion.steps.BancoFormTarjetasSteps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class BancoFormTarjetaDefinition {
	
	@Steps
	BancoFormTarjetasSteps bancoFormTarjetaSteps;
	
	@Given("^Ingresar a la opción  Tarjetas de Crédito$")
	public void ingresar_a_la_opción_Tarjetas_de_Crédito() {
		bancoFormTarjetaSteps.ingresarFormulario();
	 
	}

	@Given("^Imprimir en Consola la información de las tarjetas de credito$")
	public void imprimir_en_Consola_la_información_de_las_tarjetas_de_credito() throws Throwable {
		bancoFormTarjetaSteps.imprimirInfoTC();
	    
	}

	@When("^Diligenciar Datos Formulario Obligatorios$")
	public void diligenciar_Datos_Formulario_Obligatorios(DataTable datosTabla) throws Throwable {
		List<List<String>> data = datosTabla.raw();				
		for(int i=1; i< data.size(); i++) {
			bancoFormTarjetaSteps.diligenciarFormularioSolicitudTC(data, i);
								try {
									Thread.sleep(5000);
								}catch(InterruptedException e) {
									
								}
							} 

	}

	@Then("^Verificar resultado Formulario$")
	public void verificar_resultado_Formulario() throws Throwable {
	}


}
