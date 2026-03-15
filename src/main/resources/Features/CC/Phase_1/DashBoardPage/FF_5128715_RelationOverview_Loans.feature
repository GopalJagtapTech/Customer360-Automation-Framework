Feature: FF_5128715_Relation Overview Cards Development for Loans Details and Card Details.

  @pass @run
  Scenario Outline: To verify User is able to view Relations Overview Section on Dashboard Page
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

    Examples:
      | Domain | Username  | Password      | Url                                            | Dashboard                                        | Links                                                               |
      | CC     | 202432943 | Finserv@12345 | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | Offers#Bureau Insights#Service Request#CTR#PII#EasyReward#3in1 Data |

  @pass @run
  Scenario Outline: To verify that details displayed on Relations overview section
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
    And Relation Tabs "<Tabs>" are displayed under Relations Overview
    And Verify Tiles are displayed under Relations

#  7.Backword and forword arrows

    Examples:
      | Domain | Username  | Password      | Url                                            | Dashboard                                        | Tabs                        |
      | CC     | 202432943 | Finserv@12345 | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | Loans, Cards, Insurance, Fd |

  @pass @run
  Scenario Outline: To verify that customer is able to view widget under 1 second after loading
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
    And Verify "Widgets" Section is displayed in DashBoard Page

    Examples:
      | Domain | Username  | Password      | Url                                            | Dashboard                                        | Tabs                        |
      | CC     | 202432943 | Finserv@12345 | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | Loans, Cards, Insurance, fd |


  @OOS
#  Scenario Outline: To verify that widget is compatible for all the supportive  browsers
#    Given User is on Customer 360 Login Page
#    And  User should select Domain "<Domain>"
#    And User enters UserName "<Username>"
#    And User enters Password "<Password>"
#    And Clicks on LogIn Button
#    Then User should be redirected to Landing Page "<Url>"
#    And Selects "Mobile Number" Option from Search Dropdown
#    And Enters "7499129437" into Search Input Box
#    And Clicks on "PROCEED" Button
#    Then User should be redirected to Dashboard Page "<Dashboard>"
#    Then Widget should be compatible for all the supportive browsers
#    Examples:
#      | Domain  | Username        | Password | Url                                            | Dashboard                                        | Tabs                        |
#      | Partner | 202432943 | Abhi@12345   | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | Loans, Cards, Insurance, fd |


    @OOS
#  Scenario Outline: To verify that design and functionality is same across the different browsers
#    Given User is on Customer 360 Login Page
#    And  User should select Domain "<Domain>"
#    And User enters UserName "<Username>"
#    And User enters Password "<Password>"
#    And Clicks on LogIn Button
#    Then User should be redirected to Landing Page "<Url>"
#    And Selects "Mobile Number" Option from Search Dropdown
#    And Enters "7499129437" into Search Input Box
#    And Clicks on "PROCEED" Button
#    Then User should be redirected to Dashboard Page "<Dashboard>"
#    Then Design and functionality is same across the different browsers
#    Examples:
#      | Domain  | Username        | Password | Url                                            | Dashboard                                        | Tabs                        |
#      | Partner | 202432943 | Abhi@12345   | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | Loans, Cards, Insurance, fd |


    @NA
#  Scenario Outline: To verify that widget is responsible for mobile device
#    Given User is on Customer 360 Login Page
#    And  User should select Domain "<Domain>"
#    And User enters UserName "<Username>"
#    And User enters Password "<Password>"
#    And Clicks on LogIn Button
#    Then User should be redirected to Landing Page "<Url>"
#    And Selects "Mobile Number" Option from Search Dropdown
#    And Enters "7499129437" into Search Input Box
#    And Clicks on "PROCEED" Button
#    Then User should be redirected to Dashboard Page "<Dashboard>"
#    Then widget should be responsible for all the mobile device .design and functionality should be same
#    Examples:
#      | Domain  | Username        | Password | Url                                            | Dashboard                                        | Tabs                        |
#      | Partner | 202432943 | Abhi@12345   | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | Loans, Cards, Insurance, fd |

    @pass @run
  Scenario Outline: To verify that after successful search on customer 360 dashboard customer is able to view loan card with details
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
    And Verify Search Icon is displayed for "Loans"
    And Clicks on Search Icon in Relations Overview
    And Enters the Number "405DPFIZ946071" in Search Field
    Then That Particular Relation "405DPFIZ946071" should be displayed

    Examples:
      | Domain | Username  | Password      | Url                                            | Dashboard                                        |
      | CC     | 202432943 | Finserv@12345 | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard |


  @NA
