package pageobjects;

import base.ApplicationKeywords;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;


public class DetailsPage extends ApplicationKeywords {


    /////////////////////////XPaths
    public static final String selectDataFd = "Select Data Calendar#xpath=//div[@class='send-date-box']";
    public static final String selectDataFdInput = "Select Date Calendar Box#xpath=//input[@class='send-date-input']";
    public static final String bclDownload = "BCL Report Download#xpath=//p[normalize-space(text())='Balance Confirmation Letter']/..//button";
    public static final String tdsDownload = "TDS Report Download#xpath=//p[normalize-space(text())='TDS Certificate']/..//button";
    public static final String bankAccountBankDetailsPage = "Bank Account Bank Details Page#xpath=//div[@id='fd-details']//h2[normalize-space(text())='Bank Details']/following-sibling::div//p[normalize-space(text())='Bank Account']/following-sibling::h3";
    public static final String dobNomineeDetailsPage = "DOB Nominee Details Page#xpath=//div[@id='fd-details']//h2[normalize-space(text())='Nominee Details']/following-sibling::div//p[normalize-space(text())='DOB']/following-sibling::h3";
    public static final String maturityInstruction = "Maturity Instruction #xpath=//div[@id='fd-details']//h2[normalize-space(text())='Fixed Deposit Details']/following-sibling::div//p[normalize-space(text())='Maturity Instruction']/following-sibling::h3";

    public static final String depositdropDown = "Relation Selector Dropdown #xpath=//select[contains(@class,'aggrement-select')]";
    public static final String custIddropDown = "Customer ID Selector Dropdown #xpath=//select[contains(@class,'aggrement-select')]";
    public static final String custIddropDownAgreementPage = "Customer ID Selector Dropdown #xpath=//p[normalize-space(text())='Customer Id']//select[contains(@class,'aggrement-select')]";

    public static final String disburseAccountNo = "Disbursement Account No#xpath=//h2[normalize-space(text())='Disbursment Banking Details']/parent::div/descendant::table[@class='emi-table']//tr[1]//td[3]";
    public static final String disburseAmount = "Disbursement Amount#xpath=//h2[normalize-space(text())='Disbursment Banking Details']/parent::div/descendant::table[@class='emi-table']//tr[1]//td[7]";
    public static final String dateCardBlockStatus = "Card Block/Unblock Status - Date#xpath=//h2[normalize-space(text())='Card Block/Unblock Status']/parent::div/descendant::table[@class='emi-table']//tr//td[1]";

    public static final String ctrReportLogo = "CTR Report for First Column #xpath=//h2[normalize-space(text())='CTR Report']/parent::div/descendant::table[@class='emi-table']//tr[1]//td[3]//img[contains(@src,'images/pdf-download-img')]";
    public static final String smsSendSMSLogo = "Send SMS for First Column #xpath=//h2[normalize-space(text())='CTR Report']/parent::div/descendant::table[@class='emi-table']//tr[1]//td[4]//img[contains(@src,'images/comment-icon')]";
    public static final String ctrPasswordBox = "CTR Validation Page Password Box #xpath=//input[@id='txtPassword']";
    public static final String ctrSubmitButton = "CTR Validation Page Submit Button #xpath=//input[@id='btnsubmit']";

    public static final String lanDropdownCreditSummary = "LAN Dropdown #xpath=//p[normalize-space(text())='LAN']/following-sibling::select[contains(@class,'aggrement-select')]";
    public static final String coApplicantDropdownCreditSummary = "CO Applicant Dropdown #xpath=//p[normalize-space(text())='CoApplicant Customer ID']/following-sibling::select[contains(@class,'aggrement-select')]";

    public static final String financialYearDropdown = "Financial Year Dropdown #xpath=//p[normalize-space(text())='Financial Year']/following-sibling::select[contains(@class,'aggrement-select')][1]";
    public static final String quarterDropdown = "Quarter Dropdown #xpath=//p[normalize-space(text())='Quarter']/following-sibling::select[contains(@class,'aggrement-select')]";
    public static final String disclaimerPrematurity = "Prematurity Disclaimer #xpath=//h2[normalize-space(text())='Disclaimer:']/following-sibling::h3";
    public static final String disclaimerDeviceFinance = "Device Finance Disclaimer #xpath=//p[@class='disclaimer']";
    public static final String favouriteStatus = "Favourite Status #xpath=//h2[normalize-space(text())='Flexi Lite and Favourite Status']/following-sibling::div//p[normalize-space(text())='Favourite Status']/following-sibling::h3";

    public static final String agreementDropGstPage = "Agreement Number Dropdown#xpath=//p[normalize-space(text())='Agreement Number']/following-sibling::select";
    public static final String invoiceDropGstPage = "Invoice Number Dropdown#xpath=//p[normalize-space(text())='Invoice Number']/following-sibling::select";
    public static final String creditNoteGstPage = "Invoice Number Dropdown#xpath=//td[normalize-space(text())='credit note']";

    public static final String bureauDropBureauInsightPage = "Bureau Dropdown #xpath=//p[normalize-space(text())='Bureau']/following-sibling::select";
    public static final String productDropBureauInsightPage = "Product Dropdown #xpath=//p[normalize-space(text())='Product']/following-sibling::select";
    public static final String processDropBureauInsightPage = "Process Dropdown #xpath=//p[normalize-space(text())='Process']/following-sibling::select";
    public static final String ownerDropBureauInsightPage = "Ownership Type Dropdown #xpath=//p[normalize-space(text())='Ownership Type']/following-sibling::select";
    public static final String generatePdfButtonBureauInsightPage = "Generate Pdf Button #xpath=//p[normalize-space(text())='Generate PDF']/parent::button";

    public static final String repayBankAccNo = "Repayment Bank A/c No. #xpath=//h2[normalize-space(text())='Sourcing Information']/following-sibling::div//p[normalize-space(text())='Repayment Bank A/c No.']/following-sibling::h3";


    //////////////////Methods
    public void verifyLogosLhsMenusFDDetailsPage(String menus, String extra) {

        try {
            String[] opt = menus.split(", ");
            for (int i = 0; i < opt.length; i++) {
                String menu = opt[i];
                String logo = " " + menu + " Logo#xpath=//ul[@class='loan-details-ul']//a//p[normalize-space(text())='" + menu + "']/preceding-sibling::img";
                verifyElementIsDisplayedOrNot(logo);
            }
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed verify Logos Lhs Menus FD Details Page" + e.getClass());
        }
    }

    public void clickLhsTabsFDDetailsPage(String menu, String extra) {

        try {
            String tab = " " + menu + " in LHS #xpath=//p[normalize-space(text())='" + menu.trim() + "']/ancestor::a";
            String activetab = " " + menu + " in LHS Selected #xpath=//p[normalize-space(text())='" + menu.trim() + "']/ancestor::a[contains(@class,'active')]";
            clickOn(tab);
            waitTime(2);
            if (menu.equalsIgnoreCase("DEBT MGMT") || menu.equalsIgnoreCase("Charges")) {
            } else {
                verifyElementIsDisplayedOrNot(activetab);
            }
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed click Lhs Tabs FD Details Page" + e.getClass());
        }
    }

    public void verifyLabelsFDDetailsPage(String menus, String section, String extra) {

        try {
            String[] opt = menus.split(", ");
            for (int i = 0; i < opt.length; i++) {
                String menu = opt[i];
                verifyValueUsingLabel("//h2[normalize-space(text())='" + section.trim() + "']/following::div//p", menu, "/following-sibling::h3", "");
            }
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed verify Labels FD Details Page" + e.getClass());
        }
    }

    public void verifyReportsFDDetailsPage(String menus, String section, String extra) {

        try {
            String[] opt = menus.split(", ");
            for (int i = 0; i < opt.length; i++) {
                String menu = opt[i];
                String locator = "" + menu + "#xpath=//div[@id='fd-details']//h2[normalize-space(text())='" + section.trim() + "']/following-sibling::div//p[normalize-space(text())='" + menu.trim() + "']";
                String locatorLogo = "" + menu + " Logo#xpath=//div[@id='fd-details']//h2[normalize-space(text())='" + section.trim() + "']/following-sibling::div//p[normalize-space(text())='" + menu.trim() + "']/..//button";
                verifyElementIsDisplayedOrNot(locator);
                verifyElementIsDisplayedOrNot(locatorLogo);
            }
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed verify Reports FD Details Page" + e.getClass());
        }
    }

