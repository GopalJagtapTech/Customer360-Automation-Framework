Feature: Relations Overview - Insurance

####Insurance
  @pass @run
  Scenario Outline: To verify Selection of Tabs in Relation Overview - Insurance
    Given User is on Customer 360 Login Page
    And  User should select Domain "<Domain>"
    And User enters UserName "<Username>"
    And User enters Password "<Password>"
    And Clicks on LogIn Button
    Then User should be redirected to Landing Page "<Url>"
    And Selects "Mobile Number" Option from Search Dropdown
    And Enters "7499129437" into Search Input Box
    And Clicks on "PROCEED" Button
    Then User should be redirected to Dashboard Page "<Dashboard>"
    And Verify "Relations Overview" Section is displayed in DashBoard Page
    And Select a Tab "Insurance" in Relations Overview
    Examples:
      | Domain | Username | Password | Url                                            | Dashboard                                        | pdcurl                                        |
      | CC     | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | https://report.bajajfinserv.in/PDCReport.aspx |

  @pass @run
  Scenario Outline: To verify that Count is displayed for Tabs - Insurance
    Given User is on Customer 360 Login Page
    And  User should select Domain "<Domain>"
    And User enters UserName "<Username>"
    And User enters Password "<Password>"
    And Clicks on LogIn Button
    Then User should be redirected to Landing Page "<Url>"
    And Selects "Mobile Number" Option from Search Dropdown
    And Enters "7249024719" into Search Input Box
    And Clicks on "PROCEED" Button
    Then User should be redirected to Dashboard Page "<Dashboard>"
    And Verify "Relations Overview" Section is displayed in DashBoard Page
    And Select a Tab "Insurance" in Relations Overview
    And Verify Respective Count is displayed for the Tab "Insurance"
    Examples:
      | Domain | Username | Password | Url                                            | Dashboard                                        | pdcurl                                        |
      | CC     | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | https://report.bajajfinserv.in/PDCReport.aspx |

  @pass @run
  Scenario Outline: To verify If the User has no Relations - Insurance
    Given User is on Customer 360 Login Page
    And  User should select Domain "<Domain>"
    And User enters UserName "<Username>"
    And User enters Password "<Password>"
    And Clicks on LogIn Button
    Then User should be redirected to Landing Page "<Url>"
    And Selects "Mobile Number" Option from Search Dropdown
    And Enters "9669919934" into Search Input Box
    And Clicks on "PROCEED" Button
    Then User should be redirected to Dashboard Page "<Dashboard>"
    And Verify "Relations Overview" Section is displayed in DashBoard Page
    And Select a Tab "Insurance" in Relations Overview
    And Verify Text "No Insurance Available" and Count 0 displayed for the Relation "Insurance"

    Examples:
      | Domain | Username | Password | Url                                            | Dashboard                                        | pdcurl                                        |
      | CC     | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | https://report.bajajfinserv.in/PDCReport.aspx |

  @pass @run
  Scenario Outline: To verify Tiles are displayed under Relations - Insurance
    Given User is on Customer 360 Login Page
    And  User should select Domain "<Domain>"
    And User enters UserName "<Username>"
    And User enters Password "<Password>"
    And Clicks on LogIn Button
    Then User should be redirected to Landing Page "<Url>"
    And Selects "Mobile Number" Option from Search Dropdown
    And Enters "7249024719" into Search Input Box
    And Clicks on "PROCEED" Button
    Then User should be redirected to Dashboard Page "<Dashboard>"
    And Verify "Relations Overview" Section is displayed in DashBoard Page
    And Select a Tab "Insurance" in Relations Overview
    And Verify Tiles are displayed under Relations

    Examples:
      | Domain | Username | Password | Url                                            | Dashboard                                        | pdcurl                                        |
      | CC     | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | https://report.bajajfinserv.in/PDCReport.aspx |

  @fail @run
  Scenario Outline: To verify that details displayed on Insurance - Active
    Given User is on Customer 360 Login Page
    And  User should select Domain "<Domain>"
    And User enters UserName "<Username>"
    And User enters Password "<Password>"
    And Clicks on LogIn Button
    Then User should be redirected to Landing Page "<Url>"
    And Selects "Mobile Number" Option from Search Dropdown
    And Enters "7249024719" into Search Input Box
    And Clicks on "PROCEED" Button
    Then User should be redirected to Dashboard Page "<Dashboard>"
    And Verify "Relations Overview" Section is displayed in DashBoard Page
    And Select a Tab "Insurance" in Relations Overview
    Then Customer should be able to view below details on "Insurance" tile "IL3227607"

    Examples:
      | Domain | Username | Password | Url                                            | Dashboard                                        | pdcurl                                        |
      | CC     | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | https://report.bajajfinserv.in/PDCReport.aspx |

  @pass @run
  Scenario Outline: To verify that for Active Relation, Green coloured Badge is displayed - Insurance
    Given User is on Customer 360 Login Page
    And  User should select Domain "<Domain>"
    And User enters UserName "<Username>"
    And User enters Password "<Password>"
    And Clicks on LogIn Button
    Then User should be redirected to Landing Page "<Url>"
    And Selects "Mobile Number" Option from Search Dropdown
    And Enters "7249024719" into Search Input Box
    And Clicks on "PROCEED" Button
    Then User should be redirected to Dashboard Page "<Dashboard>"
    And Verify "Relations Overview" Section is displayed in DashBoard Page
    And Select a Tab "Insurance" in Relations Overview
    Then "ACTIVE" Badge should be displayed in Green Colour for "IL3227607" Relation

    Examples:
      | Domain | Username | Password | Url                                            | Dashboard                                        | pdcurl                                        |
      | CC     | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | https://report.bajajfinserv.in/PDCReport.aspx |

  @pass @run
  Scenario Outline: To verify that for Closed Relation, Red coloured Badge is displayed - Insurance
    Given User is on Customer 360 Login Page
    And  User should select Domain "<Domain>"
    And User enters UserName "<Username>"
    And User enters Password "<Password>"
    And Clicks on LogIn Button
    Then User should be redirected to Landing Page "<Url>"
    And Selects "Mobile Number" Option from Search Dropdown
    And Enters "8106050431" into Search Input Box
    And Clicks on "PROCEED" Button
    Then User should be redirected to Dashboard Page "<Dashboard>"
    And Verify "Relations Overview" Section is displayed in DashBoard Page
    And Select a Tab "Insurance" in Relations Overview
    Then "CANCELLED" Badge should be displayed in Red Colour for "PP000208_0CZC6" Relation


    Examples:
      | Domain | Username | Password | Url                                            | Dashboard                                        | pdcurl                                        |
      | CC     | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | https://report.bajajfinserv.in/PDCReport.aspx |


  @data
  Scenario Outline: To verify that User is able to view close Insurance after the active Insurance
    Given User is on Customer 360 Login Page
    And  User should select Domain "<Domain>"
    And User enters UserName "<Username>"
    And User enters Password "<Password>"
    And Clicks on LogIn Button
    Then User should be redirected to Landing Page "<Url>"
    And Selects "Mobile Number" Option from Search Dropdown
    And Enters "9833728591" into Search Input Box
    And Clicks on "PROCEED" Button
    Then User should be redirected to Dashboard Page "<Dashboard>"
    And Verify "Relations Overview" Section is displayed in DashBoard Page
    And Select a Tab "Insurance" in Relations Overview
