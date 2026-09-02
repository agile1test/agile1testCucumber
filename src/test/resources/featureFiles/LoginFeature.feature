Feature: Login Feature
@smoke 
Scenario Outline: Valid  admin login
Given user is in the login page in '<browser>'
When user insert valid '<email>' data
And user inserts valid '<password>'
And user clicks on login button
Then dashboard page should be displayed
And an welcome message should be displayed

Examples:
|email					|password| browser|
|student@qa.test|Password123|chrome|
|admin@qa.test	|Admin@123|firefox|


@reg
Scenario: Valid  admin login
Given user is in the login page
When user insert valid '<email>' data
And user inserts valid '<password>'
And user clicks on login button
Then dashboard page should be displayed
And an welcome message should be displayed

@smoke
Scenario: Valid  admin login
Given user is in the login page
When user insert valid email
And user inserts valid password
And user clicks on login button
Then dashboard page should be displayed
And an welcome message should be displayed