#  Scenario Outline: To verify that customer is able to view source system name according to Source_Id
#    Given User is on Customer 360 Login Page
#    And  User should select Domain "<Domain>"
#    And User enters UserName "<Username>"
#    And User enters Password "<Password>"
#    And Clicks on LogIn Button
#    Then User should be redirected to Landing Page "<Url>"
#    And Selects "Mobile Number" Option from Search Dropdown
#    And Enters "7499129437" into Search Input Box
#    And Clicks on "PROCEED" Button
#    Then User should be redirected to Dashboard Page "<Dashboard>"
#    Then widget should be responsible for all the mobile device .design and functionality should be same
#    Examples:
#      | Domain  | Username        | Password | Url                                            | Dashboard                                        | Tabs                        |
#      | Partner | 202432943 | Abhi@12345   | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | Loans, Cards, Insurance, fd |


    @pass @run
  Scenario Outline: To verify that details displayed on Loan cards

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
    Then Customer should be able to view below details on loan cards

    Examples:
      | Domain | Username  | Password      | Url                                            | Dashboard                                        | Tabs                        |
      | CC     | 202432943 | Finserv@12345 | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | Loans, Cards, Insurance, fd |

  @pass @run
  Scenario Outline: To verify that loan amount, EMI  amount, total overdue, last payment date, POS outstanding, disbursement date that details are fetched from loan details API
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
    Then Loan details(Loan amount,EMI amount,total overdue,last payment date,POS outstanding,Disbursement date) should be fetched from loan details API
    Examples:
      | Domain | Username  | Password      | Url                                            | Dashboard                                        | Tabs                        |
      | CC     | 202432943 | Finserv@12345 | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | Loans, Cards, Insurance, fd |

  @pass @run
  Scenario Outline: To verify that for Active Relation, Green coloured Badge is displayed - Loan
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
    Then "ACTIVE" Badge should be displayed in Green Colour for "405DPFKA311104" Relation

    Examples:
      | Domain | Username  | Password      | Url                                            | Dashboard                                        | Tabs                        |
      | CC     | 202432943 | Finserv@12345 | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | Loans, Cards, Insurance, fd |

  @pass @run
  Scenario Outline: To verify that for Closed Relation, Red coloured Badge is displayed - Loan
    Given User is on Customer 360 Login Page
    And  User should select Domain "<Domain>"
    And User enters UserName "<Username>"
    And User enters Password "<Password>"
    And Clicks on LogIn Button
    Then User should be redirected to Landing Page "<Url>"
    And Selects "Mobile Number" Option from Search Dropdown
    And Enters "9584663421" into Search Input Box
    And Clicks on "PROCEED" Button
    Then User should be redirected to Dashboard Page "<Dashboard>"
    And Verify "Relations Overview" Section is displayed in DashBoard Page
    Then "CLOSED" Badge should be displayed in Red Colour for "T43RPLGJ034309" Relation

    Examples:
      | Domain | Username  | Password      | Url                                            | Dashboard                                        | Tabs                        |
      | CC     | 202432943 | Finserv@12345 | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | Loans, Cards, Insurance, fd |

  @NA
