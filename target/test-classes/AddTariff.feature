@Smoke, @Sanity
Feature: Tarrif plan
  I want to use this template for my feature file

  Background: 
    #Given User is in telecom home page
    And User click on add tarrif

  Scenario: Add Tariff Details
    When user is filling all the fields one dimension list
      | 250 | 150 | 60 | 200 | 1 | 5 | 3 |
    And User click on submit
