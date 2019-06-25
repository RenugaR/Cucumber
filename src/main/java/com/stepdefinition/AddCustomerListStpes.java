package com.stepdefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddCustomerListStpes {
	static WebDriver driver;
		@Given("The Customer is in telecome page")
		public void the_Customer_is_in_telecome_page() {
			System.setProperty("webdriver.chrome.driver", "C:\\GreenTech\\SeleniumDay1\\drivers\\ChromeDriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://demo.guru99.com/telecom/index.html");  
		}

		@Given("The customer clicks the add customer")
		public void the_customer_clicks_the_add_customer() {
			driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
		}

		@When("The customer is filling all the details")
		public void the_customer_is_filling_all_the_details(DataTable dataTable) {
			List<String> l = dataTable.asList(String.class);
			driver.findElement(By.xpath("//label[@for='done']")).click();
		    driver.findElement(By.id("fname")).sendKeys(l.get(0));
		    driver.findElement(By.id("lname")).sendKeys(l.get(1));
		    driver.findElement(By.id("email")).sendKeys(l.get(2));
		    driver.findElement(By.name("addr")).sendKeys(l.get(3));
		    driver.findElement(By.id("telephoneno")).sendKeys(l.get(4));
		}

		@When("The customer clickthe submit button")
		public void the_customer_clickthe_submit_button() {
			driver.findElement(By.name("submit")).click();
		}

		@Then("The customer will get the customer id")
		public void the_customer_will_get_the_customer_id() {
			Assert.assertTrue(driver.findElement(By.xpath("//td[@align='center'][2]")).isDisplayed());
		}

	}