#  Scenario Outline: To  verify that when customer search using parameter like LAN number, Appl ID, Deal ID as search parameter
#    Given User is on Customer 360 Login Page
#    And  User should select Domain "<Domain>"
#    And User enters UserName "<Username>"
#    And User enters Password "<Password>"
#    And Clicks on LogIn Button
#    Then User should be redirected to Landing Page "<Url>"
#    And Selects "Mobile Number" Option from Search Dropdown
#    And Enters "7499129437" into Search Input Box
#    And Clicks on "PROCEED" Button
#    Then User should be redirected to Dashboard Page "<Dashboard>"
#    And Verify "Relations Overview" Section is displayed in DashBoard Page
#    Then Then Loan Card corresponding to the searched LAN number, Appl ID, Deal ID should be appear first.
#    Examples:
#      | Domain  | Username        | Password | Url                                            | Dashboard                                        | Tabs                        |
#      | Partner | 202432943 | Abhi@12345   | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | Loans, Cards, Insurance, fd |

    @pass @run
  Scenario Outline: TTo verify that customer is able to view first loan card which card have disbursement - Active
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
    Then Customer should be able to view loans cards according to latest disbursement date
    Examples:
      | Domain | Username  | Password      | Url                                            | Dashboard                                        | Tabs                        |
      | CC     | 202432943 | Finserv@12345 | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | Loans, Cards, Insurance, fd |

  @pass @run
  Scenario Outline: To verify that User is able to view close loan after the active loans
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
    Then User should be able to view close loan after the active loans
    Examples:
      | Domain | Username  | Password      | Url                                            | Dashboard                                        | Tabs                        |
      | CC     | 202432943 | Finserv@12345 | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | Loans, Cards, Insurance, fd |


  @pass @run
  Scenario Outline: To verify that User is able to view "<Document>" reports include SMS icon and PDF icon on loan cards
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
    And Clicks on a "<Document>" Document in "405DPFKA311104" Relation Tile
    Then Customer should be able to view below Icons for the "<Document>"
#    Then User should be able to view SOA,RPS,NDC,interest Certificate reports include SMS icon and PDF icon on loan cards
    Examples:
      | Domain | Username  | Password      | Url                                            | Dashboard                                        | Document |
      | CC     | 202432943 | Finserv@12345 | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | SOA      |
      | CC     | 202432943 | Finserv@12345 | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | RPS      |

  @pass @run
  Scenario Outline: To verify that User is able to view "<Document>" reports include SMS icon and PDF icon on loan cards
    Given User is on Customer 360 Login Page
    And  User should select Domain "<Domain>"
    And User enters UserName "<Username>"
    And User enters Password "<Password>"
    And Clicks on LogIn Button
    Then User should be redirected to Landing Page "<Url>"
    And Selects "Mobile Number" Option from Search Dropdown
    And Enters "9443703371" into Search Input Box
    And Clicks on "PROCEED" Button
    Then User should be redirected to Dashboard Page "<Dashboard>"
    And Verify "Relations Overview" Section is displayed in DashBoard Page
    And Clicks on a "<Document>" Document in "5550PL15072698" Relation Tile
    Then Customer should be able to view below Icons for the "NOC"

    Examples:
      | Domain | Username  | Password      | Url                                            | Dashboard                                        | Document |
      | CC     | 202432943 | Finserv@12345 | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | NDC      |

  @pass @run
  Scenario Outline: To verify that on click of PDF icon User is able to view pop up for language selection
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
    And Clicks on a "SOA" Document in "405DPFKA311104" Relation Tile
    And Clicks on "PDF" Icon of the "SOA" Document
    Then User should be able to view "Select a Language" pop up for language selection

    Examples:
      | Domain | Username  | Password      | Url                                            | Dashboard                                        | Tabs                        |
      | CC     | 202432943 | Finserv@12345 | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | Loans, Cards, Insurance, fd |

  @pass @run
  Scenario Outline: To verify that User is able to view number of language options on pop up
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
    And Clicks on a "SOA" Document in "405DPFKA311104" Relation Tile
    And Clicks on "PDF" Icon of the "SOA" Document
    Then User should be able to view "Select a Language" pop up for language selection
    Then User should be able to view number of language options "<Languages>" on pop up

    Examples:
      | Domain | Username  | Password      | Url                                            | Dashboard                                        | Languages                                                           |
      | CC     | 202432943 | Finserv@12345 | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | ENGLISH#TAMIL#KANNADA#MARATHI#HINDI#GUJARATI#BENGALI#TELUGU#PUNJABI |


  @OOS
