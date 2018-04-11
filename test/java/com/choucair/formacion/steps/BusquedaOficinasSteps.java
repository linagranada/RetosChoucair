package com.choucair.formacion.steps;

import java.util.List;

import com.choucair.formacion.pageobjects.BusquedaOficinasPage;

import net.thucydides.core.annotations.Step;

public class BusquedaOficinasSteps {

	BusquedaOficinasPage busquedaOficinasPage;
	
	@Step
	public void ingresarBusquedaOficina() {
		busquedaOficinasPage.open();
		busquedaOficinasPage.opcionVisitanos();
		}
	
	@Step
	public void ingresarDireccionOficina(List<List<String>> data, int id) throws InterruptedException {
			busquedaOficinasPage.diligenciarDireccion(data.get(id).get(0).trim());
			busquedaOficinasPage.buscarOficinasCercanas();
			busquedaOficinasPage.tiempoEspera(5);
			busquedaOficinasPage.ubicarOficinaMapa();
	}
	
	@Step
	public void imprimirInfoConsola() throws InterruptedException {
		busquedaOficinasPage.imprimirInfoOficina();
	}
}