    public void verifyDepositSelectorDropdown(String extra) {

        try {
            String drop = "Deposit Selector Dropdown #xpath=//select[contains(@class,'aggrement-select')]/parent::div";
            String locator = "Deposit Selector Dropdown #xpath=//select[contains(@class,'aggrement-select')]//option";
            verifyElementIsDisplayedOrNot(drop);
            int size = sizeOfLocator(locator);
            if (size > 1) {
                testStepPassed("Multiple Deposits are being displayed in Dropdown " + size);
            } else {
                testStepFailed("Multiple Deposits are not being displayed in Dropdown");
            }
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed verify Deposit Selector Dropdown" + e.getClass());
        }
    }

    public void verifyDepositSelectorDropdownRefresh(String opt, String extra) {

        try {
            String locator = "Label #xpath=//h2[normalize-space(text())='Fixed Deposit Details']/following-sibling::div//p[normalize-space(text())='Portal ID']/following-sibling::h3";
            String portal1 = getTextPresent(locator);
            selectDropDownUsingText(DetailsPage.depositdropDown, opt);
            waitTime(5);
            String portal2 = getTextPresent(locator);
            if (!portal1.equalsIgnoreCase(portal2)) {
                testStepPassed("Page has refreshed Automatically on selection of new Deposit");
            } else {
                testStepFailed("Page has not refreshed Automatically on selection of new Deposit");
            }

        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed verify Deposit Selector Dropdown Refresh" + e.getClass());
        }
    }

    public void verifyCoDepositSelectorDropdownRefresh(String opt, String extra) {

        try {
            String locator = "Label #xpath=//h2[normalize-space(text())='Fixed Deposit Details']/following-sibling::div//p[normalize-space(text())='Portal ID']/following-sibling::h3";
            String portal1 = getTextPresent(locator);
            selectDropDownUsingText(DetailsPage.depositdropDown, opt);
            waitTime(5);
            String portal2 = getTextPresent(locator);
            if (!portal1.equalsIgnoreCase(portal2)) {
                testStepPassed("Page has refreshed Automatically on selection of new Deposit");
            } else {
                testStepFailed("Page has not refreshed Automatically on selection of new Deposit");
            }

        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed verify Co Deposit Selector Dropdown Refresh" + e.getClass());
        }
    }