#  Scenario Outline: To verify that PDF is downloaded in selected language
#    Given User is on Customer 360 Login Page
#    And  User should select Domain "<Domain>"
#    And User enters UserName "<Username>"
#    And User enters Password "<Password>"
#    And Clicks on LogIn Button
#    Then User should be redirected to Landing Page "<Url>"
#    And Selects "Mobile Number" Option from Search Dropdown
#    And Enters "7499129437" into Search Input Box
#    And Clicks on "PROCEED" Button
#    Then User should be redirected to Dashboard Page "<Dashboard>"
#    And click on PDF
#    And select the language
#    Then Downloaded PFD should be in selected language
#    Examples:
#      | Domain  | Username        | Password | Url                                            | Dashboard                                        | Tabs                        |
#      | Partner | 202432943 | Abhi@12345   | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | Loans, Cards, Insurance, fd |

    @pass @run
  Scenario Outline:To verify that on click of SMS icon for "<Doc>" - reports pop up is displayed
    Given User is on Customer 360 Login Page
    And  User should select Domain "<Domain>"
    And User enters UserName "<Username>"
    And User enters Password "<Password>"
    And Clicks on LogIn Button
    Then User should be redirected to Landing Page "<Url>"
    And Selects "Mobile Number" Option from Search Dropdown
    And Enters "<Mobile>" into Search Input Box
    And Clicks on "PROCEED" Button
    Then User should be redirected to Dashboard Page "<Dashboard>"
    And Verify "Relations Overview" Section is displayed in DashBoard Page
    And Clicks on a "<Doc>" Document in "<Relation>" Relation Tile
    And Clicks on "SMS" Icon of the "<Doc>" Document
    Then "Confirm it!!!" popup for sms should be displayed

    Examples:
      | Domain | Username  | Password      | Url                                            | Dashboard                                        | Doc | Mobile     | Relation       |
      | CC     | 202432943 | Finserv@12345 | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | SOA | 9833728591 | 405DPFKA311104 |
      | CC     | 202432943 | Finserv@12345 | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | RPS | 9833728591 | 405DPFKA311104 |

  @pass @run
  Scenario Outline:To verify that on click of SMS icon for "<Doc>" - reports pop up is displayed
    Given User is on Customer 360 Login Page
    And  User should select Domain "<Domain>"
    And User enters UserName "<Username>"
    And User enters Password "<Password>"
    And Clicks on LogIn Button
    Then User should be redirected to Landing Page "<Url>"
    And Selects "Mobile Number" Option from Search Dropdown
    And Enters "<Mobile>" into Search Input Box
    And Clicks on "PROCEED" Button
    Then User should be redirected to Dashboard Page "<Dashboard>"
    And Verify "Relations Overview" Section is displayed in DashBoard Page
    And Clicks on a "<Doc>" Document in "<Relation>" Relation Tile
    And Clicks on "SMS" Icon of the "NOC" Document
    Then "Confirm it!!!" popup for sms should be displayed

    Examples:
      | Domain | Username  | Password      | Url                                            | Dashboard                                        | Doc | Mobile     | Relation       |
      | CC     | 202432943 | Finserv@12345 | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | NDC | 9443703371 | 5550PL15072698 |

  @fail @run
  Scenario Outline: To verify that on click of  "Yes"  CTA User is receive notification message "<Doc>"
    Given User is on Customer 360 Login Page
    And  User should select Domain "<Domain>"
    And User enters UserName "<Username>"
    And User enters Password "<Password>"
    And Clicks on LogIn Button
    Then User should be redirected to Landing Page "<Url>"
    And Selects "Mobile Number" Option from Search Dropdown
    And Enters "<Mobile>" into Search Input Box
    And Clicks on "PROCEED" Button
    Then User should be redirected to Dashboard Page "<Dashboard>"
    And Verify "Relations Overview" Section is displayed in DashBoard Page
    And Clicks on a "<Doc>" Document in "<Relation>" Relation Tile
    And Clicks on "SMS" Icon of the "<Doc>" Document
    Then "Confirm it!!!" popup for sms should be displayed
    Then On click of Yes CTA User should receive notification message
    Examples:
      | Domain | Username  | Password      | Url                                            | Dashboard                                        | Doc | Mobile     | Relation       |
      | CC     | 202432943 | Finserv@12345 | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | SOA | 9833728591 | 405DPFKA311104 |
      | CC     | 202432943 | Finserv@12345 | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | RPS | 9833728591 | 405DPFKA311104 |


  @fail @run
  Scenario Outline: To verify that on click of  “Yes”  CTA User is receive notification message "<Doc>"
    Given User is on Customer 360 Login Page
    And  User should select Domain "<Domain>"
    And User enters UserName "<Username>"
    And User enters Password "<Password>"
    And Clicks on LogIn Button
    Then User should be redirected to Landing Page "<Url>"
    And Selects "Mobile Number" Option from Search Dropdown
    And Enters "<Mobile>" into Search Input Box
    And Clicks on "PROCEED" Button
    Then User should be redirected to Dashboard Page "<Dashboard>"
    And Verify "Relations Overview" Section is displayed in DashBoard Page
    And Clicks on a "<Doc>" Document in "<Relation>" Relation Tile
    And Clicks on "SMS" Icon of the "NOC" Document
    Then "Confirm it!!!" popup for sms should be displayed
    Then On click of Yes CTA User should receive notification message

    Examples:
      | Domain | Username  | Password      | Url                                            | Dashboard                                        | Doc | Mobile     | Relation       |
      | CC     | 202432943 | Finserv@12345 | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | NDC | 9443703371 | 5550PL15072698 |

  @pass @run
  Scenario Outline: To verify that on click of “Cancel” CTA pop get closed "<Doc>"
    Given User is on Customer 360 Login Page
    And  User should select Domain "<Domain>"
    And User enters UserName "<Username>"
    And User enters Password "<Password>"
    And Clicks on LogIn Button
    Then User should be redirected to Landing Page "<Url>"
    And Selects "Mobile Number" Option from Search Dropdown
    And Enters "<Mobile>" into Search Input Box
    And Clicks on "PROCEED" Button
    Then User should be redirected to Dashboard Page "<Dashboard>"
    And Verify "Relations Overview" Section is displayed in DashBoard Page
    And Clicks on a "<Doc>" Document in "<Relation>" Relation Tile
    And Clicks on "SMS" Icon of the "<Doc>" Document
    Then "Confirm it!!!" popup for sms should be displayed
    Then On click of Cancel CTA SMS pop should be closed

    Examples:
      | Domain | Username  | Password      | Url                                            | Dashboard                                        | Doc | Mobile     | Relation       |
      | CC     | 202432943 | Finserv@12345 | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | SOA | 9833728591 | 405DPFKA311104 |
      | CC     | 202432943 | Finserv@12345 | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | RPS | 9833728591 | 405DPFKA311104 |

  @pass @run
  Scenario Outline: To verify that on click of “Cancel” CTA pop get closed "<Doc>"
    Given User is on Customer 360 Login Page
    And  User should select Domain "<Domain>"
    And User enters UserName "<Username>"
    And User enters Password "<Password>"
    And Clicks on LogIn Button
    Then User should be redirected to Landing Page "<Url>"
    And Selects "Mobile Number" Option from Search Dropdown
    And Enters "<Mobile>" into Search Input Box
    And Clicks on "PROCEED" Button
    Then User should be redirected to Dashboard Page "<Dashboard>"
    And Verify "Relations Overview" Section is displayed in DashBoard Page
    And Clicks on a "<Doc>" Document in "<Relation>" Relation Tile
    And Clicks on "SMS" Icon of the "NOC" Document
    Then "Confirm it!!!" popup for sms should be displayed
    Then On click of Cancel CTA SMS pop should be closed

    Examples:
      | Domain | Username  | Password      | Url                                            | Dashboard                                        | Doc | Mobile     | Relation       |
      | CC     | 202432943 | Finserv@12345 | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | NDC | 9443703371 | 5550PL15072698 |

  @OOS
