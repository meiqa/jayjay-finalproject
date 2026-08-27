@web
Feature: Cart

  @add-product-to-cart
  Scenario: Add Product to Cart
    Given the user is on landing page
    When the user clicks the login menu
    And the user entered "test" in login username field
    And the user entered "test" in login password field
    And the user clicks confirm login button
    Then the name of user appears at the right top is "Welcome test"
    When the user click a product
    Then the product details appears
    And the add to cart button appear
    When the user clicks add to cart
    Then alert message should be displayed as "Product added."