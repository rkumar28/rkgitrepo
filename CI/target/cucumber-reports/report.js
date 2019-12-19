$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/LandingPageProperties.feature");
formatter.feature({
  "name": "LandingPage Properties.",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Navigate to SignIn Page from Landing page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@RegisterTest"
    },
    {
      "name": "@SmokeTest"
    },
    {
      "name": "@Demo"
    }
  ]
});
formatter.step({
  "name": "SkinnyTies launched and active",
  "keyword": "Given "
});
formatter.match({
  "location": "LandingPageProperties_Steps.skinnyties_launched_and_active()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the SignInLink",
  "keyword": "When "
});
formatter.match({
  "location": "LandingPageProperties_Steps.i_click_the_SignInLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "SignIn page should be launched",
  "keyword": "Then "
});
formatter.match({
  "location": "LandingPageProperties_Steps.signin_page_should_be_launched()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "SignIn page should have email and password field displayed and enabled",
  "keyword": "And "
});
formatter.match({
  "location": "LandingPageProperties_Steps.signin_page_should_have_email_and_password_field_displayed_and_enabled()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Click the SkinnyTies logo Landing page should be displayed",
  "keyword": "And "
});
formatter.match({
  "location": "LandingPageProperties_Steps.i_Click_the_SkinnyTies_logo_Landing_page_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Navigate to Registration Page from Landing page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@RegisterTest"
    },
    {
      "name": "@SmokeTest"
    },
    {
      "name": "@Demo"
    }
  ]
});
formatter.step({
  "name": "SkinnyTies launched and active",
  "keyword": "Given "
});
formatter.match({
  "location": "LandingPageProperties_Steps.skinnyties_launched_and_active()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Click the Register link",
  "keyword": "When "
});
formatter.match({
  "location": "LandingPageProperties_Steps.i_Click_the_Register_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Register page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LandingPageProperties_Steps.register_page_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Register page should have First Name and Last Name fields",
  "keyword": "And "
});
formatter.match({
  "location": "LandingPageProperties_Steps.register_page_should_have_First_Name_and_Last_Name_fields()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Email, password and Confirm password fields for Account Info should be enabled and displayed",
  "keyword": "And "
});
formatter.match({
  "location": "LandingPageProperties_Steps.email_password_and_Confirm_password_fields_for_Account_Info_should_be_enabled_and_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Click Register button with out entering value in Required fields",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@RegisterTest"
    },
    {
      "name": "@SmokeTest"
    },
    {
      "name": "@Demo"
    }
  ]
});
formatter.step({
  "name": "SkinnyTies launched and active",
  "keyword": "Given "
});
formatter.match({
  "location": "LandingPageProperties_Steps.skinnyties_launched_and_active()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigated to Register Page",
  "keyword": "And "
});
formatter.match({
  "location": "LandingPageProperties_Steps.navigated_to_Register_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Register button with out entering value in Required fields",
  "keyword": "When "
});
formatter.match({
  "location": "LandingPageProperties_Steps.i_click_Register_button_with_out_entering_value_in_Required_fields()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "mandatory field warning should be displayed for all the fields",
  "keyword": "Then "
});
formatter.match({
  "location": "LandingPageProperties_Steps.mandatory_field_warning_should_be_displayed_for_all_the_fields()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The Register page should be active",
  "keyword": "And "
});
formatter.match({
  "location": "LandingPageProperties_Steps.the_Register_page_should_be_active()"
});
formatter.result({
  "status": "passed"
});
});