#  Scenario Outline: To verify that User is receive bitly link within 30 minutes
#    Given User is on Customer 360 Login Page
#    And  User should select Domain "<Domain>"
#    And User enters UserName "<Username>"
#    And User enters Password "<Password>"
#    And Clicks on LogIn Button
#    Then User should be redirected to Landing Page "<Url>"
#    And Selects "Mobile Number" Option from Search Dropdown
#    And Enters "7499129437" into Search Input Box
#    And Clicks on "PROCEED" Button
#    Then User should be redirected to Dashboard Page "<Dashboard>"
#    And click on PDF of SOA/RPS/NDC
#    And click on SMS
#    And click on Yes CTA
#    Then User should be is receive bitly link within 30 minutes
#    Examples:
#      | Domain  | Username        | Password | Url                                            | Dashboard                                        | Tabs                        |
#      | Partner | 202432943 | Abhi@12345   | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | Loans, Cards, Insurance, fd |

    @pass @run
  Scenario Outline: To verify that NDC reports is visible only that Users who is  having closed loan
    Given User is on Customer 360 Login Page
    And  User should select Domain "<Domain>"
    And User enters UserName "<Username>"
    And User enters Password "<Password>"
    And Clicks on LogIn Button
    Then User should be redirected to Landing Page "<Url>"
    And Selects "Mobile Number" Option from Search Dropdown
    And Enters "9584663421" into Search Input Box
    And Clicks on "PROCEED" Button
    Then User should be redirected to Dashboard Page "<Dashboard>"
    And Verify "Relations Overview" Section is displayed in DashBoard Page
    Then "NDC" should be displayed only for loan which is marked as Closed "T43RPLGJ034309"

