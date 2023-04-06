Feature: Login Data driven with Excel

  Scenario Outline: Login Data driven with Excel
    Given User Lanch browser
    And opens URL "http://localhost/opencart/upload/"
    When User navigate to MyAccount menu
    And click on Login    
    Then check User navigates to MyAccount Page by passing Email and Password with excel row "<row_index>"

    Examples: 
      |row_index|
      |1|
      |2|
      |3|
      |4|
      |5|
      
      
