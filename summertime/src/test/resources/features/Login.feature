Feature: Login
  This is a test page

  Background:
    Given that I navigate to www.giftrt.com
    When I click login

  @Valid @smoke
  Scenario: Valid Login
    And I entered the username "absaziz"
   And I entered the password "azizpassword"
    And I click on the login button
    Then I should be logged in

@Invalid
  Scenario: Log in Invalid username
    And I entered the invalid username"absziz1"
    And i entered the invalid password "azizpassword1"
    And I click on the login button
    Then I should be not able to log in

  @Invalid
  Scenario: Invalid Password Login with Parameter
    And I entered the invalid username
    And i entered the invalid password
    And I click on the login button
    Then I should be not able to log in


    Scenario Outline: Login with multiple users
      And I entered the username "<username>"
      And i entered the invalid password "<password>"
      And I click on the login button
      Then I should be not able to log in
      And I log out

      Examples:
      |username|password|
      |absaziz |azizpassword|
      |absaziz1|azizpassword1|
