Feature:  Widgets

  @pass @run
  Scenario Outline: To verify User is able to view Widgets on Dashboard Page
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
      | Domain | Username | Password | Url                                            | Dashboard                                        | Links                                                               |
      | CC     | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | Offers#Bureau Insights#Service Request#CTR#PII#EasyReward#3in1 Data |

  @pass @run  ##Fail - Remove Commn Audit Trails Option
  Scenario Outline: To verify User is able to view Options under Widgets on Dashboard Page
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
    And Verify User is able to view the Options "<Options>" under Widgets Section

    Examples:
      | Domain | Username | Password | Url                                            | Dashboard                                        | Options                                                                                         |
      | CC     | 202432943  | Finserv@12345  | https://customer360uat.bajajfinserv.in/landing | https://customer360uat.bajajfinserv.in/dashboard | GST, Dedupe Linkage, Voucher Details, Demographic Details, Comm Audit Trail, Chat History, SICR |
