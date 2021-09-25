Feature: Facebook login feature

@Sanity
Scenario: Verify user is able to login using postivive credentials

Given Launch the application
When Enter valid username
And Enter valid password
When click on login button
Then Verify appication is logged in or not