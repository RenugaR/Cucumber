@CustomerID
Feature: Title of your feature
  I want to use this template for my feature file
Background:
   Given The user is in telecome page
    And The user click on add customer

@Customer  
   Scenario: Title of your scenario
   
    When The user is filling all the details
    And The customer clicks on submit button
    Then The user will see the customer id
    
    @MutltiCustomer
  Scenario Outline: Title of your scenario outline
  
     When The user is filling all the ID details"<name>","<lastname>","<email>","<address>","<phnno>"
     And The customer click on submit button
    Then The user will gets the customer id
    Examples: 
      | name  | lastname | email        |address| phnno|
      |Renu   |R         |adkd@gmail.com|Chennai|2659522|
   		|Pavi   |R         |asdad@gmail.com|Chennai|2659552|
    