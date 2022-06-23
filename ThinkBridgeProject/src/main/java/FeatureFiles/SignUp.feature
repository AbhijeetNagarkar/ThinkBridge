Feature: Sign Up Workflow
  
  Scenario: To verify Sign Up workflow
  			Given User Launch a new Browser
				When User Open URL https://jt-dev.azurewebsites.net/#/SignUp
				Then Validate that the dropdown has "English" and "Dutch"
				And Enter in User name
				And Enter organization
				And Enter email address.
				And Click on I agree to the Terms and Conditions
				And Click on SignUp
				And Validate Email received
