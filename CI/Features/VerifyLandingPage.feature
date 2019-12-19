#Author: your rameshkumar.m@hcl.com

Feature: Landingpage Header Properties

@SmokeTest @Demo
Scenario: VerifyLandingPage
	Given The application SkinnyTies launched
	When SkinnyTies Landing Page HeaderLoaded
	Then SkinnyTies Landing Page Header should have the Logo visible and ebabled
	And The Navigation link Collection should be enabled and displayed
	And The Navigation link Color should be enabled and displayed
	And The Navigation link Width should be enabled and displayed
	And The Navigation link Fabric should be enabled and displayed
	And The Navigation link Pattern should be enabled and displayed
	And The Feature link SignIn should be enabled and displayed
	And The Feature link Register should be enabled and displayed
	And The Search Editbox should be displayed and enabled	