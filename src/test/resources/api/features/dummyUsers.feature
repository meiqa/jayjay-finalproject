@api
  Feature: User Data

    @user-list
    Scenario:Get User List
      Given the user has valid app id
      When the user send GET user list request
      Then the response status code should be 200

    @user-id
    Scenario: Get User by ID
      Given the user has valid app id
      When the user send GET user id by "60d0fe4f5311236168a109fb"
      Then the response status code should be 200
      And the response should match get user by id json schema

    @create-user
    Scenario: Create New User
      Given the user has valid app id
      And the user enter "Ineffa" as first name
      And the user enter "Aino" as last name
      And the user enter "@gi.com" as email suffix
      When the user send POST create user
      Then the response status code should be 200
      And the response user id should not be null

    @update-user
    Scenario: Update Existing User
      Given the user has valid app id
      And the user enter "Odette" as last name
      When the user send PUT user id by "6a8fe52c07f34e6029273346"
      Then the response status code should be 200
      And the response should match update user by id json schema
      And the response user id should not be null

    @delete-non-existing-user
    Scenario: Delete Non-Existing User
      Given the user has valid app id
      When the user send DELETE user id by "6a8fde7107f34e041a273123"
      Then the response status code should be 404
      And the response should match delete user by id json schema