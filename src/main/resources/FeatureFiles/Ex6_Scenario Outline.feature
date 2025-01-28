Feature:Login Feature with Scenario Outline 


Scenario Outline:
Given user in at signup page
When user enters name as "<name>" 
And user enters age as <Age> 
And user confirm gender as "<gender>"
Then user gets created


Examples:
|name|Age|gender|
|swati|36|F|
|Poonam|32|F|
|Kamali|35|M|
|Mitali|65|M|
     