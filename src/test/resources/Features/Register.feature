Feature: User Registration
  Scenario: user register with required valid credentials
    Given user is on register page
    When user enter valid credentials "Muhamed" "Tharwat" "jigiko4865a@dekaps.com" "P@ssw0rd"
    And click on register button
    Then User Directed to profile page successfully