Feature: Category

  Scenario: Retrieve FISH category by ID
    Given I have a Category service
    When I request the category "FISH"
    Then I should receive a response with the category
      |id|categoryId|name|description|
      |1000|FISH|Fish|Fish Description|

  Scenario: Retrieve BIRDS category by ID
    Given I have a Category service
    When I request the category "BIRDS"
    Then I should receive a response with the category
      |id|categoryId|name|description|
      |1008|BIRDS|Birds|Birds Description|

  Scenario: Retrieve all categories
    Given I have a Category service
    When I request all categories
    Then I should receive a response with the categories
      |id|categoryId|name|description|
      |1000|FISH|Fish|Fish Description|
      |1002|DOGS|Dogs|Dogs Description|
      |1004|REPTILES|Reptiles|Reptiles Description|
      |1006|CATS|Cats|Cats Description|
      |1008|BIRDS|Birds|Birds Description|

  Scenario: Retrieve all categories
    Given I have a Category service
    When I request all categories
    Then I should receive a response with the categories
      |id|categoryId|
      |1000|FISH|
      |1002|DOGS|
      |1004|REPTILES|
      |1006|CATS|
      |1008|BIRDS|
