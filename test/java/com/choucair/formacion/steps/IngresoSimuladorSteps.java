package com.choucair.formacion.steps;

import java.util.List;

import com.choucair.formacion.pageobjects.ObjetosMenusPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class IngresoSimuladorSteps {

	ObjetosMenusPage objetosmenusPage;
	
	public void ingresarurl() {
		objetosmenusPage.open();
		objetosmenusPage.ingresouurl();
	}
		
	public void DiligenciarFormSimulador_datos_tabla(List<List<String>> data, int id) {
		objetosmenusPage.diligenciarValorConIVA(data.get(id).get(0).trim());
		objetosmenusPage.diligenciarPlazo(data.get(id).get(1).trim());
		objetosmenusPage.diligenciarPorcentaje(data.get(id).get(2).trim());
		objetosmenusPage.diligenciarTipoTasa(data.get(id).get(3).trim());
		verificar_modalida();
		objetosmenusPage.Simular();
	}
	
	@Step
	public void verificar_modalida() {
		objetosmenusPage.modalidadVencida();
	}
	
	
}
