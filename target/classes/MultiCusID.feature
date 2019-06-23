
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag2
  Scenario Outline: Title of your scenario outline
    Given The user is in telecome page link
    And The user clicks on add customer
     When The user is filling all the ID details"<name>","<lastname>","<email>","<address>","<phnno>"
      And The customer click on submit button
    Then The user will gets the customer id
    Examples: 
      | name  | lastname | email        |address| phnno|
      |Renu   |R         |adkd@gmail.com|Chennai|2659522|
   		|Pavi   |R         |asdad@gmail.com|Chennai|2659552|
      