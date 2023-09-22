Feature: User Registration
  Background:
    Given user is on register page

  Scenario: user register with required valid credentials
    Given user enter valid credentials "Muhamed" "Tharwat" "jigiko4865qa7a@dekaps.com" "P@ssw0rd"
    When click on register button
    Then verify register completed message "Your registration completed"

  Scenario Outline: user can not register with already Registered email
    Given user enter valid credentials "<Fname>" "<Lname>" "<Email>" "<Password>"
    When click on register button
    Then verify Email Already exist message "<ErrorMessage>"

    Examples:
      | Fname   | Lname   | Email                    | Password | ErrorMessage|
      | Muhamed | Tharwat | jigiko4865qa7a@dekaps.com | P@ssw0rd | The specified email already exists|

  Scenario Outline: "<FieldName>" field is required
    Given user enter valid credentials "<Fname>" "<Lname>" "<Email>" "<Password>"
    When click on register button
    Then verify "<FieldName>" Required message "<ErrorMessage>"

    Examples:
      | FieldName  | Fname   | Lname   | Email                     | Password | ErrorMessage            |
      | First Name |         | Tharwat | jigiko4865qa7aa@dekaps.com | P@ssw0rd | First name is required. |
      | Last Name  | Muahmed |         | jigiko4865qa7aa@dekaps.com | P@ssw0rd | Last name is required.  |
      | Password  | Muahmed | Tharwat | jigiko4865qa7aa@dekaps.com |          | Password is required.   |
