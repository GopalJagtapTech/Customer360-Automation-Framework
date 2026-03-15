Feature: Communication Trails

  @pass @run
  Scenario Outline: To verify User is able to view Communication Trails Section on Dashboard Page
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
    And Verify "Communication Trails" Section is displayed in DashBoard Page

    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        | Links                                                               |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | Offers#Bureau Insights#Service Request#CTR#PII#EasyReward#3in1 Data |

  @pass @run
  Scenario Outline: To verify User is able to view View All Button for Communication Trails Section in Dashboard Page
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
    And Verify "View All" button is displayed for "Communication Trails" Section in DashBoard Page

    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        | Links                                                               |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | Offers#Bureau Insights#Service Request#CTR#PII#EasyReward#3in1 Data |

  @pass @run
  Scenario Outline: To verify User is able to view Headers for Communication Trails Section in Dashboard Page
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
    And Verify Headers are displayed for Communication Trails Section in DashBoard Page

    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        | Links                                                               |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | Offers#Bureau Insights#Service Request#CTR#PII#EasyReward#3in1 Data |

  @pass @run
  Scenario Outline: To verify User is able to view Time Stamp for Sent Date in Communication Trails Section in Dashboard Page
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
    And Verify Time Stamp for Sent Date for Communication Trails Section in DashBoard Page

    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        | Links                                                               |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | Offers#Bureau Insights#Service Request#CTR#PII#EasyReward#3in1 Data |

  @pass @run
  Scenario Outline: To verify User is able to view Time Stamp for Sent Date as per Latest Order in Communication Trails Section in Dashboard Page
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
    And Verify Time Stamp for Sent Date as per Latest Order for Communication Trails Section in DashBoard Page

    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        | Links                                                               |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | Offers#Bureau Insights#Service Request#CTR#PII#EasyReward#3in1 Data |


  ########Commn Trails Page
  @pass @run
  Scenario Outline: To verify User is able to redirect to relevant page when clicked on view all of Communication Trails
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
    And User Clicks on "View All" Button of "Communication Trails" Section
    Then Verify Customer redirected to "https://customer360uat.bajajfinserv.in/commtrailviewmore" Url

    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        | Links                                                               |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | Offers#Bureau Insights#Service Request#CTR#PII#EasyReward#3in1 Data |

  @pass @run
  Scenario Outline: To verify User is able to view Content on Communication Trails Page
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
    And User Clicks on "View All" Button of "Communication Trails" Section
    Then Verify Customer redirected to "https://customer360uat.bajajfinserv.in/commtrailviewmore" Url
    And Verify Content on Communication Trails Page

    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        | Links                                                               |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | Offers#Bureau Insights#Service Request#CTR#PII#EasyReward#3in1 Data |

  @pass @run
  Scenario Outline: To verify User is able to view Content on Communication Trails Table - Communication Trails Page
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
    And User Clicks on "View All" Button of "Communication Trails" Section
    Then Verify Customer redirected to "https://customer360uat.bajajfinserv.in/commtrailviewmore" Url
    And Verify Content on Communication Trails Table - Communication Trails Page

    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        | Links                                                               |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | Offers#Bureau Insights#Service Request#CTR#PII#EasyReward#3in1 Data |

  @pass @run
  Scenario Outline: To verify User is able to view Table Headers on Communication Trails Table - Communication Trails Page
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
    And User Clicks on "View All" Button of "Communication Trails" Section
    Then Verify Customer redirected to "https://customer360uat.bajajfinserv.in/commtrailviewmore" Url
    And Verify Headers are displayed for Communication Trails Section - Communication Trails Page


    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        | Links                                                               |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | Offers#Bureau Insights#Service Request#CTR#PII#EasyReward#3in1 Data |

  @pass @run
  Scenario Outline: To verify User is able to view Time Stamp on Communication Trails Table - Communication Trails Page
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
    And User Clicks on "View All" Button of "Communication Trails" Section
    Then Verify Customer redirected to "https://customer360uat.bajajfinserv.in/commtrailviewmore" Url
    And Verify Time Stamp for Sent Date for Communication Trails Section - Communication Trails Page


    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        | Links                                                               |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | Offers#Bureau Insights#Service Request#CTR#PII#EasyReward#3in1 Data |

  @pass @run
  Scenario Outline: To verify User is able to view Time Stamp in Latest Order on Communication Trails Table - Communication Trails Page
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
    And User Clicks on "View All" Button of "Communication Trails" Section
    Then Verify Customer redirected to "https://customer360uat.bajajfinserv.in/commtrailviewmore" Url
    And Verify Time Stamp for Sent Date in Latest Order for Communication Trails Section - Communication Trails Page


    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        | Links                                                               |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | Offers#Bureau Insights#Service Request#CTR#PII#EasyReward#3in1 Data |

  @pass @run
  Scenario Outline: To verify User is able to Select by Filter - Communication Trails Page -SMS
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
    And User Clicks on "View All" Button of "Communication Trails" Section
    Then Verify Customer redirected to "https://customer360uat.bajajfinserv.in/commtrailviewmore" Url
    And User Clicks on a Filter type "SMS" in Communication Trails
    Then User should be able to view Filtered Channel "SMS"


    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        | Links                                                               |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | Offers#Bureau Insights#Service Request#CTR#PII#EasyReward#3in1 Data |

  @data
  Scenario Outline: To verify User is able to Select by Filter - Communication Trails Page -WhatsApp
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
    And User Clicks on "View All" Button of "Communication Trails" Section
    Then Verify Customer redirected to "https://customer360uat.bajajfinserv.in/commtrailviewmore" Url
    And User Clicks on a Filter type "WhatsApp" in Communication Trails
    Then User should be able to view Filtered Channel "WhatsApp"


    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        | Links                                                               |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | Offers#Bureau Insights#Service Request#CTR#PII#EasyReward#3in1 Data |

  @pass @run
  Scenario Outline: To verify User is able to View Pages Field - Communication Trails Page
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
    And User Clicks on "View All" Button of "Communication Trails" Section
    Then Verify Customer redirected to "https://customer360uat.bajajfinserv.in/commtrailviewmore" Url
    And Verify the Pages are displayed for Communication Trails Table - Communication Trails Page

    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        | Links                                                               |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | Offers#Bureau Insights#Service Request#CTR#PII#EasyReward#3in1 Data |


  @pass @run
  Scenario Outline: To verify User Clicks on Next Button in Communication Trails Table - Communication Trails Page
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
    And User Clicks on "View All" Button of "Communication Trails" Section
    Then Verify Customer redirected to "https://customer360uat.bajajfinserv.in/commtrailviewmore" Url
    And Verify When User Clicks on Next Button in Communication Trails Table - Communication Trails Page

    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        | Links                                                               |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | Offers#Bureau Insights#Service Request#CTR#PII#EasyReward#3in1 Data |

  @pass @run
  Scenario Outline: To verify User is able to Filter Communication Trails Table - Communication Trails Page
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
    And User Clicks on "View All" Button of "Communication Trails" Section
    Then Verify Customer redirected to "https://customer360uat.bajajfinserv.in/commtrailviewmore" Url
    And Enters Date "23092024" in the Sent Date - Date Picker in Communication Trails Page
    Then The Filtered Trails should be displayed for the entered Date "2024-09-23"

    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        | Links                                                               |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | Offers#Bureau Insights#Service Request#CTR#PII#EasyReward#3in1 Data |























