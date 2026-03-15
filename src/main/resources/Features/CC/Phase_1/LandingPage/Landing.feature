Feature: Landing Page


  ###Landing Page
  @pass @run
  Scenario Outline: To verify customer is able to view Content on Landing Page "<Domain>"
    Given User is on Customer 360 Login Page
    And  User should select Domain "<Domain>"
    And User enters UserName "<Username>"
    And User enters Password "<Password>"
    And Clicks on LogIn Button
    Then User should be redirected to Landing Page "<Url>"
    And Verify User is able to view below content for Landing Page

    Examples:
      | Domain | Username | Password | Url                                            |
      | CC     | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing |

  @pass @run
  Scenario Outline: To verify customer is able to view Upper Section Content on Landing Page "<Domain>"
    Given User is on Customer 360 Login Page
    And  User should select Domain "<Domain>"
    And User enters UserName "<Username>"
    And User enters Password "<Password>"
    And Clicks on LogIn Button
    Then User should be redirected to Landing Page "<Url>"
    And Verify User is able to view below content for Top Section on Landing Page

    Examples:
      | Domain | Username | Password | Url                                            |
      | CC     | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing |

  @pass @run
  Scenario Outline: To verify customer is able to view Search Section Content on Landing Page "<Domain>"
    Given User is on Customer 360 Login Page
    And  User should select Domain "<Domain>"
    And User enters UserName "<Username>"
    And User enters Password "<Password>"
    And Clicks on LogIn Button
    Then User should be redirected to Landing Page "<Url>"
    And Verify User is able to view below content for Search Section on Landing Page

    Examples:
      | Domain | Username | Password | Url                                            |
      | CC     | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing |

  @pass @run
  Scenario Outline: To verify customer is able to view Below Options "<Options>" for Search By Dropdown
    Given User is on Customer 360 Login Page
    And  User should select Domain "<Domain>"
    And User enters UserName "<Username>"
    And User enters Password "<Password>"
    And Clicks on LogIn Button
    Then User should be redirected to Landing Page "<Url>"
    And Verify User is able to view Below Options "<Options>" for Search By Dropdown

    Examples:
      | Domain | Username | Password | Url                                            | Options                                                                                                                                                                                                                      |
      | CC     | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | Mobile Number#Customer ID#Agreement Number#EMI Card Number#Fixed Deposit Number#FD Application Number#FD Reference Number#Deal Number#Application ID#Email ID#PAN Number#Bank Account Number#Policy Number#Old Mobile Number |











