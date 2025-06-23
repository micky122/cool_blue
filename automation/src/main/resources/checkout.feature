Feature: Checkout flow through Coolblue website
  Scenario: Login and surfing on Coolblue
    Given I go to the home page
    And I accept the cookies
    When I go to the login field in the account section of the navigation bar
    Then I login in with my account information