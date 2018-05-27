Feature: Verify Login to Application

  As a user I should be logged in into the Application
  when i have provided valid credentials
  Also denied access when unable to prove my identity

  @Test
  Scenario: Verify user is able to login with correct credentials
    Given Luke is user accesing the portal
    When Luke try logging into the portal using password Skywalker
    Then He should be Logged in

  @Test
  Scenario: Verify user is not able to login with Invalid credentials
    Given Luke is user accesing the portal
    When Luke try logging into the portal using password skywalker
    Then He shouldn't be Logged in
