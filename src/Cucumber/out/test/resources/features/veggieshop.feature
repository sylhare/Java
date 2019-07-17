Feature: Regular expressions in step definitions
  As a developer
  I want to see examples of regular expressions in step definitions
  So that I can write powerful Cucumber steps

  Scenario: 101 - Exact match
    Given I have a cucumber step

  Scenario: 102 - Non-capturing group
    Given I have a tasty cucumber step
    Given I have a nasty cucumber step
    Given I have a rusty cucumber step

  Scenario: 103 - Capture integers and strings
    Given I have 5 carrots in my basket

  Scenario: 104 - Singular and plural
    Given There is 1 cat fed by 1 person
    Given There are 2 cats fed by 1 person
    Given There are 2 cats fed by 2 persons
    Given There are 2 cats fed by 3 people
    Given There is 1 ox fed by 4 persons
    Given There are 3 oxen fed by 5 people

  Scenario: 105 - Data tables
    Given I have the following order
      | vegetable | amount | cost |
      | cucumber  | 4      | 10   |
      | carrot    | 5      | 6    |
      | potato    | 6      | 4    |

  Scenario: 106 - List of domain objects
    Given I have another order
      | vegetable | amount | cost |
      | cucumber  | 4      | 10   |
      | carrot    | 5      | 6    |
      | potato    | 6      | 4    |

  Scenario: 107 - Get and keep the double quotes
    Given I have a shop named ""VeggieShop""
