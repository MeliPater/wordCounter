@stories
Feature: WordCounter page verification
  Background:
    Given access to the WordCounter page
  @scenario1
  Scenario: check the number of words in the assigned sentence
    When  insert the sentence "Oracion de Prueba Oracion de Oracion"
    Then the number of words must be "6"
  @scenario2
  Scenario: check the number of characters in the assigned sentence
    When  insert the sentence "Oracion de Prueba Oracion de Oracion"
    Then the number of characters must be "36"
  @scenario3
  Scenario: check the order of Keyword Density section first word
    When  insert the sentence "Oracion de Prueba Oracion de Oracion"
    Then the most repeated first word must be "Oracion"
  @scenario4
  Scenario: check the order of Keyword Density section second word
    When  insert the sentence "Oracion de Prueba Oracion de Oracion"
    Then the second most repeated word must be "de"
  @scenario5
  Scenario: check the order of Keyword Density section third word
    When  insert the sentence "Oracion de Prueba Oracion de Oracion"
    Then the third most repeated word must be "Prueba"

