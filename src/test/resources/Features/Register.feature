Feature: User Registration
  Background:
    Given user is on register page

  Scenario: user register with required valid credentials
    Given user enter valid credentials "Muhamed" "Tharwat" "jigiko4865qaa@dekaps.com" "P@ssw0rd"
    When click on register button
    Then verify register completed message "Your registration completed"

  Scenario: user can not register with already Registered email
    Given user enter valid credentials "Muhamed" "Tharwat" "jigiko4865qaa@dekaps.com" "P@ssw0rd"
    When click on register button
    Then verify Email Already exist message "The specified email already exists"