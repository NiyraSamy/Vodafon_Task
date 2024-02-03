

@SelectFeature
Feature: Select Items 

  
    
@SelectScenario3
Scenario Outline: Select 3 items when arabic & old customer
    Given user open the website and go to home page
    And User clicks on close cookies settings and clicks on Take me back to homepage
    When User is on home page
    Then User Login with "<MobileNumber>" and "<Password>"
    #Then Get Cart num of products
    #And User search for the last item as "<ItemName>" and add to cart
    #And Check that item added to cart
    #And User add 2 item to the cart
    #And Check that item added to cart
    
    
    
    
Examples:

|   MobileNumber   | Password | ItemName |
|   01142704126    | Test123@ |سكوتر|

@