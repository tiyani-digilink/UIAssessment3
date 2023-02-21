Feature: Test the log in page.

  Scenario: Test login using valid login details.
    Given user is on the login page
    When user enters correct user name and correct password
    And clicks on the login button
    Then user should be navigated to the inventory page