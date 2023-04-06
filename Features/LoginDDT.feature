Feature: Login Data driven

@sanity @regression
  Scenario Outline: Login Data driven
    Given User Lanch browser
    And opens URL "http://localhost/opencart/upload/"
    When User navigate to MyAccount menu
    And click on Login
    And User enters Email as "<email>" and Password as "<password>"
    And Click on Login button
    Then User navigates to MyAccount Page

    Examples: 
      | email             | password  |
      | muali@gmail.com   | test@123  |
      | muali@gmail12.com | test@1234 |
