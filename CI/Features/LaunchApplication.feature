#Author: your rameshkumar.m@hcl.com


Feature: LaunchApplication
	Launch the Skinny ties application

@SmokeTest
Scenario: LaunchApplication_SkinnyTies
Given Web Browser is active
When I enter application url and hit enterkey
Then Browser should load the SkinnyTies Application
	And SignIn link should displayed and enabled
	And Register link should displayed and enabled
	And SkinnyTies Logo should be displayed
	And CartBox should be displayed and enabled
	And SearchBox should be displayed and enabled
	And Collection Link should be diplayed and enabled
	And Color Link should be diplayed and enabled
	And Width Link should be diplayed and enabled
	And Fabric Link should be diplayed and enabled
	And Pattern Link should be diplayed and enabled
	