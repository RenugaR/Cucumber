@tag
Feature: Title of your feature
  I want to use this template for my feature file
  @tag2
  Scenario Outline: Title of your scenario outline
   Given The user is telecome home page
    And The user clicks on add Tariff plan
    When The user is filling all tariff details"<MonthlyRental>","<LocMins>","<IntMins>","<SMSpack>","<locCharges>","<IntCharges>","<SMS>"
    And The customer click on tariff submit button
    Then The user will gets the success message
    Examples: 
      |MonthlyRental   |LocMins  |IntMins         |SMSpack| locCharges|IntCharges|SMS|
      |100             |500      |200             |75     |10         |50        |5  |
      |101             |200      |100             |75     |20         |40        |25 |
      |102             |400      |300             |75     |30         |20        |15 |
