package com.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resource.FunctionalLibrary;

public class AddTarrif extends FunctionalLibrary {
	
	public AddTarrif() {
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(id="rental1")
	private WebElement rent;
	
	@FindBy(id="local_minutes")
	private WebElement local;
	
	@FindBy(id="inter_minutes")
	private WebElement inter;
	
	@FindBy(id="sms_pack")
	private WebElement smspack;
	
	@FindBy(id="minutes_charges")
	private WebElement mincharges;
	
	@FindBy(id="inter_charges")
	private WebElement intercharges;
	
	
	@FindBy(id="sms_charges")
	private WebElement smscharges;
	
	@FindBy(xpath="//input[@name='submit']")
	private WebElement submitbutton;

	public WebElement getRent() {
		return rent;
	}

	public WebElement getLocal() {
		return local;
	}

	public WebElement getInter() {
		return inter;
	}

	public WebElement getSmspack() {
		return smspack;
	}

	public WebElement getMincharges() {
		return mincharges;
	}

	public WebElement getIntercharges() {
		return intercharges;
	}

	public WebElement getSmscharges() {
		return smscharges;
	}

	public WebElement getSubmitbutton() {
		return submitbutton;
	}
	
	
	
		
	
	

}