#    Then User should be able to view close loan after the active loans

    Examples:
      | Domain  | Username        | Password | Url                                            | Dashboard                                        | Tabs                        |
      | Partner | 202432943 | Abhi@12345   | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | Loans, Cards, Insurance, fd |


    @pass @run
  Scenario Outline: To verify that All the Amounts in the Relation tile Starts with Symbol ₹ - Insurance
    Given User is on Customer 360 Login Page
    And  User should select Domain "<Domain>"
    And User enters UserName "<Username>"
    And User enters Password "<Password>"
    And Clicks on LogIn Button
    Then User should be redirected to Landing Page "<Url>"
    And Selects "Mobile Number" Option from Search Dropdown
    And Enters "7249024719" into Search Input Box
    And Clicks on "PROCEED" Button
    Then User should be redirected to Dashboard Page "<Dashboard>"
    And Verify "Relations Overview" Section is displayed in DashBoard Page
    And Select a Tab "Insurance" in Relations Overview
    And verify "₹" Symbol is displayed in front of all the Amounts in Relation tile "IL3227607" - Insurance


    Examples:
      | Domain | Username | Password | Url                                            | Dashboard                                        | pdcurl                                        |
      | CC     | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | https://report.bajajfinserv.in/PDCReport.aspx |

  @pass @run
  Scenario Outline: To verify Same Customer ID is being displayed in Personal Info And of Relation Tile - Cards
    Given User is on Customer 360 Login Page
    And  User should select Domain "<Domain>"
    And User enters UserName "<Username>"
    And User enters Password "<Password>"
    And Clicks on LogIn Button
    Then User should be redirected to Landing Page "<Url>"
    And Selects "Mobile Number" Option from Search Dropdown
    And Enters "7249024719" into Search Input Box
    And Clicks on "PROCEED" Button
    Then User should be redirected to Dashboard Page "<Dashboard>"
    And Select a Tab "Insurance" in Relations Overview
    And Verify Customer ID in Personal Info And of Relation Tile "IL3227607" for "Insurance" Relation

    Examples:
      | Domain | Username | Password | Url                                            | Dashboard                                        | pdcurl                                        |
      | CC     | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | https://report.bajajfinserv.in/PDCReport.aspx |

