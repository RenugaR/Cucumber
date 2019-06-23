package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MultiCusIDSteps {
	static WebDriver driver; 
	@Given("The user is in telecome page link")
	public void the_user_is_in_telecome_page_link() {
		System.setProperty("webdriver.chrome.driver", "C:\\GreenTech\\SeleniumDay1\\drivers\\ChromeDriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/telecom/index.html");
	}

	@Given("The user clicks on add customer")
	public void the_user_clicks_on_add_customer() {
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	}

	@When("The user is filling all the ID details{string},{string},{string},{string},{string}")
	public void the_user_is_filling_all_the_ID_details(String name, String lastname, String email, String address, String phnno) {
		driver.findElement(By.xpath("//label[@for='done']")).click();
	    driver.findElement(By.id("fname")).sendKeys(name);
	    driver.findElement(By.id("lname")).sendKeys(lastname);
	    driver.findElement(By.id("email")).sendKeys(email);
	    driver.findElement(By.name("addr")).sendKeys(address);
	    driver.findElement(By.id("telephoneno")).sendKeys(phnno);
	}

	@When("The customer click on submit button")
	public void the_customer_click_on_submit_button() {
		driver.findElement(By.name("submit")).click();
	}

	@Then("The user will gets the customer id")
	public void the_user_will_gets_the_customer_id() {
		Assert.assertTrue(driver.findElement(By.xpath("//td[@align='center'][2]")).isDisplayed());
	}


}
