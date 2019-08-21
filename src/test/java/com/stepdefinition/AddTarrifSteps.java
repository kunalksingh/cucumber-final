package com.stepdefinition;


import java.util.List;
import com.objectrepository.AddTarrif;
import com.objectrepository.HomePage;
import com.resource.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;


public class AddTarrifSteps extends FunctionalLibrary{
	
	@Given("User click on add tarrif")
	public void user_click_on_add_tarrif() {
		
		HomePage page=new HomePage();
		clickButton(page.getAddTarrifPlan());
	   
	}

	@When("user is filling all the fields one dimension list")
	public void user_is_filling_all_the_fields_one_dimension_list(DataTable dataTable) {
		
		List<String> asList6 = dataTable.asList(String.class);
		
	  AddTarrif page=new AddTarrif();
	  text(page.getRent(), asList6.get(0));
	  text(page.getLocal(), asList6.get(1));
	  text(page.getSmspack(), asList6.get(2));
	  text(page.getIntercharges(), asList6.get(3));
	  text(page.getSmscharges(), asList6.get(4));
	  
	  
	  
	}

	@When("User click on submit")
	public void user_click_on_submit() {
		AddTarrif page=new AddTarrif();
		clickButton(page.getSubmitbutton());
	   
	}

}