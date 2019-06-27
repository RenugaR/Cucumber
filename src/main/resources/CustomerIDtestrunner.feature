@CustomerID
Feature: Title of your feature
  I want to use this template for my feature file
Background:
   Given The users is in telecome page
    And The users click on add customer

@Customer  @MultiCustomer
   Scenario: Title of your scenario
   
    When The users is filling all the details
    And The customers clicks on submit button
    Then The users will see the customer id
    
    @MutltiCustomer
  Scenario Outline: Title of your scenario outline
  
     When The users is filling all the ID details"<name>","<lastname>","<email>","<address>","<phnno>"
     And The customer click the submit button
    Then The user will sees the customer id
    Examples: 
      | name  | lastname | email        |address| phnno|
      |Renu   |R         |adkd@gmail.com|Chennai|2659522|
   		|Pavi   |R         |asdad@gmail.com|Chennai|2659552|
    