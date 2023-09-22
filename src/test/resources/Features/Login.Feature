Feature: User Login
  Background:
    Given user is on login page

    Scenario Outline: user register with required valid credentials
      Given user enter valid credentials "<Email>" "<Password>"
      And click on login button
      Then user is logged in and logout button appeared

      Examples:
      |Email|Password|
      |jigiko4865qa5aa@dekaps.com|P@ssw0rd|