Feature: Product

  Scenario: Retrieve a fish product by ID
    Given I have a Product service
    When I request the product "FI-SW-01"
    Then I should receive a response with the product
      |id|productId|name|description|category.categoryId|category.name|category.description|
      |1000|FI-SW-01|Angelfish|Salt Water fish from Australia|FISH|Fish|Fish Description|

  Scenario: Retrieve a bird product by ID
    Given I have a Product service
    When I request the product "AV-CB-01"
    Then I should receive a response with the product
      |id|productId|name|description|category.categoryId|category.name|category.description|
      |1028|AV-CB-01|Amazon Parrot|Great companion for up to 75 years|BIRDS|Birds|Birds Description|

  Scenario: Retrieve a dog product by ID
    Given I have a Product service
    When I request the product "K9-DL-01"
    Then I should receive a response with the product
      |id|productId|name|description|category.categoryId|category.name|category.description|
      |1012|K9-DL-01|Dalmation|Great dog for a Fire Station|DOGS|Dogs|Dogs Description|

  Scenario: Retrieve products in FISH category
    Given I have a Product service
    When I request products in the category "FISH"
    Then I should receive a response with the products
      |id|productId|name|description|category.categoryId|category.name|category.description|
      |1000|FI-SW-01|Angelfish|Salt Water fish from Australia|FISH|Fish|Fish Description|
      |1002|FI-SW-02|Tiger Shark|Salt Water fish from Australia|FISH|Fish|Fish Description|
      |1004|FI-FW-01|Koi|Fresh Water fish from Japan|FISH|Fish|Fish Description|
      |1006|FI-FW-02|Goldfish|Fresh Water fish from China|FISH|Fish|Fish Description|

  Scenario: Retrieve products in DOGS category
    Given I have a Product service
    When I request products in the category "DOGS"
    Then I should receive a response with the products
      |id|productId|name|description|category.categoryId|category.name|category.description|
      |1008|K9-BD-01|Bulldog|Friendly dog from England|DOGS|Dogs|Dogs Description|
      |1010|K9-PO-02|Poodle|Cute dog from France|DOGS|Dogs|Dogs Description|
      |1012|K9-DL-01|Dalmation|Great dog for a Fire Station|DOGS|Dogs|Dogs Description|
      |1014|K9-RT-01|Golden Retriever|Great family dog|DOGS|Dogs|Dogs Description|
      |1016|K9-RT-02|Labrador Retriever|Great hunting dog|DOGS|Dogs|Dogs Description|
      |1018|K9-CW-01|Chihuahua|Great companion dog|DOGS|Dogs|Dogs Description|

  Scenario: Retrieve products in REPTILES category
    Given I have a Product service
    When I request products in the category "REPTILES"
    Then I should receive a response with the products
      |id|productId|name|description|category.categoryId|category.name|category.description|
      |1020|RP-SN-01|Rattlesnake|Doubles as a watch dog|REPTILES|Reptiles|Reptiles Description|
      |1022|RP-LI-02|Iguana|Friendly green friend|REPTILES|Reptiles|Reptiles Description|

  Scenario: Retrieve products in CATS category
    Given I have a Product service
    When I request products in the category "CATS"
    Then I should receive a response with the products
      |id|productId|name|description|category.categoryId|category.name|category.description|
      |1024|FL-DSH-01|Manx|Great for reducing mouse populations|CATS|Cats|Cats Description|
      |1026|FL-DLH-02|Persian|Friendly house cat, doubles as a princess|CATS|Cats|Cats Description|

  Scenario: Retrieve products in BIRDS category
    Given I have a Product service
    When I request products in the category "BIRDS"
    Then I should receive a response with the products
      |id|productId|name|description|category.categoryId|category.name|category.description|
      |1028|AV-CB-01|Amazon Parrot|Great companion for up to 75 years|BIRDS|Birds|Birds Description|
      |1030|AV-SB-02|Finch|Great stress reliever|BIRDS|Birds|Birds Description|

