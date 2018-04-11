package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.*;
import net.thucydides.core.annotations.Step;


public class PopupValidationSteps 
{
	ColorlibLoginPage colorlibLoginPage;
	ColorlibMenuPage colorlibMenuPage;
	

	@Step
	public void login_Colorlib(String strUsuario, String strPass)
	{		
		colorlibLoginPage.open();		
		colorlibLoginPage.IngresarDatos(strUsuario, strPass);		
		colorlibLoginPage.VerificaHome();
	}
	
	
	@Step
	public void ingresar_form_validation() {
		colorlibMenuPage.menuFormValidation();
	}
}
