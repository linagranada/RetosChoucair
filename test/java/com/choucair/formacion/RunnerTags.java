package com.choucair.formacion;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
//@CucumberOptions(features ="src/test/resources/features/")
//@CucumberOptions(features ="src/test/resources/features/ColorLib/")
//@CucumberOptions(features ="src/test/resources/features/ColorLib/Forms/examen.feature")
@CucumberOptions(features ="src/test/resources/features/Bancolombia/Forms/TarjetasCredito.feature", tags = "@EscenarioExitoso")
//@CucumberOptions(features ="src/test/resources/features/Bancolombia/Forms/Visitanos.feature", tags = "@ConsultaOficina")
/*@CucumberOptions (
		plugin		= {"pretty"},
		features	= {"src/test/resources/features/Bancolombia/Forms/TarjetasCredito.feature"}, 
		tags= {"@EscenarioExitoso"},
		glue		= {"com.choucair.formacion.definition"}
		)
		
*/
public class RunnerTags 
{
	

}