#    And click on PDF of NDC
#    Then NDC reports should be displayed that User who is having closed loans
    Examples:
      | Domain | Username  | Password      | Url                                            | Dashboard                                        | Tabs                        |
      | CC     | 202432943 | Finserv@12345 | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | Loans, Cards, Insurance, fd |

  @pass @run
  Scenario Outline: To verify that welcome letter is download via PDF and opening in new tab
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
    And Clicks on a "Welcome Letter" Document in "405DPFKA311104" Relation Tile
    Then Verify User redirected to "<Welcomeurl>" Url in New Tab

#    And click on Welcome letter PDF
#    Then Welcome letter should be download via PFD and opening in new tab
    Examples:
      | Domain | Username  | Password      | Url                                            | Dashboard                                        | Welcomeurl                                                    |
      | CC     | 202432943 | Finserv@12345 | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | https://documents.bajajfinserv.in/Welcome_Letter/DocPOD/Index |


  @NA
  Scenario Outline: To verify that SMS trigger option for the welcome letter is only available for specific products
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
    And click on Welcome letter PDF
    Then SMS trigger option for the welcome letter should be  only available for specific products
    Examples:
      | Domain | Username  | Password      | Url                                            | Dashboard                                        | Tabs                        |
      | CC     | 202432943 | Finserv@12345 | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | Loans, Cards, Insurance, fd |

  @pass @run
  Scenario Outline: To verify that Foreclosure (FC) letter is displayed only for loan who is marked as “Active”
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
    Then "FC Letter" should be displayed only for loan which is marked as Active "405DPFKA311104"

    Examples:
      | Domain | Username  | Password      | Url                                            | Dashboard                                        | Tabs                        |
      | CC     | 202432943 | Finserv@12345 | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | Loans, Cards, Insurance, fd |

  @pass @run
  Scenario Outline: To verify that on click of PDF icon PDC report is displayed
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
    And Clicks on a "PDC" Document in "405DPFKA311104" Relation Tile
    Then Verify User redirected to "<pdcurl>" Url in New Tab

    Examples:
      | Domain | Username  | Password      | Url                                            | Dashboard                                        | pdcurl                                        |
      | CC     | 202432943 | Finserv@12345 | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | https://report.bajajfinserv.in/PDCReport.aspx |


