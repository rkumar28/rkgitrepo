package stepDefinition;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LandingPageProperties_Steps {

public static WebDriver wDriver;

//Scenario:Navigate to SignIn Page from Landing page
@Given("SkinnyTies launched and active")
public void skinnyties_launched_and_active() {
	String geckodriverpath="C:\\HCL-All-Items\\rkgitrepo\\CI\\WebDriver\\geckodriver-v0.21.0-win64\\geckodriver.exe";
    //Set system property and GeckoDriver Path
    System.setProperty("webdriver.gecko.driver", geckodriverpath);
    //Then create a new instance on firefox driver
    wDriver = new FirefoxDriver();	    
    wDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);    
	wDriver.manage().window().maximize();
	
	System.out.println("Opened the Browser - Local Test Mode.");
	wDriver.get("https://skinnyties.com");
	assertTrue(wDriver.findElement(By.xpath("//*[@id='search']")).isDisplayed());
	assertTrue(wDriver.findElement(By.xpath("//*[@id='search']")).isEnabled());
}

@When("I click the SignInLink")
public void i_click_the_SignInLink() {
	WebElement signinLink = wDriver.findElement(By.xpath("//*[@id='header-account']/ul/li[1]/a"));
	assertTrue(signinLink.isDisplayed());
	signinLink.click();	
}

@Then("SignIn page should be launched")
public void signin_page_should_be_launched() {
	WebElement email_field = wDriver.findElement(By.id("email"));
	assertTrue(email_field.isEnabled());
	assertTrue(email_field.isDisplayed());
}

@Then("SignIn page should have email and password field displayed and enabled")
public void signin_page_should_have_email_and_password_field_displayed_and_enabled() {
   WebElement password_field = wDriver.findElement(By.id("pass"));
   assertTrue(password_field.isDisplayed());
   assertTrue(password_field.isEnabled());
}

@Then("I Click the SkinnyTies logo Landing page should be displayed")
public void i_Click_the_SkinnyTies_logo_Landing_page_should_be_displayed() {
   WebElement st_logo = wDriver.findElement(By.xpath("/html/body/div[1]/header/div/h1/a"));
   assertTrue(st_logo.isEnabled());
   if (st_logo.isDisplayed() && (st_logo.isEnabled())){
	   st_logo.click();
   }
   WebElement HomeHero = wDriver.findElement(By.cssSelector(".home-hero"));
   assertTrue(HomeHero.isDisplayed() && HomeHero.isEnabled());
   
   wDriver.quit();
}
// Scenario: Navigate to Registration Page from Landing page
@When("I Click the Register link")
public void i_Click_the_Register_link() {
	WebElement Register_Link = wDriver.findElement(By.xpath("//*[@id='header-account']/ul/li[2]/a"));
	Register_Link.click();
}

@Then("Register page should be displayed")
public void register_page_should_be_displayed() {
	assertTrue(wDriver.getCurrentUrl().contains("customer/account/create/"));
}

@Then("Register page should have First Name and Last Name fields")
public void register_page_should_have_First_Name_and_Last_Name_fields() {
	//Check the presence of First Name field.
    WebElement FirstName_field = wDriver.findElement(By.id("firstname"));
    assertTrue(FirstName_field.isDisplayed());
    assertTrue(FirstName_field.isEnabled());
    
    //Check the presence of Last Name field
    WebElement LastName_field =  wDriver.findElement(By.id("lastname"));
    assertTrue(LastName_field.isDisplayed());
    assertTrue(LastName_field.isEnabled());    
    // Wait for some time
}

@Then("Email, password and Confirm password fields for Account Info should be enabled and displayed")
public void email_password_and_Confirm_password_fields_for_Account_Info_should_be_enabled_and_displayed() {
	WebElement emailid_field = wDriver.findElement(By.id("email_address"));
	assertTrue(emailid_field.isDisplayed());
    assertTrue(emailid_field.isEnabled());
    
	
	WebElement password_field = wDriver.findElement(By.id("password"));
	assertTrue(password_field.isDisplayed());
    assertTrue(password_field.isEnabled());
    
	WebElement confirmation_field = wDriver.findElement(By.id("confirmation"));
	assertTrue(confirmation_field.isDisplayed());
    assertTrue(confirmation_field.isEnabled());   
    
    //Quit Driver
    wDriver.quit();
}

// Scenario:Click Register button with out entering value in Required fields
@Given("Navigated to Register Page")
public void navigated_to_Register_Page() {
	WebElement Register_Link = wDriver.findElement(By.xpath("//*[@id='header-account']/ul/li[2]/a"));
	Register_Link.click();
	assertTrue(wDriver.getCurrentUrl().contains("customer/account/create/"));
}

@When("I click Register button with out entering value in Required fields")
public void i_click_Register_button_with_out_entering_value_in_Required_fields() {
	WebElement Register_Button = wDriver.findElement(By.xpath("//*[@id='register-form']/div[3]/button"));
	Register_Button.click();
}

@Then("mandatory field warning should be displayed for all the fields")
public void mandatory_field_warning_should_be_displayed_for_all_the_fields() {
   assertTrue(wDriver.findElement(By.id("advice-required-entry-firstname")).isDisplayed()); 
   assertTrue(wDriver.findElement(By.id("advice-required-entry-lastname")).isDisplayed());
   assertTrue(wDriver.findElement(By.id("advice-required-entry-email_address")).isDisplayed());
   assertTrue(wDriver.findElement(By.id("advice-required-entry-password")).isDisplayed());
   assertTrue(wDriver.findElement(By.id("advice-required-entry-confirmation")).isDisplayed());
}

@Then("The Register page should be active")
public void the_Register_page_should_be_active() {
   WebElement RegisterPage_Header = wDriver.findElement(By.xpath("//*[@id='matter']/div[1]/div/h1"));
   assertTrue(RegisterPage_Header.isDisplayed());
   
   wDriver.quit();
}

}
