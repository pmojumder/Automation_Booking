package com.Stepdef;

import java.io.FileNotFoundException;

import com.Generic.script.Genric;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class verifyvalidation {

	Genric ref=new Genric();
@Given("execute get call")
public void execute_get_call() {
   ref.get(0);
}

@Then("execute post call")
public void execute_post_call() throws FileNotFoundException {
   ref.post();
}


}
