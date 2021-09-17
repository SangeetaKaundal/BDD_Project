Feature: Login Functionality

Scenario: check availability of all the login form elements
Given Launch the application with valid URL
Then check availability of all the elements

Scenario: check login function with valid credentials
Given Launch the application with valid URL
When user enter the valid credentials
And click on login button
Then user should be redirect to Home Page