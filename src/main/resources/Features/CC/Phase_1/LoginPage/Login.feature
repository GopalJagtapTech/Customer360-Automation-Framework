Feature: LogIn

#  @run

  @pass @run
  Scenario: To verify customer is able to view following content on LHS of Login page
    Given User is on Customer 360 Login Page
    And Verify LHS side of Login Page

  @pass @run
  Scenario: To verify customer is able to view following content on RHS of Login page
    Given User is on Customer 360 Login Page
    And Verify RHS side of Login Page

  @pass @run
  Scenario: To verify customer is able to redirect to Respective Urls on clicking First Access 360 Url
    Given User is on Customer 360 Login Page
    And Customer clicks on First Access 360 Url
    Then Verify Customer redirected to "https://access360.bajajfinserv.in/" Url in New Tab

  @fail @run
  Scenario: To verify customer is able to redirect to Respective Urls on clicking Azure Url
    Given User is on Customer 360 Login Page
    And Customer clicks on Azure Url
#    And Customer clicks on Second Access 360 Url
    Then Verify Customer redirected to "https://login.microsoftonline.com/" Url in New Tab

  @fail @run
  Scenario: To verify customer is able to redirect to Respective Urls on clicking Service Now Url
    Given User is on Customer 360 Login Page
    And Customer clicks on Service Now Url
    Then Verify Customer redirected to " https://bajajfinserv.service-now.com/bfl" Url in New Tab

  @pass @run
  Scenario Outline: To verify customer is able to view below Options "<Options>" in Select Domain Dropdown
    Given User is on Customer 360 Login Page
    And User should be able to see below Domains "<Options>"

    Examples:
      | Options            |
      | BFL#Partner#CC |

  @pass @run
  Scenario Outline: To verify customer is able to select below Option "<Option>" in Select Domain Dropdown
    Given User is on Customer 360 Login Page
    And  User should be able to select Domain "<Option>"

    Examples:
      | Option  |
      | Partner |
      | CC      |

  @pass @run
  Scenario Outline: To verify customer is able to enter All Characters "<Text>" in Username Box
    Given User is on Customer 360 Login Page
    And User should be able to enter the "<Text>" in Username Box

    Examples:
      | Text                     |
      | abcdefg#123456#$%$^%^&^% |

  @pass @run
  Scenario Outline: To verify customer is able to enter All Characters "<Text>" in Password Box
    Given User is on Customer 360 Login Page
    And User should be able to enter the "<Text>" in Password Box

    Examples:
      | Text                     |
      | abcdefg#123456#$%$^%^&^% |

  @pass @run
  Scenario Outline: To verify customer is able to login to the Application for "<Domain>"
    Given User is on Customer 360 Login Page
    And  User should select Domain "<Domain>"
    And User enters UserName "<Username>"
    And User enters Password "<Password>"
    And Clicks on LogIn Button
    Then User should be redirected to Landing Page "<Url>"

    Examples:
      | Domain  | Username        | Password | Url                                            |
      | CC | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing |

@pass @run
  Scenario Outline: To verify customer is able to logout of the Application for "<Domain>"
    Given User is on Customer 360 Login Page
    And  User should select Domain "<Domain>"
    And User enters UserName "<Username>"
    And User enters Password "<Password>"
    And Clicks on LogIn Button
    Then User should be redirected to Landing Page "<Url>"
    And Clicks on Profile Icon
    And Clicks on "Logout" Button
    Then Verify Customer is Logged out

    Examples:
      | Domain  | Username        | Password | Url                                            |
      | CC | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing |












