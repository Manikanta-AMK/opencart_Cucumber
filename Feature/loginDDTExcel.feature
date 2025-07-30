Feature: Login Data Driven with Excel

  Scenario Outline: Login Data Driven Excel
    Given the user navigates to login page
    Then the user should be redirected to the MyAccount Page by passing email and password with excel row "<row_index>"
		And Click on login button DDT
    Then User should be able to see my account text and logout link DDT
    And click on logout link DDT

    Examples: 
      | email                                 | password |
      | eethanhunt@gmail.com |  Blackbeast319@! |
      | Blackbeast319@!             |  ethanhunt@gmail.com |
      | ethanhunt@gmail.com   | Blackbeast319@! | 
      
      