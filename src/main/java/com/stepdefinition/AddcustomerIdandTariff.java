package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddcustomerIdandTariff {
	static WebDriver driver;
		@Given("The users is in telecome page")
		public void the_users_is_in_telecome_page() {
			System.setProperty("webdriver.chrome.driver", "C:\\GreenTech\\SeleniumDay1\\drivers\\ChromeDriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://demo.guru99.com/telecom/index.html");
		}

		@Given("The users click on add customer")
		public void the_users_click_on_add_customer() {
			driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
		}

		@When("The users is filling all the details")
		public void the_users_is_filling_all_the_details() {
			driver.findElement(By.xpath("//label[@for='done']")).click();
		    driver.findElement(By.id("fname")).sendKeys("Renu");
		    driver.findElement(By.id("lname")).sendKeys("R");
		    driver.findElement(By.id("email")).sendKeys("Rendfao@gmail.com");
		    driver.findElement(By.name("addr")).sendKeys("Chennai");
		    driver.findElement(By.id("telephoneno")).sendKeys("94562323");
		}
		@When("The customers clicks on submit button")
		public void the_customers_clicks_on_submit_button() {
			 driver.findElement(By.name("submit")).click();
		}

		@Then("The users will see the customer id")
		public void the_users_will_see_the_customer_id() {
			Assert.assertTrue(driver.findElement(By.xpath("//td[@align='center'][2]")).isDisplayed());
		}

	
		@When("The users is filling all the ID details{string},{string},{string},{string},{string}")
		public void the_users_is_filling_all_the_ID_details(String name, String lastname, String email, String address, String phnno) {
			driver.findElement(By.xpath("//label[@for='done']")).click();
		    driver.findElement(By.id("fname")).sendKeys(name);
		    driver.findElement(By.id("lname")).sendKeys(lastname);
		    driver.findElement(By.id("email")).sendKeys(email);
		    driver.findElement(By.name("addr")).sendKeys(address);
		    driver.findElement(By.id("telephoneno")).sendKeys(phnno);
	}
		@When("The customer click the submit button")
		public void the_customer_click_the_submit_button() {
			 driver.findElement(By.name("submit")).click();
		}

		@Then("The user will sees the customer id")
		public void the_user_will_sees_the_customer_id() {
			Assert.assertTrue(driver.findElement(By.xpath("//td[@align='center'][2]")).isDisplayed());
		}
}
