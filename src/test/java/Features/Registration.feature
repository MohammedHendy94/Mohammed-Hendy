Feature: Check the Registration Scenario
  Scenario: Validate that user can register successfully
    Given user opening the registration page
    When user fill the firstname as "Muhamed" and lastname as "Hendy"
    And fill the username as "hendy@email.com" and password as "NewYear!!"
    And retype the email as "hendy@email.com"
    And select the birth date, Day as "23" and Month as "7" and Year as "1994"
    And select the gender as "male"
    And click register
    Then App Navigate user to the next page

 Scenario Outline: Validate user can register using custom option in Gender
  Given user opening the registration page
  When user fill the firstname as "<firstname>" and lastname as "<lastname>"
  And fill the username as "<email>" and password as "<password>"
   And retype the email as "<RetypeEmail>"
  And select the birth date, Day as "<birthday>" and Month as "<birthmonth>" and Year as "<birthyear>"
  And select the custom gender and fill the pronoun as <pronoun> and gender as "<Gender>"
  And click register
  Then App Navigate user to the next page
  Examples:
  | firstname | lastname | email   | password  | RetypeEmail |  birthday | birthmonth | birthyear  | pronoun | Gender |
  | ali       | ahmed    | m@m.com | P@ssw0rd  | m@m.com     | 1         | 2          | 1994       | 1       | male   |
  | joe       | felix    | j@f.com | P@ssw0rd  | j@f.com     | 1         | 3          | 1995       | 2       | female |
  | leo       | messi    | l@m.com | P@ssw0rd  | l@m.com     | 1         | 4          | 1996       | 3       | both   |