    public void verifyTableContentsDetailsPageFlexiDisbu(String tab, String tableHeaders, String extra) {

        try {
            String table = "" + tab + " Table #xpath=//h2[normalize-space(text())='" + tab.trim() + "']/parent::div/descendant::table[@class='emi-table']";
            verifyElementIsDisplayedOrNot(table);
            verifyFieldsPresentUsingCommonXpathAndMultipleTextWithHash("//h2[normalize-space(text())='" + tab.trim() + "']/parent::div/descendant::table[@class='emi-table']//th", tableHeaders, "");

            String noRecords = "No Records #xpath=//h2[normalize-space(text())='" + tab.trim() + "']/parent::div/descendant::table[@class='emi-table']//td[normalize-space(text())='No Records Found']|//h2[normalize-space(text())='" + tab.trim() + "']/parent::div/descendant::table[@class='emi-table']//td[normalize-space(text())='No records found']|//h2[normalize-space(text())='" + tab.trim() + "']/parent::div/descendant::table[@class='emi-table']//td[normalize-space(text())='No record found']";

            String rows = "Rows #xpath=//h2[normalize-space(text())='" + tab.trim() + "']/parent::div/descendant::table[@class='emi-table']//tr";
            String columns = "Columns #xpath=//h2[normalize-space(text())='" + tab.trim() + "']/parent::div/descendant::table[@class='emi-table']//tr//th";
            int count = sizeOfLocator(rows);
            int columnCount = sizeOfLocator(columns);
            if (isElementDisplayed(noRecords)) {
                testStepFailed("No Records Displayed. UPDATE TEST DATA");
            } else {
                for (int i = 1; i < count; i++) {
                    for (int j = 1; j <= columnCount; j++) {
                        String header = " Header #xpath=//h2[normalize-space(text())='" + tab.trim() + "']/parent::div/descendant::table[@class='emi-table']//th[" + j + "]";
                        String headertext = getTextPresent(header);
                        String label = "Row " + (i) + " : " + headertext + ": #xpath=//h2[normalize-space(text())='" + tab.trim() + "']/parent::div/descendant::table[@class='emi-table']//tr[" + i + "]//td[" + j + "]";
                        verifyElementIsPresentAndGetText(label);
                    }

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed verify Table Contents Details Page Flexi Disbu" + e.getClass());
        }
    }

    public void verifyTableContentsDetailsPageDeviceFinance(String tab, String id, String tableHeaders, String extra) {

        try {
            String table = "" + tab + " Table #xpath=//div[@id='" + id.trim() + "']/descendant::table[@class='emi-table']";
            verifyElementIsDisplayedOrNot(table);
            verifyFieldsPresentUsingCommonXpathAndMultipleTextWithHash("//div[@id='" + id.trim() + "']/descendant::table[@class='emi-table']//th", tableHeaders, "");


            String noRecords = "No Records #xpath=//div[@id='" + id.trim() + "']/descendant::table[@class='emi-table']//td[normalize-space(text())='No Records Found']";
            String rows = "Rows #xpath=//div[@id='" + id.trim() + "']/descendant::table[@class='emi-table']//tr";
            String columns = "Columns #xpath=//div[@id='" + id.trim() + "']/descendant::table[@class='emi-table']//tr//th";
            int count = sizeOfLocator(rows);
            int columnCount = sizeOfLocator(columns);

            if (isElementDisplayed(noRecords)) {
                testStepFailed("No Records Displayed. UPDATE TEST DATA");
            } else {
                for (int i = 1; i < count; i++) {
                    for (int j = 1; j <= columnCount; j++) {
                        String header = " Header #xpath=//div[@id='" + id.trim() + "']/descendant::table[@class='emi-table']//th[" + j + "]";
                        String headertext = getTextPresent(header);
                        String label = "Row " + (i) + " : " + headertext + ": #xpath=//div[@id='" + id.trim() + "']/descendant::table[@class='emi-table']//tr[" + i + "]//td[" + j + "]";
                        verifyElementIsPresentAndGetText(label);
                    }

                }
            }


        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed verify Table Contents Details Page Device Finance" + e.getClass());
        }
    }

    ///////Loan
    public void verifyLoanSelectorDropdownRefresh(String relation, String opt, String tab, String label, String extra) {

        try {
            String locator = " Label #xpath=//h2[normalize-space(text())='" + tab.trim() + "']/following-sibling::div//p[normalize-space(text())='" + label.trim() + "']/following-sibling::h3";
            String portal1 = getTextPresent(locator);
            selectDropDownUsingText(DetailsPage.depositdropDown, opt);
            waitTime(5);
            String portal2 = getTextPresent(locator);
            if (!portal1.equalsIgnoreCase(portal2)) {
                testStepPassed("Page has refreshed Automatically on selection of new " + relation + "");
            } else {
                testStepFailed("Page has not refreshed Automatically on selection of new " + relation + "");
            }

        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed verify Loan Selector Dropdown Refresh" + e.getClass());
        }
    }

    public void verifynoDataAvailable(String tab, String text, String extra) {

        try {
            String noRecords = "No Records #xpath=//h2[normalize-space(text())='" + tab.trim() + "']/parent::div/descendant::table[@class='emi-table']//td[normalize-space(text())='" + text.trim() + "']|//h3[normalize-space(text())='" + tab.trim() + "']/following-sibling::div[contains(@class,'loandetails-contant')][1]//table[@class='emi-table']//td[normalize-space(text())='" + text.trim() + "']";
            scrollToWebElementIfPresent(noRecords);
            verifyElementIsDisplayedOrNot(noRecords);
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed verify no Data Available" + e.getClass());
        }
    }

    public void verifyDisburseBankAmount(String extra) {

        try {
            String value = getTextPresent(DetailsPage.disburseAmount);
            String[] spl = value.split("\\.");
            if (value.contains(".")) {
                manualScreenshot(getRefOfXpath(DetailsPage.disburseAmount) + "has Decimal Value verified Successfully");
                int len = spl[1].length();
                if (len == 2) {
                    testStepPassed(getRefOfXpath(DetailsPage.disburseAmount) + "has 2 Decimal Places Verified Successfully");
                } else {
                    testStepFailed(getRefOfXpath(DetailsPage.disburseAmount) + " does not have 2 Decimal Places");

                }
            } else {
                testStepFailed(getRefOfXpath(DetailsPage.disburseAmount) + "has no Decimal Value");
            }
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed verify Disburse Bank Amount" + e.getClass());
        }
    }


    public void verifyRaiseSRUrl(String credentials, String extra) {

        try {
            String url = driver.getCurrentUrl();
            String[] words = credentials.split(", ");
            int len = words.length;
            for (int i = 0; i < len; i++) {
                String word = words[i];
                if (word.equalsIgnoreCase("emailid")) {
                    String encrypted = url.split(word + "=")[1];
                    if (url.contains(word)) {
                        testStepPassed(word + " is passed in the Url in Encrypted form: " + encrypted);
                    } else {
                        testStepFailed(word + " is not passed in the Url");
                    }

                } else {
                    String encrypted = url.split(word + "=")[1].split("==")[0];
                    if (url.contains(word)) {
                        testStepPassed(word + " is passed in the Url in Encrypted form: " + encrypted);
                    } else {
                        testStepFailed(word + " is not passed in the Url");
                    }

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed verify Raise SR Url" + e.getClass());
        }
    }


    public void verifyOfferAmountOfferPage(String tab, String extra) {

        try {

            String noRecords = "No Records #xpath=//h2[normalize-space(text())='" + tab.trim() + "']/parent::div/descendant::table[@class='emi-table']//td[normalize-space(text())='No Records Found']|//h2[normalize-space(text())='" + tab.trim() + "']/parent::div/descendant::table[@class='emi-table']//td[normalize-space(text())='No records found']";
            String rows = "Rows #xpath=//h2[normalize-space(text())='" + tab.trim() + "']/parent::div/descendant::table[@class='emi-table']//tr";
            String columns = "Columns #xpath=//h2[normalize-space(text())='" + tab.trim() + "']/parent::div/descendant::table[@class='emi-table']//tr//th";
            int count = sizeOfLocator(rows);
            int columnCount = sizeOfLocator(columns);
            if (isElementDisplayed(noRecords)) {
                testStepFailed("No Records Displayed. UPDATE TEST DATA");
            } else {
                for (int i = 1; i < count; i++) {
                    String header = " Header #xpath=//h2[normalize-space(text())='" + tab.trim() + "']/parent::div/descendant::table[@class='emi-table']//th[5]";
                    String headertext = getTextPresent(header);
                    String label = "Row " + (i) + " : " + headertext + ": #xpath=//h2[normalize-space(text())='" + tab.trim() + "']/parent::div/descendant::table[@class='emi-table']//tr[" + i + "]//td[5]";
                    verifyElementIsPresentAndGetText(label);
                    String value = getTextPresent(label);
                    verifyAmountsWithStartSymbols(label, "₹", "");
                    String[] spl = value.split("\\.");
                    if (value.contains(".")) {
                        manualScreenshot(getRefOfXpath(label) + "has Decimal Value verified Successfully");
                        int len = spl[1].length();
                        if (len == 2) {
                            testStepPassed(getRefOfXpath(label) + "has 2 Decimal Places Verified Successfully");
                        } else {
                            testStepFailed(getRefOfXpath(label) + " does not have 2 Decimal Places");

                        }
                    } else {
                        testStepFailed(getRefOfXpath(label) + "has no Decimal Value");
                    }

                }
            }


        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed verify Offer Amount Offer Page" + e.getClass());
        }
    }

    public void verifyOfferCreatedRefreshDateOfferPage(String tab, int headerNumber, String format, String extra) {

        try {

            String noRecords = "No Records #xpath=//h2[normalize-space(text())='" + tab.trim() + "']/parent::div/descendant::table[@class='emi-table']//td[normalize-space(text())='No Records Found']|//h2[normalize-space(text())='" + tab.trim() + "']/parent::div/descendant::table[@class='emi-table']//td[normalize-space(text())='No records found']";
            String rows = "Rows #xpath=//h2[normalize-space(text())='" + tab.trim() + "']/parent::div/descendant::table[@class='emi-table']//tr";
            String columns = "Columns #xpath=//h2[normalize-space(text())='" + tab.trim() + "']/parent::div/descendant::table[@class='emi-table']//tr//th";
            int count = sizeOfLocator(rows);
            int columnCount = sizeOfLocator(columns);
            if (isElementDisplayed(noRecords)) {
                testStepFailed("No Records Displayed. UPDATE TEST DATA");
            } else {
                for (int i = 1; i < count; i++) {
                    String header = " Header #xpath=//h2[normalize-space(text())='" + tab.trim() + "']/parent::div/descendant::table[@class='emi-table']//th[" + headerNumber + "]";
                    String headertext = getTextPresent(header);
                    String label = "Row " + (i) + " : " + headertext + ": #xpath=//h2[normalize-space(text())='" + tab.trim() + "']/parent::div/descendant::table[@class='emi-table']//tr[" + i + "]//td[" + headerNumber + "]";
                    verifyElementIsPresentAndGetText(label);
                    String value = getTextPresent(label);
                    verifyDateFormatForDates(value, format, "");
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed verify Offer Created Refresh Date OfferPage" + e.getClass());
        }
    }

    public void verifyOfferCreatedRefreshDateOrderOfferPage(String tab, int headerNumber, String format, String extra) {

        try {

            String noRecords = "No Records #xpath=//h2[normalize-space(text())='" + tab.trim() + "']/parent::div/descendant::table[@class='emi-table']//td[normalize-space(text())='No Records Found']|//h2[normalize-space(text())='" + tab.trim() + "']/parent::div/descendant::table[@class='emi-table']//td[normalize-space(text())='No records found']";
            String rows = "Rows #xpath=//h2[normalize-space(text())='" + tab.trim() + "']/parent::div/descendant::table[@class='emi-table']//tr";
            String columns = "Columns #xpath=//h2[normalize-space(text())='" + tab.trim() + "']/parent::div/descendant::table[@class='emi-table']//tr//th";
            int count = sizeOfLocator(rows);
            int columnCount = sizeOfLocator(columns);
            if (isElementDisplayed(noRecords)) {
                testStepFailed("No Records Displayed. UPDATE TEST DATA");
            } else {
                for (int i = 1; i < count - 1; i++) {
                    for (int j = i + 1; j <= i + 1; j++) {
                        String header = " Header #xpath=//h2[normalize-space(text())='" + tab.trim() + "']/parent::div/descendant::table[@class='emi-table']//th[" + headerNumber + "]";
                        String headertext = getTextPresent(header);
                        String label1 = "Row " + (i) + " : " + headertext + ": #xpath=//h2[normalize-space(text())='" + tab.trim() + "']/parent::div/descendant::table[@class='emi-table']//tr[" + i + "]//td[" + headerNumber + "]";
                        String label2 = "Row " + (i + 1) + " : " + headertext + ": #xpath=//h2[normalize-space(text())='" + tab.trim() + "']/parent::div/descendant::table[@class='emi-table']//tr[" + j + "]//td[" + headerNumber + "]";
                        verifyElementIsDisplayedAndGetText(label1);
                        verifyElementIsDisplayedAndGetText(label2);
                        String date1 = getTextPresent(label1);
                        String date2 = getTextPresent(label2);
                        DateFormat sdf = new SimpleDateFormat(format);
                        Date firstDate = sdf.parse(date1);
                        Date secondDate = sdf.parse(date2);
                        boolean after = compareDates(firstDate, secondDate, false);
                        if (after) {
                            testStepPassed(getRefOfXpath(label1) + " " + date1 + "is Latest than" + getRefOfXpath(label2) + " " + date2);
                        } else {
                            testStepFailed(getRefOfXpath(label1) + " " + date1 + " is Older than" + getRefOfXpath(label2) + " " + date2);

                        }
                    }
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed verify Offer Created Refresh Date Order Offer Page" + e.getClass());
        }
    }


    public void verifyOffersPaginationOffersPage(String tab, String extra) {
        try {

            String noRecords = "No Records #xpath=//h2[normalize-space(text())='" + tab.trim() + "']/parent::div/descendant::table[@class='emi-table']//td[normalize-space(text())='No Records Found']|//h2[normalize-space(text())='" + tab.trim() + "']/parent::div/descendant::table[@class='emi-table']//td[normalize-space(text())='No records found']";
            if (isElementDisplayed(noRecords)) {
                testStepFailed("No Records Displayed. UPDATE TEST DATA");
            } else {
                String previousDisabled = "Disabled Previous Button #xpath=//nav[@role='navigation']//li[contains(@class,'pagination-previous disabled')]";
                String next = "Next Button #xpath=//nav[@role='navigation']//li[contains(@class,'pagination-next')]";
                String pages = "Pages #xpath=//nav[@role='navigation']//li//a";
                String navigation = "Navigation Campaigns #xpath=//nav[@role='navigation']";
                scrollToWebElement(navigation);
                int num = sizeOfLocator(pages);
                testStepInfo("Total Pages displayed " + num);
                verifyElementIsDisplayedOrNot(previousDisabled);
                verifyElementIsDisplayedOrNot(next);
            }
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify Offers Pagination Offers Page" + e.getClass());
        }

    }

    public void verifySortingOptionOffersPage(String tab, String header, String extra) {
        try {

            String noRecords = "No Records #xpath=//h2[normalize-space(text())='" + tab.trim() + "']/parent::div/descendant::table[@class='emi-table']//td[normalize-space(text())='No Records Found']|//h2[normalize-space(text())='" + tab.trim() + "']/parent::div/descendant::table[@class='emi-table']//td[normalize-space(text())='No records found']";
            if (isElementDisplayed(noRecords)) {
                testStepFailed("No Records Displayed. UPDATE TEST DATA");
            } else {
                String sort = "Sorting Order Option for: " + header + " #xpath=//th[normalize-space(text())='" + header.trim() + "'][@style='cursor: pointer;']";
                verifyElementIsDisplayedOrNot(sort);
            }
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at verify Sorting Option Offers Page" + e.getClass());
        }

    }


    public void verifyTableLabelsIndividual(String tab, String tableHeaders, String extra) {

        try {
            String table = "" + tab + " Table #xpath=//h2[normalize-space(text())='" + tab.trim() + "']/parent::div/descendant::table[@class='emi-table']|//h2[normalize-space(text())='" + tab.trim() + "']/ancestor::div[contains(@class,'emi')]/descendant::table[@class='emi-table']";
            verifyElementIsDisplayedOrNot(table);

            String noRecords = "No Records #xpath=//h2[normalize-space(text())='" + tab.trim() + "']/parent::div/descendant::table[@class='emi-table']//td[normalize-space(text())='No Records Found']|//h2[normalize-space(text())='" + tab.trim() + "']/parent::div/descendant::table[@class='emi-table']//td[normalize-space(text())='No Data Available']|//h2[normalize-space(text())='" + tab.trim() + "']/parent::div/descendant::table[@class='emi-table']//td[normalize-space(text())='No records found']|//h2[normalize-space(text())='" + tab.trim() + "']/ancestor::div[contains(@class,'emi')]/descendant::table[@class='emi-table']//td[normalize-space(text())='No records found']";

            String rows = "Rows #xpath=//h2[normalize-space(text())='" + tab.trim() + "']/parent::div/descendant::table[@class='emi-table']//tr|//h2[normalize-space(text())='" + tab.trim() + "']/ancestor::div[contains(@class,'emi')]/descendant::table[@class='emi-table']//tr";
            String columns = "Columns #xpath=//h2[normalize-space(text())='" + tab.trim() + "']/parent::div/descendant::table[@class='emi-table']//tr//th|//h2[normalize-space(text())='" + tab.trim() + "']/ancestor::div[contains(@class,'emi')]/descendant::table[@class='emi-table']//tr//th";
            int count = sizeOfLocator(rows);
            int columnCount = sizeOfLocator(columns);
            int position = 0;

            if (isElementDisplayed(noRecords)) {
                testStepFailed("No Records Displayed. UPDATE TEST DATA");
            } else {
                for (int i = 1; i <= columnCount; i++) {
                    String header = " Header #xpath=//h2[normalize-space(text())='" + tab.trim() + "']/parent::div/descendant::table[@class='emi-table']//th[" + i + "]|//h2[normalize-space(text())='" + tab.trim() + "']/ancestor::div/descendant::table[@class='emi-table']//th[" + i + "]";
                    String headertext = getTextPresent(header);
                    if (headertext.equalsIgnoreCase(tableHeaders)) {
                        manualScreenshot(tableHeaders + " is present at Position " + i);
                        position = i;
                        break;
                    }
                }

                for (int i = 1; i < count; i++) {
                    String label = "Row " + (i) + " : " + tableHeaders + ": #xpath=//h2[normalize-space(text())='" + tab.trim() + "']/parent::div/descendant::table[@class='emi-table']//tr[" + i + "]//td[" + position + "]|//h2[normalize-space(text())='" + tab.trim() + "']/ancestor::div[contains(@class,'emi')]/descendant::table[@class='emi-table']//tr[" + i + "]//td[" + position + "]";
                    verifyElementIsPresentAndGetText(label);

                }


            }
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed verify Table Labels Individual" + e.getClass());
        }
    }

    public void verifyTableLabelsIcon(String tab, String tableHeaders, String icon, String extra) {

        try {
            String table = "" + tab + " Table #xpath=//h2[normalize-space(text())='" + tab.trim() + "']/parent::div/descendant::table[@class='emi-table']";
            verifyElementIsDisplayedOrNot(table);

            String noRecords = "No Records #xpath=//h2[normalize-space(text())='" + tab.trim() + "']/parent::div/descendant::table[@class='emi-table']//td[normalize-space(text())='No Records Found']|//h2[normalize-space(text())='" + tab.trim() + "']/parent::div/descendant::table[@class='emi-table']//td[normalize-space(text())='No records found']";

            String rows = "Rows #xpath=//h2[normalize-space(text())='" + tab.trim() + "']/parent::div/descendant::table[@class='emi-table']//tr";
            String columns = "Columns #xpath=//h2[normalize-space(text())='" + tab.trim() + "']/parent::div/descendant::table[@class='emi-table']//tr//th";
            int count = sizeOfLocator(rows);
            int columnCount = sizeOfLocator(columns);
            int position = 0;

            if (isElementDisplayed(noRecords)) {
                testStepFailed("No Records Displayed. UPDATE TEST DATA");
            } else {
                for (int i = 1; i <= columnCount; i++) {
                    String header = " Header #xpath=//h2[normalize-space(text())='" + tab.trim() + "']/parent::div/descendant::table[@class='emi-table']//th[" + i + "]";
                    String headertext = getTextPresent(header);
                    if (headertext.equalsIgnoreCase(tableHeaders)) {
                        manualScreenshot(tableHeaders + " is present at Position " + i);
                        position = i;
                        break;
                    }
                }

                if (icon.equalsIgnoreCase("Reports")) {
                    for (int i = 1; i < count; i++) {
                        String label = "Row " + (i) + " : " + tableHeaders + ": #xpath=//h2[normalize-space(text())='" + tab.trim() + "']/parent::div/descendant::table[@class='emi-table']//tr[" + i + "]//td[" + position + "]//img[contains(@src,'images/pdf-download-img')]";
                        verifyElementIsDisplayedUsingLocator(label);

                    }
                }

                if (icon.equalsIgnoreCase("SMS")) {
                    for (int i = 1; i < count; i++) {
                        String label = "Row " + (i) + " : " + tableHeaders + ": #xpath=//h2[normalize-space(text())='" + tab.trim() + "']/parent::div/descendant::table[@class='emi-table']//tr[" + i + "]//td[" + position + "]//img[contains(@src,'images/comment-icon')]";
                        verifyElementIsDisplayedUsingLocator(label);

                    }
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed verify Table Labels Icon" + e.getClass());
        }
    }


    public void verifycreditSummaryPage(String menus, String section, String extra) {

        try {
            String[] opt = menus.split(", ");
            for (int i = 0; i < opt.length; i++) {
                String menu = opt[i];
                verifyValueUsingLabel("//h3[normalize-space(text())='" + section.trim() + "']/following-sibling::div[contains(@class,'loandetails-contant')][1]//p", menu, "/following-sibling::h3", "");
            }
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed verify credit Summary Page" + e.getClass());
        }
    }

    public void verifyTableContentsCreditSummary(String tab, String tableHeaders, String extra) {

        try {
            String table = "" + tab + " Table #xpath=//h3[normalize-space(text())='" + tab.trim() + "']/following-sibling::div[contains(@class,'loandetails-contant')][1]//table[@class='emi-table']";
            verifyElementIsDisplayedOrNot(table);
            verifyFieldsPresentUsingCommonXpathAndMultipleTextWithHash("//h3[normalize-space(text())='" + tab.trim() + "']/following-sibling::div[contains(@class,'loandetails-contant')][1]//table[@class='emi-table']//th", tableHeaders, "");

            String noRecords = "No Records #xpath=//h3[normalize-space(text())='" + tab.trim() + "']/following-sibling::div[contains(@class,'loandetails-contant')][1]//table[@class='emi-table']//td[normalize-space(text())='No Records Found']|//h3[normalize-space(text())='" + tab.trim() + "']/following-sibling::div[contains(@class,'loandetails-contant')][1]//table[@class='emi-table']//td[normalize-space(text())='No records found']";

            String rows = "Rows #xpath=//h3[normalize-space(text())='" + tab.trim() + "']/following-sibling::div[contains(@class,'loandetails-contant')][1]//table[@class='emi-table']//tr";
            String columns = "Columns #xpath=//h3[normalize-space(text())='" + tab.trim() + "']/following-sibling::div[contains(@class,'loandetails-contant')][1]//table[@class='emi-table']//tr//th";
            int count = sizeOfLocator(rows);
            int columnCount = sizeOfLocator(columns);
            if (isElementDisplayed(noRecords)) {
                testStepFailed("No Records Displayed. UPDATE TEST DATA");
            } else {
                for (int i = 1; i < count; i++) {
                    for (int j = 1; j <= columnCount; j++) {
                        String header = " Header #xpath=//h3[normalize-space(text())='" + tab.trim() + "']/following-sibling::div[contains(@class,'loandetails-contant')][1]//table[@class='emi-table']//th[" + j + "]";
                        String headertext = getTextPresent(header);
                        String label = "Row " + (i) + " : " + headertext + ": #xpath=//h3[normalize-space(text())='" + tab.trim() + "']/following-sibling::div[contains(@class,'loandetails-contant')][1]//table[@class='emi-table']//tr[" + i + "]//td[" + j + "]";
                        verifyElementIsPresentAndGetText(label);
                    }

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed verify Table Contents Credit Summary" + e.getClass());
        }
    }

    public void verifyIdentificationTableContentsCreditSummary(String tab, String tableHeaders, String extra) {

        try {
            String table = "" + tab + " Table #xpath=//h3[normalize-space(text())='" + tab.trim() + "']/following-sibling::div[contains(@class,'loandetails-contant')][1]//table[@class='emi-table']";
            verifyElementIsDisplayedOrNot(table);
            verifyFieldsPresentUsingCommonXpathAndMultipleTextWithHash("//h3[normalize-space(text())='" + tab.trim() + "']/following-sibling::div[contains(@class,'loandetails-contant')][1]//table[@class='emi-table']//th", tableHeaders, "");

            String noRecords = "No Records #xpath=//h3[normalize-space(text())='" + tab.trim() + "']/following-sibling::div[contains(@class,'loandetails-contant')][1]//table[@class='emi-table']//td[normalize-space(text())='No Records Found']|//h3[normalize-space(text())='" + tab.trim() + "']/following-sibling::div[contains(@class,'loandetails-contant')][1]//table[@class='emi-table']//td[normalize-space(text())='No records found']";

            String rows = "Rows #xpath=//h3[normalize-space(text())='" + tab.trim() + "']/following-sibling::div[contains(@class,'loandetails-contant')][1]//table[@class='emi-table']//tr";
            String columns = "Columns #xpath=//h3[normalize-space(text())='" + tab.trim() + "']/following-sibling::div[contains(@class,'loandetails-contant')][1]//table[@class='emi-table']//tr//th";
            int count = sizeOfLocator(rows);
            int columnCount = sizeOfLocator(columns);

            Map<String, String> map = new HashMap<>();

            if (isElementDisplayed(noRecords)) {
                testStepFailed("No Records Displayed. UPDATE TEST DATA");
            } else {

                for (int i = 1; i < count; i++) {
                    String header = "Row " + i + " Identification Type: #xpath=//h3[normalize-space(text())='" + tab.trim() + "']/following-sibling::div[contains(@class,'loandetails-contant')][1]//table[@class='emi-table']//tr[" + i + "]//td[1]";
                    String value = "Row " + i + "  Identification Number #xpath=//h3[normalize-space(text())='" + tab.trim() + "']/following-sibling::div[contains(@class,'loandetails-contant')][1]//table[@class='emi-table']//tr[" + i + "]//td[2]";

                    String headerValue = getTextPresent(header);
                    String headerValue2 = getTextPresent(value);

                    manualScreenshot(getRefOfXpath(header) + " is " + headerValue + " & " + getRefOfXpath(value) + " is " + headerValue2);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed verify Identification Table Contents Credit Summary" + e.getClass());
        }
    }


    public void verifyTableLabelsIconCreditSummary(String tab, String tableHeaders, String icon, String extra) {

        try {
            String table = "" + tab + " Table #xpath=//h3[normalize-space(text())='" + tab.trim() + "']/following-sibling::div[contains(@class,'loandetails-contant')][1]//table[@class='emi-table']";
            verifyElementIsDisplayedOrNot(table);

            String noRecords = "No Records #xpath=//h3[normalize-space(text())='" + tab.trim() + "']/following-sibling::div[contains(@class,'loandetails-contant')][1]//table[@class='emi-table']//td[normalize-space(text())='No Records Found']|//h3[normalize-space(text())='" + tab.trim() + "']/following-sibling::div[contains(@class,'loandetails-contant')][1]//table[@class='emi-table']//td[normalize-space(text())='No records found']";

            String rows = "Rows #xpath=//h3[normalize-space(text())='" + tab.trim() + "']/following-sibling::div[contains(@class,'loandetails-contant')][1]//table[@class='emi-table']//tr";
            String columns = "Columns #xpath=//h3[normalize-space(text())='" + tab.trim() + "']/following-sibling::div[contains(@class,'loandetails-contant')][1]//table[@class='emi-table']//tr//th";
            int count = sizeOfLocator(rows);
            int columnCount = sizeOfLocator(columns);
            int position = 0;

            if (isElementDisplayed(noRecords)) {
                testStepFailed("No Records Displayed. UPDATE TEST DATA");
            } else {
                for (int i = 1; i <= columnCount; i++) {
                    String header = " Header #xpath=//h3[normalize-space(text())='" + tab.trim() + "']/following-sibling::div[contains(@class,'loandetails-contant')][1]//table[@class='emi-table']//th[" + i + "]";
                    String headertext = getTextPresent(header);
                    if (headertext.equalsIgnoreCase(tableHeaders)) {
                        manualScreenshot(tableHeaders + " is present at Position " + i);
                        position = i;
                        break;
                    }
                }

                if (icon.equalsIgnoreCase("Reports")) {
                    for (int i = 1; i < count; i++) {
                        String label = "Row " + (i) + " : " + tableHeaders + ": #xpath=//h3[normalize-space(text())='" + tab.trim() + "']/following-sibling::div[contains(@class,'loandetails-contant')][1]//table[@class='emi-table']//tr[" + i + "]//td[" + position + "]//img[contains(@src,'images/pdf')]";
                        verifyElementIsDisplayedUsingLocator(label);

                    }
                }

                if (icon.equalsIgnoreCase("Details")) {
                    for (int i = 1; i < count; i++) {
                        String label = "Row " + (i) + " : " + tableHeaders + ": #xpath=//h3[normalize-space(text())='" + tab.trim() + "']/following-sibling::div[contains(@class,'loandetails-contant')][1]//table[@class='emi-table']//tr[" + i + "]//td[" + position + "]//a[normalize-space(text())='View Details']";
                        verifyElementIsDisplayedUsingLocator(label);

                    }
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed verify Table Labels Icon Credit Summary" + e.getClass());
        }
    }


    public void clickViewReportsCreditSummary(String label, String extra) {
        try {
            String viewDetails = "View Details for: " + label + " #xpath=//h3[normalize-space(text())='" + label.trim() + "']/following-sibling::div[contains(@class,'loandetails-contant')][1]//table[@class='emi-table']//tr[1]//td[14]//a[normalize-space(text())='View Details']";
            scrollToWebElementIfPresent(viewDetails);
            clickOn(viewDetails);
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed click View Reports Credit Summary" + e.getClass());

        }
    }


    public String lanAgreementNumberDefaultViewDetailsCreditSummary(String extra) {
        String number = "";
        try {
            String agreementNo = "Agreement Number#xpath=//h3[normalize-space(text())='Tradeline Details']/following-sibling::div[contains(@class,'loandetails-contant')][1]//p[normalize-space(text())='Agreement Number']/following-sibling::h3";
            String agreementNumber = getTextPresent(agreementNo);
            String lan = getSelectedOptionInDropDown(lanDropdownCreditSummary, agreementNumber);
            if (agreementNumber.equalsIgnoreCase(lan)) {
                manualScreenshot("Both Agrreement Number and LAN are same " + lan);
                number = agreementNumber;
            } else {
                testStepFailed("Both Agrreement Number and LAN are not same " + lan);
                ;
            }

        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed lan Agreement Number Default View Details Credit Summary" + e.getClass());

        }
        return number;
    }

    public void lanAgreementNumberSelectedViewDetailsCreditSummary(String extra) {
        try {

            String agreementNo = "Agreement Number#xpath=//h3[normalize-space(text())='Tradeline Details']/following-sibling::div[contains(@class,'loandetails-contant')][1]//p[normalize-space(text())='Agreement Number']/following-sibling::h3";
            String agreementNumber1 = lanAgreementNumberDefaultViewDetailsCreditSummary("");
            selectDropDownUsingIndex(lanDropdownCreditSummary, 2);
            waitTime(2);
            String agreementNumber2 = getTextPresent(agreementNo);
            String lan = getSelectedOptionInDropDown(lanDropdownCreditSummary, agreementNumber2);
            if (agreementNumber2.equalsIgnoreCase(lan)) {
                manualScreenshot("Both Agrreement Number and LAN are same " + lan + " and Details have been updated after selecting New LAN");
            } else {
                testStepFailed("Both Agrreement Number and LAN are not same");
            }

        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed lan Agreement Number Selected View Details Credit Summary" + e.getClass());

        }
    }


    public void verifyPDFDownloadViewDetailsCreditSummary(String doc, String docName, String extra) {
        try {
            String document = "Document " + doc + "#xpath=//h3[normalize-space(text())='Tradeline Details']/following-sibling::div[contains(@class,'loandetails-contant')][1]//p[normalize-space(text())='" + doc.trim() + "']/following-sibling::h3//img";
            String agreementNo = "Agreement Number#xpath=//h3[normalize-space(text())='Tradeline Details']/following-sibling::div[contains(@class,'loandetails-contant')][1]//p[normalize-space(text())='Agreement Number']/following-sibling::h3";
            String agreementNumber = getTextPresent(agreementNo);
            scrollToWebElementIfPresent(document);
            clickOn(document);
            waitTime(3);
            handleToastByClass("toast-title", "Success", "");
            waitTime(2);
            verifyDownLoadAndDeleteLatestFileNameFromLocalMachine(agreementNumber + "_" + docName + ".pdf");
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed click View Reports Credit Summary" + e.getClass());

        }
    }

    public void verifyPDFDownloadFromTableCreditSummary(String doc, String docName, String section, String extra) {
        try {
            String document = "Document " + doc + "#xpath=//h3[normalize-space(text())='" + section.trim() + "']/following-sibling::div[contains(@class,'loandetails-contant')][1]//table[@class='emi-table']//tr[1]//td[15]//img[contains(@src,'images/pdf')]";
            String agreementNo = "Agreement Number#xpath=//h3[normalize-space(text())='" + section.trim() + "']/following-sibling::div[contains(@class,'loandetails-contant')][1]//table[@class='emi-table']//tr[1]//td[1]";
            scrollToWebElementIfPresent(agreementNo);
            String agreementNumber = getTextPresent(agreementNo);
            clickOn(document);
            waitTime(3);
            handleToastByClass("toast-title", "Success", "");
            waitTime(2);
            verifyDownLoadAndDeleteLatestFileNameFromLocalMachine(agreementNumber + "_" + docName + ".pdf");
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed verify PDF Download From Table Credit Summary" + e.getClass());

        }
    }


    public void verifyAmountFormatCreditSummaryTables(String icon, String label, String section, String extra) {

        try {
            String rows = "Rows #xpath=//h3[normalize-space(text())='" + section.trim() + "']/following-sibling::div[contains(@class,'loandetails-contant')][1]//table[@class='emi-table']//tr";
            int count = sizeOfLocator(rows);
            for (int i = 1; i < count; i++) {
                String locator = "" + section + " " + label + " for Row " + i + " #xpath=//h3[normalize-space(text())='" + section.trim() + "']/following-sibling::div[contains(@class,'loandetails-contant')][1]//table[@class='emi-table']//tr[" + i + "]//td[5]";
                verifyAmountsWithStartSymbols(locator, icon, "");
            }

        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed verify Amount Format Credit Summary Tables" + e.getClass());
        }
    }

    public void verifyDateFormatCreditSummaryTables(String label, String section, String extra) {

        try {
            String rows = "Rows #xpath=//h3[normalize-space(text())='" + section.trim() + "']/following-sibling::div[contains(@class,'loandetails-contant')][1]//table[@class='emi-table']//tr";
            int count = sizeOfLocator(rows);
            for (int i = 1; i < count; i++) {
                String locator = "" + section + " " + label + " for Row " + i + " #xpath=//h3[normalize-space(text())='" + section.trim() + "']/following-sibling::div[contains(@class,'loandetails-contant')][1]//table[@class='emi-table']//tr[" + i + "]//td[4]";
                verifyDateFormatLocator(locator, label, "dd/mm/yyyy", "");

            }

        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed verify Date Format Credit Summary Tables" + e.getClass());
        }
    }

    public void verifyDateFormatCreditSummaryPage(String labels, String section, String extra) {

        try {
            String[] split = labels.split(", ");
            for (int i = 0; i < split.length; i++) {
                String label = split[i];
                String locator = "" + section + " " + label + " Date Format#xpath=//h3[normalize-space(text())='" + section.trim() + "']/following-sibling::div[contains(@class,'loandetails-contant')][1]//p[normalize-space(text())='" + label.trim() + "']/following-sibling::h3";
                verifyDateFormatLocator(locator, label, "dd/mm/yyyy", "");
            }
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed verify Date Format Credit Summary Page" + e.getClass());
        }
    }

    public void verifyAmountFormatCreditSummaryPage(String icon, String labels, String section, String extra) {

        try {
            String[] split = labels.split(", ");
            for (int i = 0; i < split.length; i++) {
                String label = split[i];
                String locator = "" + section + " " + label + " Amount Format#xpath=//h3[normalize-space(text())='" + section.trim() + "']/following-sibling::div[contains(@class,'loandetails-contant')][1]//p[normalize-space(text())='" + label.trim() + "']/following-sibling::h3";
                verifyAmountsWithStartSymbols(locator, icon, "");
            }
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed verify Amount Format Credit Summary Page" + e.getClass());
        }
    }


    public void verifyReportsInsuranceDetailsPage(String menus, String section, String extra) {

        try {
            String[] opt = menus.split(", ");
            for (int i = 0; i < opt.length; i++) {
                String menu = opt[i];
                String locator = "" + menu + "#xpath=//h2[normalize-space(text())='" + section.trim() + "']/following-sibling::div//p[normalize-space(text())='" + menu.trim() + "']";
                String locatorButton = "" + menu + " Button#xpath=//h2[normalize-space(text())='" + section.trim() + "']/following-sibling::div//p[normalize-space(text())='" + menu.trim() + "']/..//a|//h2[normalize-space(text())='" + section.trim() + "']/following-sibling::div//p[normalize-space(text())='" + menu.trim() + "']/..//button";
                String locatorLogo = "" + menu + " Logo#xpath=//h2[normalize-space(text())='" + section.trim() + "']/following-sibling::div//p[normalize-space(text())='" + menu.trim() + "']/..//a//img|//h2[normalize-space(text())='" + section.trim() + "']/following-sibling::div//p[normalize-space(text())='" + menu.trim() + "']/..//button//img";
                String locatorText = "" + menu + " Download Pdf Text#xpath=//h2[normalize-space(text())='" + section.trim() + "']/following-sibling::div//p[normalize-space(text())='" + menu.trim() + "']/..//a//p[normalize-space(text())='Download PDF']|//h2[normalize-space(text())='" + section.trim() + "']/following-sibling::div//p[normalize-space(text())='" + menu.trim() + "']/..//button//p[normalize-space(text())='Download PDF']";
                verifyElementIsDisplayedOrNot(locator);
                verifyElementIsDisplayedOrNot(locatorButton);
                verifyElementIsDisplayedOrNot(locatorLogo);
                verifyElementIsDisplayedOrNot(locatorText);
            }
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed verify Reports Insurance Details Page" + e.getClass());
        }
    }

    public void clickReportsInsuranceDetailsPage(String menu, String section, String extra) {

        try {
            String locatorLogo = "" + menu + " Logo#xpath=//h2[normalize-space(text())='" + section.trim() + "']/following-sibling::div//p[normalize-space(text())='" + menu.trim() + "']/..//a//img|//h2[normalize-space(text())='" + section.trim() + "']/following-sibling::div//p[normalize-space(text())='" + menu.trim() + "']/..//button//img";
            clickOn(locatorLogo);
            waitTime(3);
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed click Reports Insurance Details Page" + e.getClass());
        }
    }


    public void checkDocsContentInsurance(String content, String filepath, String sheet, String extra) {
        try {
            String[] split = content.split(", ");
            for (int i = 0; i < split.length; i++) {
                String text = split[i];
                boolean value = isTextPresentInExcel(filepath, sheet, text);
                if (value) {
                    System.out.println(text + " is present in the Excel File");
                } else {
                    testStepFailed(text + " is not present in the Excel File");
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed check Docs Content Insurance" + e.getClass());
        }


    }


    public void verifyPolicyNoSelectorDropdownRefresh(String opt, String extra) {

        try {
            String locator = "Label #xpath=//h2[normalize-space(text())='Nominee Details']/following-sibling::div//p[normalize-space(text())='Nominee Name']/following-sibling::h3";
            String nominee1 = getTextPresent(locator);
            selectDropDownUsingText(DetailsPage.depositdropDown, opt);
            waitTime(5);
            String nominee2 = getTextPresent(locator);
            if (!nominee1.equalsIgnoreCase(nominee2)) {
                testStepPassed("Page has refreshed Automatically on selection of new Policy");
            } else {
                testStepFailed("Page has not refreshed Automatically on selection of new Policy");
            }

        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed verify Policy No Selector Dropdown Refresh" + e.getClass());
        }
    }


    public void verifyBCLReportCalendarDate(String date, String extra) {
        try {
            String dateValue = getAttributeValue(DetailsPage.selectDataFdInput);
            String simpleDate = dateValue.replaceAll("-", "");
            if (simpleDate.equalsIgnoreCase(date)) {
                testStepPassed(getRefOfXpath(DetailsPage.selectDataFdInput) + " has accepted the Date: " + date);
            } else {
                testStepFailed(getRefOfXpath(DetailsPage.selectDataFdInput) + " has not accepted the Date: " + simpleDate);
            }
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed verify BCL Report Calendar Date" + e.getClass());
        }
    }


    /////3in1
    public void verifyTabIsDisplayedInThe3in1PageusingText(String buttonswithComma, String extra) {
        boolean flag = false;
        try {
            String[] split = buttonswithComma.split(",");
            for (int i = 0; i < split.length; i++) {
                String buttonText = split[i];
                String locator = buttonText + "#xpath=//ul[contains(@class,'devicefinance')]//li//a[contains(text(),'" + buttonText + "')]";
                for (int j = 1; j <= findWebElements(locator).size(); j++) {
                    String button = "" + buttonText + " Tab#xpath=(//ul[contains(@class,'devicefinance')]//li//a[contains(text(),'" + buttonText + "')])[" + j + "]";
                    if (isElementPresent(button)) {
                        scrollToWebElement(button);
                        if (isElementDisplayed(button))
                            manualScreenshot(buttonText + " is Displayed successfully");
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    testStepFailed(buttonText + " Tab is Not Displayed");
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed in verify Tab Is Displayed In The 3in1 Page using Text. Exception: " + e.getClass());
        }

    }


    public void tabCountIn3in1Page(String tab, String extra) {
        try {
            String locator = tab + "#xpath=//ul[contains(@class,'devicefinance')]//li//a[contains(text(),'" + tab + "')]";
            String[] text = getTextPresent(locator).split("\\(");
            String count = text[1].replace(")", "");
            manualScreenshot("Count for " + tab + " is " + count);
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed in tab Count In 3 in 1 Page. Exception: " + e.getClass());
        }
    }

    public void gstPagePdfDownload(String doc, String extra) {
        try {
            String date = generateTodayDate("dd-MM-yyyy");
            String docName = doc + "-" + date + ".pdf";
            handleToastByClass("toast-title", "Success", "");
            verifyDownLoadAndDeleteLatestFileNameFromLocalMachine(docName);
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed in gst Page Pdf Download. Exception: " + e.getClass());
        }
    }

    public void verifyCardsNumberMasked3in1Page(String tab, String id, String extra) {

        try {

            String table = "" + tab + " Table #xpath=//div[@id='" + id.trim() + "']/descendant::table[@class='emi-table']";
            verifyElementIsDisplayedOrNot(table);

            String noRecords = "No Records #xpath=//div[@id='" + id.trim() + "']/descendant::table[@class='emi-table']//td[normalize-space(text())='No Records Found']";
            String rows = "Rows #xpath=//div[@id='" + id.trim() + "']/descendant::table[@class='emi-table']//tr";
            String columns = "Columns #xpath=//div[@id='" + id.trim() + "']/descendant::table[@class='emi-table']//tr//th";
            int count = sizeOfLocator(rows);
            int columnCount = sizeOfLocator(columns);

            if (isElementDisplayed(noRecords)) {
                testStepFailed("No Records Displayed. UPDATE TEST DATA");
            } else {
                for (int i = 1; i < count; i++) {
                    String label1 = "Row " + (i) + " : Card No: #xpath=//div[@id='" + id.trim() + "']/descendant::table[@class='emi-table']//tr[" + i + "]//td[1]";
                    verifyElementIsPresentAndGetText(label1);
                    String actual = getTextPresent(label1);
                    verifyMaskedAndUnmaskedFormatUsingValue(actual, "Cards", "X", 0, 12, false, "0");
                    verifyMaskedAndUnmaskedFormatUsingValue(actual, "Cards", "X", 4, 4, true, "0");
                    verifyMaskedAndUnmaskedFormatUsingValue(actual, "Cards", "X", 13, 4, false, "1");


                }
            }


        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed verify Cards Number Masked Deposits 3in1" + e.getClass());
        }
    }


    public static String getLabelValueDetailsPage(String section, String label, String extra) {
        String value = "";
        try {
            String labelValue = "" + label + " Value: #xpath=//h2[normalize-space(text())='" + section.trim() + "']/following-sibling::div//p[normalize-space(text())='" + label.trim() + "']/following-sibling::h3|//h3[normalize-space(text())='" + section.trim() + "']/following-sibling::div[contains(@class,'loandetails-contant')][1]//table[@class='emi-table']//td[normalize-space(text())='" + label.trim() + "']/following-sibling::td";
//               scrollToWebElementIfPresent(labelValue);
            value = findWebElement(labelValue).getText();
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed get Label Value Details Page" + e.getClass());


        }
        return value;
    }

    public String getTableLabelValueFirstRowDetailsPage(String section, String label, String extra) {
        String value = "";
        try {
            String labelValue = "" + label + " Value: #xpath=//h2[normalize-space(text())='" + section.trim() + "']/following-sibling::div//p[normalize-space(text())='" + label.trim() + "']/following-sibling::h3";
//            String label = "Row " + (i) + " : " + headertext + ": #xpath=//h2[normalize-space(text())='" + tab.trim() + "']/parent::div/descendant::table[@class='emi-table']//tr[" + i + "]//td[" + j + "]";
            scrollToWebElementIfPresent(labelValue);
            value = getTextPresent(labelValue);
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed get Label Value Details Page" + e.getClass());


        }
        return value;
    }


    public void verifyAccountNumberMaskedEmiTableAgreePage(String tab, String extra) {

        try {

            String table = "" + tab + " Table #xpath=//h2[normalize-space(text())='" + tab.trim() + "']/parent::div/descendant::table[@class='emi-table']";
            verifyElementIsDisplayedOrNot(table);

            String noRecords = "No Records #xpath=//h2[normalize-space(text())='" + tab.trim() + "']/parent::div/descendant::table[@class='emi-table']//td[normalize-space(text())='No Records Found']";
            String rows = "Rows #xpath=//h2[normalize-space(text())='" + tab.trim() + "']/parent::div/descendant::table[@class='emi-table']//tr";
            String columns = "Columns #xpath=//h2[normalize-space(text())='" + tab.trim() + "']/parent::div/descendant::table[@class='emi-table']//tr//th";
            int count = sizeOfLocator(rows);
            int columnCount = sizeOfLocator(columns);

            if (isElementDisplayed(noRecords)) {
                testStepFailed("No Records Displayed. UPDATE TEST DATA");
            } else {
                for (int i = 1; i < count; i++) {
                    String label1 = "Row " + (i) + " : Account No: #xpath=//h2[normalize-space(text())='" + tab.trim() + "']/parent::div/descendant::table[@class='emi-table']//tr[" + i + "]//td[7]";
                    verifyElementIsPresentAndGetText(label1);
                    String actual = getTextPresent(label1);
                    int unmasked = (actual.length() - 4);

                    verifyMaskedAndUnmaskedFormatUsingValue(actual, "Account No", "*", 0, 4, true, "0");
                    verifyMaskedAndUnmaskedFormatUsingValue(actual, "Account No", "*", unmasked, 4, false, "1");


                }
            }


        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed verify Account Number Masked Emi Table Agree Page" + e.getClass());
        }
    }

    public void verifyAgreementNumberDropdownRefresh(String opt, String extra) {

        try {
            String locator = "Label #xpath=//h2[normalize-space(text())='Sourcing Information']/following-sibling::div//p[normalize-space(text())='Agreement Number']/following-sibling::h3";
            String portal1 = getTextPresent(locator);
            selectDropDownUsingText(DetailsPage.depositdropDown, opt);
            waitTime(5);
            String portal2 = getTextPresent(locator);
            if (!portal1.equalsIgnoreCase(portal2)) {
                testStepPassed("Page has refreshed Automatically on selection of new Agreement Number");
            } else {
                testStepFailed("Page has not refreshed Automatically on selection of new Agreement Number");
            }

        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed verify Agreement Number Selector Dropdown Refresh" + e.getClass());
        }
    }


    public void verifyLabelsLoansDetailsUnmasked(String menus, String section, String extra) {

        try {
            String[] opt = menus.split(", ");
            for (int i = 0; i < opt.length; i++) {
                String menu = opt[i];
                verifyValueUsingLabel("//h2[normalize-space(text())='" + section.trim() + "']/following::div[contains(@class,'loan-information-box')]//p", menu, "/following-sibling::h3", "");
                String loc = "Label #xpath=//h2[normalize-space(text())='" + section.trim() + "']/following::div[contains(@class,'loan-information-box')]//p[normalize-space(text())='" + menu.trim() + "']/following-sibling::h3";
                String text = getTextPresent(loc);
                if (!text.isEmpty()) {
                    if (text.contains("X")) {
                        testStepFailed("Label: " + menu + " Value contains masked Symbol");
                    } else {
                        testStepPassed("Label Value is unmasked verified");
                    }
                } else {
                    testStepFailed("Label: " + menu + " is empty");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed verify Labels Loans Details Unmasked" + e.getClass());
        }
    }


    public void verifyLabelsCoApplicantAgreementDetailsPage(String menus, String section, String extra) {

        try {
            String[] opt = menus.split(", ");
            for (int i = 0; i < opt.length; i++) {
                String menu = opt[i];
                verifyValueUsingLabel("//h2[normalize-space(text())='" + section.trim() + "']/following::div[contains(@class,'loan-information-box')]//p", menu, "/following-sibling::h3", "");
            }
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed verify Labels CoApplicant Agreement Details Page" + e.getClass());
        }
    }


    public String fdDetailsValues(String head, String label, String extra) {
        String value = "";
        try {
            String locator = "#xpath=//h2[normalize-space(text())='"+head.trim()+"']/ancestor::div[contains(@class,'loandetails')]//p[normalize-space(text())='"+label.trim()+"']/following-sibling::h3";
            value = getTextPresent(locator).replace("\n", " ");
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at fd Details Values. Exception: " + e.getClass());
        }
        return value;
    }


    //////Vignesh
    public static final String noDetailsAvailable = "No Details Available #xpath=//tr/td[contains(text(),'No Data Available')]";
    public static final String searchByCustomerDropdown = "Search By Customer Dropdown #xpath=//h6[text()='Search Customer by']/..//select";
    public static final String searchByCustomerInput = "Search By Customer Dropdown #xpath=//h6[text()='Search Customer by']/..//input";
    public static final String searchByCustomerProceed = "Search By Customer Dropdown #xpath=//h6[text()='Search Customer by']/..//button";
    public static final String personalInfoHeader = "Personal Info #xpath=//h6[text()='PERSONAL INFO']";
    public static final String serviceSegmanetHeader = "Service Segment #xpath=//h6[text()='SERVICE SEGMENT']";
    public static final String quickLinksHeader = "Quick links #xpath=//h6[text()='QUICK LINKS']";
    public static final String bbpsSection = "BBPS Section #xpath=//p[text()='BBPS']";
    public static final String walletSection = "Wallet Section #xpath=//p[text()='Wallet']";
    public static final String upiSection = "UPI Section #xpath=//p[text()='UPI']";
    public static final String gamesSection = "Games Section #xpath=//p[text()='Games']";
    public static final String customerName = "Customer Name #xpath=//p[contains(@class,'user-name')]";
    public static final String customerID = "Customer ID #xpath=//span[contains(text(),'Cust ID')]";
    public static final String emailIDField = "Email ID #xpath=//p[contains(text(),'Email ID')]";
    public static final String tabelHome = "Table #xpath=//table[contains(@class,'emi-table')]";


}
