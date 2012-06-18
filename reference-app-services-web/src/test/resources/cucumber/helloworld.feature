Feature: Hello World

  Scenario: Say hello
    Given I have a hello app with "Howdy"
    When I ask it to say hi
    Then it should answer with "Howdy World"

  Scenario: Say goodbye
    Given I have a hello app with "Goodbye"
    When I ask it to say goodbye
    Then it should answer with "Goodbye World"