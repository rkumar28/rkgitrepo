package stepDefinition;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class VerifyLandingPage_Steps {
	public static WebDriver wDriver;	

	@Given("The application SkinnyTies launched")
	public void the_application_SkinnyTies_launched() {
		String geckodriverpath="C:\\HCL-All-Items\\rkgitrepo\\CI\\WebDriver\\geckodriver-v0.21.0-win64\\geckodriver.exe";
	    //Set system property and GeckoDriver Path
        System.setProperty("webdriver.gecko.driver", geckodriverpath);
        //Then create a new instance on firefox driver
        wDriver = new FirefoxDriver();	    
		wDriver.manage().window().maximize();
		System.out.println("Opened the Browser - Local Test Mode.");
		wDriver.get("http://SkinnyTies.com");
		System.out.println("Application Title :" + wDriver.getTitle());
		assertTrue(wDriver.findElement(By.xpath("//*[@id='search']")).isDisplayed());
		assertTrue(wDriver.findElement(By.xpath("//*[@id='search']")).isEnabled());
	}

	@When("SkinnyTies Landing Page HeaderLoaded")
	public void skinnyties_Landing_Page_HeaderLoaded() {
		assertTrue(wDriver.findElement(By.xpath("//*[@id='search']")).isDisplayed());
	}

	@Then("SkinnyTies Landing Page Header should have the Logo visible and ebabled")
	public void skinnyties_Landing_Page_Header_should_have_the_Logo_visible_and_ebabled() {
		assertTrue(wDriver.findElement(By.id("logo")).isDisplayed());
		assertTrue(wDriver.findElement(By.id("logo")).isEnabled());
	}

	@Then("The Navigation link Collection should be enabled and displayed")
	public void the_Navigation_link_Collection_should_be_enabled_and_displayed() {
		assertTrue(wDriver.findElement(By.xpath("//*[@id='nav']/ol/li[1]/a")).isDisplayed());
		assertTrue(wDriver.findElement(By.xpath("//*[@id='nav']/ol/li[1]/a")).isEnabled());
	}

	@Then("The Navigation link Color should be enabled and displayed")
	public void the_Navigation_link_Color_should_be_enabled_and_displayed() {
		assertTrue(wDriver.findElement(By.xpath("//*[@id='nav']/ol/li[2]/a")).isDisplayed());
		assertTrue(wDriver.findElement(By.xpath("//*[@id='nav']/ol/li[2]/a")).isEnabled());
	}
	
	@Then("The Navigation link Width should be enabled and displayed")
	public void the_Navigation_link_Width_should_be_enabled_and_displayed() {
		assertTrue(wDriver.findElement(By.xpath("//*[@id='nav']/ol/li[3]/a")).isDisplayed());
		assertTrue(wDriver.findElement(By.xpath("//*[@id='nav']/ol/li[3]/a")).isEnabled());
	}

	@Then("The Navigation link Fabric should be enabled and displayed")
	public void the_Navigation_link_Fabric_should_be_enabled_and_displayed() {
		assertTrue(wDriver.findElement(By.xpath("//*[@id='nav']/ol/li[4]/a")).isDisplayed());
		assertTrue(wDriver.findElement(By.xpath("//*[@id='nav']/ol/li[4]/a")).isEnabled());
	}

	@Then("The Navigation link Pattern should be enabled and displayed")
	public void the_Navigation_link_Pattern_should_be_enabled_and_displayed() {
		assertTrue(wDriver.findElement(By.xpath("//*[@id='nav']/ol/li[5]/a")).isDisplayed());
		assertTrue(wDriver.findElement(By.xpath("//*[@id='nav']/ol/li[5]/a")).isEnabled());
	}

	@Then("The Feature link SignIn should be enabled and displayed")
	public void the_Feature_link_SignIn_should_be_enabled_and_displayed() {
		assertTrue(wDriver.findElement(By.xpath("//*[@id='header-account']/ul/li[1]/a")).isDisplayed());
		assertTrue(wDriver.findElement(By.xpath("//*[@id='header-account']/ul/li[1]/a")).isEnabled());	  
	}

	@Then("The Feature link Register should be enabled and displayed")
	public void the_Feature_link_Register_should_be_enabled_and_displayed() {
		assertTrue(wDriver.findElement(By.xpath("//*[@id='header-account']/ul/li[2]/a")).isDisplayed());
		assertTrue(wDriver.findElement(By.xpath("//*[@id='header-account']/ul/li[2]/a")).isEnabled());
	}

	@Then("The Search Editbox should be displayed and enabled")
	public void the_Search_Editbox_should_be_displayed_and_enabled() {
		assertTrue(wDriver.findElement(By.xpath("//*[@id='search']")).isDisplayed());
		assertTrue(wDriver.findElement(By.xpath("//*[@id='search']")).isEnabled());
		
		wDriver.quit();
	}
}

