Feature: Login_Scenario
  @smoke @regression
  Scenario: Validate that user can login successfully
    Given user opens the login screen
    When user enter email as "01023818181" and password as "p@ssw0rd"
    And click login
    Then app navigate the user to next screen

    @regression
    Scenario Outline: Check the login functionality with invalid data
      Given user opens the login screen
      When user enter email as "<username>" and password as "<password>"
      And click login
      Then app keep user in the same page
      Examples:
      | username           | password
      | 01012345           | P@ssw0rd
      | w@www.net          | 12345
      | -2                 | a@a.com



