package com.choucair.formacion;

import org.junit.Test;
import cucumber.runtime.junit.SanityChecker;

public class IntegralRunner {
	
	@Test
	public void PruebaRunner() {
		
		//Llamado Feature1--Proveedor X
		SanityChecker.run(RunnerTags.class, true);
		
	
	}
	

}
