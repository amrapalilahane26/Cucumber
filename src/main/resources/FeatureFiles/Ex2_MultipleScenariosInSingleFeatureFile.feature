Feature: Login Feature
Scenario: Login with Credentials

Scenario: : login with credentials
Given  user is at login page
When user enter UN
And user enter PWD
And user click on login btn
Then user should redirect to home page

Scenario: verify title of webpage
Given  user is at login page
Then  title of page should visible

