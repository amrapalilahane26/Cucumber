Feature: Login Feature
  Scenario: Successful login with valid credentials

   
   
   
Given  user is at login page
When user enter UN
And user enter PWD
And user click on login btn
Then user should redirect to home page
   