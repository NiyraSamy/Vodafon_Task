#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""

## (Comments)
#Sample Feature Definition Template

Feature: contact page feature

 @tag1
 Scenario: open
    Given user open the website and go to login page

  @tag11
  Scenario: Make sure that the email text field is visible
    Given user open the website and go to login page
    When user fill email as "qacart" and "Test123!" and click on login
    And clicks on contacts
    #Then email text field should be visible
    And click on add new contact
    And fill the firstname and password
    #Then Email text field should be visible
    
    @tag2 @tag3
    Scenario: Add new contact
    Given User open the website and go to login page 
    When User fill email as "qacart" and "Test123!" and click on login
    And clicks on contacts    
    And click on add new contact
    And fill the firstname and password
    Then A new contact should be added
    
    