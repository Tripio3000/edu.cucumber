Feature: EvenOdd feature

  Scenario: Run programm to get Even
    Given Create a EvenOdd programm
    When Run with the 6
    Then The result is "Even"

  Scenario: Run programm to get Odd
    Given Create a EvenOdd programm
    When Run with the 9
    Then The result is "Odd"