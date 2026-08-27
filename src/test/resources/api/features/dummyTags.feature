@api
  Feature: Tags

    @get-tags
    Scenario:Get List of Tags
      Given the user has valid app id
      When the user send GET list of tags request
      Then the response status code should be 200