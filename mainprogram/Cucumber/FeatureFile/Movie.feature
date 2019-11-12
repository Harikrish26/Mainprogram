@Movie
Feature: Watch the movie

  Scenario: To buy movie ticket and watch the movie
    Given Launch the Bookmyshow website
    When Select the seat and snacks
    And select the no of member to watch
    When make the paymet through debit card
    Then finally watch the bigil movie
