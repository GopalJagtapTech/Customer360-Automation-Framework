Feature: Relations Overview - Fixed Deposits


  @pass @run
  Scenario Outline: To verify Selection of Tabs in Relation Overview - FD
    Given User is on Customer 360 Login Page
    And  User should select Domain "<Domain>"
    And User enters UserName "<Username>"
    And User enters Password "<Password>"
    And Clicks on LogIn Button
    Then User should be redirected to Landing Page "<Url>"
    And Selects "Mobile Number" Option from Search Dropdown
    And Enters "9867024806" into Search Input Box
    And Clicks on "PROCEED" Button
    Then User should be redirected to Dashboard Page "<Dashboard>"
    And Verify "Relations Overview" Section is displayed in DashBoard Page
    And Select a Tab "Fd" in Relations Overview
    Examples:
      | Domain | Username | Password | Url                                            | Dashboard                                        | pdcurl                                        |
      | CC     | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | https://report.bajajfinserv.in/PDCReport.aspx |

  @pass @run
  Scenario Outline: To verify that Count is displayed for Tabs - FD
    Given User is on Customer 360 Login Page
    And  User should select Domain "<Domain>"
    And User enters UserName "<Username>"
    And User enters Password "<Password>"
    And Clicks on LogIn Button
    Then User should be redirected to Landing Page "<Url>"
    And Selects "Mobile Number" Option from Search Dropdown
    And Enters "9867024806" into Search Input Box
    And Clicks on "PROCEED" Button
    Then User should be redirected to Dashboard Page "<Dashboard>"
    And Verify "Relations Overview" Section is displayed in DashBoard Page
    And Select a Tab "Fd" in Relations Overview
    And Verify Respective Count is displayed for the Tab "Fd"
    Examples:
      | Domain | Username | Password | Url                                            | Dashboard                                        | pdcurl                                        |
      | CC     | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | https://report.bajajfinserv.in/PDCReport.aspx |

  @pass @run
  Scenario Outline: To verify If the User has no Relations - FD
    Given User is on Customer 360 Login Page
    And  User should select Domain "<Domain>"
    And User enters UserName "<Username>"
    And User enters Password "<Password>"
    And Clicks on LogIn Button
    Then User should be redirected to Landing Page "<Url>"
    And Selects "Mobile Number" Option from Search Dropdown
    And Enters "9819427072" into Search Input Box
    And Clicks on "PROCEED" Button
    Then User should be redirected to Dashboard Page "<Dashboard>"
    And Verify "Relations Overview" Section is displayed in DashBoard Page
    And Select a Tab "Fd" in Relations Overview
    And Verify Text "No Deposits Available" and Count 0 displayed for the Relation "Fd"

    Examples:
      | Domain | Username | Password | Url                                            | Dashboard                                        | pdcurl                                        |
      | CC     | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | https://report.bajajfinserv.in/PDCReport.aspx |

  @pass @run
  Scenario Outline: To verify Tiles are displayed under Relations - FD
    Given User is on Customer 360 Login Page
    And  User should select Domain "<Domain>"
    And User enters UserName "<Username>"
    And User enters Password "<Password>"
    And Clicks on LogIn Button
    Then User should be redirected to Landing Page "<Url>"
    And Selects "Mobile Number" Option from Search Dropdown
    And Enters "9867024806" into Search Input Box
    And Clicks on "PROCEED" Button
    Then User should be redirected to Dashboard Page "<Dashboard>"
    And Verify "Relations Overview" Section is displayed in DashBoard Page
    And Select a Tab "Fd" in Relations Overview
    And Verify Tiles are displayed under Relations

    Examples:
      | Domain | Username | Password | Url                                            | Dashboard                                        | pdcurl                                        |
      | CC     | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | https://report.bajajfinserv.in/PDCReport.aspx |

  @pass @run
  Scenario Outline: To verify that details displayed on FD - Active
    Given User is on Customer 360 Login Page
    And  User should select Domain "<Domain>"
    And User enters UserName "<Username>"
    And User enters Password "<Password>"
    And Clicks on LogIn Button
    Then User should be redirected to Landing Page "<Url>"
    And Selects "Mobile Number" Option from Search Dropdown
    And Enters "9867024806" into Search Input Box
    And Clicks on "PROCEED" Button
    Then User should be redirected to Dashboard Page "<Dashboard>"
    And Verify "Relations Overview" Section is displayed in DashBoard Page
    And Select a Tab "Fd" in Relations Overview
    Then Customer should be able to view below details on "Fixed Deposit" tile "544165"

    Examples:
      | Domain | Username | Password | Url                                            | Dashboard                                        | pdcurl                                        |
      | CC     | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | https://report.bajajfinserv.in/PDCReport.aspx |

  @pass @run
  Scenario Outline: To verify that for Active Relation, Green coloured Badge is displayed - FD
    Given User is on Customer 360 Login Page
    And  User should select Domain "<Domain>"
    And User enters UserName "<Username>"
    And User enters Password "<Password>"
    And Clicks on LogIn Button
    Then User should be redirected to Landing Page "<Url>"
    And Selects "Mobile Number" Option from Search Dropdown
    And Enters "9867024806" into Search Input Box
    And Clicks on "PROCEED" Button
    Then User should be redirected to Dashboard Page "<Dashboard>"
    And Verify "Relations Overview" Section is displayed in DashBoard Page
    And Select a Tab "Fd" in Relations Overview
    Then "OPEN" Badge should be displayed in Green Colour for "544165" Relation

    Examples:
      | Domain | Username | Password | Url                                            | Dashboard                                        | pdcurl                                        |
      | CC     | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | https://report.bajajfinserv.in/PDCReport.aspx |

  @pass @run
  Scenario Outline: To verify that for Closed Relation, Red coloured Badge is displayed - FD
    Given User is on Customer 360 Login Page
    And  User should select Domain "<Domain>"
    And User enters UserName "<Username>"
    And User enters Password "<Password>"
    And Clicks on LogIn Button
    Then User should be redirected to Landing Page "<Url>"
    And Selects "Mobile Number" Option from Search Dropdown
    And Enters "9867024806" into Search Input Box
    And Clicks on "PROCEED" Button
    Then User should be redirected to Dashboard Page "<Dashboard>"
    And Verify "Relations Overview" Section is displayed in DashBoard Page
    And Select a Tab "Fd" in Relations Overview
    Then "Matured" Badge should be displayed in Red Colour for "108429" Relation

    Examples:
      | Domain | Username | Password | Url                                            | Dashboard                                        | pdcurl                                        |
      | CC     | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | https://report.bajajfinserv.in/PDCReport.aspx |


  @pass @run
  Scenario Outline: To verify that User is able to view close FD after the active FD
    Given User is on Customer 360 Login Page
    And  User should select Domain "<Domain>"
    And User enters UserName "<Username>"
    And User enters Password "<Password>"
    And Clicks on LogIn Button
    Then User should be redirected to Landing Page "<Url>"
    And Selects "Mobile Number" Option from Search Dropdown
    And Enters "9891379037" into Search Input Box
    And Clicks on "PROCEED" Button
    Then User should be redirected to Dashboard Page "<Dashboard>"
    And Verify "Relations Overview" Section is displayed in DashBoard Page
    And Select a Tab "Fd" in Relations Overview
    Then User should be able to view close loan after the active loans
    Then User should be able to view Matured FDs after the Open FDs - "Fixed Depsoits"
    Examples:
      | Domain | Username | Password | Url                                            | Dashboard                                        | Tabs                        |
      | CC     | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | Loans, Cards, Insurance, fd |


  @pass @run
  Scenario Outline: To verify that All the Amounts in the Relation tile Starts with Symbol ₹ - Fixed Deposit
    Given User is on Customer 360 Login Page
    And  User should select Domain "<Domain>"
    And User enters UserName "<Username>"
    And User enters Password "<Password>"
    And Clicks on LogIn Button
    Then User should be redirected to Landing Page "<Url>"
    And Selects "Mobile Number" Option from Search Dropdown
    And Enters "9867024806" into Search Input Box
    And Clicks on "PROCEED" Button
    Then User should be redirected to Dashboard Page "<Dashboard>"
    And Verify "Relations Overview" Section is displayed in DashBoard Page
    And Select a Tab "Fd" in Relations Overview
    And verify "₹" Symbol is displayed in front of all the Amounts in Relation tile "544165" - Fixed Deposit


    Examples:
      | Domain | Username | Password | Url                                            | Dashboard                                        | pdcurl                                        |
      | CC     | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | https://report.bajajfinserv.in/PDCReport.aspx |

  @pass @run
  Scenario Outline: To verify the Date Formats for Labels in the Relation tile - Fixed Deposits
    Given User is on Customer 360 Login Page
    And  User should select Domain "<Domain>"
    And User enters UserName "<Username>"
    And User enters Password "<Password>"
    And Clicks on LogIn Button
    Then User should be redirected to Landing Page "<Url>"
    And Selects "Mobile Number" Option from Search Dropdown
    And Enters "9867024806" into Search Input Box
    And Clicks on "PROCEED" Button
    Then User should be redirected to Dashboard Page "<Dashboard>"
    And Verify "Relations Overview" Section is displayed in DashBoard Page
    And Select a Tab "Fd" in Relations Overview
    And verify Date Formats for Labels in the Relation tile "544165" - Fixed Deposits

    Examples:
      | Domain | Username | Password | Url                                            | Dashboard                                        | pdcurl                                        |
      | CC     | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | https://report.bajajfinserv.in/PDCReport.aspx |

  @pass @run
  Scenario Outline: To verify Same Customer ID is being displayed in Personal Info And of Relation Tile - Fixed Deposits
    Given User is on Customer 360 Login Page
    And  User should select Domain "<Domain>"
    And User enters UserName "<Username>"
    And User enters Password "<Password>"
    And Clicks on LogIn Button
    Then User should be redirected to Landing Page "<Url>"
    And Selects "Mobile Number" Option from Search Dropdown
    And Enters "9867024806" into Search Input Box
    And Clicks on "PROCEED" Button
    Then User should be redirected to Dashboard Page "<Dashboard>"
    And Select a Tab "Fd" in Relations Overview
    And Verify Customer ID in Personal Info And of Relation Tile "544165" for "Fixed Deposits" Relation

    Examples:
      | Domain | Username | Password | Url                                            | Dashboard                                        | pdcurl                                        |
      | CC     | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | https://report.bajajfinserv.in/PDCReport.aspx |

