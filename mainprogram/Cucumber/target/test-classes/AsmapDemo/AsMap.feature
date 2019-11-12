Feature: Test the Demo automation practise
Scenario: Test login functionality of automation practise
Given User is already on automation practise SignIn Page
When User click signin button
And User should enters 
|Username|b.harikrish26@gmail.com|
|Password|hari1991|
When User clicks the sign button
Then User should see the home page