##################################33Feature:
  @pass @run
  Scenario Outline: To verify that All the Amounts in the Relation tile Starts with Symbol ₹
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
    And verify "₹" Symbol is displayed in front of all the Amounts in Relation tile "405DPFKA311104"

    Examples:
      | Domain | Username  | Password      | Url                                            | Dashboard                                        | pdcurl                                        |
      | CC     | 202432943 | Finserv@12345 | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | https://report.bajajfinserv.in/PDCReport.aspx |

  @pass @run
  Scenario Outline: To verify the Date Formats for Labels in the Relation tile
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
    And verify Date Formats for Labels in the Relation tile "4X6RPLGV938592"

    Examples:
      | Domain | Username  | Password      | Url                                            | Dashboard                                        | pdcurl                                        |
      | CC     | 202432943 | Finserv@12345 | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | https://report.bajajfinserv.in/PDCReport.aspx |

  @pass @run
  Scenario Outline: To verify If the User has no Relations - Loans
    Given User is on Customer 360 Login Page
    And  User should select Domain "<Domain>"
    And User enters UserName "<Username>"
    And User enters Password "<Password>"
    And Clicks on LogIn Button
    Then User should be redirected to Landing Page "<Url>"
    And Selects "Mobile Number" Option from Search Dropdown
    And Enters "6479390934" into Search Input Box
    And Clicks on "PROCEED" Button
    Then User should be redirected to Dashboard Page "<Dashboard>"
    And Verify "Relations Overview" Section is displayed in DashBoard Page
    And Select a Tab "Loans" in Relations Overview
    And Verify Text "No Loans Available" and Count 0 displayed for the Relation "Loans"

    Examples:
      | Domain | Username  | Password      | Url                                            | Dashboard                                        | pdcurl                                        |
      | CC     | 202432943 | Finserv@12345 | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | https://report.bajajfinserv.in/PDCReport.aspx |

  @pass @run
  Scenario Outline: To verify that Count is displayed for Tabs - Loans
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
    And Verify Respective Count is displayed for the Tab "Loans"
    Examples:
      | Domain | Username  | Password      | Url                                            | Dashboard                                        | pdcurl                                        |
      | CC     | 202432943 | Finserv@12345 | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | https://report.bajajfinserv.in/PDCReport.aspx |

  @pass @run
  Scenario Outline: To verify By Default Loan Tab is Selected
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
    And Verify By Default "Loans" Tabs is Selected

    Examples:
      | Domain | Username  | Password      | Url                                            | Dashboard                                        | pdcurl                                        |
      | CC     | 202432943 | Finserv@12345 | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | https://report.bajajfinserv.in/PDCReport.aspx |



##############New

  @pass @run
  Scenario Outline: To verify that User is able to download the File when clicks on "<Document>"
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
    And Clicks on a "<Document>" Document in "405DPFKA311104" Relation Tile
    Then "405DPFKA311104" File Should be downloaded for FC Letter

    Examples:
      | Domain | Username  | Password      | Url                                            | Dashboard                                        | Document  |
      | CC     | 202432943 | Finserv@12345 | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | FC Letter |

  @pass @run
  Scenario Outline: To verify that User is redirected to Url when clicks on "<Document>"
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
    And Clicks on a "<Document>" Document in "405DPFKA311104" Relation Tile
    Then Verify User redirected to "<Url2>" Url in New Tab

    Examples:
      | Domain | Username  | Password      | Url                                            | Dashboard                                        | Document       | Url2                                                          |
      | CC     | 202432943 | Finserv@12345 | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | PDC            | https://report.bajajfinserv.in/PDCReport                      |
      | CC     | 202432943 | Finserv@12345 | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | Scanned Docs   | https://dmsapp.bajajfinserv.in/finserv/viewDoc.jsp            |
      | CC     | 202432943 | Finserv@12345 | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | Welcome Letter | https://documents.bajajfinserv.in/Welcome_Letter/DocPOD/Index |

  @pass @run
  Scenario Outline: To verify that User is able to view Financial Year Dropdown when clicks on "<Document>"
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
    And Clicks on a "<Document>" Document in "405DPFKA311104" Relation Tile
    Then "Select a Financial Year" Popup should be displayed along with Years dropdown

    Examples:
      | Domain | Username  | Password      | Url                                            | Dashboard                                        | Document                |
      | CC     | 202432943 | Finserv@12345 | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | Interest Certificate    |
      | CC     | 202432943 | Finserv@12345 | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | Provisional Certificate |



