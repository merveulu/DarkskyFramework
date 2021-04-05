@Login
Feature:Dark sky whether forecast

  Scenario: See the whether forecast of your location
    Given I am on the home page
    When I enter my location
    And I click the search button
    Then I see the lowest and highest temperature of my location