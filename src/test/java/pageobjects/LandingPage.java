package pageobjects;

import base.ApplicationKeywords;

public class LandingPage extends ApplicationKeywords {

    public static final String searchDropdown = "Search Dropdown#xpath=//div[@class='mobile-num-dropdown']//select";
    public static final String searchByInput = "Search By Input Box#xpath=//div[@class='mobile-num-input']//input";

    public static final String searchCustRadio = "Search Customer Radio Button#xpath=//input[@value='search']";
    public static final String blockCustRadio = "Block Customer Radio Button#xpath=//input[@value='block']";

    public static final String mobileNumInputCustBlocklist = "Mobile Number Input Box#xpath=//input[@id='mobileInput']";
    public static final String searchCustTable = "Search Customer Table#xpath=//div[contains(@class,'loandetails-contant')]//table[@class='emi-table']";

    public static final String mobileNumInputBlockCustBlocklist = "Mobile Number Input Box#xpath=//input[@id='mobile']";
    public static final String mobileNumInputBlocklistPage = "Mobile Number Input Box#xpath=//input[contains(@id,'mobile')]";
    public static final String originDropdownBlockCustBlocklist = "Origin Dropdown#xpath=//p[normalize-space(text())='Origin']/following-sibling::select";
    public static final String inputBoxBlockCustBlocklist = "Input Box#xpath=//p[normalize-space(text())='Input']/following-sibling::textarea";

    public static final String cust360Logo = "Customer 360 Logo#xpath=//a[@class='header-logo-icon']//img";
    public static final String userType = "User Type #xpath=//div[@class='username-box']//p";

    public void landingPageContents() {
        try {
            String topSection = "Top Section in Landing Page#xpath=//div[@class='customer-header']";
            String searchSection = "Search Section in Landing Page#xpath=//div[@class='search-div']";
            String upcomingLeft = "Left(Upcoming Features) Side of Landing Page#xpath=//div[@class='upcoming-feature-left']";
            String upcomingRight = "Right(Upcoming Features) Side of Landing Page#xpath=//div[@class='upcoming-feature-right']";
            String copyRight = "CopyRight Footer#xpath=//div[@class='copyright-footer']";

            verifyElementIsDisplayedOrNot(topSection);
            verifyElementIsDisplayedOrNot(searchSection);
            verifyElementIsDisplayedOrNot(upcomingLeft);
            verifyElementIsDisplayedOrNot(upcomingRight);
            verifyElementIsDisplayedAndGetText(copyRight);

        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at landing Page Contents " + e.getClass());
        }

    }

    public void topSectionContents() {
        try {
            String logo = "Customer 360 Logo#xpath=//a[@class='header-logo-icon']//img[contains(@src,'customer-360logo')]";
            String notifications = "Notification#xpath=//div[@class='d-flex']";
            String userProfile = "User Profile Details#xpath=//div[@class='user-profile-detailsbox']";
            String userName = "User Name#xpath=//div[@class='username-box']//h3";
            String userRole = "User Role#xpath=//div[@class='username-box']//p";
            String userLogo = "User Profile Logo#xpath=//div[@class='user-profile-detailsbox']//img[@class='user-profile-icon']";
            String userLogoArrow = "User Profile Arrow#xpath=//div[@class='user-profile-detailsbox']//img[@class='profile-arrow-icon']";

            verifyElementIsDisplayedOrNot(logo);
            verifyFieldsUsingCommonXpathAndMultipleTextWithHash("//ul[@class='navbar-ul']//li//a", "Home#Bajaj Pay#Loan Journey#Customer Blocklist", "");
            verifyElementIsDisplayedOrNot(notifications);
            verifyElementIsDisplayedOrNot(userProfile);
            verifyElementIsDisplayedAndGetText(userName);
            verifyElementIsDisplayedAndGetText(userRole);
            verifyElementIsDisplayedOrNot(userLogo);
            verifyElementIsDisplayedOrNot(userLogoArrow);

        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at top Section Contents " + e.getClass());
        }

    }

    public void searchSectionContents() {
        try {
            String searchDropdown = "Search By Dropdown#xpath=//div[@class='mobile-num-dropdown']";
            String searchByDropdownLogo = "Search By Input Box Logo#xpath=//div[@class='mobile-num-dropdown']//img[contains(@src,'search.svg')]";
            String searchByInput = "Search By Input Box#xpath=//div[@class='mobile-num-input']";
            String proceedButton = "Proceed Button in Search#xpath=//div[@class='proceed-div']";
            String proceedButtonArrow = "Proceed Button Arrow in Search#xpath=//div[@class='proceed-div']//button//img";

            verifyFieldDisplayedUsingTagAndText("h6", "Search Customer by", "");
            verifyElementIsDisplayedOrNot(searchDropdown);
            verifyElementIsDisplayedOrNot(searchByDropdownLogo);
            verifyElementIsDisplayedOrNot(searchByInput);
            verifyElementIsDisplayedOrNot(proceedButton);
            verifyElementIsDisplayedOrNot(proceedButtonArrow);

        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at Search Section Contents " + e.getClass());
        }

    }

    public void verifySearchCustomerTableCustBlocklist(String tableHeaders, String extra) {

        try {
            //      //div[contains(@class,'loandetails-contant')]//table[@class='emi-table']
            String table = "Search Customer Table #xpath=//div/descendant::table[@class='emi-table']";
            verifyElementIsDisplayedOrNot(table);
            verifyFieldsPresentUsingCommonXpathAndMultipleTextWithHash("//div/descendant::table[@class='emi-table']//th", tableHeaders, "");

            String noRecords = "No Records #xpath=//div/descendant::table[@class='emi-table']//td[normalize-space(text())='No Records Found']|//div/descendant::table[@class='emi-table']//td[normalize-space(text())='No records found']";

            String rows = "Rows #xpath=//div/descendant::table[@class='emi-table']//tr";
            String columns = "Columns #xpath=//div/descendant::table[@class='emi-table']//tr//th";
            int count = sizeOfLocator(rows);
            int columnCount = sizeOfLocator(columns);
            if (isElementDisplayed(noRecords)) {
                testStepFailed("No Records Displayed. UPDATE TEST DATA");
            } else {
                for (int i = 1; i < count; i++) {
                    for (int j = 1; j <= columnCount; j++) {
                        String header = " Header #xpath=//div/descendant::table[@class='emi-table']//th[" + j + "]";
                        String headertext = getTextPresent(header);
                        String label = "Row " + (i) + " : " + headertext + ": #xpath=//div/descendant::table[@class='emi-table']//tr[" + i + "]//td[" + j + "]";
                        verifyElementIsPresentAndGetText(label);
                    }

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed verify Search Customer Table Cust Blocklist" + e.getClass());
        }
    }

    public void verifyblockCustomerReset(String extra) {
        try {
            String value = getAttributeValue(mobileNumInputBlockCustBlocklist);
            if (value.isEmpty()) {
                testStepPassed("Page has been successfully Refreshed on click of Reset Button");
            } else {
                testStepFailed("Page is not Refreshed");
            }

        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed verify block Customer Reset" + e.getClass());

        }
    }

}
