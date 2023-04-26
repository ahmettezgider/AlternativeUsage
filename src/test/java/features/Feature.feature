Feature: Multi WebSite test

  Scenario: Scenario 1
    Given user on Opencart homepage named as "opencart"
    And   opencart, user clicks link "My Account"
    And   opencart, user clicks link "Login"
    And   opencart, user sendkeys "deneme@deneme.com" to control "E-Mail Address"
    And   opencart, user sendkeys "deneme" to control "Password"
    When  opencart, user clicks button "Login"
    Then  opencart, the link "Logout" should be present

    Given user opens OrangeHRM homepage in new TAB named as "orangehrm"
    And   orangehrm, user sendkeys "Admin" to control "Username"
    And   orangehrm, user sendkeys "admin123" to control "Password"
    When  orangehrm, user clicks button "Login"
    Then  orangehrm, the link "Admin" should be present

    And   user switch to window "opencart"
    And   wait 500 milis
    And   user switch to window "orangehrm"
    And   wait 500 milis
    And   user switch to window "opencart"
    And   wait 500 milis
    And   user switch to window "orangehrm"
    And   wait 500 milis
    And   user switch to window "opencart"
    And   wait 500 milis
    And   user switch to window "orangehrm"
    And   wait 500 milis


