Feature: Verify the Success message local host

Scenario: Verify using valid username, name and valid password

Given User in on login page

When User enters valid "admin", "admin" and "admin"

And User clicks on gender checkbox

And User clicks on submit button

Then User sees Success message

