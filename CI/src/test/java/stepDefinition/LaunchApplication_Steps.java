package stepDefinition;


import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LaunchApplication_Steps {
	public static WebDriver wDriver;	
		
	@Given("Web Browser is active")
	public void web_Browser_is_active() {
		String geckodriverpath="C:\\HCL-All-Items\\rkgitrepo\\CI\\WebDriver\\geckodriver-v0.21.0-win64\\geckodriver.exe";
	    //Set system property and GeckoDriver Path
        System.setProperty("webdriver.gecko.driver", geckodriverpath);
        //Then create a new instance on firefox driver
        wDriver = new FirefoxDriver();	    
		wDriver.manage().window().maximize();
		System.out.println("Opened the Browser - Local Test Mode.");
	}

	@When("I enter application url and hit enterkey")
	public void i_enter_application_url_and_hit_enterkey() {
		wDriver.get("http://SkinnyTies.com");
		System.out.println("Application Title :" + wDriver.getTitle());
	}

	@Then("Browser should load the SkinnyTies Application")
	public void browser_should_load_the_SkinnyTies_Application() {
		assertTrue(wDriver.findElement(By.xpath("//*[@id='search']")).isDisplayed());
		assertTrue(wDriver.findElement(By.xpath("//*[@id='search']")).isEnabled());
	}

	@Then("SignIn link should displayed and enabled")
	public void signin_link_should_displayed_and_enabled() {
		assertTrue(wDriver.findElement(By.xpath("//*[@id='header-account']/ul/li[1]/a")).isDisplayed());
		assertTrue(wDriver.findElement(By.xpath("//*[@id='header-account']/ul/li[1]/a")).isEnabled());
	}

	@Then("Register link should displayed and enabled")
	public void register_link_should_displayed_and_enabled() {
		assertTrue(wDriver.findElement(By.xpath("//*[@id='header-account']/ul/li[2]/a")).isDisplayed());
		assertTrue(wDriver.findElement(By.xpath("//*[@id='header-account']/ul/li[2]/a")).isEnabled());
		//wDriver.quit();
	}	
	@Then("SkinnyTies Logo should be displayed")
	public void skinnyties_Logo_should_be_displayed() {
		assertTrue(wDriver.findElement(By.id("logo")).isDisplayed());
		assertTrue(wDriver.findElement(By.id("logo")).isEnabled());	   
	}

	@Then("CartBox should be displayed and enabled")
	public void cartbox_should_be_displayed_and_enabled() {
		assertTrue(wDriver.findElement(By.id("header-cart")).isDisplayed());
		assertTrue(wDriver.findElement(By.id("header-cart")).isEnabled());	
	}

	@Then("SearchBox should be displayed and enabled")
	public void searchbox_should_be_displayed_and_enabled() {
		assertTrue(wDriver.findElement(By.id("search")).isDisplayed());
		assertTrue(wDriver.findElement(By.id("search")).isEnabled());			
	}

	@Then("Collection Link should be diplayed and enabled")
	public void collection_Link_should_be_diplayed_and_enabled() {		
		assertTrue(wDriver.findElement(By.xpath("//*[@id='nav']/ol/li[1]/a")).isDisplayed());
		assertTrue(wDriver.findElement(By.xpath("//*[@id='nav']/ol/li[1]/a")).isEnabled());
	}

	@Then("Color Link should be diplayed and enabled")
	public void color_Link_should_be_diplayed_and_enabled() {
		assertTrue(wDriver.findElement(By.xpath("//*[@id='nav']/ol/li[2]/a")).isDisplayed());
		assertTrue(wDriver.findElement(By.xpath("//*[@id='nav']/ol/li[2]/a")).isEnabled());
	}

	@Then("Width Link should be diplayed and enabled")
	public void width_Link_should_be_diplayed_and_enabled() {
		assertTrue(wDriver.findElement(By.xpath("//*[@id='nav']/ol/li[3]/a")).isDisplayed());
		assertTrue(wDriver.findElement(By.xpath("//*[@id='nav']/ol/li[3]/a")).isEnabled());
	}

	@Then("Fabric Link should be diplayed and enabled")
	public void fabric_Link_should_be_diplayed_and_enabled() {
		assertTrue(wDriver.findElement(By.xpath("//*[@id='nav']/ol/li[4]/a")).isDisplayed());
		assertTrue(wDriver.findElement(By.xpath("//*[@id='nav']/ol/li[4]/a")).isEnabled());
	}

	@Then("Pattern Link should be diplayed and enabled")
	public void pattern_Link_should_be_diplayed_and_enabled() {
		assertTrue(wDriver.findElement(By.xpath("//*[@id='nav']/ol/li[5]/a")).isDisplayed());
		assertTrue(wDriver.findElement(By.xpath("//*[@id='nav']/ol/li[5]/a")).isEnabled());
	
	wDriver.quit();
	}
}
