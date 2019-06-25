package com.stepdefinition;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddCustomerMAPsteps {
	static WebDriver driver;
	@Given("The User is in telecome page")
	public void the_User_is_in_telecome_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\GreenTech\\SeleniumDay1\\drivers\\ChromeDriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/telecom/index.html");  
	}

	@Given("The User clicks the add User")
	public void the_User_clicks_the_add_User() {
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	}

	@When("The User is filling all the details")
	public void the_User_is_filling_all_the_details(DataTable dataTable) {
		Map<String, String> m = dataTable.asMap(String.class, String.class);
		driver.findElement(By.xpath("//label[@for='done']")).click();
	    driver.findElement(By.id("fname")).sendKeys(m.get("fname"));
	    driver.findElement(By.id("lname")).sendKeys(m.get("lname"));
	    driver.findElement(By.id("email")).sendKeys(m.get("email"));
	    driver.findElement(By.name("addr")).sendKeys(m.get("add"));
	    driver.findElement(By.id("telephoneno")).sendKeys(m.get("phn"));
	}

	@When("The User clickthe submit button")
	public void the_User_clickthe_submit_button() {
		driver.findElement(By.name("submit")).click();
	}

	@Then("The User will get the customer id")
	public void the_User_will_get_the_customer_id() {
		Assert.assertTrue(driver.findElement(By.xpath("//td[@align='center'][2]")).isDisplayed());
	}

}
