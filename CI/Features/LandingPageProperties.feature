
Feature: LandingPage Properties.

@RegisterTest @SmokeTest @Demo
Scenario: Navigate to SignIn Page from Landing page
Given SkinnyTies launched and active
When I click the SignInLink
Then SignIn page should be launched
	And SignIn page should have email and password field displayed and enabled
	And I Click the SkinnyTies logo Landing page should be displayed

@RegisterTest @SmokeTest @Demo
Scenario: Navigate to Registration Page from Landing page
	Given SkinnyTies launched and active
	When I Click the Register link
	Then Register page should be displayed
	 And  Register page should have First Name and Last Name fields 
	 And Email, password and Confirm password fields for Account Info should be enabled and displayed
	
@RegisterTest @SmokeTest @Demo
Scenario: Click Register button with out entering value in Required fields
	Given SkinnyTies launched and active
		And Navigated to Register Page
	When I click Register button with out entering value in Required fields
	Then mandatory field warning should be displayed for all the fields
		And The Register page should be active
		 
	