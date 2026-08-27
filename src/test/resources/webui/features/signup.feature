@web
  Feature: Sign Up

    @sign-up-exist-user
    Scenario: Sign Up with Existing User
      Given the user is on landing page
      When the user clicks the sign up menu
      And the user entered "test" in sign up username field
      And the user entered "test" in sign up password field
      And the user clicks confirm sign up button
      Then alert message should be displayed as "This user already exist."