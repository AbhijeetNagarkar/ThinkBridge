$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/FeatureFiles/SignUp.feature");
formatter.feature({
  "line": 1,
  "name": "Sign Up Workflow",
  "description": "",
  "id": "sign-up-workflow",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "To verify Sign Up workflow",
  "description": "",
  "id": "sign-up-workflow;to-verify-sign-up-workflow",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User Launch a new Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User Open URL https://jt-dev.azurewebsites.net/#/SignUp",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Validate that the dropdown has \"English\" and \"Dutch\"",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Enter in User name",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Enter organization",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Enter email address.",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Click on I agree to the Terms and Conditions",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Click on SignUp",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Validate Email received",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpStepDefinitionClass.user_Launch_a_new_Browser()"
});
formatter.result({
  "duration": 3585976800,
  "status": "passed"
});
formatter.match({
  "location": "SignUpStepDefinitionClass.user_Open_URL_https_jt_dev_azurewebsites_net_SignUp()"
});
formatter.result({
  "duration": 3757637600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "English",
      "offset": 32
    },
    {
      "val": "Dutch",
      "offset": 46
    }
  ],
  "location": "SignUpStepDefinitionClass.validate_that_the_dropdown_has_and(String,String)"
});
formatter.result({
  "duration": 718129300,
  "status": "passed"
});
formatter.match({
  "location": "SignUpStepDefinitionClass.enter_in_User_name()"
});
formatter.result({
  "duration": 99099900,
  "status": "passed"
});
formatter.match({
  "location": "SignUpStepDefinitionClass.enter_organization()"
});
formatter.result({
  "duration": 136660500,
  "status": "passed"
});
formatter.match({
  "location": "SignUpStepDefinitionClass.enter_email_address()"
});
formatter.result({
  "duration": 231935100,
  "status": "passed"
});
formatter.match({
  "location": "SignUpStepDefinitionClass.click_on_I_agree_to_the_Terms_and_Conditions()"
});
formatter.result({
  "duration": 61351200,
  "status": "passed"
});
formatter.match({
  "location": "SignUpStepDefinitionClass.click_on_SignUp()"
});
formatter.result({
  "duration": 69082800,
  "status": "passed"
});
formatter.match({
  "location": "SignUpStepDefinitionClass.validate_Email_received()"
});
formatter.result({
  "duration": 26600,
  "status": "passed"
});
});