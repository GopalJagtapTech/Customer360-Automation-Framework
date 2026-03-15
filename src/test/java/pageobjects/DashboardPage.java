package pageobjects;

import base.ApplicationKeywords;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class DashboardPage extends ApplicationKeywords {

    ////Xpaths
    public static final String personalInfo = "Personal Info Section#xpath=//app-personalinfo";
    public static final String appService = "App Service Section#xpath=//app-servicesegment";
    public static final String quickLinks = "Quick Link Section#xpath=//app-quicklinks";
    public static final String relationsTabs = "Relation Tabs#xpath=//div[@class='relation-tabs']";
    public static final String relationsTiles = "Relation Tiles#xpath=//div[contains(@class,'tab-info-card')]";
    public static final String languageDropdown = "Language Dropdown#xpath=//select[@id='dropdown']";
    public static final String languageDropdownCross = "Language Dropdown Cross#xpath=//a//img[contains(@src,'icons-cross')]";
    public static final String popupCross = "Pop Up Cross#xpath=//a//img[contains(@src,'icons-cross')]";

    public static final String relationsTilesSection = "Relation Tiles Section#xpath=//div[contains(@class,'tabs-div')]";

    public static final String yesSMSPop = "Yes in SMS Pop#xpath=//p[normalize-space(text())='YES']/parent::a";
    public static final String noSMSPop = "No in SMS Pop#xpath=//p[normalize-space(text())='NO']/parent::a/..";
    public static final String noSMSPopUp = "No in SMS Pop#xpath=//p[normalize-space(text())='NO']/parent::a";
    public static final String successToast = "Green Success Toast#xpath=//div[@id='toast-container']";
    public static final String notificationPop = "Notification Pop#xpath=//h2[normalize-space(text())='Notifications']";
    public static final String commnTrailsTable = "Communication Trails Table#xpath=//table[@class='communication-table']";
    public static final String serviceReqTable = "Service Request Table#xpath=//table[@class='communication-table disposition-table']";

    public static final String auditTrailsTable = "Communication Trails Table#xpath=//div[@class='audit-trails-mainbox']";
    public static final String sentDateFilter = "Sent Date Filter#xpath=//div[@class='send-date-box'][1]";
    public static final String sentDateInputBox = "Sent Date Input#xpath=//input[@formcontrolname='selectedDate']";
    public static final String filterBy = "Filter By#xpath=//div[@class='send-date-box'][2]";
    public static final String custPortfolioSection = "Customer Portfolio Section#xpath=//div[@class='customer-portfolio-section']";
    public static final String notDownlddAppStatus = "Bajaj Finserv App Status - Not Downloaded#xpath=//li//p[normalize-space(text())='Bajaj Finserv App Status']/following-sibling::strong[normalize-space(text())='Not Downloaded']//a//img";
    public static final String notDownlddToast = "Bajaj Finserv App Status - Not Downloaded Toast Msg#xpath=//div[contains(@class,'toast-success')]";

    public static final String searchIconDashboard = "Search Icon - Dashboard Page#xpath=//button[@class='search-button']//img";
    public static final String searchIconZeroCountDashboard = "Disabled Search Icon - Dashboard Page#xpath=//button[@class='search-button zerocount']//img";
    public static final String searchInputRelationsOverview = "Search Input Box - Dashboard Page#xpath=//input[contains(@class,'search-input')]";
    public static final String reqIdInputBox = "Request ID Input Box#xpath=//input[@class='send-date-input']";
    public static final String servReqTable = "Service Request Table#xpath=//div[@class='audit-tbl-box']";
    public static final String financialDropdown = "Financial Year Dropdown#xpath=//select[@formcontrolname='yearSelect']";

    public static final String dob = "Date of Birth#xpath=//div[@class='additional-info']//li//p[normalize-space(text())='DOB:']/following-sibling::strong";
    public static final String pan = "PAN#xpath=//div[@class='additional-info']//li//p[normalize-space(text())='PAN:']/following-sibling::strong";
    public static final String mob = "Mobile Number#xpath=//div[@class='additional-info']//li//p[normalize-space(text())='Mobile No:']/following-sibling::strong";
    public static final String email = "Email ID#xpath=//div[@class='additional-info']//li//p[normalize-space(text())='Email ID:']/following-sibling::strong";
    public static final String address = "Address#xpath=//div[@class='additional-info']//li//p[normalize-space(text())='Address:']/following-sibling::strong";

    public static final String totalPos = "Total POS#xpath=//div[@class='ppc-contant-box']//p[normalize-space(text())='Total POS']/following-sibling::h3";
    public static final String bounceCountButton = "Bounce Count Button#xpath=//div[@class='ppc-contant-box']//p[normalize-space(text())='Bounce count']/following-sibling::h3//a";
    public static final String bounceMonthPopupSOA = "Bounce Months Popup#xpath=//div[@class='tooltip']";
    public static final String bounceCountSOA = "Bounce Count#xpath=(//table[@class='emi-table']//tr//td[10]//a)[1]";
    public static final String bajajPay = "Bajaj Pay Section#xpath=//div[@class='bajaj-pay-wrapper']";

    public static final String loanInsightsButton = "Loan Insights Button #xpath=//div[@class='loan-insightbox']//a[normalize-space(text())='Insights']";
    public static final String loanInsightsDropdown = "Loan Insights Dropdown #xpath=//div[@class='loaninsights-dropdown']";
    public static final String loanInsightsClose = "Loan Insights Close Button #xpath=//a[@class='loan-insights-close']";
    public static final String infoLast5Emi = "Info Icon for Last 5 Emi Status #xpath=//a[@class='emi-label-info']//img";

    public static final String creditFacilitystatus = "Credit Facility Status: #xpath=//div[@class='ppc-contant-box']//p[normalize-space(text())='credit Facility status']/following-sibling::h3";
    public static final String custIdDropAppDetailsUnderwrit = "Cust Id Dropdown- Applicant Details #xpath=//select[contains(@class,'custom')]";
    public static final String indCorpFlagAppDetailsUnderwrit = "Applicant Details - Individual Corporate Flag #xpath=//h6[normalize-space(text())='Applicant Details']/ancestor::div[@class='info-card']//li//p[normalize-space(text())='Individual Corporate Flag']/following-sibling::strong";
    public static final String liveTradeline = "Live Tradeline Table #xpath=//div[@id='live-tradeline']//div[@class='emi-status-tablebox']";
    public static final String preselectTradeline = "Preselected Tradelines Overview #xpath=//a[normalize-space(text())='Tradelines Overview'][contains(@class,'bgfilled')]";
    public static final String userTypeDeceased = "User type #xpath=//p[@class='user-name']/following-sibling::strong";

    public static final String bajajPayOption = "Bajaj Pay Option On Landing Page #xpath=//a[text()='Bajaj Pay']";
    public static final String bpayDasboardUPI = "Bajaj Pay Dashboard Page UPI section #xpath=//div[@class='bajaj-pay-main-li']//p[normalize-space()='UPI']";
    public static final String bpaySubMenuNoDataAvailableMessage = "Bajaj Pay Sub Menu No Data Available Message #xpath=//div[contains(@class,'table')]//table//td[normalize-space(text())='No Data Available']";
    public static final String bpaySubMenuOptionTableMandateNameColumn = "Bajaj Pay Sub Menu Options Table Mandate Name Cloumn #xpath=//table[@class='emi-table']//tbody//tr[1]//td[2]";


    //////Methods
    public void dashBoardPageTopContents() {
        try {
            String topSection = "Top Section in Landing Page#xpath=//div[@class='customer-header']";
            String searchSection = "Search Section in Landing Page#xpath=//div[@class='search-div']";

            verifyElementIsDisplayedOrNot(topSection);
            verifyElementIsDisplayedOrNot(searchSection);

        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at dashBoard Page Top Contents " + e.getClass());
        }

    }

    public void personalInfoDashBoardPage() {
        try {
            String shortName = "User Short Name#xpath=//div[@class='profile-short-name']";
            String backGroundPersonal = "Personal Info Background Image#xpath=//img[@class='personal-bg']";
            String userName = "User Name#xpath=//p[@class='user-name']";
            String userId = "User ID#xpath=//p[@class='user-id']";
            String additionalInfoSection = "Additional Info Section#xpath=//div[@class='additional-info']";

            verifyFieldDisplayedUsingTagAndText("h6", "PERSONAL INFO", "");
            verifyElementIsDisplayedAndGetText(shortName);
            verifyElementIsDisplayedOrNot(backGroundPersonal);
            verifyElementIsDisplayedAndGetText(userName);
            verifyElementIsDisplayedAndGetText(userId);
            verifyElementIsDisplayedOrNot(additionalInfoSection);


        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at personal Info DashBoard Page " + e.getClass());
        }

    }

    public void personalInfoLabels() {
        try {

            verifyFieldDisplayedUsingTagAndText("h6", "PERSONAL INFO", "");

            verifyValueUsingLabel("//div[@class='additional-info']//li//p", "Gender:", "/following-sibling::strong", "");
            verifyValueUsingLabel("//div[@class='additional-info']//li//p", "DOB:", "/following-sibling::strong", "");
            verifyValueUsingLabel("//div[@class='additional-info']//li//p", "PAN:", "/following-sibling::strong", "");
            verifyValueUsingLabel("//div[@class='additional-info']//li//p", "Mobile No:", "/following-sibling::strong", "");
            verifyValueUsingLabel("//div[@class='additional-info']//li//p", "Marital Status:", "/following-sibling::strong", "");
            verifyValueUsingLabel("//div[@class='additional-info']//li//p", "Email ID:", "/following-sibling::strong", "");
            verifyValueUsingLabel("//div[@class='additional-info']//li//p", "Address:", "/following-sibling::strong", "");

        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at personal Info Labels " + e.getClass());
        }

    }

    public void serviceSegmentSectionDashboardPage() {
        try {

            verifyFieldDisplayedUsingTagAndText("h6", "SERVICE SEGMENT", "");

            verifyValueUsingLabel("//div[@class='service-div']//li//p", "Block Status", "/following-sibling::strong", "");
            verifyValueUsingLabel("//div[@class='service-div']//li//p", "Service Segment", "/following-sibling::strong", "");
            verifyValueUsingLabel("//div[@class='service-div']//li//p", "Bajaj Finserv App Status", "/following-sibling::strong", "");
            verifyValueUsingLabel("//div[@class='service-div']//li//p", "Preferred Language", "/following-sibling::strong", "");
            verifyValueUsingLabel("//div[@class='service-div']//li//p", "KYC Renewal Date", "/following-sibling::strong", "");
            verifyValueUsingLabel("//div[@class='service-div']//li//p", "Mandate Status", "/following-sibling::a//strong", "");
            verifyValueUsingLabel("//div[@class='service-div']//li//p", "Account Aggregator Consent", "/following-sibling::strong", "");
            verifyValueUsingLabel("//div[@class='service-div']//li//p", "BBPS | WALLET | UPI Status", "/following-sibling::strong", "");

        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at service Segment Section DashboardPage " + e.getClass());
        }

    }

    public void serviceSegmentSectionBajajPayPage() {
        try {

            verifyFieldDisplayedUsingTagAndText("h6", "SERVICE SEGMENT", "");

            verifyValueUsingLabel("//div[@class='service-div']//li//p", "Service Segment", "/following-sibling::strong", "");
            verifyValueUsingLabel("//div[@class='service-div']//li//p", "Bajaj Finserv App Status", "/following-sibling::strong", "");
            verifyValueUsingLabel("//div[@class='service-div']//li//p", "Preferred Language", "/following-sibling::strong", "");
            verifyValueUsingLabel("//div[@class='service-div']//li//p", "KYC Flag | Type", "/following-sibling::strong", "");
            verifyValueUsingLabel("//div[@class='service-div']//li//p", "DNC Status", "/following-sibling::strong", "");
            verifyValueUsingLabel("//div[@class='service-div']//li//p", "Type", "/following-sibling::strong", "");
            verifyValueUsingLabel("//div[@class='service-div']//li//p", "BBPS | WALLET | UPI Status", "/following-sibling::strong", "");

        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at service Segment Section Bajaj Pay Page " + e.getClass());
        }

    }


    public void verifyDOBMasked(String extra) {
        try {
            verifyValueUsingLabel("//div[@class='additional-info']//li//p", "DOB:", "/following-sibling::strong", "");
            String value = getTextPresent(dob);
            if (value.equalsIgnoreCase("NA")) {
                testStepFailed("Need New Test Data. DOB Unavailable");
            } else {
                String[] split = value.split("-");
                String date = split[0];
                String month = split[1];
                String year = split[2];
                for (int i = 0; i < date.length(); i++) {
                    char a;
                    a = date.charAt(i);
                    String b = String.valueOf(a);
                    if (b.equals("X")) {
                        testStepPassed("Date at Character " + i + " is Masked Successfully");
                    } else {
                        testStepFailed("Date at Character " + i + " is not Masked");
                    }
                }

                for (int i = 0; i < month.length(); i++) {
                    char a;
                    a = month.charAt(i);
                    String b = String.valueOf(a);
                    if (b.equals("X")) {
                        testStepPassed("Month at Character " + i + " is Masked Successfully");
                    } else {
                        testStepFailed("Month at Character " + i + " is not Masked");
                    }
                }

                for (int i = 0; i < year.length(); i++) {
                    char a;
                    a = year.charAt(i);
                    String b = String.valueOf(a);
                    if (!b.equals("X")) {
                        testStepPassed("Year at Character " + i + " is Not Masked Verified");
                    } else {
                        testStepFailed("Year at Character " + i + " is Masked");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify DOB Masked " + e.getClass());
        }

    }

    public void verifyPanMasked(String extra) {
        try {
            verifyValueUsingLabel("//div[@class='additional-info']//li//p", "PAN:", "/following-sibling::strong", "");
            String value = getTextPresent(pan);
            if (value.equalsIgnoreCase("NA")) {
                testStepFailed("Need New Test Data. PAN Unavailable");
            } else {

                verifyMaskedAndUnmaskedFormatUsingValue(value, "PAN", "X", 0, 4, true, "0");
                verifyMaskedAndUnmaskedFormatUsingValue(value, "PAN", "X", 6, 4, false, "1");
            }
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify Pan Masked " + e.getClass());
        }

    }

    public void verifyMobileMasked(String extra) {
        try {
            verifyValueUsingLabel("//div[@class='additional-info']//li//p", "Mobile No:", "/following-sibling::strong", "");
            String value = getTextPresent(mob);
            if (value.equalsIgnoreCase("NA")) {
                testStepFailed("Need New Test Data. Mobile Number Unavailable");
            } else {

                verifyMaskedAndUnmaskedFormatUsingValue(value, "Mobile No:", "X", 0, 4, true, "0");
                verifyMaskedAndUnmaskedFormatUsingValue(value, "Mobile No:", "X", 6, 4, false, "1");
            }
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify Mobile Masked " + e.getClass());
        }

    }

    public void verifyEmailIdMasked(String extra) {
        try {
            verifyValueUsingLabel("//div[@class='additional-info']//li//p", "Email ID:", "/following-sibling::strong", "");
            String value = getTextPresent(email);
            if (value.equalsIgnoreCase("NA")) {
                testStepFailed("Need New Test Data. Email Id Unavailable");
            } else {

                String mail = value.split("@")[0];
                verifyMaskedAndUnmaskedFormatUsingValue(mail, "Email ID", "X", 1, 1, true, "0");
            }
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify Email Id Masked " + e.getClass());
        }

    }

    public void verifyAddressMasked(String extra) {
        try {
            verifyValueUsingLabel("//div[@class='additional-info']//li//p", "Address:", "/following-sibling::strong", "");
            String value = getTextPresent(address);
            if (value.equalsIgnoreCase("NA")) {
                testStepFailed("Need New Test Data. Address Unavailable");
            } else {

                String[] words = value.split(" ");
                int num = words.length;
                String unmasked1 = words[num - 1] + words[num - 2] + words[num - 3];
                String masked1 = "";
                for (int i = 0; i < num - 3; i++) {
                    masked1 = masked1 + words[i];
                }

                for (int i = 0; i < masked1.length(); i++) {
                    char a;
                    a = masked1.charAt(i);
                    String b = String.valueOf(a);
                    if (b.equals("X") || b.equals("x")) {
                        testStepPassed("Address at Character " + i + " is Masked Verified Successfully");
                    } else {
                        testStepFailed("Address at Character " + i + " is Not Masked");
                    }
                }

                for (int i = 0; i < unmasked1.length(); i++) {
                    char a;
                    a = unmasked1.charAt(i);
                    String b = String.valueOf(a);
                    if (!(b.equals("X")) && !(b.equals("x"))) {
                        testStepPassed("Address at Character " + i + " is Not Masked Verified ");
                    } else {
                        testStepFailed("Address at Character " + i + " is Masked");
                    }
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify Address Masked " + e.getClass());
        }

    }


    public void verifyBajajFinservStatus(String status, String extra) {
        try {

            String appStatus = "App Status#xpath=//div[@class='service-div']//li//p[normalize-space(text())='Bajaj Finserv App Status']/following-sibling::strong";
            verifyValueUsingLabel("//div[@class='service-div']//li//p", "Bajaj Finserv App Status", "/following-sibling::strong", "");
            String value = getTextPresent(appStatus);
            if (status.equalsIgnoreCase("Not Downloaded")) {
                verifyLocatorColorUsingCssValue(appStatus, "#ff0000", "Red", "color");
            }

            if (status.equalsIgnoreCase("Downloaded")) {
                verifyLocatorColorUsingCssValue(appStatus, "#ff0000", "Green", "color");
            }


        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify Bajaj Finserv Status " + e.getClass());
        }

    }

    public void verifyMandateStatus(String status, String extra) {
        try {

            String appStatus = "Mandate Status#xpath=//div[@class='service-div']//li//p[normalize-space(text())='Mandate Status']/following-sibling::a//strong";
            verifyValueUsingLabel("//div[@class='service-div']//li//p", "Mandate Status", "/following-sibling::a//strong", "");
//            String value = getTextPresent(status);
            verifyElementIsDisplayedAndGetText(appStatus);
            if (status.equalsIgnoreCase("Rejected")) {
                verifyLocatorColorUsingCssValue(appStatus, "#ff0000", "Red", "color");
            }

            if (status.equalsIgnoreCase("Accepted")) {
                verifyLocatorColorUsingCssValue(appStatus, "#008000", "Green", "color");
            }


        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify Mandate Status " + e.getClass());
        }

    }

    public void verifyLoanDetailsDashboardPage(String tileType, int tile, String extra) {
        try {

            String relationsTiles = "Relation Tabs#xpath=//div[contains(@class,'tab-info-card blue')]";
            verifyElementAndPrintSize(relationsTiles, "");

            String tileLogo = "" + tileType + " Tile Logo: " + tile + " : #xpath=(//div[contains(@class,'tab-info-card blue')]//div[contains(@class,'tab-info')]//img)[" + tile + "]";
            String tileTitle = "" + tileType + " Tile Name: " + tile + " : #xpath=(//div[contains(@class,'tab-info-card blue')]//div[contains(@class,'tab-info-text')]//p[contains(@class,'tab-card-title')])[" + tile + "]";
            String tileNumber = "" + tileType + " Tile Number: " + tile + " : #xpath=(//div[contains(@class,'tab-info-card blue')]//div[contains(@class,'tab-info-text')]//h5)[" + tile + "]";
            String tileCustId = "" + tileType + " Tile Customer ID: " + tile + " : #xpath=(//div[contains(@class,'tab-info-card blue')]//div[contains(@class,'tab-info-text')]//p[contains(@class,'tab-card-cust-id')])[" + tile + "]";

            String tileType1 = "" + tileType + " Tile Type: " + tile + " : #xpath=(//div[contains(@class,'tab-info-card blue')]//div[contains(@class,'status-div')]//p[contains(@class,'color-name')])[" + tile + "]";
            String tileStatus = "" + tileType + " Tile Status: " + tile + " : #xpath=(//div[contains(@class,'tab-info-card blue')]//div[contains(@class,'status-div')]//p[contains(@class,'status-info')])[" + tile + "]";
            String tileDownloadLink = "" + tileType + " Tile Download Link Text : " + tile + " : #xpath=(//div[contains(@class,'tab-info-card blue')]//div[contains(@class,'documents-div')]//p[normalize-space(text())='Download link for the document'])[" + tile + "]";
            String tileDocs = "" + tileType + " Tile Documents : " + tile + " : #xpath=((//div[contains(@class,'tab-info-card blue')])[" + tile + "]//div[contains(@class,'document_div')]//p)";

            String tileGetDetailsBtn = "" + tileType + " Tile : " + tile + " Get Details ButtonButton: #xpath=(//div[contains(@class,'tab-info-card blue')]//button[contains(@class,'get-details-btn')])[" + tile + "]";

            verifyElementIsDisplayedOrNot(tileLogo);
            verifyElementIsDisplayedAndGetText(tileTitle);
            verifyElementIsDisplayedAndGetText(tileNumber);
            verifyElementIsDisplayedAndGetText(tileCustId);
            verifyElementIsDisplayedAndGetText(tileType1);
            verifyElementIsDisplayedAndGetText(tileStatus);


            verifyValueUsingLabelUsingIteration("//div[contains(@class,'tab-info-card blue')]//div[contains(@class,'amount-info-part')]//div[@class='label']", "Loan Amount", "/following-sibling::div[@class='value']", tile, "");
            verifyValueUsingLabelUsingIteration("//div[contains(@class,'tab-info-card blue')]//div[contains(@class,'amount-info-part')]//div[@class='label']", "EMI Amount", "/following-sibling::div[@class='value']", tile, "");
            verifyValueUsingLabelUsingIteration("//div[contains(@class,'tab-info-card blue')]//div[contains(@class,'amount-info-part')]//div[@class='label']", "Total Overdue", "/following-sibling::div[@class='value']", tile, "");
            verifyValueUsingLabelUsingIteration("//div[contains(@class,'tab-info-card blue')]//div[contains(@class,'amount-info-part')]//div[contains(@class,'label')]", "Next EMI Due Date", "/following-sibling::div[contains(@class,'value')]", tile, "");
            verifyValueUsingLabelUsingIteration("//div[contains(@class,'tab-info-card blue')]//div[contains(@class,'amount-info-part')]//div[@class='label']", "POS", "/following-sibling::div[@class='value']", tile, "");
            verifyValueUsingLabelUsingIteration("//div[contains(@class,'tab-info-card blue')]//div[contains(@class,'amount-info-part')]//div[@class='label']", "Disbursement Date", "/following-sibling::div[@class='value']", tile, "");


            verifyElementIsDisplayedAndGetText(tileDownloadLink);
            verifyElementAndPrintSize(tileDocs, "");
            int docs = sizeOfLocator(tileDocs);
            for (int i = 1; i <= docs; i++) {
                String tileDocsRectangle = "" + tileType + " Tile Documents  : " + tile + " - Rectangle for Doc " + i + " : #xpath=((//div[contains(@class,'tab-info-card blue')])[" + tile + "]//a[contains(@class,'download-document')])[" + i + "]";
                String tileDocsName = "" + tileType + " Tile Documents  : " + tile + " - Name for Doc " + i + " : #xpath=((//div[contains(@class,'tab-info-card blue')])[" + tile + "]//div[contains(@class,'documents')]//p)[" + i + "]";
                String tileDocsLogo = "" + tileType + " Tile : " + tile + " - Logo for Doc " + i + " : #xpath=((//div[contains(@class,'tab-info-card blue')])[" + tile + "]//div[contains(@class,'documents')]//img)[" + i + "]";


                if (!isElementDisplayed(tileDocsRectangle)) {
                    String dots = "#xpath=(//div[@class='owl-dot ng-star-inserted']//span)";
                    int size = sizeOfLocator(dots);
                    for (int j = 2; j <= size; j++) {
                        String inddots = "#xpath=(//div[@class='owl-dot ng-star-inserted']//span)[" + j + "]";
                        if (!isElementDisplayed(tileDocsRectangle)) {
                            clickOn(inddots);
                            waitTime(2);
                        }
                    }

                    verifyElementIsDisplayedOrNot(tileDocsRectangle);
                    verifyElementIsDisplayedAndGetText(tileDocsName);
                    verifyElementIsDisplayedOrNot(tileDocsLogo);
                } else {
                    verifyElementIsDisplayedOrNot(tileDocsRectangle);
                    verifyElementIsDisplayedAndGetText(tileDocsName);
                    verifyElementIsDisplayedOrNot(tileDocsLogo);

                }


            }

            verifyElementIsDisplayedAndGetText(tileGetDetailsBtn);
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify Loan Details Dashboard Page " + e.getClass());
        }

    }

    public void verifyLoanDetailsFromApi(int tile, String extra) {
        try {

            String relationsTiles = "Relation Tabs#xpath=//div[contains(@class,'tab-info-card blue')]";
            verifyElementAndPrintSize(relationsTiles, "");


            verifyValueUsingLabelUsingIteration("//div[contains(@class,'tab-info-card blue')]//div[contains(@class,'amount-info-part')]//div[@class='label']", "Loan Amount", "/following-sibling::div[@class='value']", tile, "");
            verifyValueUsingLabelUsingIteration("//div[contains(@class,'tab-info-card blue')]//div[contains(@class,'amount-info-part')]//div[@class='label']", "EMI Amount", "/following-sibling::div[@class='value']", tile, "");
            verifyValueUsingLabelUsingIteration("//div[contains(@class,'tab-info-card blue')]//div[contains(@class,'amount-info-part')]//div[@class='label']", "Total Overdue", "/following-sibling::div[@class='value']", tile, "");
            verifyValueUsingLabelUsingIteration("//div[contains(@class,'tab-info-card blue')]//div[contains(@class,'amount-info-part')]//div[@class='label']", "Next EMI Due Date", "/following-sibling::div[@class='value']", tile, "");
            verifyValueUsingLabelUsingIteration("//div[contains(@class,'tab-info-card blue')]//div[contains(@class,'amount-info-part')]//div[@class='label']", "POS", "/following-sibling::div[@class='value']", tile, "");
            verifyValueUsingLabelUsingIteration("//div[contains(@class,'tab-info-card blue')]//div[contains(@class,'amount-info-part')]//div[@class='label']", "Disbursement Date", "/following-sibling::div[@class='value']", tile, "");


        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify Loan Details From Api " + e.getClass());
        }

    }

    public void verifyDocuments(String doc, String extra) {
        try {

            String title = "Title: #xpath=//h2[@class='verification-title' and normalize-space(text())='" + doc.trim() + " Download via']";
            String smsTitle = "Title for SMS Card #xpath=//h2[normalize-space(text())='" + doc.trim() + " Download via']/parent::div//a//p[normalize-space(text())='SMS']";
            String pdfTitle = "Title for PDF Card #xpath=//h2[normalize-space(text())='" + doc.trim() + " Download via']/parent::div//a//p[normalize-space(text())='PDF']";
            String smsLogo = "Logo for SMS Card #xpath=//h2[normalize-space(text())='" + doc.trim() + " Download via']/parent::div//a//img[contains(@src,'email.png')]";
            String pdfLogo = "Logo for PDF Card #xpath=//h2[normalize-space(text())='" + doc.trim() + " Download via']/parent::div//a//img[contains(@src,'pdf.svg')]";
            verifyElementIsDisplayedAndGetText(title);
            verifyElementIsDisplayedAndGetText(smsTitle);
            verifyElementIsDisplayedOrNot(smsLogo);
            verifyElementIsDisplayedAndGetText(pdfTitle);
            verifyElementIsDisplayedOrNot(pdfLogo);

        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify Documents " + e.getClass());
        }

    }

    public void clickDocsInTile(String tile, String doc, String extra) {
        try {

            String document = "Tile No: " + tile + " Doc: " + doc + " #xpath=//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card blue')]//a[contains(@class,'download-document')]//p[normalize-space(text())='" + doc.trim() + "']/preceding-sibling::img|//h5[contains(text(),'" + tile.trim() + "')]/ancestor::div[contains(@class,'tab-info-card blue')]//a[contains(@class,'download-document')]//p[normalize-space(text())='" + doc.trim() + "']/preceding-sibling::img";
            scrollToWebElementIfPresent(document);
            String dots = "#xpath=(//div[@class='owl-dot ng-star-inserted']//span)";
            int size = sizeOfLocator(dots);
            for (int i = 2; i <= 4; i++) {
                String inddots = "#xpath=(//div[@class='owl-dot ng-star-inserted']//span)[" + i + "]";
                if (!isElementDisplayed(document)) {
                    clickOn(inddots);
                    waitTime(2);
                } else {
                    clickUsingMouse(document);
                    waitTime(2);
                    break;

                }
            }
//            clickOn(document);
//            waitTime(4);
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at click Docs In Tile " + e.getClass());
        }

    }

    public void clickFilesInDocPopup(String doc, String file, String extra) {
        try {

            String pdfLogo = "Logo for PDF Card #xpath=//h2[normalize-space(text())='" + doc.trim() + " Download via']/parent::div//p[normalize-space(text())='" + file.trim() + "']/preceding-sibling::img";
            clickOn(pdfLogo);
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at click Docs In Tile " + e.getClass());
        }

    }

    public void verifyActiveBadge(String expected, String relation, String extra) {
        try {

            String active = "" + expected + " Badge #xpath=//h5[normalize-space(text())='" + relation.trim() + "']/ancestor::div[@class='header-part']/descendant::p[contains(@class,'status-info active')]";
            verifyElementIsDisplayedAndGetText(active);
            verifyGetTextUsingLocatorAndCompareWithText(active, expected, "");

            verifyLocatorColorUsingCssValue(active, "#02c444", "Green", "background-color");

        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify Active Badge " + e.getClass());
        }

    }

    public void verifyClosedBadge(String expected, String relation, String extra) {
        try {

            String closed = "" + expected + " Badge #xpath=//h5[normalize-space(text())='" + relation.trim() + "']/ancestor::div[@class='header-part']/descendant::p[contains(@class,'status-info closed')]";
            verifyElementIsDisplayedAndGetText(closed);
            verifyGetTextUsingLocatorAndCompareWithText(closed, expected, "");
            verifyLocatorColorUsingCssValue(closed, "#fe2323", "Red", "background-color");

        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify Closed Badge " + e.getClass());
        }

    }

    public void verifyFCDocDisplayed(String relation, String doc, String extra) {
        try {

            String document = "Document: #xpath=//h5[normalize-space(text())='" + relation + "']/../../..//following-sibling::p[normalize-space(text())='ACTIVE']/ancestor::div[contains(@class,'tab-info-card blue')]/descendant::div[contains(@class,'documents')]//p[normalize-space(text())='" + doc.trim() + "']|//h5[normalize-space(text())='" + relation.trim() + "']/../../..//following-sibling::p/ancestor::div[contains(@class,'tab')]/descendant::div[contains(@class,'documents')]//p[normalize-space(text())='" + doc.trim() + "']";
            verifyElementIsDisplayedOrNot(document);
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify FC Doc Displayed " + e.getClass());
        }

    }

    public void verifyNDCDocDisplayed(String relation, String doc, String extra) {
        try {

            String document = "Document: #xpath=//h5[normalize-space(text())='" + relation + "']/../../..//following-sibling::p[normalize-space(text())='CLOSED']/ancestor::div[contains(@class,'tab-info-card blue')]/descendant::div[contains(@class,'documents')]//p[normalize-space(text())='" + doc.trim() + "']";
            verifyElementIsDisplayedOrNot(document);

        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify NDC Doc Displayed " + e.getClass());
        }

    }


    public void disbursementDates(String format, String extra) {
        try {

            String disburse = "Disbursement Dates - Tiles #xpath=(//div[contains(@class,'tab-info-card blue')]//div[contains(@class,'amount-info-part')]//div[@class='label'][normalize-space(text())='Disbursement Date']/following-sibling::div[@class='value'])";
            String active = "Active - Relations #xpath=(//div[@class='header-part']/descendant::p[contains(@class,'status-info') and normalize-space(text())='ACTIVE'])";
            String next = "Relation Tiles Next Button #xpath=(//div[@class='owl-next'])";

            verifyElementAndPrintSize(active, "");
            int tiles = sizeOfLocator(active);
            for (int i = 1; i < tiles; i++) {
                for (int j = i + 1; j <= i + 1; j++) {

                    String relation1 = "Tile -" + i + " #xpath=(//div[contains(@class,'tab-info-card blue')]//div[contains(@class,'amount-info-part')]//div[@class='label'][normalize-space(text())='Disbursement Date']/following-sibling::div[@class='value'])[" + i + "]";
                    String relation2 = "Tile -" + j + "  #xpath=(//div[contains(@class,'tab-info-card blue')]//div[contains(@class,'amount-info-part')]//div[@class='label'][normalize-space(text())='Disbursement Date']/following-sibling::div[@class='value'])[" + j + "]";

                    String label1 = "Relation Tile 1 #xpath=(//div[@class='header-part']/descendant::p[contains(@class,'status-info')])[1]";
                    String label2 = "Relation Tile 1 #xpath=(//div[@class='header-part']/descendant::p[contains(@class,'status-info')])[2]";
                    String tile1 = getTextPresent(label1);
                    String tile2 = getTextPresent(label2);


                    if (!isElementDisplayed(relation2)) {
                        clickOnLocatorIfDisplayedUsingLocatorUsingForLoop(next);
                        waitTime(2);
                    }
                    String date1 = getTextPresent(relation1);
                    String date2 = getTextPresent(relation2);
                    DateFormat sdf = new SimpleDateFormat(format);
                    Date firstDate = sdf.parse(date1);
                    Date secondDate = sdf.parse(date2);
                    boolean after = compareDates(firstDate, secondDate, false);
                    if (after) {
                        testStepPassed("Relation No:" + i + " Disbursement Date: " + date1 + " is Latest than Relation No: " + j + " Disbursement Date:" + date2);
                    } else {
                        testStepFailed("Relation No:" + i + " Disbursement Date: " + date1 + " is Older than Relation No: " + j + " Disbursement Date:" + date2);

                    }

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at disbursement Dates " + e.getClass());
        }

    }


    public void verifyRelationsOrder(String relation, String extra) {
        try {

            String tiles = "Relation Tiles #xpath=//div[@class='header-part']/descendant::p[contains(@class,'status-info')]";
            String next = "Relation Tiles Next Button #xpath=(//div[@class='owl-next'])";
            int size = sizeOfLocator(tiles);
            if (relation.equalsIgnoreCase("Loans")) {
                if (size == 1) {
                    testStepFailed("Test Data Issue");
                }

                if (size == 2) {
                    testStepInfo("No of Relations: " + size);
                    String label1 = "Relation Tile 1 #xpath=(//div[@class='header-part']/descendant::p[contains(@class,'status-info')])[1]";
                    String label2 = "Relation Tile 1 #xpath=(//div[@class='header-part']/descendant::p[contains(@class,'status-info')])[2]";
                    String tile1 = getTextPresent(label1);
                    String tile2 = getTextPresent(label2);

                    if (tile1.equalsIgnoreCase("Active") && tile2.equalsIgnoreCase("CLOSED")) {
                        testStepPassed("Closed tile is being Displayed after Active tile");
                    } else if (tile1.equalsIgnoreCase("CLOSED") && tile2.equalsIgnoreCase("Active")) {
                        testStepFailed("Closed tile is being Displayed before Active tile");
                    } else {
                        testStepFailed("Test Data Issue");
                    }
                }
                ///////////////
                if (size > 2) {
                    testStepInfo("No of Relations: " + size);
                    for (int i = 1; i < size; i++) {
                        String label1 = "Relation Tile " + i + " #xpath=(//div[@class='header-part']/descendant::p[contains(@class,'status-info')])[" + i + "]";
                        String tile1 = getTextPresent(label1);
                        for (int j = i + 1; j <= i + 1; j++) {
                            String label2 = "Relation Tile " + j + " #xpath=(//div[@class='header-part']/descendant::p[contains(@class,'status-info')])[" + j + "]";
                            if (!isElementDisplayed(label2)) {
                                clickOnLocatorIfDisplayedUsingLocatorUsingForLoop(next);
                                waitTime(2);
                            }
                            String tile2 = getTextPresent(label2);
                            if (tile1.equalsIgnoreCase(tile2)) {
                                manualScreenshot("Both Relations are of Same type: Tile: " + i + " : " + tile1 + " and Tile: " + j + " : " + tile2);
                            } else if (tile1.equalsIgnoreCase("Active") && tile2.equalsIgnoreCase("CLOSED")) {
                                testStepPassed("Closed tile " + i + " is being Displayed after Active tile " + j + "");
                            } else if (tile1.equalsIgnoreCase("CLOSED") && tile2.equalsIgnoreCase("Active")) {
                                testStepFailed("Closed tile " + i + " is being Displayed before Active tile " + j + "");
                            }
                        }

                    }


                }
            }

            if (relation.equalsIgnoreCase("Fixed Deposits")) {
                if (size == 1) {
                    testStepFailed("Test Data Issue");
                }

                if (size == 2) {
                    testStepInfo("No of Relations: " + size);
                    String label1 = "Relation Tile 1 #xpath=(//div[@class='header-part']/descendant::p[contains(@class,'status-info')])[1]";
                    String label2 = "Relation Tile 1 #xpath=(//div[@class='header-part']/descendant::p[contains(@class,'status-info')])[2]";
                    String tile1 = getTextPresent(label1);
                    String tile2 = getTextPresent(label2);

                    if (tile1.equalsIgnoreCase("OPEN") && tile2.equalsIgnoreCase("MATURED")) {
                        testStepPassed("MATURED tile is being Displayed after OPEN tile");
                    } else if (tile1.equalsIgnoreCase("MATURED") && tile2.equalsIgnoreCase("OPEN")) {
                        testStepFailed("MATURED tile is being Displayed before OPEN tile");
                    } else {
                        testStepFailed("Test Data Issue");
                    }
                }
                ///////////////
                if (size > 2) {
                    testStepInfo("No of Relations: " + size);
                    for (int i = 1; i < size; i++) {
                        String label1 = "Relation Tile " + i + " #xpath=(//div[@class='header-part']/descendant::p[contains(@class,'status-info')])[" + i + "]";
                        String tile1 = getTextPresent(label1);
                        for (int j = i + 1; j <= i + 1; j++) {
                            String label2 = "Relation Tile " + j + " #xpath=(//div[@class='header-part']/descendant::p[contains(@class,'status-info')])[" + j + "]";
                            if (!isElementDisplayed(label2)) {
                                clickOnLocatorIfDisplayedUsingLocatorUsingForLoop(next);
                                waitTime(2);
                            }
                            String tile2 = getTextPresent(label2);
                            if (tile1.equalsIgnoreCase(tile2)) {
                                manualScreenshot("Both Relations are of Same type: Tile: " + i + " : " + tile1 + " and Tile: " + j + " : " + tile2);
                            } else if (tile1.equalsIgnoreCase("OPEN") && tile2.equalsIgnoreCase("MATURED")) {
                                testStepPassed("MATURED tile " + i + " is being Displayed after OPEN tile " + j + "");
                            } else if (tile1.equalsIgnoreCase("MATURED") && tile2.equalsIgnoreCase("OPEN")) {
                                testStepFailed("MATURED tile " + i + " is being Displayed before OPEN tile " + j + "");
                            }
                        }

                    }


                }
            }


        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify Relations Order " + e.getClass());
        }

    }


    public void verifyAmountsSymbolRelationTile(String relation, String symbol, String label, String extra) {
        try {

            String value = "Label: " + label + " in " + relation + " Tile #xpath=//h5[normalize-space(text())='" + relation.trim() + "']/ancestor::div[contains(@class,'tab-info-card')]//div[contains(@class,'amount-info-part')]//div[@class='label'][normalize-space(text())='" + label.trim() + "']/following-sibling::div[@class='value']";
            verifyAmountsWithStartSymbols(value, symbol, "");
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify Amounts Symbol Relation Tile " + e.getClass());
        }

    }

    public void verifyDateFormatsRelationTile(String relation, String format, String label, String extra) {
        try {

            String value = "Label: " + label + " in " + relation + " Tile #xpath=//h5[normalize-space(text())='" + relation.trim() + "']/ancestor::div[contains(@class,'tab-info-card')]//div[contains(@class,'amount-info-part')]//div[@class='label'][normalize-space(text())='" + label.trim() + "']/following-sibling::div[@class='value']";
            String date = getTextPresent(value);
            if (date.equalsIgnoreCase("NA")) {
                testStepFailed("Test Data Issue: NA");
            } else {
                verifyDateFormatLocator(value, label, format, "");
            }

        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify Date Formats Relation Tile " + e.getClass());
        }

    }

    public void selectTabRelationsOverview(String tab, String extra) {
        try {

            String select = "Tab: " + tab + " in Relations Overview #xpath=//a[normalize-space(text())='" + tab.trim() + "']/parent::li";
            clickOn(select);
            waitTime(2);
            String tabActive = "Tab: " + tab + " Selected in Relations Overview #xpath=//a[normalize-space(text())='" + tab.trim() + "']/parent::li[contains(@class,'active')]";
            verifyElementIsDisplayedOrNot(tabActive);
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at select Tab Relations Overview" + e.getClass());
        }

    }

    public void tabCountForRelations(String tab, String extra) {
        try {

            String count = "Tab: " + tab + " in Relations Overview has Count: #xpath=//a[normalize-space(text())='" + tab.trim() + "']//span";
            verifyElementIsDisplayedAndGetText(count);
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at tab Count For Relations" + e.getClass());
        }

    }


    public void verifyCustomerIdMatch(String relation, String tileType, String extra) {
        try {

            String tileCustId = "" + tileType + " Tile: " + relation + " - Customer ID: #xpath=(//div[contains(@class,'tab-info-card')]//h5[normalize-space(text())='" + relation.trim() + "']/parent::div[contains(@class,'tab-info-text')]//p[contains(@class,'tab-card-cust-id')]//span)";
            String personalInfoCustId = " Personal Info - Customer ID: #xpath=(//p[@class='user-id']//span)[2]";
            scrollToWebElementIfPresent(personalInfoCustId);
            String text1 = getTextPresent(personalInfoCustId).trim();
            scrollToWebElementIfPresent(tileCustId);
            String text2 = getTextPresent(tileCustId).trim();

            if (text1.equalsIgnoreCase(text2)) {
                testStepPassed(getRefOfXpath(personalInfoCustId) + " : " + text1 + " and " + getRefOfXpath(tileCustId) + " : " + text2 + " are Same");
            } else {
                testStepFailed(getRefOfXpath(personalInfoCustId) + " : " + text1 + " and " + getRefOfXpath(tileCustId) + " : " + text2 + " are not Same");
            }

        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify Customer Id Match" + e.getClass());
        }

    }

    public void verifyIfNoRelationsPresent(String text, int count, String tab, String extra) {
        try {

            String notext = "Not Available Text: #xpath=(//div[@class='tab-info']//p)";
            verifyGetTextUsingLocatorAndCompareWithText(notext, text, "");
            String countTab = "Tab: " + tab + " in Relations Overview has Count: #xpath=//a[normalize-space(text())='" + tab.trim() + "']//span";
//            int actualcount= Integer.parseInt(getTextPresent(countTab));
//            if (count==actualcount){
//                testStepPassed("Count is displayed as "+count);
//            }else{
//                testStepFailed("Count is displayed as "+actualcount);
//            }

        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify If No Relations Present" + e.getClass());
        }

    }


    ///////////CARDS
    public void verifyTileDetailsDashboardPage(String tileType, String tile, String extra) {
        try {

            if (tileType.equalsIgnoreCase("Cards")) {
                String relationsTiles = "Relation Tiles " + tileType + "#xpath=//div[contains(@class,'tab-info-card pink')]";
                verifyElementAndPrintSize(relationsTiles, "");
                String tileLogo = "" + tileType + " Tile Logo for : " + tile + " : #xpath=(//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card pink')]//div[contains(@class,'tab-info')]//img)";
                String tileTitle = "" + tileType + " Tile Name for: " + tile + " : #xpath=(//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card pink')]//div[contains(@class,'tab-info-text')]//p[contains(@class,'tab-card-title')])";
                String tileNumber = "" + tileType + " Tile Number for: " + tile + " : #xpath=(//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card pink')]//div[contains(@class,'tab-info-text')]//h5)";
                String tileCustId = "" + tileType + " Tile Customer ID for: " + tile + " : #xpath=(//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card pink')]//div[contains(@class,'tab-info-text')]//p[contains(@class,'tab-card-cust-id')])";

                String tileStatus = "" + tileType + " Tile Status for: " + tile + " : #xpath=(//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card pink')]//div[contains(@class,'status-div')]//p[contains(@class,'status-info')])";

                String tileGetDetailsBtn = "" + tileType + " Tile : " + tile + " Button: #xpath=(//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card pink')]//button[contains(@class,'get-details-btn')])";

                verifyElementIsDisplayedOrNot(tileLogo);
                verifyElementIsDisplayedAndGetText(tileTitle);
                verifyElementIsDisplayedAndGetText(tileNumber);
                verifyElementIsDisplayedAndGetText(tileCustId);
                verifyElementIsDisplayedAndGetText(tileStatus);


                verifyValueUsingLabel("//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card pink')]//div[contains(@class,'amount-info-part')]//div[@class='label']", "Relationship Type", "/following-sibling::div[contains(@class,'value')]", "");
                verifyValueUsingLabel("//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card pink')]//div[contains(@class,'amount-info-part')]//div[@class='label']", "Card Limit", "/following-sibling::div[@class='value']", "");
                verifyValueUsingLabel("//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card pink')]//div[contains(@class,'amount-info-part')]//div[@class='label']", "Available Limit", "/following-sibling::div[@class='value']", "");
                verifyValueUsingLabel("//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card pink')]//div[contains(@class,'amount-info-part')]//div[@class='label']", "Utilized Limit", "/following-sibling::div[@class='value']", "");
                verifyValueUsingLabel("//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card pink')]//div[contains(@class,'amount-info-part')]//div[@class='label']", "Date of Activation", "/following-sibling::div[@class='value']", "");
                verifyValueUsingLabel("//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card pink')]//div[contains(@class,'amount-info-part')]//div[@class='label']", "Date of Expiry", "/following-sibling::div[@class='value']", "");

                verifyElementIsDisplayedAndGetText(tileGetDetailsBtn);


            }

            if (tileType.equalsIgnoreCase("Insurance")) {
                String relationsTiles = "Relation Tiles " + tileType + "#xpath=//div[contains(@class,'tab-info-card pink')]";
                verifyElementAndPrintSize(relationsTiles, "");
                String tileLogo = "" + tileType + " Tile Logo for : " + tile + " : #xpath=(//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card pink')]//div[contains(@class,'tab-info')]//img)";
                String tileTitle = "" + tileType + " Tile Name for: " + tile + " : #xpath=(//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card pink')]//div[contains(@class,'tab-info-text')]//p[contains(@class,'tab-card-title')])";
                String tileNumber = "" + tileType + " Tile Number for: " + tile + " : #xpath=(//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card pink')]//div[contains(@class,'tab-info-text')]//h5)";
                String tileCustId = "" + tileType + " Tile Customer ID for: " + tile + " : #xpath=(//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card pink')]//div[contains(@class,'tab-info-text')]//p[contains(@class,'tab-card-cust-id')])";

                String tileStatus = "" + tileType + " Tile Status for: " + tile + " : #xpath=(//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card pink')]//div[contains(@class,'status-div')]//p[contains(@class,'status-info')])";

                String tileGetDetailsBtn = "" + tileType + " Tile : " + tile + " Button: #xpath=(//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card pink')]//button[contains(@class,'get-details-btn')])";

                verifyElementIsDisplayedOrNot(tileLogo);
                verifyElementIsDisplayedAndGetText(tileTitle);
                verifyElementIsDisplayedAndGetText(tileNumber);
                verifyElementIsDisplayedAndGetText(tileCustId);
                verifyElementIsDisplayedAndGetText(tileStatus);


                verifyValueUsingLabel("//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card pink')]//div[contains(@class,'amount-info-part')]//div[@class='label']", "Insurance Unique ID", "/following-sibling::div[@class='value']", "");
                verifyValueUsingLabel("//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card pink')]//div[contains(@class,'amount-info-part')]//div[@class='label']", "LAN No", "/following-sibling::div[@class='value']", "");
                verifyValueUsingLabel("//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card pink')]//div[contains(@class,'amount-info-part')]//div[@class='label']", "Product", "/following-sibling::div[@class='value']", "");
                verifyValueUsingLabel("//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card pink')]//div[contains(@class,'amount-info-part')]//div[@class='label']", "Company", "/following-sibling::div[@class='value']", "");
                verifyValueUsingLabel("//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card pink')]//div[contains(@class,'amount-info-part')]//div[@class='label']", "Sum Assured", "/following-sibling::div[@class='value']", "");
                verifyValueUsingLabel("//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card pink')]//div[contains(@class,'amount-info-part')]//div[@class='label']", "Issuance Status", "/following-sibling::div[@class='value']", "");


                String tileDownloadLink = "" + tileType + " Tile Download Link Text : " + tile + " : #xpath=(//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card pink')]//div[contains(@class,'documents-div')]//p[normalize-space(text())='Download link for the document'])";
                String tileDocs = "" + tileType + " Tile Documents : " + tile + " : #xpath=((//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card pink')])//div[@class='documents']//p)";
                verifyElementIsDisplayedAndGetText(tileDownloadLink);
                verifyElementAndPrintSize(tileDocs, "");
                int docs = sizeOfLocator(tileDocs);
                for (int i = 1; i <= docs; i++) {
                    String tileDocsRectangle = "" + tileType + " Tile Documents  : " + tile + " - Rectangle for Doc " + i + " : #xpath=((//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card pink')])//a[contains(@class,'download-document')])[" + i + "]";
                    String tileDocsName = "" + tileType + " Tile Documents  : " + tile + " - Name for Doc " + i + " : #xpath=((//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card pink')])//div[@class='documents']//p)[" + i + "]";
                    String tileDocsLogo = "" + tileType + " Tile : " + tile + " - Logo for Doc " + i + " : #xpath=((//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card pink')])//div[@class='documents']//img)[" + i + "]";
                    verifyElementIsDisplayedOrNot(tileDocsRectangle);
                    verifyElementIsDisplayedAndGetText(tileDocsName);
                    verifyElementIsDisplayedOrNot(tileDocsLogo);

                }


                verifyElementIsDisplayedAndGetText(tileGetDetailsBtn);

            }

            if (tileType.equalsIgnoreCase("Loans") || tileType.equalsIgnoreCase("Fixed Deposit")) {
                String relationsTiles = "Relation Tiles " + tileType + "#xpath=//div[contains(@class,'tab-info-card blue')]";
                verifyElementAndPrintSize(relationsTiles, "");
                String tileLogo = "" + tileType + " Tile Logo for : " + tile + " : #xpath=(//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card blue')]//div[contains(@class,'tab-info')]//img)";
                String tileTitle = "" + tileType + " Tile Name for: " + tile + " : #xpath=(//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card blue')]//div[contains(@class,'tab-info-text')]//p[contains(@class,'tab-card-title')])";
                String tileNumber = "" + tileType + " Tile Number for: " + tile + " : #xpath=(//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card blue')]//div[contains(@class,'tab-info-text')]//h5)";
                String tileCustId = "" + tileType + " Tile Customer ID for: " + tile + " : #xpath=(//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card blue')]//div[contains(@class,'tab-info-text')]//p[contains(@class,'tab-card-cust-id')])";

                String tileType1 = "" + tileType + " Tile Type: " + tile + " : #xpath=(//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card blue')]//div[contains(@class,'status-div')]//p[contains(@class,'color-name')])";

                String tileStatus = "" + tileType + " Tile Status for: " + tile + " : #xpath=(//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card blue')]//div[contains(@class,'status-div')]//p[contains(@class,'status-info')])";

                String tileGetDetailsBtn = "" + tileType + " Tile : " + tile + " Button: #xpath=(//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card blue')]//button[contains(@class,'get-details-btn')])";

                verifyElementIsDisplayedOrNot(tileLogo);
                verifyElementIsDisplayedAndGetText(tileTitle);
                verifyElementIsDisplayedAndGetText(tileNumber);
                verifyElementIsDisplayedAndGetText(tileCustId);
                verifyElementIsDisplayedAndGetText(tileType1);
                verifyElementIsDisplayedAndGetText(tileStatus);


                if (tileType.equalsIgnoreCase("Loans")) {
                    verifyValueUsingLabel("//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card blue')]//div[contains(@class,'amount-info-part')]//div[@class='label']", "Loan Amount", "/following-sibling::div[@class='value']", "");
                    verifyValueUsingLabel("//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card blue')]//div[contains(@class,'amount-info-part')]//div[@class='label']", "POS", "/following-sibling::div[@class='value']", "");
                    verifyValueUsingLabel("//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card blue')]//div[contains(@class,'amount-info-part')]//div[@class='label']", "EMI Amount", "/following-sibling::div[@class='value']", "");
                    verifyValueUsingLabel("//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card blue')]//div[contains(@class,'amount-info-part')]//div[@class='label']", "Disbursement Date", "/following-sibling::div[@class='value']", "");
                    verifyValueUsingLabel("//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card blue')]//div[contains(@class,'amount-info-part')]//div[@class='label']", "Next EMI Due Date", "/following-sibling::div[@class='value']", "");
                    verifyValueUsingLabel("//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card blue')]//div[contains(@class,'amount-info-part')]//div[@class='label']", "Total Overdue", "/following-sibling::div[@class='value']", "");

                }
                if (tileType.equalsIgnoreCase("Fixed Deposit")) {
                    verifyValueUsingLabel("//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card blue')]//div[contains(@class,'amount-info-part')]//div[@class='label']", "Deposit Amount", "/following-sibling::div[@class='value']", "");
                    verifyValueUsingLabel("//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card blue')]//div[contains(@class,'amount-info-part')]//div[@class='label']", "Interest Rate", "/following-sibling::div[@class='value']", "");
                    verifyValueUsingLabel("//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card blue')]//div[contains(@class,'amount-info-part')]//div[@class='label']", "Interest Amount", "/following-sibling::div[@class='value']", "");
                    verifyValueUsingLabel("//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card blue')]//div[contains(@class,'amount-info-part')]//div[@class='label']", "Maturity Amount", "/following-sibling::div[@class='value']", "");
                    verifyValueUsingLabel("//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card blue')]//div[contains(@class,'amount-info-part')]//div[@class='label']", "Interest Start Date", "/following-sibling::div[@class='value']", "");
                    verifyValueUsingLabel("//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card blue')]//div[contains(@class,'amount-info-part')]//div[@class='label']", "Maturity Date", "/following-sibling::div[@class='value']", "");

                }
                String tileDownloadLink = "" + tileType + " Tile Download Link Text : " + tile + " : #xpath=(//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card blue')]//div[contains(@class,'documents-div')]//p[normalize-space(text())='Download link for the document'])";
                String tileDocs = "" + tileType + " Tile Documents : " + tile + " : #xpath=((//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card blue')])//div[contains(@class,'download_document_div')]//p)";
                verifyElementIsDisplayedAndGetText(tileDownloadLink);
                verifyElementAndPrintSize(tileDocs, "");
                int docs = sizeOfLocator(tileDocs);
                for (int i = 1; i <= docs; i++) {
                    String tileDocsRectangle = "" + tileType + " Tile Documents  : " + tile + " - Rectangle for Doc " + i + " : #xpath=((//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card blue')])//a[contains(@class,'download-document')])[" + i + "]";
                    String tileDocsName = "" + tileType + " Tile Documents  : " + tile + " - Name for Doc " + i + " : #xpath=((//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card blue')])//div[contains(@class,'download_document_div')]//p)[" + i + "]";
                    String tileDocsLogo = "" + tileType + " Tile : " + tile + " - Logo for Doc " + i + " : #xpath=((//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card blue')])//div[contains(@class,'download_document_div')]//img)[" + i + "]";
                    if (isElementDisplayed(tileDocsRectangle)) {
                        verifyElementIsDisplayedOrNot(tileDocsRectangle);
                        verifyElementIsDisplayedAndGetText(tileDocsName);
                        verifyElementIsDisplayedOrNot(tileDocsLogo);

                    } else {

                        String dots = "#xpath=(//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card blue')]//div[contains(@class,'owl-dot ng-star-inserted')]//span)";
                        int size = sizeOfLocator(dots);
                        for (int j = 2; j <= size; j++) {
                            String inddots = "#xpath=(//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card blue')]//div[contains(@class,'owl-dot ng-star-inserted')]//span)[" + j + "]";
                            clickOn(inddots);
                            waitTime(2);
                            verifyElementIsDisplayedOrNot(tileDocsRectangle);
                            verifyElementIsDisplayedAndGetText(tileDocsName);
                            verifyElementIsDisplayedOrNot(tileDocsLogo);

                        }


                    }

                }


                verifyElementIsDisplayedAndGetText(tileGetDetailsBtn);

            }

        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify Tile Details Dashboard Page " + e.getClass());
        }

    }


    public void verifyViewAllDashboardPage(String button, String section, String extra) {
        try {

            String buttonSect = "Button: " + button + " in " + section + " Section #xpath=//h5[normalize-space(text())='" + section.trim() + "']/following-sibling::a[normalize-space(text())='" + button.trim() + "']";
            verifyFieldsDisplayedUsingLocatorUsingForLoop(buttonSect, "");

        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify View All Dashboard Page" + e.getClass());
        }

    }

    public void verifyCommunicationTrailsTable(String extra) {
        try {

            String rows = "Rows #xpath=//table[@class='communication-table']//tr";
            String columns = "Columns #xpath=//table[@class='communication-table']//tr//th";
            verifyElementIsDisplayedOrNot(DashboardPage.commnTrailsTable);
            int count = sizeOfLocator(rows);
            int columnCount = sizeOfLocator(columns);
            if (count == 6) {
                testStepPassed("5 Rows are being displayed as expected");
            } else {
                testStepFailed(count + " is being Displayed");
            }

            for (int i = 1; i < count; i++) {
//                for (int j = 1; j <= columnCount; j++) {
                String sentDate = "Row " + (i - 1) + " : Sent Date: #xpath=//table[@class='communication-table']//tr[" + i + "]//td[1]";
                String text = "Row " + (i - 1) + " : Text: #xpath=//table[@class='communication-table']//tr[" + i + "]//td[2]";
                String channel = "Row " + (i - 1) + " : Channel: #xpath=//table[@class='communication-table']//tr[" + i + "]//td[3]";
                verifyElementIsDisplayedAndGetText(sentDate);
                verifyElementIsDisplayedAndGetText(text);
                verifyElementIsDisplayedAndGetText(channel);

//                }
            }


        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify Communication Trials Table" + e.getClass());
        }

    }

    public void verifyCommunicationTrailsTableHeaders(String extra) {
        try {

            String columns = "Columns #xpath=//table[@class='communication-table']//tr//th";
            verifyElementIsDisplayedOrNot(DashboardPage.commnTrailsTable);

            String head1 = "Columns #xpath=//table[@class='communication-table']//tr//th[1]";
            String head2 = "Columns #xpath=//table[@class='communication-table']//tr//th[2]";
            String head3 = "Columns #xpath=//table[@class='communication-table']//tr//th[3]";

            verifyGetTextUsingLocatorAndCompareWithText(head1, "SENT DATE", "");
            verifyGetTextUsingLocatorAndCompareWithText(head2, "TEXT", "");
            verifyGetTextUsingLocatorAndCompareWithText(head3, "CHANNEL", "");

        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify Communication Trials Table Headers" + e.getClass());
        }

    }


    public void verifyCommunicationTrialsTableDateFormat(String extra) {
        try {

            String rows = "Rows #xpath=//table[@class='communication-table']//tr";
            String columns = "Columns #xpath=//table[@class='communication-table']//tr//th";
            verifyElementIsDisplayedOrNot(DashboardPage.commnTrailsTable);
            int count = sizeOfLocator(rows);
            int columnCount = sizeOfLocator(columns);
            for (int i = 1; i < count; i++) {
                for (int j = 1; j <= 1; j++) {
                    String sentDate = "Row " + (i) + " : Sent Date: #xpath=//table[@class='communication-table']//tr[" + i + "]//td[" + j + "]";
                    verifyElementIsDisplayedAndGetText(sentDate);
                    String date = getTextPresent(sentDate);
                    verifyDateFormatForDates(date, "yyyy-mm-dd hh:mm:ss", "");
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify Communication Trials Table Date Format" + e.getClass());
        }

    }

    public void verifyCommunicationTrialsTableDateRecent(String format, String extra) {
        try {

            String rows = "Rows #xpath=//table[@class='communication-table']//tr";
            String columns = "Columns #xpath=//table[@class='communication-table']//tr//th";
            verifyElementIsDisplayedOrNot(DashboardPage.commnTrailsTable);
            int count = sizeOfLocator(rows);
            int columnCount = sizeOfLocator(columns);
            for (int i = 1; i < count - 1; i++) {
                for (int j = i + 1; j <= i + 1; j++) {
                    String sentDate1 = "Row " + (i) + " : Sent Date: #xpath=//table[@class='communication-table']//tr[" + i + "]//td[1]";
                    String sentDate2 = "Row " + (j) + " : Sent Date: #xpath=//table[@class='communication-table']//tr[" + j + "]//td[1]";
                    verifyElementIsDisplayedAndGetText(sentDate1);
                    verifyElementIsDisplayedAndGetText(sentDate2);
                    String date1 = getTextPresent(sentDate1);
                    String date2 = getTextPresent(sentDate2);
                    DateFormat sdf = new SimpleDateFormat(format);
                    Date firstDate = sdf.parse(date1);
                    Date secondDate = sdf.parse(date2);
                    boolean after = compareDates(firstDate, secondDate, false);
                    if (after) {
                        testStepPassed(getRefOfXpath(sentDate1) + " " + date1 + "is Latest than" + getRefOfXpath(sentDate2) + " " + date2);
                    } else {
                        testStepFailed(getRefOfXpath(sentDate1) + " " + date1 + " is Older than" + getRefOfXpath(sentDate2) + " " + date2);

                    }
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify Communication Trials Table Date Recent" + e.getClass());
        }

    }


    public void clickViewAllDashboardPage(String button, String section, String extra) {
        try {

            String buttonSect = "Button: " + button + " in " + section + " Section #xpath=//h5[normalize-space(text())='" + section.trim() + "']/following-sibling::a[normalize-space(text())='" + button.trim() + "']";
            scrollToWebElementIfPresent(buttonSect);
            clickOnButtonUsingLocatorUsingForLoop(buttonSect);
            waitTime(5);
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at click View All Dashboard Page" + e.getClass());
        }

    }

    ////////////////Communication Trails Page

    public void verifyCommunicationTrailsTableCommnPage(String extra) {
        try {

            String rows = "Rows #xpath=//table[@class='emi-table']//tr";
            String columns = "Columns #xpath=//table[@class='emi-table']//tr//th";
            String navigation = "Navigation Campaigns #xpath=//nav[@role='navigation']";
            verifyElementIsDisplayedOrNot(DashboardPage.auditTrailsTable);
            verifyElementIsDisplayedOrNot(DashboardPage.sentDateFilter);
            verifyElementIsDisplayedOrNot(DashboardPage.filterBy);
            verifyFieldsDisplayedUsingText("Sent Date");
            verifyFieldsDisplayedUsingText("Filter By - ");
            verifyTextOptionsIsDisplayedUsingCommonXpath("//div[@class='filter-box-wrapper']//a//p", "SMS#WhatAspp");
            int count = sizeOfLocator(rows);
            int columnCount = sizeOfLocator(columns);
            if (count == 6) {
                testStepPassed("5 Rows are being displayed as expected");
            } else {
                testStepFailed((count - 1) + " is being Displayed");
            }

            for (int i = 1; i < count; i++) {
//                for (int j = 1; j <= columnCount; j++) {
                String sentDate = "Row " + (i) + " : Sent Date: #xpath=//table[@class='emi-table']//tr[" + i + "]//td[1]";
                String text = "Row " + (i) + " : Text: #xpath=//table[@class='emi-table']//tr[" + i + "]//td[2]";
                String channel = "Row " + (i) + " : Channel: #xpath=//table[@class='emi-table']//tr[" + i + "]//td[3]";
                String campaign = "Row " + (i) + " : Campaign: #xpath=//table[@class='emi-table']//tr[" + i + "]//td[4]";
                verifyElementIsDisplayedAndGetText(sentDate);
                verifyElementIsDisplayedAndGetText(text);
                verifyElementIsDisplayedAndGetText(channel);
                verifyElementIsDisplayedAndGetText(campaign);

            }


            verifyElementIsDisplayedOrNot(navigation);
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify Communication Trials Table Commn Page" + e.getClass());
        }

    }

    public void verifyCommunicationTrailsTableHeadersCommnPage(String extra) {
        try {

            String columns = "Columns #xpath=//table[@class='emi-table']//tr//th";
            verifyElementIsDisplayedOrNot(DashboardPage.auditTrailsTable);

            String head1 = "Columns #xpath=//table[@class='emi-table']//tr//th[1]";
            String head2 = "Columns #xpath=//table[@class='emi-table']//tr//th[2]";
            String head3 = "Columns #xpath=//table[@class='emi-table']//tr//th[3]";
            String head4 = "Columns #xpath=//table[@class='emi-table']//tr//th[4]";

            verifyGetTextUsingLocatorAndCompareWithText(head1, "Sent Date", "");
            verifyGetTextUsingLocatorAndCompareWithText(head2, "Text", "");
            verifyGetTextUsingLocatorAndCompareWithText(head3, "Channel", "");
            verifyGetTextUsingLocatorAndCompareWithText(head4, "Campaign", "");

        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify Communication Trials Table Headers Commn Page" + e.getClass());
        }

    }


    public void verifyCommunicationTrialsTableDateFormatCommnPage(String extra) {
        try {

            String rows = "Rows #xpath=//table[@class='emi-table']//tr";
            String columns = "Columns #xpath=//table[@class='emi-table']//tr//th";
            verifyElementIsDisplayedOrNot(DashboardPage.auditTrailsTable);
            int count = sizeOfLocator(rows);
            int columnCount = sizeOfLocator(columns);
            for (int i = 1; i < count; i++) {
//                for (int j = 1; j <= 1; j++) {
                String sentDate = "Row " + (i - 1) + " : Sent Date: #xpath=//table[@class='emi-table']//tr[" + i + "]//td[1]";
                verifyElementIsDisplayedAndGetText(sentDate);
                String date = getTextPresent(sentDate);
                verifyDateFormatForDates(date, "yyyy-mm-dd hh:mm:ss", "");
//                }
            }


        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify Communication Trials Table Date Format Commn Page" + e.getClass());
        }

    }


    public void verifyCommunicationTrialsTableDateRecentCommnPage(String format, String extra) {
        try {

            String rows = "Rows #xpath=//table[@class='emi-table']//tr";
            String columns = "Columns #xpath=//table[@class='emi-table']//tr//th";
            verifyElementIsDisplayedOrNot(DashboardPage.auditTrailsTable);
            int count = sizeOfLocator(rows);
            int columnCount = sizeOfLocator(columns);
            for (int i = 1; i < count - 1; i++) {
                for (int j = i + 1; j <= i + 1; j++) {
                    String sentDate1 = "Row " + (i) + " : Sent Date: #xpath=//table[@class='emi-table']//tr[" + i + "]//td[1]";
                    String sentDate2 = "Row " + (j) + " : Sent Date: #xpath=//table[@class='emi-table']//tr[" + j + "]//td[1]";
                    verifyElementIsDisplayedAndGetText(sentDate1);
                    verifyElementIsDisplayedAndGetText(sentDate2);
                    String date1 = getTextPresent(sentDate1);
                    String date2 = getTextPresent(sentDate2);
                    DateFormat sdf = new SimpleDateFormat(format);
                    Date firstDate = sdf.parse(date1);
                    Date secondDate = sdf.parse(date2);
                    boolean after = compareDates(firstDate, secondDate, false);
                    if (after) {
                        testStepPassed(getRefOfXpath(sentDate1) + " " + date1 + "is Latest than" + getRefOfXpath(sentDate2) + " " + date2);
                    } else {
                        testStepFailed(getRefOfXpath(sentDate1) + " " + date1 + " is Older than" + getRefOfXpath(sentDate2) + " " + date2);

                    }
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify Communication Trials Table Date Recent Commn Page" + e.getClass());
        }

    }


    public void verifyCommunicationTrailsFilterChannelsCommnPage(String filter, String extra) {
        try {
            verifyElementIsDisplayedOrNot(DashboardPage.auditTrailsTable);
            String rows = "Rows #xpath=//table[@class='emi-table']//tr//td[3]";
            int num = sizeOfLocator(rows);
            testStepInfo("Total Communications displayed " + num);
            for (int i = 1; i <= num; i++) {
                String commn = "Communication " + i + ": #xpath=//table[@class='emi-table']//tr[" + i + "]//td[3]";
                String text = getTextPresent(commn);
                if (text.equalsIgnoreCase(filter)) {
                    testStepPassed(getRefOfXpath(commn) + " is being Displayed as Filtered: " + filter);
                } else {
                    testStepFailed(getRefOfXpath(commn) + " is not being Displayed as Filtered: " + text);
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify Communication Trials Filter Channels Commn Page" + e.getClass());
        }

    }


    public void verifyCommunicationTrailsPaginationCommnPage(String extra) {
        try {
//            verifyElementIsDisplayedOrNot(DashboardPage.auditTrailsTable);
            String previousDisabled = "Disabled Previous Button #xpath=//nav[@role='navigation']//li[contains(@class,'pagination-previous disabled')]";
            String next = "Next Button #xpath=//nav[@role='navigation']//li[contains(@class,'pagination-next')]";
            String pages = "Pages #xpath=//nav[@role='navigation']//li//a";
            String navigation = "Navigation Campaigns #xpath=//nav[@role='navigation']";
            scrollToWebElement(navigation);
            int num = sizeOfLocator(pages);
            testStepInfo("Total Pages displayed " + num);
            verifyElementIsDisplayedOrNot(previousDisabled);
            verifyElementIsDisplayedOrNot(next);

        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify Communication Trials Pagination Commn Page" + e.getClass());
        }

    }


    public void verifyCommunicationTrailsPaginationNextCommnPage(String extra) {
        try {
            verifyElementIsDisplayedOrNot(DashboardPage.auditTrailsTable);
            String navigation = "Navigation Campaigns #xpath=//nav[@role='navigation']";

            String previousDisabled = "Disabled Previous Button #xpath=//nav[@role='navigation']//li[contains(@class,'pagination-previous disabled')]";
            String previousActive = "Active Previous Button #xpath=//nav[@role='navigation']//li[contains(@class,'pagination-previous')]";
            String next = "Next Button #xpath=//nav[@role='navigation']//li[contains(@class,'pagination-next')]//a";
            String current = "Pages #xpath=//nav[@role='navigation']//li[@class='current']//span[2]";
            String pages = "Pages #xpath=//nav[@role='navigation']//li//a";

            scrollToWebElement(navigation);

            int num = sizeOfLocator(pages);
            testStepInfo("Total Pages displayed " + num);
            verifyElementIsDisplayedOrNot(previousDisabled);
            verifyElementIsDisplayedOrNot(next);
            clickOn(next);
            waitTime(2);
            verifyElementIsDisplayedOrNot(previousActive);

        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at  verify Communication Trials Pagination Next Commn Page" + e.getClass());
        }

    }


    public void verifySentDateFilterCommnPage(String date, String extra) {
        try {
            String rows = "Rows#xpath=(//table[@class='emi-table']//tr)";
            int size = sizeOfLocator(rows);
            if (size == 0) {
                testStepFailed("No Filters for this Date - Change the Date");
            } else {
                manualScreenshot("Total Filters " + (size - 1));
                for (int i = 1; i < size; i++) {
                    String filterRowsSentDate = "Row " + i + " Sent Date#xpath=(//table[@class='emi-table']//tr[" + i + "])//td[1]";
                    ;
                    String actual = getTextPresent(filterRowsSentDate);
                    if (actual.contains(date)) {
                        testStepPassed("Filter is working fine: " + getRefOfXpath(filterRowsSentDate) + " " + actual + " has the Filtered Date: " + date);
                    } else {
                        testStepFailed("Filter is not working fine");
                    }
                }


            }
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify sent Date Filter Commn Page" + e.getClass());

        }
    }

    /////////Service Requests

    public void verifyServiceRequestTable(String extra) {
        try {

            String rows = "Rows #xpath=//table[@class='communication-table disposition-table']//tr";
            String columns = "Columns #xpath=//table[@class='communication-table disposition-table']//tr//th";
            verifyElementIsDisplayedOrNot(DashboardPage.serviceReqTable);
            int count = sizeOfLocator(rows);
            int columnCount = sizeOfLocator(columns);
            if (count == 6) {
                testStepPassed("5 Rows are being displayed as expected");
            } else {
                testStepFailed(count + " is being Displayed");
            }

            for (int i = 1; i < count; i++) {
                String date = "Row " + (i) + " : Date: #xpath=//table[@class='communication-table disposition-table']//tr[" + i + "]//td[1]";
                String reqId = "Row " + (i) + " : Request Id: #xpath=//table[@class='communication-table disposition-table']//tr[" + i + "]//td[2]";
                String category = "Row " + (i) + " : Category: #xpath=//table[@class='communication-table disposition-table']//tr[" + i + "]//td[3]";
                String disposition = "Row " + (i) + " : Disposition: #xpath=//table[@class='communication-table disposition-table']//tr[" + i + "]//td[4]";
                String status = "Row " + (i) + " : Status: #xpath=//table[@class='communication-table disposition-table']//tr[" + i + "]//td[5]//span";
                verifyElementIsDisplayedAndGetText(date);
                verifyElementIsDisplayedAndGetText(reqId);
                verifyElementIsDisplayedAndGetText(category);
                verifyElementIsDisplayedAndGetText(disposition);
                verifyElementIsDisplayedAndGetText(status);

            }


        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify Service Request Table" + e.getClass());
        }

    }

    public void verifyServiceRequestStatusBadge(String extra) {
        try {

            String rows = "Rows #xpath=//table[@class='communication-table disposition-table']//tr";
            String columns = "Columns #xpath=//table[@class='communication-table disposition-table']//tr//th";
            verifyElementIsDisplayedOrNot(DashboardPage.serviceReqTable);
            int count = sizeOfLocator(rows);
            int columnCount = sizeOfLocator(columns);

            for (int i = 1; i < count; i++) {
                String status = "Row " + (i) + " : Status: #xpath=//table[@class='communication-table disposition-table']//tr[" + i + "]//td[5]//span";
                verifyElementIsDisplayedAndGetText(status);
                String badge = getTextPresent(status);
                if (badge.equalsIgnoreCase("Closed")) {
                    verifyLocatorColorUsingCssValue(status, "#fe2323", "Red", "background-color");
                } else if (badge.equalsIgnoreCase("In Progress")) {
                    verifyLocatorColorUsingCssValue(status, "#ffa500", "Yellow", "background-color");
                } else if (badge.equalsIgnoreCase("New")) {
                    verifyLocatorColorUsingCssValue(status, "#1e90ff", "Blue", "background-color");
                }

            }


        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify Service Request Status Badge" + e.getClass());
        }

    }

    public void verifyServiceRequestTableHeaders(String extra) {
        try {

            String columns = "Columns #xpath=//table[@class='communication-table disposition-table']//tr//th";
            verifyElementIsDisplayedOrNot(DashboardPage.serviceReqTable);

            String head1 = "Header 1 #xpath=//table[@class='communication-table disposition-table']//tr//th[1]";
            String head2 = "Header 2 #xpath=//table[@class='communication-table disposition-table']//tr//th[2]";
            String head3 = "Header 3 #xpath=//table[@class='communication-table disposition-table']//tr//th[3]";
            String head4 = "Header 4 #xpath=//table[@class='communication-table disposition-table']//tr//th[4]";
            String head5 = "Header 5 #xpath=//table[@class='communication-table disposition-table']//tr//th[5]";

            verifyGetTextUsingLocatorAndCompareWithText(head1, "DATE", "");
            verifyGetTextUsingLocatorAndCompareWithText(head2, "REQUEST ID", "");
            verifyGetTextUsingLocatorAndCompareWithText(head3, "CATEGORY", "");
            verifyGetTextUsingLocatorAndCompareWithText(head4, "DISPOSITION", "");
            verifyGetTextUsingLocatorAndCompareWithText(head5, "STATUS", "");

        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify Communication Trials Table Headers" + e.getClass());
        }

    }


    public void verifyServiceRequestableDateFormat(String extra) {
        try {

            String rows = "Rows #xpath=//table[@class='communication-table disposition-table']//tr";
            String columns = "Columns #xpath=//table[@class='communication-table disposition-table']//tr//th";
            verifyElementIsDisplayedOrNot(DashboardPage.serviceReqTable);
            int count = sizeOfLocator(rows);
            int columnCount = sizeOfLocator(columns);
            for (int i = 1; i < count; i++) {
                for (int j = 1; j <= 1; j++) {
                    String Date = "Row " + (i) + " : Date: #xpath=//table[@class='communication-table disposition-table']//tr[" + i + "]//td[" + j + "]";
                    verifyElementIsDisplayedAndGetText(Date);
                    String date = getTextPresent(Date);
                    verifyDateFormatForDates(date, "mm/dd/yyyy hh:mm:ss aa", "");
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify Service Request Table Date Format" + e.getClass());
        }

    }


    public void verifyServiceRequestTableDateRecent(String format, String extra) {
        try {

            String rows = "Rows #xpath=//table[@class='communication-table disposition-table']//tr";
            String columns = "Columns #xpath=//table[@class='communication-table disposition-table']//tr//th";
            verifyElementIsDisplayedOrNot(DashboardPage.serviceReqTable);
            int count = sizeOfLocator(rows);
            int columnCount = sizeOfLocator(columns);
            for (int i = 1; i < count - 1; i++) {
                for (int j = i + 1; j <= i + 1; j++) {
                    String sentDate1 = "Row " + (i) + " : Sent Date: #xpath=//table[@class='communication-table disposition-table']//tr[" + i + "]//td[1]";
                    String sentDate2 = "Row " + (j) + " : Sent Date: #xpath=//table[@class='communication-table disposition-table']//tr[" + j + "]//td[1]";
                    verifyElementIsDisplayedAndGetText(sentDate1);
                    verifyElementIsDisplayedAndGetText(sentDate2);
                    String date1 = getTextPresent(sentDate1);
                    String date2 = getTextPresent(sentDate2);
                    DateFormat sdf = new SimpleDateFormat(format);
                    Date firstDate = sdf.parse(date1);
                    Date secondDate = sdf.parse(date2);
                    boolean after = compareDates(firstDate, secondDate, false);
                    if (after) {
                        testStepPassed(getRefOfXpath(sentDate1) + " " + date1 + "is Latest than" + getRefOfXpath(sentDate2) + " " + date2);
                    } else {
                        testStepFailed(getRefOfXpath(sentDate1) + " " + date1 + " is Older than" + getRefOfXpath(sentDate2) + " " + date2);

                    }
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify Service Request Table Date Recent" + e.getClass());
        }

    }


    public void verifyServiceRequestTableServiceRequestPage(String extra) {
        try {

            String rows = "Rows #xpath=//table[@class='emi-table']//tr";
            String columns = "Columns #xpath=//table[@class='emi-table']//tr//th";
            String navigation = "Navigation Campaigns #xpath=//nav[@role='navigation']";
            int count = sizeOfLocator(rows);
            int columnCount = sizeOfLocator(columns);
            if (count == 6) {
                testStepPassed("5 Rows are being displayed as expected");
            } else {
                testStepFailed((count - 1) + " is being Displayed");
            }

            for (int i = 1; i < count; i++) {
                String origin = "Row " + (i) + " : Origin: #xpath=//table[@class='emi-table']//tr[" + i + "]//td[1]";
                String date = "Row " + (i) + " : Date: #xpath=//table[@class='emi-table']//tr[" + i + "]//td[2]";
                String reqId = "Row " + (i) + " : Request ID: #xpath=//table[@class='emi-table']//tr[" + i + "]//td[3]";
                String custId = "Row " + (i) + " : Customer ID: #xpath=//table[@class='emi-table']//tr[" + i + "]//td[4]";
                String reltnNo = "Row " + (i) + " : Relationship No: #xpath=//table[@class='emi-table']//tr[" + i + "]//td[5]";
                String reqType = "Row " + (i) + " : Request Type: #xpath=//table[@class='emi-table']//tr[" + i + "]//td[6]";
                String subreqType = "Row " + (i) + " : Sub Request Type: #xpath=//table[@class='emi-table']//tr[" + i + "]//td[7]";
                String tat = "Row " + (i) + " : TAT in Days: #xpath=//table[@class='emi-table']//tr[" + i + "]//td[8]";
                String status = "Row " + (i) + " : Status: #xpath=//table[@class='emi-table']//tr[" + i + "]//td[9]";
                String category = "Row " + (i) + " : Category(Case Reason): #xpath=//table[@class='emi-table']//tr[" + i + "]//td[10]";
                String disposition = "Row " + (i) + " : Disposition: #xpath=//table[@class='emi-table']//tr[" + i + "]//td[11]";
                verifyElementIsDisplayedAndGetText(origin);
                verifyElementIsDisplayedAndGetText(date);
                verifyElementIsDisplayedAndGetText(reqId);
                verifyElementIsDisplayedAndGetText(custId);
                verifyElementIsDisplayedAndGetText(reltnNo);
                verifyElementIsDisplayedAndGetText(reqType);
                verifyElementIsDisplayedAndGetText(subreqType);
                verifyElementIsDisplayedAndGetText(tat);
                verifyElementIsDisplayedAndGetText(status);
                verifyElementIsDisplayedAndGetText(category);
                verifyElementIsDisplayedAndGetText(disposition);

            }

            verifyElementIsDisplayedOrNot(navigation);
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify Service Request Table Service Page" + e.getClass());
        }

    }


    public void verifyServiceTableDateFormatServicePage(String extra) {
        try {

            String rows = "Rows #xpath=//table[@class='emi-table']//tr";
            String columns = "Columns #xpath=//table[@class='emi-table']//tr//th";
            verifyElementIsDisplayedOrNot(DashboardPage.servReqTable);
            int count = sizeOfLocator(rows);
            int columnCount = sizeOfLocator(columns);
            for (int i = 1; i < count; i++) {
                String date1 = "Row " + (i) + " : Date: #xpath=//table[@class='emi-table']//tr[" + i + "]//td[2]";
                verifyElementIsDisplayedAndGetText(date1);
                String date = getTextPresent(date1);
                verifyDateFormatForDates(date, "mm/dd/yyyy hh:mm:ss aa", "");
            }


        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify Service Request Table Date Format Service Page" + e.getClass());
        }

    }


    public void verifyServiceRequestTableDateRecentServicePage(String format, String extra) {
        try {

            String rows = "Rows #xpath=//table[@class='emi-table']//tr";
            String columns = "Columns #xpath=//table[@class='emi-table']//tr//th";
            int count = sizeOfLocator(rows);
            int columnCount = sizeOfLocator(columns);
            for (int i = 1; i < count - 1; i++) {
                for (int j = i + 1; j <= i + 1; j++) {
                    String Date1 = "Row " + (i) + " : Date: #xpath=//table[@class='emi-table']//tr[" + i + "]//td[2]";
                    String Date2 = "Row " + (j) + " : Date: #xpath=//table[@class='emi-table']//tr[" + j + "]//td[2]";
                    verifyElementIsDisplayedAndGetText(Date1);
                    verifyElementIsDisplayedAndGetText(Date2);
                    String date1 = getTextPresent(Date1);
                    String date2 = getTextPresent(Date2);
                    DateFormat sdf = new SimpleDateFormat(format);
                    Date firstDate = sdf.parse(date1);
                    Date secondDate = sdf.parse(date2);
                    boolean after = compareDates(firstDate, secondDate, false);
                    if (after) {
                        testStepPassed(getRefOfXpath(Date1) + " " + date1 + "is Latest than" + getRefOfXpath(Date2) + " " + date2);
                    } else {
                        testStepFailed(getRefOfXpath(Date1) + " " + date1 + " is Older than" + getRefOfXpath(Date2) + " " + date2);

                    }
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify Service Request Table Date Recent Service Page" + e.getClass());
        }

    }


    public void verifyServiceRequestPaginationServicePage(String extra) {
        try {
            String previousDisabled = "Disabled Previous Button #xpath=//nav[@role='navigation']//li[contains(@class,'pagination-previous disabled')]";
            String next = "Next Button #xpath=//nav[@role='navigation']//li[contains(@class,'pagination-next')]";
            String pages = "Pages #xpath=//nav[@role='navigation']//li//a";
            String navigation = "Navigation Campaigns #xpath=//nav[@role='navigation']";
            scrollToWebElement(navigation);
            int num = sizeOfLocator(pages);
            testStepInfo("Total Pages displayed " + num);
            verifyElementIsDisplayedOrNot(previousDisabled);
            verifyElementIsDisplayedOrNot(next);

        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify Service Request Pagination Service Page" + e.getClass());
        }

    }


    public void verifyServiceRequestPaginationNextServicePage(String extra) {
        try {
            String navigation = "Navigation Campaigns #xpath=//nav[@role='navigation']";

            String previousDisabled = "Disabled Previous Button #xpath=//nav[@role='navigation']//li[contains(@class,'pagination-previous disabled')]";
            String previousActive = "Active Previous Button #xpath=//nav[@role='navigation']//li[contains(@class,'pagination-previous')]";
            String next = "Next Button #xpath=//nav[@role='navigation']//li[contains(@class,'pagination-next')]//a";
            String current = "Pages #xpath=//nav[@role='navigation']//li[@class='current']//span[2]";
            String pages = "Pages #xpath=//nav[@role='navigation']//li//a";

            scrollToWebElement(navigation);

            int num = sizeOfLocator(pages);
            testStepInfo("Total Pages displayed " + num);
            verifyElementIsDisplayedOrNot(previousDisabled);
            verifyElementIsDisplayedOrNot(next);

            clickOn(next);
            waitTime(2);
            verifyElementIsDisplayedOrNot(previousActive);


        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify  Service Request Pagination Next Service Page" + e.getClass());
        }

    }


    /////////Cust Portfolio


    public void verifyCustPortfolioSectionContents(String extra) {
        try {
            String custPortfolioImg = "Customer Portfolio Image#xpath=//div[@class='customer-portfolio-section']//img[contains(@src,'images/customerporfolio')]";
            String custPortfolioHeader = "Customer Portfolio Header#xpath=//div[@class='cust-port-contant']";

            verifyElementIsDisplayedOrNot(custPortfolioImg);
            verifyDisplayedAndPrintValueUsingLocator(custPortfolioHeader, "");
            verifyValueUsingLabel("//div[@class='ppc-contant-box']//p", "PPC", "/following-sibling::h3", "");
            verifyValueUsingLabel("//div[@class='ppc-contant-box']//p", "Total POS", "/following-sibling::h3", "");
            verifyValueUsingLabel("//div[@class='ppc-contant-box']//p", "DELINQUENCY", "/following-sibling::h3", "");
            verifyValueUsingLabel("//div[@class='ppc-contant-box']//p", "Bucket", "/following-sibling::h3", "");
            verifyValueUsingLabel("//div[@class='ppc-contant-box']//p", "Bounce count", "/following-sibling::h3//a", "");
            verifyValueUsingLabel("//div[@class='ppc-contant-box']//p", "credit score", "/following-sibling::h3", "");


        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify Cust Portfolio Section Contents" + e.getClass());
        }

    }


    public void verifyWidgetsDashboardPage(String options, String extra) {
        try {
            String widgets = "Widgets Section#xpath=//ul[@class='widgets-items']//p";
            scrollToWebElement(widgets);
            String[] split = options.split(", ");
            for (int i = 0; i < split.length; i++) {
                String text = split[i];
                String name = "" + text + " Widget#xpath=//ul[@class='widgets-items']//p[normalize-space(text())='" + text.trim() + "']";
                String img = "" + text + " Logo#xpath=//ul[@class='widgets-items']//p[normalize-space(text())='" + text.trim() + "']/preceding-sibling::img";
                verifyElementIsDisplayedOrNot(name);
                verifyElementIsDisplayedOrNot(img);

            }

        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify Widgets Dashboard Page" + e.getClass());
        }

    }


    public void verifyRepaymentSOATableBounceCountPage(String extra) {
        try {

            String rows = "Rows #xpath=//table[@class='emi-table']//tr";
            String columns = "Columns #xpath=//table[@class='emi-table']//tr//th";
            int count = sizeOfLocator(rows);
            int columnCount = sizeOfLocator(columns);

            for (int i = 1; i < count; i++) {
                String soa = "Row " + (i) + " : SOA: #xpath=//table[@class='emi-table']//tr[" + i + "]//td[1]//img";
                String agreement = "Row " + (i) + " : AGREEMENT NO.: #xpath=//table[@class='emi-table']//tr[" + i + "]//td[2]";
                String appId = "Row " + (i) + " : APPLICATION ID: #xpath=//table[@class='emi-table']//tr[" + i + "]//td[3]";
                String sancAmt = "Row " + (i) + " : SANCTIONED AMt.: #xpath=//table[@class='emi-table']//tr[" + i + "]//td[4]";
                String prodType = "Row " + (i) + " : PRODUCT TYPE: #xpath=//table[@class='emi-table']//tr[" + i + "]//td[5]";
                String mob = "Row " + (i) + " : MOB: #xpath=//table[@class='emi-table']//tr[" + i + "]//td[6]";
                String tenure = "Row " + (i) + " : TENURE: #xpath=//table[@class='emi-table']//tr[" + i + "]//td[7]";
                String loanStatus = "Row " + (i) + " : LOAN STATUS: #xpath=//table[@class='emi-table']//tr[" + i + "]//td[8]";
                String pos = "Row " + (i) + " : POS: #xpath=//table[@class='emi-table']//tr[" + i + "]//td[9]";
                verifyElementIsDisplayedOrNot(soa);
                verifyElementIsDisplayedAndGetText(agreement);
                verifyElementIsDisplayedAndGetText(appId);
                verifyElementIsDisplayedAndGetText(sancAmt);
                verifyElementIsDisplayedAndGetText(prodType);
                verifyElementIsDisplayedAndGetText(mob);
                verifyElementIsDisplayedAndGetText(tenure);
                verifyElementIsDisplayedAndGetText(loanStatus);
                verifyElementIsDisplayedAndGetText(pos);

            }


        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify Repayment SOA Table Bounce Count Page" + e.getClass());
        }

    }

    public void verifyRepaymentSOAPdfDownload(int row, String extra) {
        try {
            String rows = "Rows #xpath=//table[@class='emi-table']//tr";
            String langSelect = "Rows #xpath=//select[@formcontrolname='LanguageSelect']";
            int count = sizeOfLocator(rows);

            if (count != 0) {
                String soa = "Row " + row + " SOA: #xpath=//table[@class='emi-table']//tr[" + row + "]//td[1]//a";
                String agreement = "Row " + row + " SOA: #xpath=//table[@class='emi-table']//tr[" + row + "]//td[2]";
                String agreementnum = getTextPresent(agreement);
                clickOn(soa);
                verifyFieldDisplayedUsingTagAndText("h2", "Select a Language", "");
                verifyGetAllOptionsInDropDownAndCompare(langSelect, "ENGLISH#TAMIL#KANNADA#MARATHI#HINDI#GUJARATI#BENGALI#TELUGU#PUNJABI");
                selectDropDownUsingText(langSelect, "ENGLISH");
                waitTime(2);
                verifyDownLoadAndDeleteLatestFileNameFromLocalMachine("" + agreementnum + "_SOA.pdf");
            } else {
                testStepFailed("No Bounces for this Customer");
            }


        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify Repayment SOA Pdf Download" + e.getClass());
        }

    }


    public void verifyLoanStatusBounceCountPage(String extra) {
        try {

            String rows = "Rows #xpath=//table[@class='emi-table']//tr";
            String columns = "Columns #xpath=//table[@class='emi-table']//tr//th";
            int count = sizeOfLocator(rows);
            int columnCount = sizeOfLocator(columns);

            for (int i = 1; i < count; i++) {
                String loanStatus = "Row " + (i) + " : LOAN STATUS: #xpath=//table[@class='emi-table']//tr[" + i + "]//td[8]";
                verifyElementIsDisplayedAndGetText(loanStatus);
                String text = getTextPresent(loanStatus);
                if (text.equalsIgnoreCase("Active")) {
                    manualScreenshot(getRefOfXpath(loanStatus) + "is Active");
                } else if (text.equalsIgnoreCase("Closed")) {
                    manualScreenshot(getRefOfXpath(loanStatus) + "is Closed");

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify Loan Status Bounce Count Page" + e.getClass());
        }

    }


    public void verifyTrackRecordBounceCountPage(String bounce, String extra) {
        try {

            String rows = "Rows #xpath=//table[@class='emi-table']//tr";
            String columns = "Columns #xpath=//table[@class='emi-table']//tr//th";
            int count = sizeOfLocator(rows);
            int columnCount = sizeOfLocator(columns);

            if (bounce.equalsIgnoreCase("No Bounce")) {
                String nobounces = "Rows #xpath=//table[@class='emi-table']//tr//td[10]//span";
                int count2 = sizeOfLocator(nobounces);
                for (int i = 1; i <= count2; i++) {
                    String track = "Row " + (i) + " : Track Record: #xpath=//table[@class='emi-table']//tr[" + i + "]//td[10]//span";
                    verifyElementIsDisplayedAndGetText(track);
                    String text = getTextPresent(track);
                    if (text.equalsIgnoreCase("No Bounce")) {
                        verifyLocatorColorUsingCssValue(track, "#008000", "Green", "color");
                    }
                }
            }
            if (bounce.equalsIgnoreCase("Bounce")) {
                String bounces = "Rows #xpath=//table[@class='emi-table']//tr//td[10]//a";
                int count1 = sizeOfLocator(bounces);
                for (int i = 1; i < count1; i++) {
                    String track = "Row " + (i) + " : Track Record: #xpath=//table[@class='emi-table']//tr[" + i + "]//td[10]//a";
                    verifyElementIsDisplayedAndGetText(track);
                    String text = getTextPresent(track);
                    verifyLocatorColorUsingCssValue(track, "#ff6f01", "Red", "color");
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify Track Record Bounce Count Page" + e.getClass());
        }

    }


    public void verifyServiceRequestFilterServiceReqPage(String req, String extra) {
        try {
            String rows = "Rows#xpath=//table[@class='emi-table']//tr";
            int size = sizeOfLocator(rows);
            if (size == 2) {
                testStepPassed("Filtered Row is being Displayed Successfully");
            } else {
                testStepFailed("Filtered Row is not being Displayed");
            }
            String filter = "Rows#xpath=(//table[@class='emi-table']//tr//td)[3]";
            String actual = getTextPresent(filter);
            if (actual.equalsIgnoreCase(req)) {
                testStepPassed("Filtered Req ID is being Displayed Successfully: " + req);
            } else {
                testStepFailed("Filtered Req ID is not being Displayed: " + actual);

            }

        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify Service Request Filter Service Req Page" + e.getClass());
        }

    }


    ////////Filter
    public void verifySearchFilterDashboardPage(String relation, String extra) {
        try {
            String relationsTiles = "Relation Tiles #xpath=//div[contains(@class,'tab-info-card')]";

            String relationCard = "Relation: " + relation.trim() + "#xpath=(//h5[normalize-space(text())='" + relation.trim() + "'])";
            int size = sizeOfLocator(relationsTiles);

            if (size == 1) {
                manualScreenshot("Filtered Tile is being displayed Successfully");
                verifyElementIsDisplayedOrNot(relationCard);
            } else {
                testStepFailed("Filtered Tile not is being displayed");
            }
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify Search Filter Dashboard Page" + e.getClass());

        }
    }

    public static String generateFinancialYears() {
        String years = "";
        try {
            int year = getYearFromDate(new Date());
            years = "" + ((year) + "-" + (year + 1)) + "#" + ((year - 1) + "-" + (year)) + "#" + ((year - 2) + "-" + (year - 1)) + "#" + ((year - 3) + "-" + (year - 2)) + "#" + ((year - 4) + "-" + (year - 3)) + "";
            System.out.println(years);
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at generate Financial Years" + e.getClass());
        }
        return years;
    }

    public static String generateFinancialYears(int num) {
        String years = "";
        try {
            int year = getYearFromDate(new Date());
            int month = getMonthFromDate(new Date());
            String ab = "";
            for (int i = num - 1; i >= 0; i--) {
                for (int j = i - 1; j >= i - 1; j--) {
                    years = years + "" + ((year - i) + "-" + (year - j)) + "#";
                }
            }
            System.out.println(years);
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at generate Financial Years" + e.getClass());
        }
        return years;
    }

    public static String generateFinancialYearsNew(int num) {
        StringBuilder years = new StringBuilder();
        try {
            Calendar calendar = Calendar.getInstance();
            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH) + 1;

            for (int i = 0; i < num; i++) {
                int startYear, endYear;
                if (month >= 4) {
                    startYear = year - i;
                    endYear = startYear + 1;
                } else {
                    startYear = (year - i) - 1;
                    endYear = startYear + 1;
                }
                years.append(startYear).append("-").append(endYear);
                if (i < num - 1) {
                    years.append("#");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at generate Financial Years New" + e.getClass());
        }
        return years.toString();
    }


    //////Cards - Masked


    public void verifyCardsNumberMasked(String tile) {

        try {
            String tileNumber = "Cards Tile Number for: " + tile + " : #xpath=(//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card pink')]//div[contains(@class,'tab-info-text')]//h5)";
            String actual = getTextPresent(tileNumber);
            verifyMaskedAndUnmaskedFormatUsingValue(actual, "Cards", "X", 0, 12, false, "0");
            verifyMaskedAndUnmaskedFormatUsingValue(actual, "Cards", "X", 4, 4, true, "0");
            verifyMaskedAndUnmaskedFormatUsingValue(actual, "Cards", "X", 13, 4, false, "1");


        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed verify Cards Number Masked" + e.getClass());
        }
    }

    public void clickGetDetailsButton(String tileType, String tile, String extra) {

        try {
            String tileGetDetailsBtn = "" + tileType + " Tile : " + tile + " Button: #xpath=(//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card')]//button[contains(@class,'get-details-btn')])";
            scrollToWebElement(relationsTilesSection);
            if (!isElementDisplayed(tileGetDetailsBtn)) {
                String dots = "#xpath=(//div[@class='owl-dot ng-star-inserted']//span)";
                int size = sizeOfLocator(dots);
                for (int j = 2; j <= size; j++) {
                    String inddots = "#xpath=(//div[@class='owl-dot ng-star-inserted']//span)[" + j + "]";
                    if (!isElementDisplayed(tileGetDetailsBtn)) {
                        clickOn(inddots);
                        waitTime(2);
                    }
                }
            }
            scrollToWebElement(tileGetDetailsBtn);
            clickOn(tileGetDetailsBtn);
            waitForPageToLoad();
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed click Get Details Button" + e.getClass());
        }
    }


    ////////////Bajaj Pay


    public void clickBBPSTabs(String tab, String extra) {

        try {
            String taboption = "BBPS Tab: " + tab + " : #xpath=//p[normalize-space(text())='" + tab.trim() + "']/ancestor::div[contains(@class,'bajaj-pay-main')]//a";
            scrollToWebElement(taboption);
            clickOn(taboption);
            waitForPageToLoad();
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed click BBPS Tabs" + e.getClass());
        }
    }

    public void verifyBBPSTabOptions(String option, String extra) {

        try {
            String taboption = "BBPS Tab Option: " + option + " : #xpath=//p[normalize-space(text())='" + option.trim() + "']/ancestor::a[contains(@class,'bj-submenu-tabbtn')]";
            scrollToWebElement(taboption);
            verifyElementIsDisplayedOrNot(taboption);
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed verify BBPS Tab Options" + e.getClass());
        }
    }

    public void clickBBPSTabOptions(String option, String extra) {

        try {
            String taboption = "BBPS Tab Option: " + option + " : #xpath=//p[normalize-space(text())='" + option.trim() + "']/ancestor::a[contains(@class,'bj-submenu-tabbtn')]";
            scrollToWebElement(taboption);
            clickOn(taboption);
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed click BBPS Tab Options" + e.getClass());
        }
    }

    public void verifyTabSubOptions(String tab, String options, String extra) {
        String text = "";
        try {
            String taboption = "Tab: " + tab + " : #xpath=//div[contains(@class,'bajaj-pay-main')]//a//p[normalize-space(text())='" + tab.trim() + "']/following::ul[contains(@class,'bj-submenu')]//a";
            String option = changeCommaToHash(options, "");
            String[] split = option.split("#");
            for (int i = 0; i < split.length; i++) {
                text = split[i];
                String locator = "Tab: " + tab + " : " + text + "#xpath=" + getCommonPathOfLocator(taboption) + "//p[normalize-space(text())=\"" + text.trim() + "\"]";
                scrollToWebElementIfPresent(locator);
                if (isElementDisplayed(locator)) {
                    manualScreenshot(getRefOfXpath(locator) + " is Displayed successfully.");
                } else {
                    testStepFailed(getRefOfXpath(locator) + " is Not Displayed.");
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed verify Tab Sub Options" + e.getClass());
        }
    }

    public void verifySubTabSubOptions(String subTab, String options, String extra) {
        String text = "";
        try {
            String taboption = "Tab: " + subTab + " : #xpath=//p[normalize-space(text())='" + subTab.trim() + "']/ancestor::a[contains(@class,'bj-submenu-tabbtn')]/following-sibling::div//a//p";
            String option = changeCommaToHash(options, "");
            String[] split = option.split("#");
            for (int i = 0; i < split.length; i++) {
                text = split[i];
                String locator = "Sub Tab: " + subTab + " Option: " + text + "#xpath=" + getCommonPathOfLocator(taboption) + "[normalize-space(text())=\"" + text.trim() + "\"]";
                scrollToWebElementIfPresent(locator);
                if (isElementDisplayed(locator)) {
                    manualScreenshot(getRefOfXpath(locator) + " is Displayed successfully.");
                } else {
                    testStepFailed(getRefOfXpath(locator) + " is Not Displayed.");
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed verify Sub Tab Sub Options" + e.getClass());
        }
    }


    public void clickBBPSSubTabs(String sub, String extra) {

        try {
            String taboption = " Sub Tab: " + sub + " : #xpath=//p[normalize-space(text())='" + sub.trim() + "']/ancestor::a[contains(@class,'bj-submenu-tabbtn')]|//p[normalize-space(text())='" + sub.trim() + "']/ancestor::a[contains(@class,'submenu')]";
            scrollToWebElement(taboption);
            clickOn(taboption);
            waitForPageToLoad();
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed click BBPS Sub Tabs" + e.getClass());
        }
    }

    public void clickWalletSubTabs(String sub, String extra) {

        try {
            String taboption = " Sub Tab: " + sub + " : #xpath=//p[normalize-space(text())='" + sub.trim() + "']/ancestor::a[contains(@class,'submenu-list-links')]";
            scrollToWebElement(taboption);
            clickOn(taboption);
            waitForPageToLoad();
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed click Wallet Sub Tabs" + e.getClass());
        }
    }


    public void verifyTableContentsBajajPay(String header, String tabId, String tableHeaders, String extra) {

        try {
            String table = "" + header + " Table #xpath=//div[contains(@id,'" + tabId.trim() + "')]//div[contains(@class,'table')]//table";
            verifyElementIsDisplayedOrNot(table);
            verifyFieldsPresentUsingCommonXpathAndMultipleTextWithHash("//div[contains(@id,'" + tabId.trim() + "')]//div[contains(@class,'table')]//table//th", tableHeaders, "");

            String noRecords = "No Data Available #xpath=//div[contains(@id,'" + tabId.trim() + "')]//div[contains(@class,'table')]//table//td[normalize-space(text())='No Data Available']";

            String rows = "Rows #xpath=//div[contains(@id,'" + tabId.trim() + "')]//div[contains(@class,'table')]//table//tr";
            String columns = "Columns #xpath=//div[contains(@id,'" + tabId.trim() + "')]//div[contains(@class,'table')]//table//tr//th";
            int count = sizeOfLocator(rows);
            int columnCount = sizeOfLocator(columns);
            if (isElementDisplayed(noRecords)) {
                testStepFailed("No Records Displayed. UPDATE TEST DATA");
            } else {
                for (int i = 1; i < count; i++) {
                    for (int j = 1; j <= columnCount; j++) {
                        String header1 = " header #xpath=//div[contains(@id,'" + tabId.trim() + "')]//div[contains(@class,'table')]//table//th[" + j + "]";
                        String headerText = getTextPresent(header1);
                        String label = "Row " + (i) + " : " + headerText + ": #xpath=//div[contains(@id,'" + tabId.trim() + "')]//div[contains(@class,'table')]//table//tr[" + i + "]//td[" + j + "]";
                        verifyElementIsPresentAndGetText(label);
                    }

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed verify Table Contents Bajaj Pay" + e.getClass());
        }
    }

    public void verifyTableContentsBajajPaySingleRecord(String header, String tabId, String tableHeaders, String extra) {

        try {
            String table = "" + header + " Table #xpath=//div[contains(@id,'" + tabId.trim() + "')]//div[contains(@class,'table')]//table";
            verifyElementIsDisplayedOrNot(table);
            verifyFieldsPresentUsingCommonXpathAndMultipleTextWithHash("//div[contains(@id,'" + tabId.trim() + "')]//div[contains(@class,'table')]//table//th", tableHeaders, "");

            String noRecords = "No Data Available #xpath=//div[contains(@id,'" + tabId.trim() + "')]//div[contains(@class,'table')]//table//td[normalize-space(text())='No Data Available']";

            String rows = "Rows #xpath=//div[contains(@id,'" + tabId.trim() + "')]//div[contains(@class,'table')]//table//tr";
            String columns = "Columns #xpath=//div[contains(@id,'" + tabId.trim() + "')]//div[contains(@class,'table')]//table//tr//th";
            int count = sizeOfLocator(rows);
            int columnCount = sizeOfLocator(columns);
            if (isElementDisplayed(noRecords)) {
                testStepFailed("No Records Displayed. UPDATE TEST DATA");
            } else if ((count > 2)) {
                testStepFailed(" More than Single Record is being displayed");
            } else {
                manualScreenshot("Single Record is being displayed as expected");
                for (int i = 1; i < count; i++) {
                    for (int j = 1; j <= columnCount; j++) {
                        String header1 = " header #xpath=//div[contains(@id,'" + tabId.trim() + "')]//div[contains(@class,'table')]//table//th[" + j + "]";
                        String headerText = getTextPresent(header1);
                        String label = "Row " + (i) + " : " + headerText + ": #xpath=//div[contains(@id,'" + tabId.trim() + "')]//div[contains(@class,'table')]//table//tr[" + i + "]//td[" + j + "]";
                        verifyElementIsPresentAndGetText(label);
                    }

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed verify Table Contents Bajaj Pay Single Record" + e.getClass());
        }
    }


    public void verifynoDataAvailable(String id, String text, String extra) {

        try {
            String noRecords = "No Data Available #xpath=//div[contains(@id,'" + id.trim() + "')]//div[contains(@class,'table')]//table//td[normalize-space(text())='" + text.trim() + "']";
            scrollToWebElementIfPresent(noRecords);
            verifyElementIsDisplayedOrNot(noRecords);
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed verify no Data Available" + e.getClass());
        }
    }

    public void verifyCustIDNotAvailableBajajPay(String Labels, String extra) {

        try {
            String custId = "Customer Id #xpath=//p[@class='user-id']//span";
            String shortName = "User Short Name#xpath=//div[@class='profile-short-name']";
            String userName = "User Name#xpath=//p[@class='user-name']";

            String id = getTextPresent(custId);
            System.out.println(id);
            if (id.contains("NA")) {
                manualScreenshot("Customer ID is displaying as NA");
                verifyElementIsDisplayedAndGetText(shortName);
                verifyElementIsDisplayedAndGetText(userName);
                String option = changeCommaToHash(Labels, "");
                String[] split = option.split("#");
                for (int i = 0; i < split.length; i++) {
                    String text = split[i];
                    String label = "Label: " + text + "#xpath=//div[@class='additional-info']//li//p[contains(text(),'" + text.trim() + "')]/following-sibling::strong";
                    String labelValue = getTextPresent(label);
                    if (labelValue.equalsIgnoreCase("NA")) {
                        testStepPassed(getRefOfXpath(label) + " Value is being displayed as NA as expected");
                    } else {
                        testStepFailed(getRefOfXpath(label) + " Value is being displayed as " + labelValue);

                    }
                }
            } else {
                testStepFailed("Customer ID is not NA");
            }

        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed verify Cust ID Not Available Bajaj Pay" + e.getClass());
        }
    }

    public void verifytypeNtbBajajPay(String extra) {

        try {
            String custId = "Customer Id #xpath=//p[@class='user-id']//span";
            String custtype = "Customer Type #xpath=//div[@class='service-div']//li//p[normalize-space(text())='Type']/following-sibling::strong";
            String id = getTextPresent(custId);
            String text = getTextPresent(custtype);
            if (id.contains("NA")) {
                manualScreenshot("Customer ID is displaying as NA");
                if (text.equalsIgnoreCase("NTB")) {
                    testStepPassed(getRefOfXpath(custtype) + " is displayed as expected: NTB");
                } else {
                    testStepFailed(getRefOfXpath(custtype) + " is not displayed as expected: " + custtype);

                }
            } else {
                testStepFailed("Customer ID is not NA");
            }

        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed verify type Ntb Bajaj Pay" + e.getClass());
        }
    }


    //////////Vignesh
    public void clickOnSubTabsCategory(String sub, String extra) {

        try {
            String taboption = "BBPS Sub Tab: " + sub + " : #xpath=//p[text()='" + sub + "']/..";
//        scrollToWebElement(taboption);
            clickOn(taboption);
            waitForPageToLoad();
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed click BBPS Sub Tabs" + e.getClass());
        }
    }

    public void verifyTableContentsBajajPayGames(String header, String tabId, String tableHeaders, String extra) {

        try {
            String table = "" + header + " Table #xpath=//div[contains(@id,'')]//div[contains(@class,'table')]//table";
            verifyElementIsDisplayedOrNot(table);
            verifyFieldsPresentUsingCommonXpathAndMultipleTextWithHash("//div[contains(@id,' " + tabId.trim() + "')]//div[contains(@class,'table')]//table//th", tableHeaders, "");

            String noRecords = "No Data Available #xpath=//div[contains(@id,' " + tabId.trim() + "')]//div[contains(@class,'table')]//table//td[normalize-space(text())='No Data Available']";

            String rows = "Rows #xpath=//div[contains(@id,'')]//div[contains(@class,'table')]//table//tr";
            String columns = "Columns #xpath=//div[contains(@id,'')]//div[contains(@class,'table')]//table//tr//th";
            int count = sizeOfLocator(rows);
            int columnCount = sizeOfLocator(columns);
            if (isElementDisplayed(noRecords)) {
                testStepFailed("No Records Displayed. UPDATE TEST DATA");
            } else {
                for (int i = 1; i < count; i++) {
                    for (int j = 1; j <= columnCount; j++) {
                        String header1 = " header #xpath=//div[contains(@id,'')]//div[contains(@class,'table')]//table//th[" + j + "]";
                        String headerText = getTextPresent(header1);
                        String label = "Row " + (i) + " : " + headerText + ": #xpath=//div[contains(@id,'')]//div[contains(@class,'table')]//table//tr[" + i + "]//td[" + j + "]";
                        verifyElementIsPresentAndGetText(label);
                    }

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed verify Table Contents Bajaj Pay" + e.getClass());
        }
    }

    public void verifyTabsHeader(String tab, String options, String extra) {
        String text = "";
        try {
            String option = changeCommaToHash(options, "");
            String[] split = option.split("#");
            for (int i = 0; i < split.length; i++) {
                text = split[i];
                String locator = "Tab: " + tab + " : " + text + "#xpath=//table//tr/th[text()='" + text + "']";
                scrollToWebElementIfPresent(locator);
                if (isElementDisplayed(locator)) {
                    manualScreenshot(getRefOfXpath(locator) + " is Displayed successfully.");
                } else {
                    testStepFailed(getRefOfXpath(locator) + " is Not Displayed.");
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed verify Tab Sub Options" + e.getClass());
        }
    }


    public void verifycustIdChangeIn3in1Page(String extra) {
        try {

            String custId = "Cust Id#xpath=//select[contains(@class,'aggrement-select')]";
            String custId1 = getSelectedOptionTextFromDropDown(custId, "");
            selectDropDownUsingIndex(DetailsPage.custIddropDown, 2);
            waitTime(2);
            String custId2 = getSelectedOptionTextFromDropDown(custId, "");
            if (!custId2.equalsIgnoreCase(custId1)) {
                testStepPassed("Customer Id " + custId2 + " is selected from Dropdown ");
            } else {
                testStepFailed("Customer Id " + custId2 + " is not selected from Dropdown ");
            }

        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed verify cust Id Change In 3 in 1 Page" + e.getClass());

        }
    }

    public void verifyloanInsightsDetails(String tile, String details, String extra) {
        try {

            String loantile = "Loan Tile " + tile + "#xpath=//h3[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'loaninsights-accoridan-card active')]";
            String accordion = "Loan Tile " + tile + " Accordion#xpath=//h3[normalize-space(text())='" + tile.trim() + "']/ancestor::a[contains(@class,'loaninsights-accoridan-button')]";
            if (isElementDisplayed(loantile)) {
                manualScreenshot(getRefOfXpath(loantile) + " is displayed");
            } else {
                clickOn(accordion);
                verifyElementIsDisplayedOrNot(loantile);
            }

            String[] split = details.split("#");
            for (int i = 0; i < split.length; i++) {
                String label = split[i];
                if (label.equalsIgnoreCase("Last 5 EMI status")) {
                    String labelname = "Label " + label + "#xpath=//h3[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'loaninsights-accoridan-card active')]//ul//li//p[normalize-space(text())='" + label.trim() + "']";
                    String labelValue = "Label " + label + " Value#xpath=//h3[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'loaninsights-accoridan-card active')]//ul//li//p[normalize-space(text())='" + label.trim() + "']/following-sibling::div//p";
                    int size = sizeOfLocator(labelValue);
                    verifyElementIsDisplayedOrNot(labelname);
                    for (int j = 1; j <= size; j++) {
                        String labelValues = "Label " + label + " Value#xpath=(//h3[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'loaninsights-accoridan-card active')]//ul//li//p[normalize-space(text())='" + label.trim() + "']/following-sibling::div//p)[" + j + "]";
                        verifyElementIsDisplayedAndGetText(labelValues);
                    }
                } else {
                    verifyValueUsingLabel(getCommonPathOfLocator(loantile) + "//ul//li//p", label, "/following-sibling::p", "");
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed verify loan Insights Details" + e.getClass());

        }
    }


    public void verifyMultipleLoanInInsights() {
        try {

            String tiles = "Loan Insights Tiles #xpath=//div[contains(@class,'loaninsights-accoridan-card')]";
            String accordion = "Loan Insights Accordion Icons #xpath=//a[@class='loaninsights-accoridan-button']";
            int tilesize = sizeOfLocator(tiles);
            int accordionsize = sizeOfLocator(accordion);

            if (tilesize > 1 && tilesize == accordionsize) {
                manualScreenshot("Dropdown Accordians are being displayed for Customer with Multiple Loans");
            } else {
                testStepFailed("Failed due to Test Data or some other Issue");
            }
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed in verify Multiple Loan In Insights. Exception: " + e.getClass());
        }
    }


    public void underwritingDashboardLabels(String head, String labels, String extra) {
        try {

            verifyFieldDisplayedUsingTagAndText("h6", head, "");
            String[] split = labels.split("#");
            for (int i = 0; i < split.length; i++) {
                String label = split[i];
                verifyValueUsingLabel("//h6[normalize-space(text())='" + head.trim() + "']/ancestor::div[@class='info-card']//li//p", label, "/following-sibling::strong", "");
            }
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at underwriting Dashboard Labels " + e.getClass());
        }

    }

    public void underwritingDashboardLoanSummaryLabels(String head, String labels, String extra) {
        try {

            verifyFieldDisplayedUsingTagAndText("h2", head, "");
            String[] split = labels.split("#");
            for (int i = 0; i < split.length; i++) {
                String label = split[i];
                verifyValueUsingLabel("//h2[normalize-space(text())='" + head.trim() + "']/parent::div[@class='loan-summery-box']//p", label, "/following-sibling::h3", "");
            }
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at underwriting Dashboard Labels " + e.getClass());
        }

    }

    public void underwritingDashboardPortfolioSectionContents(String labels, String extra) {
        try {
            String custPortfolioImg = "Customer Portfolio Image#xpath=//div[@class='customer-portfolio-section']//img[contains(@src,'images/customerporfolio')]";
            String custPortfolioHeader = "Customer Portfolio Header#xpath=//div[@class='cust-port-contant']";
            verifyElementIsDisplayedOrNot(custPortfolioImg);
            verifyDisplayedAndPrintValueUsingLocator(custPortfolioHeader, "");

            String[] split = labels.split("#");
            for (int i = 0; i < split.length; i++) {
                String label = split[i];
                if (label.equalsIgnoreCase("Bounce count")) {
                    verifyValueUsingLabel("//div[@class='ppc-contant-box']//p", label, "/following-sibling::h3//a", "");

                } else {

                    verifyValueUsingLabel("//div[@class='ppc-contant-box']//p", label, "/following-sibling::h3", "");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at underwriting Dashboard Portfolio Section Contents" + e.getClass());
        }

    }


    public String underDashboardValues(String head, String label, String extra) {
        String value = "";
        try {
            String locator = "#xpath=//h6[normalize-space(text())='" + head.trim() + "']/ancestor::div[@class='info-card']//li//p[normalize-space(text())='" + label.trim() + "']/following-sibling::strong";
            value = getTextPresent(locator).replace("\n", " ");
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at under Dashboard Values. Exception: " + e.getClass());
        }
        return value;
    }


    public void verifyEmailIdMaskedUnderwriting(String value, String extra) {
        try {
            if (value.equalsIgnoreCase("NA")) {
                testStepFailed("Need New Test Data. Email Id Unavailable");
            } else {

                String mail = value.split("@")[0];
                verifyMaskedAndUnmaskedFormatUsingValue(mail, "Email ID", "X", 1, 1, true, "0");
            }
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify Email Id Masked Underwriting" + e.getClass());
        }

    }

    public void verifyAddressMaskedUnderwriting(String value, String extra) {
        try {
            if (value.equalsIgnoreCase("NA")) {
                testStepFailed("Need New Test Data. Address Unavailable");
            } else {

                String[] words = value.split("[,\\s]+");
                int num = words.length;
                String unmasked1 = words[num - 1] + words[num - 2] + words[num - 3];
                String masked1 = "";
                for (int i = 0; i < num - 3; i++) {
                    masked1 = masked1 + words[i];
                }

                for (int i = 0; i < masked1.length(); i++) {
                    char a;
                    a = masked1.charAt(i);
                    String b = String.valueOf(a);
                    if (b.equals("X") || b.equals("x")) {
                        testStepPassed("Address at Character " + i + " is Masked Verified Successfully");
                    } else {
                        testStepFailed("Address at Character " + i + " is Not Masked");
                    }
                }

                for (int i = 0; i < unmasked1.length(); i++) {
                    char a;
                    a = unmasked1.charAt(i);
                    String b = String.valueOf(a);
                    if (!(b.equals("X")) && !(b.equals("x"))) {
                        testStepPassed("Address at Character " + i + " is Not Masked Verified ");
                    } else {
                        testStepFailed("Address at Character " + i + " is Masked");
                    }
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify Address Masked Underwriting" + e.getClass());
        }

    }


    public void underWritingaddressFields(String value, String extra) {
        try {
            if (value.equalsIgnoreCase("NA")) {
                testStepFailed("Need New Test Data. Address Unavailable");
            } else {

                String[] words = value.split(" ");
                int num = words.length;
                if (num == 6) {
                    testStepPassed("6 Fields are being displayed as expected");
                    String addr1 = words[0];
                    String addr2 = words[1];
                    String addr3 = words[2];
                    String addr4 = words[3];
                    String addr5 = words[4];
                    String addr6 = words[5];
                    testStepInfo("Address Line 1 is " + addr1);
                    testStepInfo("Address Line 1 is " + addr2);
                    testStepInfo("Address Line 1 is " + addr3);
                    testStepInfo("City is " + addr4);
                    testStepInfo("State is " + addr5);
                    testStepInfo("Pincode is " + addr6);
                } else {
                    testStepFailed("6 Fields are not being displayed as expected");
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed in underWriting address Fields. Exception: " + e.getClass());
        }
    }


    public void captureApptooltips(String locator, String extra) {
        try {
            mouseHover(locator);
            String tooltips = "Tool tip#xpath=//app-tooltips";
            waitForElementUntilVisible(tooltips);
            testStepInfo("Tooltip Text: " + getTextPresent(tooltips));
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at capture App tool tips. Exception: " + e.getClass());
        }
    }

    public String tooltipsText(String locator, String extra) {
        String text = "";
        try {
            mouseHover(locator);
            String tooltips = "Tool tip#xpath=//app-tooltips";
            waitForElementUntilVisible(tooltips);
            testStepInfo("Tooltip Text: " + getTextPresent(tooltips));
            text = getTextPresent(tooltips);
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at tool tips Text. Exception: " + e.getClass());
        }
        return text;
    }


    public void verifyDOBMaskedUnderwritingDashboard(String extra) {
        try {
            String dateof = "Date of Birth: #xpath=//h6[normalize-space(text())='Applicant Details']/ancestor::div[@class='info-card']//li//p[normalize-space(text())='Date of Birth']/following-sibling::strong";
            String value = getTextPresent(dateof);
            if (value.equalsIgnoreCase("NA")) {
                testStepFailed("Need New Test Data. DOB Unavailable");
            } else {
                String[] split = value.split("-");
                String date = split[0];
                String month = split[1];
                String year = split[2];
                for (int i = 0; i < date.length(); i++) {
                    char a;
                    a = date.charAt(i);
                    String b = String.valueOf(a);
                    if (b.equals("X")) {
                        testStepPassed("Date at Character " + i + " is Masked Successfully");
                    } else {
                        testStepFailed("Date at Character " + i + " is not Masked");
                    }
                }

                for (int i = 0; i < month.length(); i++) {
                    char a;
                    a = month.charAt(i);
                    String b = String.valueOf(a);
                    if (b.equals("X")) {
                        testStepPassed("Month at Character " + i + " is Masked Successfully");
                    } else {
                        testStepFailed("Month at Character " + i + " is not Masked");
                    }
                }

                for (int i = 0; i < year.length(); i++) {
                    char a;
                    a = year.charAt(i);
                    String b = String.valueOf(a);
                    if (!b.equals("X")) {
                        testStepPassed("Year at Character " + i + " is Not Masked Verified");
                    } else {
                        testStepFailed("Year at Character " + i + " is Masked");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify DOB Masked Underwriting Dashboard. Exception: " + e.getClass());
        }

    }

    public void verifyTableContentsUnderwritingDashboard(String tableid, String tableHeaders, String extra) {

        try {
            String table = "" + tableid + " Table #xpath=//div[@id='" + tableid.trim() + "']//table";
            verifyElementIsDisplayedOrNot(table);
            verifyFieldsPresentUsingCommonXpathAndMultipleTextWithHash("//div[@id='" + tableid.trim() + "']//table[@class='emi-table']//th", tableHeaders, "");

            String noRecords = "No Records #xpath=//div[@id='" + tableid.trim() + "']//table[@class='emi-table']//td[normalize-space(text())='No Records Found']|//div[@id='" + tableid.trim() + "']//table[@class='emi-table']//td[normalize-space(text())='No records found']";

            String rows = "Rows #xpath=//div[@id='" + tableid.trim() + "']//table[@class='emi-table']//tr";
            String columns = "Columns #xpath=//div[@id='" + tableid.trim() + "']//table[@class='emi-table']//tr//th";
            int count = sizeOfLocator(rows);
            int columnCount = sizeOfLocator(columns);
            if (isElementDisplayed(noRecords)) {
                testStepFailed("No Records Displayed. UPDATE TEST DATA");
            } else {
                for (int i = 1; i < count; i++) {
                    for (int j = 1; j <= columnCount; j++) {
                        String header = " Header #xpath=//div[@id='" + tableid.trim() + "']//table[@class='emi-table']//th[" + j + "]";
                        String headertext = getTextPresent(header);
                        String label = "Row " + (i) + " : " + headertext + ": #xpath=//div[@id='" + tableid.trim() + "']//table[@class='emi-table']//tr[" + i + "]//td[" + j + "]";
                        verifyElementIsPresentAndGetText(label);
                    }

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed verify Table Contents Underwriting Dashboard" + e.getClass());
        }
    }


    public void verifyTableLabelsIconUnderwritingDashboard(String tableid, String tableHeaders, String icon, String extra) {

        try {
            String table = "" + tableid + " Table #xpath=//div[@id='" + tableid.trim() + "']//table[@class='emi-table']";
            verifyElementIsDisplayedOrNot(table);

            String noRecords = "No Records #xpath=//div[@id='" + tableid.trim() + "']//table[@class='emi-table']//td[normalize-space(text())='No Records Found']|//div[@id='" + tableid.trim() + "']//table[@class='emi-table']//td[normalize-space(text())='No records found']";

            String rows = "Rows #xpath=//div[@id='" + tableid.trim() + "']//table[@class='emi-table']//tr";
            String columns = "Columns #xpath=//div[@id='" + tableid.trim() + "']//table[@class='emi-table']//tr//th";
            int count = sizeOfLocator(rows);
            int columnCount = sizeOfLocator(columns);
            int position = 0;

            if (isElementDisplayed(noRecords)) {
                testStepFailed("No Records Displayed. UPDATE TEST DATA");
            } else {
                for (int i = 1; i <= columnCount; i++) {
                    String header = " Header #xpath=//div[@id='" + tableid.trim() + "']//table[@class='emi-table']//th[" + i + "]";
                    String headertext = getTextPresent(header);
                    if (headertext.equalsIgnoreCase(tableHeaders)) {
                        manualScreenshot(tableHeaders + " is present at Position " + i);
                        position = i;
                        break;
                    }
                }

                if (icon.equalsIgnoreCase("Reports")) {
                    for (int i = 1; i < count; i++) {
                        String label = "Row " + (i) + " : " + tableHeaders + ": #xpath=//div[@id='" + tableid.trim() + "']//table[@class='emi-table']//tr[" + i + "]//td[" + position + "]//img[contains(@src,'images/pdf-download-img')]";
                        verifyElementIsDisplayedUsingLocator(label);

                    }
                }

                if (icon.equalsIgnoreCase("SMS")) {
                    for (int i = 1; i < count; i++) {
                        String label = "Row " + (i) + " : " + tableHeaders + ": #xpath=//div[@id='" + tableid.trim() + "']//table[@class='emi-table']//tr[" + i + "]//td[" + position + "]//img[contains(@src,'images/comment-icon')]";
                        verifyElementIsDisplayedUsingLocator(label);

                    }
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed verify Table Labels Icon Underwriting Dashboard" + e.getClass());
        }
    }


    public void verifyTableLabelsUnderwritingDashboard(String tableid, String tableHeaders, String extra) {

        try {
            String table = "" + tableid + " Table #xpath=//div[@id='" + tableid.trim() + "']//table[@class='emi-table']";
            verifyElementIsDisplayedOrNot(table);

            String noRecords = "No Records #xpath=//div[@id='" + tableid.trim() + "']//table[@class='emi-table']//td[normalize-space(text())='No Records Found']|//div[@id='" + tableid.trim() + "']//table[@class='emi-table']//td[normalize-space(text())='No Data Available']|//div[@id='" + tableid.trim() + "']//table[@class='emi-table']//td[normalize-space(text())='No records found']";

            String rows = "Rows #xpath=//div[@id='" + tableid.trim() + "']//table[@class='emi-table']//tr";
            String columns = "Columns #xpath=//div[@id='" + tableid.trim() + "']//table[@class='emi-table']//tr//th";
            int count = sizeOfLocator(rows);
            int columnCount = sizeOfLocator(columns);
            int position = 0;

            if (isElementDisplayed(noRecords)) {
                testStepFailed("No Records Displayed. UPDATE TEST DATA");
            } else {
                for (int i = 1; i <= columnCount; i++) {
                    String header = " Header #xpath=//div[@id='" + tableid.trim() + "']//table[@class='emi-table']//th[" + i + "]";
                    String headertext = getTextPresent(header);
                    if (headertext.equalsIgnoreCase(tableHeaders)) {
                        manualScreenshot(tableHeaders + " is present at Position " + i);
                        position = i;
                        break;
                    }
                }

                for (int i = 1; i < count; i++) {
                    String label = "Row " + (i) + " : " + tableHeaders + ": #xpath=//div[@id='" + tableid.trim() + "']//table[@class='emi-table']//tr[" + i + "]//td[" + position + "]";
                    verifyElementIsPresentAndGetText(label);

                }


            }
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed verify Table Labels Underwriting Dashboard" + e.getClass());
        }
    }

    public void verifyTableLabelsValueUnderwritingDashboard(String tableid, String tableHeaders, String value, String extra) {

        try {
            String table = "" + tableid + " Table #xpath=//div[@id='" + tableid.trim() + "']//table[@class='emi-table']";
            verifyElementIsDisplayedOrNot(table);

            String noRecords = "No Records #xpath=//div[@id='" + tableid.trim() + "']//table[@class='emi-table']//td[normalize-space(text())='No Records Found']|//div[@id='" + tableid.trim() + "']//table[@class='emi-table']//td[normalize-space(text())='No Data Available']|//div[@id='" + tableid.trim() + "']//table[@class='emi-table']//td[normalize-space(text())='No records found']";

            String rows = "Rows #xpath=//div[@id='" + tableid.trim() + "']//table[@class='emi-table']//tr";
            String columns = "Columns #xpath=//div[@id='" + tableid.trim() + "']//table[@class='emi-table']//tr//th";
            int count = sizeOfLocator(rows);
            int columnCount = sizeOfLocator(columns);
            int position = 0;

            if (isElementDisplayed(noRecords)) {
                testStepFailed("No Records Displayed. UPDATE TEST DATA");
            } else {
                for (int i = 1; i <= columnCount; i++) {
                    String header = " Header #xpath=//div[@id='" + tableid.trim() + "']//table[@class='emi-table']//th[" + i + "]";
                    String headertext = getTextPresent(header);
                    if (headertext.equalsIgnoreCase(tableHeaders)) {
                        manualScreenshot(tableHeaders + " is present at Position " + i);
                        position = i;
                        break;
                    }
                }

                for (int i = 1; i < count; i++) {
                    String label = "Row " + (i) + " : " + tableHeaders + ": #xpath=//div[@id='" + tableid.trim() + "']//table[@class='emi-table']//tr[" + i + "]//td[" + position + "]";
                    verifyGetTextUsingLocatorAndCompareWithText(label, value, "");

                }


            }
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed verify Table Labels Value Underwriting Dashboard" + e.getClass());
        }
    }


    public void verifyTableLabelsDisplayedUnderwritingDashboardFreeze(String tableid, String tableHeaders, String extra) {

        try {
            String table = "" + tableid + " Table #xpath=//div[@id='" + tableid.trim() + "']//table[@class='emi-table']";
            verifyElementIsDisplayedOrNot(table);

            String noRecords = "No Records #xpath=//div[@id='" + tableid.trim() + "']//table[@class='emi-table']//td[normalize-space(text())='No Records Found']|//div[@id='" + tableid.trim() + "']//table[@class='emi-table']//td[normalize-space(text())='No Data Available']|//div[@id='" + tableid.trim() + "']//table[@class='emi-table']//td[normalize-space(text())='No records found']";

            String rows = "Rows #xpath=//div[@id='" + tableid.trim() + "']//table[@class='emi-table']//tr";
            String columns = "Columns #xpath=//div[@id='" + tableid.trim() + "']//table[@class='emi-table']//tr//th";
            int count = sizeOfLocator(rows);
            int columnCount = sizeOfLocator(columns);
            int position = 0;

            if (isElementDisplayed(noRecords)) {
                testStepFailed("No Records Displayed. UPDATE TEST DATA");
            } else {
                for (int i = 1; i <= columnCount; i++) {
                    String header = " Header #xpath=//div[@id='" + tableid.trim() + "']//table[@class='emi-table']//th[" + i + "]";
                    String headertext = getTextPresent(header);
                    if (headertext.equalsIgnoreCase(tableHeaders)) {
                        manualScreenshot(tableHeaders + " is present at Position " + i);
                        position = i;
                        break;
                    }
                }

                for (int i = 1; i < count; i++) {
                    String label = "Row " + (i) + " : " + tableHeaders + ": #xpath=//div[@id='" + tableid.trim() + "']//table[@class='emi-table']//tr[" + i + "]//td[" + position + "]";
//                    verifyElementIsDisplayedAndGetText(label);
                    checkVisibility(driver, liveTradeline, label);
                }


            }
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed verify Table Labels Underwriting Dashboard" + e.getClass());
        }
    }

    public void checkVisibility(WebDriver driver, String container, String element) {
        try {
            boolean isVisible = isElementInHorizontalView(driver, container, element);

            if (isVisible) {
                testStepPassed(getRefOfXpath(element) + " is visible after Scroll");
            } else {
                testStepFailed(getRefOfXpath(element) + " is not visible after Scroll");
            }
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at check Visibility. Exception: " + e.getClass());
        }
    }


    public void verifyIdentificationTableContentsUnderwritingDashboard(String tableClass, String tableHeaders, String extra) {

        try {
            String table = "" + tableClass + " Table #xpath=//div[@class='" + tableClass.trim() + "']//table[@class='emi-table']";
            verifyElementIsDisplayedOrNot(table);
            verifyFieldsPresentUsingCommonXpathAndMultipleTextWithHash("//div[@class='" + tableClass.trim() + "']//table[@class='emi-table']//th", tableHeaders, "");

            String noRecords = "No Records #xpath=//div[@class='" + tableClass.trim() + "']//table[@class='emi-table']//td[normalize-space(text())='No Records Found']|//div[@class='" + tableClass.trim() + "']//table[@class='emi-table']//td[normalize-space(text())='No records found']";

            String rows = "Rows #xpath=//div[@class='" + tableClass.trim() + "']//table[@class='emi-table']//tr";
            String columns = "Columns #xpath=//div[@class='" + tableClass.trim() + "']//table[@class='emi-table']//tr//th";
            int count = sizeOfLocator(rows);
            int columnCount = sizeOfLocator(columns);

            Map<String, String> map = new HashMap<>();

            if (isElementDisplayed(noRecords)) {
                testStepFailed("No Records Displayed. UPDATE TEST DATA");
            } else {

                for (int i = 1; i < count; i++) {
                    String header = "Row " + i + " Identification Type: #xpath=//div[@class='" + tableClass.trim() + "']//table[@class='emi-table']//tr[" + i + "]//td[1]";
                    String value = "Row " + i + "  Identification Number #xpath=//div[@class='" + tableClass.trim() + "']//table[@class='emi-table']//tr[" + i + "]//td[2]";

                    String headerValue = getTextPresent(header);
                    String headerValue2 = getTextPresent(value);

                    manualScreenshot(getRefOfXpath(header) + " is " + headerValue + " & " + getRefOfXpath(value) + " is " + headerValue2);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed verify Identification Table Contents Underwriting Dashboard" + e.getClass());
        }
    }


    public void consentNudgeLoanTile(String tile, String text, String extra) {
        try {
            String locator = "Tile " + tile + "#xpath=//h5[contains(text(),'" + tile.trim() + "')]";
            verifyGetTextContains(locator, text);
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at consent Nudge Loan Tile. Exception: " + e.getClass());
        }
    }

    public void consentNoNudgeLoanTile(String tile, String text, String extra) {
        try {
            String locator = "Tile " + tile + "#xpath=//h5[contains(text(),'" + tile.trim() + "')]";
            String text1 = getTextPresent(locator);
            if (!text1.contains(text)) {
                testStepPassed(getRefOfXpath(locator) + " does not contain " + text + " verified");
            } else {
                testStepFailed(getRefOfXpath(locator) + " contains " + text);
            }
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at consent No Nudge Loan Tile. Exception: " + e.getClass());
        }
    }


    public void verifyConsentSMSDocDisplayed(String relation, String doc, String extra) {
        try {

            String document = "Document: " + doc + " #xpath=//h5[contains(text(),'" + relation + "')]/../../..//ancestor::div[contains(@class,'tab-info-card blue')]/descendant::div[contains(@class,'documents')]//p[normalize-space(text())='" + doc.trim() + "']";
            String documentLogo = "Document Logo: " + doc + " #xpath=//h5[contains(text(),'" + relation + "')]/../../..//ancestor::div[contains(@class,'tab-info-card blue')]/descendant::div[contains(@class,'documents')]//p[normalize-space(text())='" + doc.trim() + "']/preceding-sibling::img";
            verifyElementIsDisplayedOrNot(document);
            verifyElementIsDisplayedOrNot(documentLogo);
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify Consent SMS Doc Displayed " + e.getClass());
        }

    }

    public void verifyConsentSMSDocNotDisplayed(String relation, String doc, String extra) {
        try {

            String document = "Document: " + doc + " #xpath=//h5[contains(text(),'" + relation + "')]/../../..//ancestor::div[contains(@class,'tab-info-card blue')]/descendant::div[contains(@class,'documents')]//p[normalize-space(text())='" + doc.trim() + "']";
            String documentLogo = "Document Logo: " + doc + " #xpath=//h5[contains(text(),'" + relation + "')]/../../..//ancestor::div[contains(@class,'tab-info-card blue')]/descendant::div[contains(@class,'documents')]//p[normalize-space(text())='" + doc.trim() + "']/preceding-sibling::img";
            verifyElementIsNotDisplayedUsingLocator(document);
            verifyElementIsNotDisplayedUsingLocator(documentLogo);
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify Consent SMS Doc Not Displayed " + e.getClass());
        }

    }

    public void clickBPaySubMenuTabs(String tab, String extra) {

        try {
            String taboption = "Bpay Sub Tab: " + tab + " : #xpath=//p[normalize-space(text())='" + tab.trim() + "']/ancestor::div[contains(@class,'bajaj-pay-main')]//a";
            scrollToWebElement(taboption);
            clickOn(taboption);
            waitForPageToLoad();
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed click BBPS Tabs" + e.getClass());
        }
    }

    public void clickBPaySubMenuTabsOptions(String submenu, String sub) {

        try {
            String taboption = submenu + " Sub Tab: " + sub + " : #xpath=//p[normalize-space(text())='" + sub.trim() + "']/ancestor::a[contains(@class,'bj-submenu-tabbtn')]|//p[normalize-space(text())='" + sub.trim() + "']/ancestor::a[contains(@class,'submenu')]";
            scrollToWebElement(taboption);
            clickOn(taboption);
            waitForPageToLoad();
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed click BBPS Sub Tabs" + e.getClass());
        }
    }

    public void verifyBPaySubMenuTableHeaders(String expectedHeadr) {
        try {
            String commonBPaySubMenuTable = "BpaySubMenuTable #xpath=//table[@class='emi-table']";

            String baseXpath = " Table Column#xpath=//table[@class='emi-table']//tr//th[%d]";

            String[] expectedHeaders = expectedHeadr.split("#");

            if (isElementDisplayed(commonBPaySubMenuTable)) {
                for (int i = 1; i < expectedHeaders.length; i++) {
                    String locator = String.format(expectedHeaders[i] + baseXpath, i + 1);
                    verifyGetTextUsingLocatorAndCompareWithText(locator, expectedHeaders[i], "");
                }
            } else {
                testStepFailed("Table not displayed.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify BPay Sub Menu Table Headers" + e.getClass());
        }
    }

    public void verifyTableDetailsDisplayedWithIn2Sec(String locator) {
        try {
            if (isElementDisplayedWithWait(locator)) {
                scrollToWebElement(locator);
                testStepPassed("Table details displayed with in 2 second");
            } else if (isElementDisplayedWithWait(bpaySubMenuNoDataAvailableMessage)) {
                testStepFailed("No Data Available message displayed.");
            } else {
                testStepFailed("Table not displayed.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify No Data Availabel Message Not Displayed" + e.getClass());
        }
    }

    public void verifyDisbursementDatePastorFuture(String label, String tile, String type, String extra) {
        try {
            verifyValueUsingLabel("//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card blue')]//div[contains(@class,'amount-info-part')]//div[contains(@class,'label')]", label, "/following-sibling::div[contains(@class,'value')]", "");
            String locator = "Disbursement Date #xpath=//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card blue')]//div[contains(@class,'amount-info-part')]//div[contains(@class,'label')][normalize-space(text())='" + label.trim() + "']/following-sibling::div[contains(@class,'value')]";
            DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String date = getTextPresent(locator);
            Date date1 = sdf.parse(date);
            String date2 = generateTodayDate("dd/MM/yyyy");
            Date date3 = sdf.parse(date2);
            if (type.equalsIgnoreCase("past")) {
                boolean pastDate = compareDates(date1, date3, true);
                if (pastDate) {
                    testStepPassed(date1 + " is of Past Date Verified Successfully");
                } else {
                    testStepFailed(date1 + " is not a Past Date");
                }
            } else {
                boolean futureDate = compareDates(date1, date3, false);
                if (futureDate) {
                    testStepPassed(date1 + " is of Future Date Verified Successfully");
                } else {
                    testStepFailed(date1 + " is not a Future Date");
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify Disbursement Date Past or Future" + e.getClass());
        }
    }

    public void verifyFCDocActive(String relation, String doc, String extra) {
        try {

            String document = "Active Document: " + doc + "#xpath=//h5[normalize-space(text())='" + relation.trim() + "']/ancestor::div[contains(@class,'tab-info-card blue')]/descendant::div[contains(@class,'documents')]//p[normalize-space(text())='" + doc.trim() + "']/parent::a[@class='download-document']";
            verifyElementIsDisplayedOrNot(document);
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify FC Doc Active " + e.getClass());
        }

    }

    public void verifyFCDocGreyed(String relation, String doc, String extra) {
        try {

            String document = "Disabled Document: " + doc + "#xpath=//h5[normalize-space(text())='" + relation.trim() + "']/ancestor::div[contains(@class,'tab-info-card blue')]/descendant::div[contains(@class,'documents')]//p[normalize-space(text())='" + doc.trim() + "']/parent::a[contains(@class,'disabled')]";
            verifyElementIsDisplayedOrNot(document);
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify FC Doc Greyed " + e.getClass());
        }

    }

    public void personalInfoLabelsThroughIteration(String labels, String extra) {
        try {
            verifyFieldDisplayedUsingTagAndText("h6", "PERSONAL INFO", "");

            String[] split = labels.split(", ");
            for (int i = 0; i < split.length; i++) {
                String text = split[i];
                verifyValueUsingLabel("//div[@class='additional-info']//li//p", text, "/following-sibling::strong", "");
            }
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at personal Info Labels Through Iteration" + e.getClass());
        }

    }


    public void serviceSegmentSectionDashboardPageThroughIteration(String labels, String extra) {
        try {
            verifyFieldDisplayedUsingTagAndText("h6", "SERVICE SEGMENT", "");

            String[] split = labels.split(", ");
            for (int i = 0; i < split.length; i++) {
                String text = split[i];
                verifyValueUsingLabel("//div[@class='service-div']//li//p", text, "/following-sibling::strong", "");
            }
//            verifyValueUsingLabel("//div[@class='service-div']//li//p", "Mandate Status", "/following-sibling::a//strong", "");

        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at service Segment Section DashboardPage Through Iteration" + e.getClass());
        }

    }


}
