@Smoke, @Sanity
Feature: Telecome feature
  I want to use this template for my feature file

  Background: 
    #Given User is in telecom home page
    And User click on add customer

  Scenario: add customer flow
    When user is filling all the fields
      | kunal | kumar | kunalkumar90981@gmailcom | chennai | 8608628990 |
    And user click on submit button.

  #one dimensional map
  Scenario: add customer flow
    When user is filling all the fields.
      | fname   | kunal                |
      | lname   | Kumar                |
      | email   | Kumarkunal@gmail.com |
      | address | Salem                |
      | phone   |           1234567890 |
    And user click on submit button.

  Scenario: Add customer flow
    When user is filling details in all the fields
      | Kunal  | Kumar    | Kumarkunal@gmail.com | Salem    | 1234567890 |
      | Pari   | parashar | pari001@gmail.com    | Thirupur | 4567890123 |
      | Ramesh | Kumar    | RameshRaj@gmail.com  | Erode    | 5678901234 |
    And user click on submit button.
