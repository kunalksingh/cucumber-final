package com.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resource.FunctionalLibrary;

public class HomePage extends FunctionalLibrary {
	
	public HomePage() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="(//a[text()='Add Customer' ])[1]")
	private WebElement addCustomerButton;
	
	
	
	@FindBy(xpath=("//a[text()='Add Tariff Plan' ]"))
	private WebElement addTarrifPlan;
	
	


public WebElement getAddCustomerButton() {
	return addCustomerButton;
}



public WebElement getAddTarrifPlan() {
	return addTarrifPlan;
}
}
