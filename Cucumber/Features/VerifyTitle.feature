Feature: Verify the Title of our Web application 
As acceptance tests we want to verify the title of our home page

Scenario: Verify the title of home page 

Given User is on landing page 
When User checks the title 
Then It must say "Facebook - Log In ot Sign Up"