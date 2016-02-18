Feature: A variety of scenarios to illustrate the different outcomes in Serenity

  Scenario: A Passing scenario is Green on the report
    Given we are interested in the serenity report
    When we want to see a Passing test
    Then we run a test that passes

  Scenario: A Pending scenario is Light Blue on the report
    Given we are interested in the serenity report
    When we want to see a Pending test
    Then we run a test that has a pending step

  @ignore
  Scenario: An Ignored scenario is Grey on the report
    Given we are interested in the serenity report
    When we want to see a Ignored test
    Then we run a test that is being Ignored

  Scenario: A Failing scenario is Red on the report
    Given we are interested in the serenity report
    When we want to see a Failing test
    Then we run a test that fails

  Scenario: An Error scenario is Orange on the report
    Given we are interested in the serenity report
    When we want to see a Error test
    Then we run a test that errors
