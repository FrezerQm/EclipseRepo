Feature: Retail Page application

@Test1
Scenario: Verify user can search a product
  Given User is on retail website
  When User search for 'Pokemon' item
  Then Product should be displayed