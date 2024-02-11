Feature: Login Automation of VtigerCRM

Background: User Navigate to HomePage
Given User at log in page
When Enter "admin" and "root"
And Click on login button
Then User Navigate to home page



Scenario Outline: Check Log in Success full with valid credential

And Close browser;


Scenario Outline: Check Log in Success full with valid credential

And Close browser;
Examples:
| Userid | password |
| admin | root |




