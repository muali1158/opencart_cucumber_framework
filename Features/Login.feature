Feature: Login with valid credentials
# ctrl+shift+f  --alignment

@sanity
Scenario: Successful Login with Valid Credentials
   Given User Lanch browser
   And opens URL "http://localhost/opencart/upload/"
   When User navigate to MyAccount menu
   And click on Login
   And User enters Email as "muali@gmail.com" and Password as "test@123"
   And Click on Login button
   Then User navigates to MyAccount Page
    