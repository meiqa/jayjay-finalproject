@web
Feature: Login and Logout

  @login-valid-user
  Scenario: Login with Valid Username and Password
    Given the user is on landing page
    When the user clicks the login menu
    And the user entered "test" in login username field
    And the user entered "test" in login password field
    And the user clicks confirm login button
    Then the name of user appears at the right top is "Welcome test"

  @login-valid-user-wrong-password
  Scenario: Login with Valid Username and Wrong Password
    Given the user is on landing page
    When the user clicks the login menu
    And the user entered "test" in login username field
    And the user entered "qwertyuiop" in login password field
    And the user clicks confirm login button
    Then alert message should be displayed as "Wrong password."

  @login-invalid-user-password
  Scenario: Login with Invalid Username and Password
    Given the user is on landing page
    When the user clicks the login menu
    And the user entered "qwertysadhelpx" in login username field
    And the user entered "qwertyuiop" in login password field
    And the user clicks confirm login button
    Then alert message should be displayed as "User does not exist."

  @logout-user
  Scenario: Logout Current User
    Given the user is on landing page
    When the user clicks the login menu
    And the user entered "test" in login username field
    And the user entered "test" in login password field
    And the user clicks confirm login button
    Then the name of user appears at the right top is "Welcome test"
    When the user click the logout menu
    Then the sign up menu appears