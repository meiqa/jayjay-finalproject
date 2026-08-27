@web
Feature: Login and Logout

  @login-user
  Scenario: Login
    Given the user is on landing page
    When the user clicks the login menu
    And the user entered "test" in login username field
    And the user entered "test" in login password field
    And the user clicks confirm login button
    Then the name of user appears at the right top is "Welcome test"

  @logout-user
  Scenario: Logout
    Given the user is on landing page
    When the user clicks the login menu
    And the user entered "test" in login username field
    And the user entered "test" in login password field
    And the user clicks confirm login button
    Then the name of user appears at the right top is "Welcome test"
    When the user click the logout menu
    Then the sign up menu appears