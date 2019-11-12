Feature: Test the Demo automation practise
Scenario Outline: Test login functionality of automation practise
Given User is already on automation practise SignIn Page
When User click signin button
And User should enters "<Username>" and "<Password>"
When User clicks the sign button
Then User should see the home page


Examples:
|Username|Password|
|b.harikrish26@gmail.com|hari1991|
|pradeeprajendiren@gmail.com|Welcom3|
|Username3|Password3|
|Username4|Password4|