Feature: US_5233402 _Bounce count popup page development in customer portfolio widget

  @pass @run
  Scenario Outline: To verify that user is able to bounce count under customer portfolio ribbon

    Given User is on Customer 360 Login Page
    And  User should select Domain "<Domain>"
    And User enters UserName "<Username>"
    And User enters Password "<Password>"
    And Clicks on LogIn Button
    Then User should be redirected to Landing Page "<Url>"
    And Selects "Mobile Number" Option from Search Dropdown
    And Enters "9945002893" into Search Input Box
    And Clicks on "PROCEED" Button
    Then User should be redirected to Dashboard Page "<Dashboard>"
    And Verify Customer Portfolio Section is displayed in DashBoard Page
    Then User should be able to "Bounce count" under Customer Portfolio ribbon

    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard |

  @pass @run
  Scenario Outline: To verify that pop up is display when user is  click on bounce count under customer portfolio ribbon

    Given User is on Customer 360 Login Page
    And  User should select Domain "<Domain>"
    And User enters UserName "<Username>"
    And User enters Password "<Password>"
    And Clicks on LogIn Button
    Then User should be redirected to Landing Page "<Url>"
    And Selects "Mobile Number" Option from Search Dropdown
    And Enters "9945002893" into Search Input Box
    And Clicks on "PROCEED" Button
    Then User should be redirected to Dashboard Page "<Dashboard>"
    And Verify Customer Portfolio Section is displayed in DashBoard Page
    And Click on Bounce count under Customer Portfolio Section
    Then Verify Customer redirected to "https://customer360uat.bajajfinserv.in/bouncecountdetails" Url
    And Verify "Repayment SOA" Header in Bounce Count Page
    And Below Options "<Options>" should be displayed on Bounce Count Page

    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        | Options                                                                                                        |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | SOA, AGREEMENT NO., APPLICATION ID, SANCTIONED AMt., PRODUCT TYPE, MOB, TENURE, LOAN STATUS, POS, TRACK RECORD |

  @pass @run
  Scenario Outline: To verify User is able to view the Details under Repayment SOA Table

    Given User is on Customer 360 Login Page
    And  User should select Domain "<Domain>"
    And User enters UserName "<Username>"
    And User enters Password "<Password>"
    And Clicks on LogIn Button
    Then User should be redirected to Landing Page "<Url>"
    And Selects "Mobile Number" Option from Search Dropdown
    And Enters "9945002893" into Search Input Box
    And Clicks on "PROCEED" Button
    Then User should be redirected to Dashboard Page "<Dashboard>"
    And Verify Customer Portfolio Section is displayed in DashBoard Page
    And Click on Bounce count under Customer Portfolio Section
    Then Verify Customer redirected to "https://customer360uat.bajajfinserv.in/bouncecountdetails" Url
    And Verify "Repayment SOA" Header in Bounce Count Page
    And Verify the Contents of Repayment SOA Table

    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        | Options                                                                                                        |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | SOA, AGREEMENT NO., APPLICATION ID, SANCTIONED AMt., PRODUCT TYPE, MOB, TENURE, LOAN STATUS, POS, TRACK RECORD |


  @pass @run
  Scenario Outline: To verify PDF is downloaded when user is click on SOA

    Given User is on Customer 360 Login Page
    And  User should select Domain "<Domain>"
    And User enters UserName "<Username>"
    And User enters Password "<Password>"
    And Clicks on LogIn Button
    Then User should be redirected to Landing Page "<Url>"
    And Selects "Mobile Number" Option from Search Dropdown
    And Enters "9945002893" into Search Input Box
    And Clicks on "PROCEED" Button
    Then User should be redirected to Dashboard Page "<Dashboard>"
    And Verify Customer Portfolio Section is displayed in DashBoard Page
    And Click on Bounce count under Customer Portfolio Section
    Then Verify Customer redirected to "https://customer360uat.bajajfinserv.in/bouncecountdetails" Url
    And Verify "Repayment SOA" Header in Bounce Count Page
    And On Clicks on SOA Pdf for Row 1, SOA Document should be downloaded after selecting Language

    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard |

  @pass @run
  Scenario Outline: To verify that user is able to view agreement number under repayment SOA page

    Given User is on Customer 360 Login Page
    And  User should select Domain "<Domain>"
    And User enters UserName "<Username>"
    And User enters Password "<Password>"
    And Clicks on LogIn Button
    Then User should be redirected to Landing Page "<Url>"
    And Selects "Mobile Number" Option from Search Dropdown
    And Enters "9945002893" into Search Input Box
    And Clicks on "PROCEED" Button
    Then User should be redirected to Dashboard Page "<Dashboard>"
    And Verify Customer Portfolio Section is displayed in DashBoard Page
    And Click on Bounce count under Customer Portfolio Section
    Then Verify Customer redirected to "https://customer360uat.bajajfinserv.in/bouncecountdetails" Url
    Then User should be able to view "AGREEMENT NO." under "Repayment SOA"

    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard |


  @pass @run
  Scenario Outline: To verify that user is able to view Application ID number under repayment SOA page

    Given User is on Customer 360 Login Page
    And  User should select Domain "<Domain>"
    And User enters UserName "<Username>"
    And User enters Password "<Password>"
    And Clicks on LogIn Button
    Then User should be redirected to Landing Page "<Url>"
    And Selects "Mobile Number" Option from Search Dropdown
    And Enters "9945002893" into Search Input Box
    And Clicks on "PROCEED" Button
    Then User should be redirected to Dashboard Page "<Dashboard>"
    And Verify Customer Portfolio Section is displayed in DashBoard Page
    And Click on Bounce count under Customer Portfolio Section
    Then Verify Customer redirected to "https://customer360uat.bajajfinserv.in/bouncecountdetails" Url
    Then User should be able to view "APPLICATION ID" under "Repayment SOA"

    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard |

  @pass @run
  Scenario Outline: To verify that user is able to view Product Type under repayment SOA page

    Given User is on Customer 360 Login Page
    And  User should select Domain "<Domain>"
    And User enters UserName "<Username>"
    And User enters Password "<Password>"
    And Clicks on LogIn Button
    Then User should be redirected to Landing Page "<Url>"
    And Selects "Mobile Number" Option from Search Dropdown
    And Enters "9945002893" into Search Input Box
    And Clicks on "PROCEED" Button
    Then User should be redirected to Dashboard Page "<Dashboard>"
    And Verify Customer Portfolio Section is displayed in DashBoard Page
    And Click on Bounce count under Customer Portfolio Section
    Then Verify Customer redirected to "https://customer360uat.bajajfinserv.in/bouncecountdetails" Url
    Then User should be able to view "PRODUCT TYPE" under "Repayment SOA"

    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard |

  @pass @run
  Scenario Outline: To verify that user is able to view mob  under repayment SOA page

    Given User is on Customer 360 Login Page
    And  User should select Domain "<Domain>"
    And User enters UserName "<Username>"
    And User enters Password "<Password>"
    And Clicks on LogIn Button
    Then User should be redirected to Landing Page "<Url>"
    And Selects "Mobile Number" Option from Search Dropdown
    And Enters "9945002893" into Search Input Box
    And Clicks on "PROCEED" Button
    Then User should be redirected to Dashboard Page "<Dashboard>"
    And Verify Customer Portfolio Section is displayed in DashBoard Page
    And Click on Bounce count under Customer Portfolio Section
    Then Verify Customer redirected to "https://customer360uat.bajajfinserv.in/bouncecountdetails" Url
    Then User should be able to view "MOB" under "Repayment SOA"

    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard |

  @pass @run
  Scenario Outline: To verify that user is able to view tenure  under repayment SOA page

    Given User is on Customer 360 Login Page
    And  User should select Domain "<Domain>"
    And User enters UserName "<Username>"
    And User enters Password "<Password>"
    And Clicks on LogIn Button
    Then User should be redirected to Landing Page "<Url>"
    And Selects "Mobile Number" Option from Search Dropdown
    And Enters "9945002893" into Search Input Box
    And Clicks on "PROCEED" Button
    Then User should be redirected to Dashboard Page "<Dashboard>"
    And Verify Customer Portfolio Section is displayed in DashBoard Page
    And Click on Bounce count under Customer Portfolio Section
    Then Verify Customer redirected to "https://customer360uat.bajajfinserv.in/bouncecountdetails" Url
    Then User should be able to view "TENURE" under "Repayment SOA"

    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard |

  @pass @run
  Scenario Outline: To verify that user is able to view Loan Status  under repayment SOA page

    Given User is on Customer 360 Login Page
    And  User should select Domain "<Domain>"
    And User enters UserName "<Username>"
    And User enters Password "<Password>"
    And Clicks on LogIn Button
    Then User should be redirected to Landing Page "<Url>"
    And Selects "Mobile Number" Option from Search Dropdown
    And Enters "9945002893" into Search Input Box
    And Clicks on "PROCEED" Button
    Then User should be redirected to Dashboard Page "<Dashboard>"
    And Verify Customer Portfolio Section is displayed in DashBoard Page
    And Click on Bounce count under Customer Portfolio Section
    Then Verify Customer redirected to "https://customer360uat.bajajfinserv.in/bouncecountdetails" Url
    And Verify "Repayment SOA" Header in Bounce Count Page
    Then User should be able to view Loan Status under repayment SOA page

    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard |

  @pass @run
  Scenario Outline:To verify that user is able to view POS  under repayment SOA page

    Given User is on Customer 360 Login Page
    And  User should select Domain "<Domain>"
    And User enters UserName "<Username>"
    And User enters Password "<Password>"
    And Clicks on LogIn Button
    Then User should be redirected to Landing Page "<Url>"
    And Selects "Mobile Number" Option from Search Dropdown
    And Enters "9945002893" into Search Input Box
    And Clicks on "PROCEED" Button
    Then User should be redirected to Dashboard Page "<Dashboard>"
    And Verify Customer Portfolio Section is displayed in DashBoard Page
    And Click on Bounce count under Customer Portfolio Section
    Then Verify Customer redirected to "https://customer360uat.bajajfinserv.in/bouncecountdetails" Url
    Then User should be able to view "POS" under "Repayment SOA"

    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard |

  @pass @run
  Scenario Outline:To verify that user is able to view Track Record under repayment SOA page

    Given User is on Customer 360 Login Page
    And  User should select Domain "<Domain>"
    And User enters UserName "<Username>"
    And User enters Password "<Password>"
    And Clicks on LogIn Button
    Then User should be redirected to Landing Page "<Url>"
    And Selects "Mobile Number" Option from Search Dropdown
    And Enters "9945002893" into Search Input Box
    And Clicks on "PROCEED" Button
    Then User should be redirected to Dashboard Page "<Dashboard>"
    And Verify Customer Portfolio Section is displayed in DashBoard Page
    And Click on Bounce count under Customer Portfolio Section
    Then Verify Customer redirected to "https://customer360uat.bajajfinserv.in/bouncecountdetails" Url
    And Verify "Repayment SOA" Header in Bounce Count Page
    Then User should be able to view "TRACK RECORD" under "Repayment SOA"

    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard |

  @pass @run
  Scenario Outline:To verify that “No Bounce” is display in green color under repayment SOA page

    Given User is on Customer 360 Login Page
    And  User should select Domain "<Domain>"
    And User enters UserName "<Username>"
    And User enters Password "<Password>"
    And Clicks on LogIn Button
    Then User should be redirected to Landing Page "<Url>"
    And Selects "Mobile Number" Option from Search Dropdown
    And Enters "9945002893" into Search Input Box
    And Clicks on "PROCEED" Button
    Then User should be redirected to Dashboard Page "<Dashboard>"
    And Verify Customer Portfolio Section is displayed in DashBoard Page
    And Click on Bounce count under Customer Portfolio Section
    Then Verify Customer redirected to "https://customer360uat.bajajfinserv.in/bouncecountdetails" Url
    And Verify "Repayment SOA" Header in Bounce Count Page
    Then No Bounce should be display in green color under repayment SOA page

    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard |

  @pass @run
  Scenario Outline:To verify that “Bounce” is display in RED color under repayment SOA page

    Given User is on Customer 360 Login Page
    And  User should select Domain "<Domain>"
    And User enters UserName "<Username>"
    And User enters Password "<Password>"
    And Clicks on LogIn Button
    Then User should be redirected to Landing Page "<Url>"
    And Selects "Mobile Number" Option from Search Dropdown
    And Enters "9945002893" into Search Input Box
    And Clicks on "PROCEED" Button
    Then User should be redirected to Dashboard Page "<Dashboard>"
    And Verify Customer Portfolio Section is displayed in DashBoard Page
    And Click on Bounce count under Customer Portfolio Section
    Then Verify Customer redirected to "https://customer360uat.bajajfinserv.in/bouncecountdetails" Url
    And Verify "Repayment SOA" Header in Bounce Count Page
    Then Bounce should be displayed in RED color under repayment SOA page

    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard |

  @pass @run
  Scenario Outline: To Verify that pop up is display with details  when user is  click on bounce

    Given User is on Customer 360 Login Page
    And  User should select Domain "<Domain>"
    And User enters UserName "<Username>"
    And User enters Password "<Password>"
    And Clicks on LogIn Button
    Then User should be redirected to Landing Page "<Url>"
    And Selects "Mobile Number" Option from Search Dropdown
    And Enters "9945002893" into Search Input Box
    And Clicks on "PROCEED" Button
    Then User should be redirected to Dashboard Page "<Dashboard>"
    And Verify Customer Portfolio Section is displayed in DashBoard Page
    And Click on Bounce count under Customer Portfolio Section
    Then Verify Customer redirected to "https://customer360uat.bajajfinserv.in/bouncecountdetails" Url
    And Verify "Repayment SOA" Header in Bounce Count Page
    And Clicks on Bounce Count in repayment SOA page
    Then Pop up should be displayed with details when user clicks on bounce

    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard |


  @pass @run
  Scenario Outline: To verify that user is able to view Sanctioned Amount under repayment SOA page

    Given User is on Customer 360 Login Page
    And  User should select Domain "<Domain>"
    And User enters UserName "<Username>"
    And User enters Password "<Password>"
    And Clicks on LogIn Button
    Then User should be redirected to Landing Page "<Url>"
    And Selects "Mobile Number" Option from Search Dropdown
    And Enters "9945002893" into Search Input Box
    And Clicks on "PROCEED" Button
    Then User should be redirected to Dashboard Page "<Dashboard>"
    And Verify Customer Portfolio Section is displayed in DashBoard Page
    And Click on Bounce count under Customer Portfolio Section
    Then Verify Customer redirected to "https://customer360uat.bajajfinserv.in/bouncecountdetails" Url
    Then User should be able to view "SANCTIONED AMt." under "Repayment SOA"

    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard |

  @pass @run
  Scenario Outline: To verify that user is able to view LOAN STATUS under repayment SOA page

    Given User is on Customer 360 Login Page
    And  User should select Domain "<Domain>"
    And User enters UserName "<Username>"
    And User enters Password "<Password>"
    And Clicks on LogIn Button
    Then User should be redirected to Landing Page "<Url>"
    And Selects "Mobile Number" Option from Search Dropdown
    And Enters "9945002893" into Search Input Box
    And Clicks on "PROCEED" Button
    Then User should be redirected to Dashboard Page "<Dashboard>"
    And Verify Customer Portfolio Section is displayed in DashBoard Page
    And Click on Bounce count under Customer Portfolio Section
    Then Verify Customer redirected to "https://customer360uat.bajajfinserv.in/bouncecountdetails" Url
    Then User should be able to view "LOAN STATUS" under "Repayment SOA"

    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard |




