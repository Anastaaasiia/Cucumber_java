Feature: Application Login

  @san
  Scenario: Home page default login
    Given User is on landing page
    When User login into application with username "elo" and password "123"
    Then Home page is populated
    And Cards displayed are "true"
