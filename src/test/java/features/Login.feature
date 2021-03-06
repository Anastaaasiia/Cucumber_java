Feature: Application Login

  Background:
    Given Validate The browser
    When Browser is triggering
    Then Check if browser is started

  @san
  Scenario: Home page default login
    Given User is on landing page
    When User login into application with username "elo" and password "123"
    Then Home page is populated
    And Cards displayed are "true"

  @mobile
  Scenario: Home page default login
    Given User is on landing page
    When User login into application with username "elo2" and password "124"
    Then Home page is populated
    And Cards displayed are "false"

  @mobile
  Scenario: Home page default login
    Given User is on landing page
    When User sign up with following details
    | jenny | abcd | john@abcd.com | Australia | 32425267 |
    Then Home page is populated
    And Cards displayed are "false"

  @reg
  Scenario Outline: Home page default login
    Given User is on landing page
    When User login in to application with username <Username> and password <password>
    Then Home page is populated
    And Cards displayed are "false"
    Examples:
    |Username | password  |
    |user1    | pass1     |
    |user2    | pass2     |
    |user3    | pass3     |
    |user4    | pass4     |
