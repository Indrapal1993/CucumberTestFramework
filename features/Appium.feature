Feature: Login User scenario for invalid credentials

  @appium
  Scenario: Login user with invalid credentials
    Given Launch the application
    When User invalid credentials got entered  
    Then Verify validation message on screen
