Feature: Service Request

  @pass @run
  Scenario Outline: To verify User is able to view Service request Section on Dashboard Page
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
    And Verify "Service request" Section is displayed in DashBoard Page

    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        | Links                                                               |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | Offers#Bureau Insights#Service Request#CTR#PII#EasyReward#3in1 Data |

  @pass @run
  Scenario Outline: To verify User is able to view View All Button for Service request on Dashboard Page
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
    And Verify "Service request" Section is displayed in DashBoard Page
    And Verify "View All" button is displayed for "Service request" Section in DashBoard Page

    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        | Links                                                               |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | Offers#Bureau Insights#Service Request#CTR#PII#EasyReward#3in1 Data |


  @pass @run
  Scenario Outline: To verify User is able to view Headers for Service request Section in DashBoard Page
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
    And Verify "Service request" Section is displayed in DashBoard Page
    And Verify Headers are displayed for Service request Section in DashBoard Page

    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        | Links                                                               |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | Offers#Bureau Insights#Service Request#CTR#PII#EasyReward#3in1 Data |

  @pass @run
  Scenario Outline: To verify User is able to view Contents for Service request Section in DashBoard Page
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
    And Verify "Service request" Section is displayed in DashBoard Page
    And Verify Contents are displayed for Service request Section in DashBoard Page

    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        | Links                                                               |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | Offers#Bureau Insights#Service Request#CTR#PII#EasyReward#3in1 Data |

  @pass @run
  Scenario Outline: To verify User is able to view Date Format for Date for Service request Section in DashBoard Page
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
    And Verify "Service request" Section is displayed in DashBoard Page
    And Verify Date Format for Date for Service request Section in DashBoard Page

    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        | Links                                                               |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | Offers#Bureau Insights#Service Request#CTR#PII#EasyReward#3in1 Data |

  @fail @run
  Scenario Outline: To verify User is able to view Dates for Service request Section as per Latest Order in DashBoard Page
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
    And Verify "Service request" Section is displayed in DashBoard Page
    And Verify Dates for Service request Section as per Latest Order in DashBoard Page

    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        | Links                                                               |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | Offers#Bureau Insights#Service Request#CTR#PII#EasyReward#3in1 Data |

  @fail @run
  Scenario Outline: To verify User is able to view Statuses in Relevant Colour Badges
    Given User is on Customer 360 Login Page
    And  User should select Domain "<Domain>"
    And User enters UserName "<Username>"
    And User enters Password "<Password>"
    And Clicks on LogIn Button
    Then User should be redirected to Landing Page "<Url>"
    And Selects "Mobile Number" Option from Search Dropdown
    And Enters "9356871941" into Search Input Box
    And Clicks on "PROCEED" Button
    Then User should be redirected to Dashboard Page "<Dashboard>"
    And Verify "Service request" Section is displayed in DashBoard Page
    And Verify Status in Service request Section in has relevant Colour Badge
#    And Verify "Closed" Status in Service request Section in "Red" Colour Badge
#    And Verify "In Progress" Status in Service request Section in "Yellow" Colour Badge

    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        | Links                                                               |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | Offers#Bureau Insights#Service Request#CTR#PII#EasyReward#3in1 Data |

  @pass @run
  Scenario Outline: To verify User is able to view Statuses in Relevant Colour Badges -New
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
    And Verify "Service request" Section is displayed in DashBoard Page
    And Verify Status in Service request Section in has relevant Colour Badge

#        And Verify "New" Status in Service request Section in "Blue" Colour Badge
#    And Verify "In Progress" Status in Service request Section in "Yellow" Colour Badge

    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        | Links                                                               |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | Offers#Bureau Insights#Service Request#CTR#PII#EasyReward#3in1 Data |

  @pass @run
  Scenario Outline: To verify User is able to redirect to relevant page when clicked on view all of Service request
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
    And User Clicks on "View All" Button of "Service request" Section
    Then Verify Customer redirected to "https://customer360uat.bajajfinserv.in/servicereqviewall" Url

    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        | Links                                                               |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | Offers#Bureau Insights#Service Request#CTR#PII#EasyReward#3in1 Data |


  @pass @run
  Scenario Outline: To verify User is able to view Content of Service request Page
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
    And User Clicks on "View All" Button of "Service request" Section
    Then Verify Customer redirected to "https://customer360uat.bajajfinserv.in/servicereqviewall" Url
    And Verify Content on Service Request Page

    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard |

  @pass @run
  Scenario Outline: To verify User is able to view Table Headers on Service Request Table - Service Request Page
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
    And User Clicks on "View All" Button of "Service request" Section
    Then Verify Customer redirected to "https://customer360uat.bajajfinserv.in/servicereqviewall" Url
    And Verify Headers are displayed for Service Request Section - Service Request Page

    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard |


  @pass @run
  Scenario Outline: To verify User is able to view Content on Service Request Table - Service Request Page
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
    And User Clicks on "View All" Button of "Service request" Section
    Then Verify Customer redirected to "https://customer360uat.bajajfinserv.in/servicereqviewall" Url
    And Verify Content on Service Request Table - Service Request Page

    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard |


  @pass @run
  Scenario Outline: To verify User is able to view Time Stamp on Service Request Table - Service Request Page
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
    And User Clicks on "View All" Button of "Service request" Section
    Then Verify Customer redirected to "https://customer360uat.bajajfinserv.in/servicereqviewall" Url
    And Verify Time Stamp for Date for Service Request Section - Service Request Page

    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard |


  @fail @run
  Scenario Outline: To verify User is able to view Time Stamp as Latest Order on Service Request Table - Service Request Page
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
    And User Clicks on "View All" Button of "Service request" Section
    Then Verify Customer redirected to "https://customer360uat.bajajfinserv.in/servicereqviewall" Url
    And Verify Time Stamp for Date in Latest Order for Service Request Table - Service Request Page

    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard |


  @pass @run
  Scenario Outline: To verify User is able to View Pages Field on Service Request Table - Service Request Page
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
    And User Clicks on "View All" Button of "Service request" Section
    Then Verify Customer redirected to "https://customer360uat.bajajfinserv.in/servicereqviewall" Url
    And Verify the Pages are displayed for Service Request Table - Service Request Page

    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard |

  @pass @run
  Scenario Outline: To verify User Clicks on Next Button in Service Request Table - Service Request Page
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
    And User Clicks on "View All" Button of "Service request" Section
    Then Verify Customer redirected to "https://customer360uat.bajajfinserv.in/servicereqviewall" Url
    And Verify When User Clicks on Next Button in Service Request Table - Service Request Page

    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard |

  @pass @run
  Scenario Outline: To verify User Searches through Request ID in Service Request Table - Service Request Page
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
    And User Clicks on "View All" Button of "Service request" Section
    Then Verify Customer redirected to "https://customer360uat.bajajfinserv.in/servicereqviewall" Url
    And Enters Request Id "SR00770607" in the Request Id Search Box
    Then The Requests should be filtered and Only the Specific Request "SR00770607" should be shown

    Examples:
      | Domain  | Username | Password | Url                                            | Dashboard                                        |
      | Partner | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard |





















