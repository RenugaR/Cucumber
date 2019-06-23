package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsTariff {
	static WebDriver driver;
	@Given("The user is in telecome home page")
	public void the_user_is_in_telecome_home_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\GreenTech\\SeleniumDay1\\drivers\\ChromeDriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/telecom/index.html");
	}
	@Given("The user click on add Tariff plan")
	public void the_user_click_on_add_Tariff_plan() {
	    driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	}
	@When("The user is filling all the tariff details")
	public void the_user_is_filling_all_the_tariff_details() {
		driver.findElement(By.id("rental1")).sendKeys("100");
		driver.findElement(By.id("local_minutes")).sendKeys("500");
		driver.findElement(By.id("inter_minutes")).sendKeys("200");
		driver.findElement(By.id("sms_pack")).sendKeys("75");
		driver.findElement(By.id("minutes_charges")).sendKeys("10");
		driver.findElement(By.id("inter_charges")).sendKeys("150");
		driver.findElement(By.id("sms_charges")).sendKeys("5");
	}
	@When("The customer clicks on tariff submit button")
	public void the_customer_clicks_on_tariff_submit_button() {
		 driver.findElement(By.name("submit")).click();
	}
	@Then("The user will see the 	success message")
	public void the_user_will_see_the_success_message() {
		Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).isDisplayed());	
	}

}
