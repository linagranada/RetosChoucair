package com.choucair.formacion.definition;

import java.util.List;

import com.choucair.formacion.steps.*;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PopupValidationDefinition {
	
	@Steps
	PopupValidationSteps popupValidationSteps;
	
	@Steps
	ColorlibFormValidationSteps colorlibFormValidationSteps;

	@Given("^Autentico en colorlib con usuario \"([^\"]*)\" y clave \"([^\"]*)\"$")
	public void autentico_en_colorlib_con_usuario_y_clave(String Usuario, String Clave) {
		popupValidationSteps.login_Colorlib(Usuario, Clave);
	}
	
	

	@Given("^Ingreso a la funcionalidad Forms Validation$")
	public void ingreso_a_la_funcionalidad_Forms_Validation() {
		popupValidationSteps.ingresar_form_validation();
	}
	
	

	@When("^Diligencio el formulario Popup Validation$")
	public void diligencio_el_formulario_Popup_Validation(DataTable dtDatosForm) {
		List<List<String>> data = dtDatosForm.raw();
		for(int i=1; i<data.size(); i++) {
			colorlibFormValidationSteps.diligenciar_popup_datos_tabla(data, i);
			try {
				Thread.sleep(5000);
			}
			catch			
				(InterruptedException e){
					
				}
			}
	}
	

	@Then("^Verifico ingreso exitoso$")
	public void verifico_ingreso_exitoso() // throws Throwable
	{
		colorlibFormValidationSteps.verificar_ingreso_datos_formulario_exitoso();
	}
	
	@Then("^Verificar que se presente globo informativo de validacion$")
	public void verificar_que_se_presente_globo_informativo_de_validacion(){
		colorlibFormValidationSteps.verificar_ingreso_datos_formulario_con_errores();
	}
}
