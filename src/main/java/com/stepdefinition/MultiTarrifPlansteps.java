package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MultiTarrifPlansteps {
static WebDriver driver;

@Given("The user is telecome home page")
public void the_user_is_telecome_home_page() {
	System.setProperty("webdriver.chrome.driver", "C:\\GreenTech\\SeleniumDay1\\drivers\\ChromeDriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.guru99.com/telecom/index.html");
}

@Given("The user clicks on add Tariff plan")
public void the_user_clicks_on_add_Tariff_plan() {
	driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
}

@When("The user is filling all tariff details{string},{string},{string},{string},{string},{string},{string}")
public void the_user_is_filling_all_tariff_details
(String MonthlyRental, String LocMins, String IntMins, String SMSpack, String locCharges, String IntCharges, String SMS) {
	driver.findElement(By.id("rental1")).sendKeys(MonthlyRental);
	driver.findElement(By.id("local_minutes")).sendKeys(LocMins);
	driver.findElement(By.id("inter_minutes")).sendKeys(IntMins);
	driver.findElement(By.id("sms_pack")).sendKeys(SMSpack);
	driver.findElement(By.id("minutes_charges")).sendKeys(locCharges);
	driver.findElement(By.id("inter_charges")).sendKeys(IntCharges);
	driver.findElement(By.id("sms_charges")).sendKeys(SMS);
}

@When("The customer click on tariff submit button")
public void the_customer_click_on_tariff_submit_button() {
	driver.findElement(By.name("submit")).click();
	}

@Then("The user will gets the success message")
public void the_user_will_gets_the_success_message() {
	Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).isDisplayed());	

}
}
