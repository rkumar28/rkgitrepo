Feature: SignIn To SkinnyTies
	Description: Verify SignIn feature with multiple data.
	
@SmokeTest
	Scenario: Launch and Navigate to SignIn Page
		Given SkinnyTies launched and active
		When I click the SignInLink
		Then SignIn page should be launched
			And SignIn page should have email and password field displayed and enabled
			And I Click the SkinnyTies logo Landing page should be displayed

@SmokeTest
Scenario: SignIn with Invalid email and verify message
	Given SkinnyTies SignIn Page is Active
	When I Enter Invalid emailid
	And Click SignIn_Button
	Then Error Message should be displayed in the Page

@UDev
Scenario: SignIn with multiple Invalid email and verify message
	Given SkinnyTies SignIn Page is Active
	When I Enter Invalid emailid and password
		|emailid	|Password|
		|abc@abc.com|abc@abc.com|
		|2345@abc.com|abc@abc.com|
		|abc45@abc.com|abc@abc.com|
	And Click SignIn_Button
	Then Error Message should be displayed in the Page