package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ColorlibFormValidationPage extends PageObject {

	@FindBy(id = "req")
	public WebElementFacade txtRequired;

	@FindBy(id = "sport")
	public WebElementFacade cmbSport;

	@FindBy(xpath = "//select[@id='sport2']")
	public WebElementFacade cbmSport2;

	@FindBy(id = "url1")
	public WebElementFacade txtUrl;

	@FindBy(id = "email1")
	public WebElementFacade txtEmail;

	@FindBy(id = "pass1")
	public WebElementFacade txtPass1;

	@FindBy(id = "pass2")
	public WebElementFacade txtPass2;

	@FindBy(id = "minsize1")
	public WebElementFacade txtMinSize;

	@FindBy(id = "maxsize1")
	public WebElementFacade txtMaxSize;

	@FindBy(id = "number2")
	public WebElementFacade txtNumber;

	@FindBy(id = "ip")
	public WebElementFacade txtIp;

	@FindBy(id = "date3")
	public WebElementFacade txtDate;

	@FindBy(id = "past")
	public WebElementFacade txtdateEarlier;

	@FindBy(xpath = "//*[@id='popup-validation']/div[14]/input")
	public WebElementFacade btnValidate;
	
	
	
	
	@FindBy(xpath = "(//DIV[@class='formErrorContent'])[1]")
	public WebElementFacade globoInformativo;
	

	public void Required(String datoPrueba) {
		txtRequired.click();
		txtRequired.clear();
		txtRequired.sendKeys(datoPrueba);
	}

	public void Select_Sport(String datoPrueba) {
		cmbSport.click();
		cmbSport.selectByVisibleText(datoPrueba);
	}

	public void Multiple_Select(String datoPrueba) {
		cbmSport2.selectByVisibleText(datoPrueba);
	}

	public void url(String datoPrueba) {
		txtUrl.click();
		txtUrl.clear();
		txtUrl.sendKeys(datoPrueba);
	}

	public void email(String datoPrueba) {
		txtEmail.click();
		txtEmail.clear();
		txtEmail.sendKeys(datoPrueba);
	}

	public void password(String datoPrueba) {
		txtPass1.click();
		txtPass1.clear();
		txtPass1.sendKeys(datoPrueba);
	}

	public void confirm_password(String datoPrueba) {
		txtPass2.click();
		txtPass2.clear();
		txtPass2.sendKeys(datoPrueba);
	}

	public void minimun_field_size(String datoPrueba) {
		txtMaxSize.click();
		txtMaxSize.clear();
		txtMaxSize.sendKeys(datoPrueba);
	}

	public void maximum_field_size(String datoPrueba) {
		txtMinSize.click();
		txtMinSize.clear();
		txtMinSize.sendKeys(datoPrueba);
	}

	public void number(String datoPrueba) {
		txtNumber.click();
		txtNumber.clear();
		txtNumber.sendKeys(datoPrueba);
	}

	public void ip(String datoPrueba) {
		txtIp.click();
		txtIp.clear();
		txtIp.sendKeys(datoPrueba);
	}
	
	public void date(String datoPrueba) {		
		txtDate.click();
		txtDate.clear();
		txtDate.sendKeys(datoPrueba);
	}
	
	public void date_earlier(String datoPrueba) {		
		txtdateEarlier.click();
		txtdateEarlier.clear();
		txtdateEarlier.sendKeys(datoPrueba);
	}

		public void Validate() {
			btnValidate.click();
		}
	
	public void form_sin_errores() {
		assertThat(globoInformativo.isCurrentlyVisible(), is(false));
	}
	
	public void form_con_errores() {
		assertThat(globoInformativo.isCurrentlyVisible(), is(true));
	}


}
