package com.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resource.FunctionalLibrary;

public class AddCustomer extends FunctionalLibrary {
	public AddCustomer() {
		PageFactory.initElements(driver, this);
	}
	

	public WebElement getfName() {
		return fName;
	}

	public WebElement getlName() {
		return lName;
	}

	public WebElement getMail() {
		return mail;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getPhno() {
		return phno;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	public WebElement getResetButton() {
		return resetButton;
	}
	
	public WebElement getRadioButton() {
		return radioButton;
	}
	
	@FindBy(xpath="(//label[@for='done'])")
	private WebElement radioButton;
	
	@FindBy(id="fname")
	private WebElement fName;
	
	@FindBy(id="lname")
	private WebElement lName;
	
	@FindBy(id="email")
	private WebElement mail;
	
	@FindBy(name="addr")
	private WebElement address;
	
	@FindBy(name="telephoneno")
	private WebElement phno;
	
	@FindBy(xpath="(//input[@name='submit'])")
	private WebElement submitButton;
	
	@FindBy(xpath="(//input[@type='reset'])")
	private WebElement resetButton;
	
	

}
