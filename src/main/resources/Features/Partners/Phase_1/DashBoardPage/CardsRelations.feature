Feature: Relations Overview - Cards

  @pass @run
  Scenario Outline: To verify Same Customer ID is being displayed in Personal Info And of Relation Tile
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
    And Verify Customer ID in Personal Info And of Relation Tile "4X6RPLGV938592" for "Loans" Relation

    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        | pdcurl                                        |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | https://report.bajajfinserv.in/PDCReport.aspx |


####Cards

  @pass @run
  Scenario Outline: To verify Selection of Tabs in Relation Overview - Cards
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
    And Select a Tab "Cards" in Relations Overview
    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        | pdcurl                                        |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | https://report.bajajfinserv.in/PDCReport.aspx |

  @pass @run
  Scenario Outline: To verify that Count is displayed for Tabs - Cards
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
    And Select a Tab "Cards" in Relations Overview
    And Verify Respective Count is displayed for the Tab "Cards"
    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        | pdcurl                                        |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | https://report.bajajfinserv.in/PDCReport.aspx |

  @pass @run
  Scenario Outline: To verify If the User has no Relations - Cards
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
    And Select a Tab "Cards" in Relations Overview
    And Verify Text "No Cards Details Available" and Count 0 displayed for the Relation "Cards"

    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        | pdcurl                                        |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | https://report.bajajfinserv.in/PDCReport.aspx |

  @pass @run
  Scenario Outline: To verify Tiles are displayed under Relations - Cards
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
    And Select a Tab "Cards" in Relations Overview
    And Verify Tiles are displayed under Relations

    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        | pdcurl                                        |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | https://report.bajajfinserv.in/PDCReport.aspx |

  @pass @run
  Scenario Outline: To verify that details displayed on Cards - Active
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
    And Select a Tab "Cards" in Relations Overview
    Then Customer should be able to view below details on "Cards" tile "2030XXXXXXXX9234"

    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        | pdcurl                                        |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | https://report.bajajfinserv.in/PDCReport.aspx |

  @pass @run
  Scenario Outline: To verify that for Active Relation, Green coloured Badge is displayed - Cards
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
    And Select a Tab "Cards" in Relations Overview
    Then "Active" Badge should be displayed in Green Colour for "2030XXXXXXXX9234" Relation

    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        | pdcurl                                        |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | https://report.bajajfinserv.in/PDCReport.aspx |

  @pass @run @data
  Scenario Outline: To verify that for Closed Relation, Red coloured Badge is displayed - Cards
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
    And Select a Tab "Cards" in Relations Overview
    Then "InActive" Badge should be displayed in Red Colour for "2030XXXXXXXX6007" Relation

    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        | pdcurl                                        |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | https://report.bajajfinserv.in/PDCReport.aspx |


  @work
#  Scenario Outline: To verify that customer is able to view first cards which card have disbursement is
#    Given User is on Customer 360 Login Page
#    And  User should select Domain "<Domain>"
#    And User enters UserName "<Username>"
#    And User enters Password "<Password>"
#    And Clicks on LogIn Button
#    Then User should be redirected to Landing Page "<Url>"
#    And Selects "Mobile Number" Option from Search Dropdown
#    And Enters "8806670170" into Search Input Box
#    And Clicks on "PROCEED" Button
#    Then User should be redirected to Dashboard Page "<Dashboard>"
#    And Verify "Relations Overview" Section is displayed in DashBoard Page
#    And Select a Tab "Cards" in Relations Overview
#    Then Customer should be able to view loans cards according to latest disbursement date
#
#    Examples:
#      | Domain  | Username        | Password | Url                                            | Dashboard                                        | Tabs                        |
#      | Partner | 202432943 | Abhi@12345   | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | Loans, Cards, Insurance, fd |

    @data
  Scenario Outline: To verify that User is able to view close Cards after the active Cards
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
    And Select a Tab "Cards" in Relations Overview
    Then User should be able to view close loan after the active loans
    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        | Tabs                        |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | Loans, Cards, Insurance, fd |


  @pass @run
  Scenario Outline: To verify that All the Amounts in the Relation tile Starts with Symbol ₹ - Cards
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
    And Select a Tab "Cards" in Relations Overview
    And verify "₹" Symbol is displayed in front of all the Amounts in Relation tile "2030XXXXXXXX9234" - Cards

    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        | pdcurl                                        |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | https://report.bajajfinserv.in/PDCReport.aspx |

  @pass @run
  Scenario Outline: To verify the Date Formats for Labels in the Relation tile
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
    And Select a Tab "Cards" in Relations Overview
    And verify Date Formats for Labels in the Relation tile "2030XXXXXXXX9234" - Cards

    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        | pdcurl                                        |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | https://report.bajajfinserv.in/PDCReport.aspx |

  @pass @run
  Scenario Outline: To verify Same Customer ID is being displayed in Personal Info And of Relation Tile - Cards
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
    And Select a Tab "Cards" in Relations Overview
    And Verify Customer ID in Personal Info And of Relation Tile "2030XXXXXXXX9234" for "Cards" Relation

    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        | pdcurl                                        |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | https://report.bajajfinserv.in/PDCReport.aspx |

  @pass @run
  Scenario Outline: To verify Number is masked on Cards - Active
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
    And Select a Tab "Cards" in Relations Overview
    Then Verify User ia able to view masked Relation for Cards Relation "2030XXXXXXXX9234"

    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        | pdcurl                                        |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | https://report.bajajfinserv.in/PDCReport.aspx |
