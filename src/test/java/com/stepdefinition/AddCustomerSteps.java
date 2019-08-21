package com.stepdefinition;

import java.util.List;
import java.util.Map;
import com.objectrepository.AddCustomer;
import com.objectrepository.HomePage;
import com.resource.FunctionalLibrary;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddCustomerSteps extends FunctionalLibrary {
	
		
	@Given("User click on add customer")
	public void user_click_on_add_customer() {
		
		HomePage page=new HomePage();
		
		clickButton(page.getAddCustomerButton());

		
	}

	@When("user is filling all the fields")
	public void user_is_filling_all_the_fields1(DataTable dataTable1) {
		List<String> asList = dataTable1.asList(String.class);
		
		AddCustomer page=new AddCustomer();
		
		clickButton(page.getRadioButton());
		text(page.getfName(),asList.get(0));
		text(page.getlName(),asList.get(1));
		text(page.getMail(),asList.get(2));
		text(page.getAddress(),asList.get(3));
		text(page.getPhno(),asList.get(4));
		
		
	}
	
	@When("user is filling all the fields.")
	public void user_is_filling_all_the_fields2(DataTable dataTable2) {
		Map<String, String> asMap = dataTable2.asMap(String.class, String.class);
		
		AddCustomer page=new AddCustomer();
		clickButton(page.getRadioButton());
		text(page.getfName(),asMap.get("fname"));
		text(page.getlName(),asMap.get("lname"));
		text(page.getMail(),asMap.get("email"));
		text(page.getAddress(),asMap.get("address"));
		text(page.getPhno(),asMap.get("phone"));
	   
	}
	@When("user is filling details in all the fields")
	public void user_is_filling_details_in_all_the_fields(DataTable dataTable3) {
		List<List<String>> asLists = dataTable3.asLists(String.class);
		AddCustomer page=new AddCustomer();
		clickButton(page.getRadioButton());
		text(page.getfName(),asLists.get(0).get(0));
		text(page.getlName(),asLists.get(0).get(1));
		text(page.getMail(),asLists.get(0).get(2));
		text(page.getAddress(),asLists.get(0).get(3));
		text(page.getPhno(),asLists.get(0).get(4));
		
	   
	}


@When("user click on submit button.")
	public void user_click_on_submit_button() {
	
	AddCustomer page=new AddCustomer();
	clickButton(page.getSubmitButton());
	
	
	
	}

}
