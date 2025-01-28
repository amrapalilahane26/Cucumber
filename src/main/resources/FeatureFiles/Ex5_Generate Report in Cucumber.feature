Feature: login functionality _Reportgeneration


Background:
Given  user is at login page
When user enter UN
And user enter PWD
And user click on login btn

Scenario: verify title
Then get title & verify

Scenario: verify profile
When user click on profile tab
Then verify profile name

Scenario: logout from app
When user click on profile tab
Then user click on logout btn
