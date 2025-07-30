Feature: Login test for OpenCart Application

  Background: I am on the Login page
  Scenario:
    Given Launch the Application and navigate to login page
    When  Given the username and password (username: "ethanhunt@gmail.com", password: "Blackbeast319@!")
    And Click on login button
    Then User should be able to see my account text and logout link
    And click on logout link


    