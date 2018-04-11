package com.choucair.formacion.steps;

import java.util.List;
import com.choucair.formacion.pageobjects.BancoFormTarjetaPage;
import net.thucydides.core.annotations.Step;

public class BancoFormTarjetasSteps {
	BancoFormTarjetaPage bancoFormTarjetaPage;
	
	@Step
	public void ingresarFormulario() {
		bancoFormTarjetaPage.open();
		bancoFormTarjetaPage.ingresoForm();
	}
	
	@Step
	public void imprimirInfoTC( ) {
			
	}
	
	@Step
	public void diligenciarFormularioSolicitudTC(List<List<String>> data, int id) throws InterruptedException {
		bancoFormTarjetaPage.tiempoEspera(10);
		bancoFormTarjetaPage.diligenciarNombres(data.get(id).get(0).trim());
		bancoFormTarjetaPage.diligenciarApellidos(data.get(id).get(1).trim());
		bancoFormTarjetaPage.diligenciarTipoDocumento(data.get(id).get(2).trim());
		bancoFormTarjetaPage.diligenciarDocumento(data.get(id).get(3).trim());
		bancoFormTarjetaPage.diligenciarFechaNacimiento(data.get(id).get(4).trim());
		bancoFormTarjetaPage.diligenciarIngresos(data.get(id).get(5).trim());
		bancoFormTarjetaPage.diligenciarCiudadDpto(data.get(id).get(6).trim());
		bancoFormTarjetaPage.botonContinuar();
		
	}
}