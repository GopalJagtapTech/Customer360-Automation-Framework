package stepdefinitions;

import pageobjects.DashboardPage;
import pageobjects.DetailsPage;
import base.ApplicationKeywords;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class DetailsSteps extends ApplicationKeywords {


    DetailsPage details;
    DashboardPage dashboard;

    public DetailsSteps() {
        details = new DetailsPage();
        dashboard = new DashboardPage();
    }


    @Then("User Should be redirected to the FD Details page {string}")
    public void userShouldBeRedirectedToTheFDDetailsPage(String url) {
        verifyRedirectioninSameTabWithoutABack(url, "");
    }

    @Then("Below Menus {string} Should be displayed to the user on LHS of FD Details page")
    public void belowMenusShouldBeDisplayedToTheUserOnLHSOfFDDetailsPage(String menus) {
        String menu = changeCommaToHash(menus, "");
        verifyFieldsUsingCommonXpathAndMultipleTextWithHash("//ul[@class='loan-details-ul']//a//p", menu, "");
        verifyFieldsUsingCommonXpathAndMultipleTextWithHash("//ul[@class='loan-details-ul']//a//p", "Prematurity | TDS | Courier", "");
        details.verifyLogosLhsMenusFDDetailsPage(menus, "");
        details.verifyLogosLhsMenusFDDetailsPage("Prematurity | TDS | Courier", "");
    }

    @Then("Below Options {string} should be displayed under the Fixed Details section")
    public void belowOptionsShouldBeDisplayedUnderTheFixedDetailsSection(String opts) {
        verifyFieldDisplayedUsingTagAndText("h2", "Fixed Deposit Details", "");
        String opt = changeCommaToHash(opts, "");
        verifyFieldsUsingCommonXpathAndMultipleTextWithHash("//h2", opt, "");
    }

    @Then("Below Options {string} should be displayed under the {string} section in FD Details Page")
    public void belowOptionsShouldBeDisplayedUnderTheSectionInFDDetailsPage(String opts, String section) {
        details.verifyLabelsFDDetailsPage(opts, section, "");
    }

    @Then("Below CTA {string} should be displayed under the Report {string} section")
    public void belowCTAShouldBeDisplayedUnderTheReportSection(String cta, String sect) {
        details.verifyReportsFDDetailsPage(cta, sect, "");
    }

    @Then("{string} Calendar should be displayed to the User")
    public void calendarShouldBeDisplayedToTheUser(String head) {
        verifyPopupDisplayedUsingTagAndText("h2", head, "");
        verifyElementIsDisplayedOrNot(DetailsPage.selectDataFd);
        verifyButtonIsDisplayedInThePage("OK");

    }

    @And("Clicks on BCL Report Download Pdf")
    public void clicksOnBCLReportDownloadPdf() {
        clickOn(DetailsPage.bclDownload);
    }

    @And("Clicks on TDS Report Download Pdf")
    public void clicksOnTDSReportDownloadPdf() {
        clickOn(DetailsPage.tdsDownload);

    }

    @Then("Bank Account Number should be displayed in Below Masked format in Bank Details")
    public void bankAccountNumberShouldBeDisplayedInBelowMaskedFormatInBankDetails() {

        String value = getTextPresent(DetailsPage.bankAccountBankDetailsPage);
        verifyMaskedAndUnmaskedFormatUsingValue(value, "Bank Account", "X", 0, 4, true, "0");
        int unmasked = (value.length() - 4);
        verifyMaskedAndUnmaskedFormatUsingValue(value, "Bank Account", "X", unmasked, 4, false, "1");
    }

    @And("Clicks on LHS Option {string} in FD Details Page")
    public void clicksOnLHSOptionInFDDetailsPage(String opt) {
        details.clickLhsTabsFDDetailsPage(opt, "");
    }

    @Then("Below Options {string} should be displayed under the {string} section")
    public void belowOptionsShouldBeDisplayedUnderTheSection(String opts, String sect) {

        String opt = changeCommaToHash(opts, "");
        verifyFieldsUsingCommonXpathAndMultipleTextWithHash("//h2", opt, "");

    }

    @Then("FD Maturity Instruction Should be displayed {string} when the deposit status is {string} and the FD renew flag is {string}.")
    public void fdMaturityInstructionShouldBeDisplayedWhenTheDepositStatusIsAndTheFDRenewFlagIs(String instruction, String arg1, String arg2) {
        verifyGetTextUsingLocatorAndCompareWithText(DetailsPage.maturityInstruction, instruction, "");

    }

    @Then("FD Maturity Instruction Should be displayed {string} when the deposit status is {string}")
    public void fdMaturityInstructionShouldBeDisplayedWhenTheDepositStatusIs(String instruction, String arg1) {
        verifyGetTextUsingLocatorAndCompareWithText(DetailsPage.maturityInstruction, instruction, "");

    }

    @Then("Below Masked format should be displayed for DOB in Nominee Details")
    public void belowMaskedFormatShouldBeDisplayedForDOBInNomineeDetails() {

        String values = getTextPresent(DetailsPage.dobNomineeDetailsPage);
        String value = values.replaceAll("-", "");
        verifyMaskedAndUnmaskedFormatUsingValue(value, "DOB", "X", 0, 4, true, "0");
        verifyMaskedAndUnmaskedFormatUsingValue(value, "DOB", "X", 4, 4, false, "1");

    }

    @Then("Drop-down for selecting Deposit Numbers should be available in FD Details Page")
    public void dropDownForSelectingDepositNumbersShouldBeAvailableInFDDetailsPage() {
        details.verifyDepositSelectorDropdown("");
    }


    @And("Selects a different Deposit from Deposit Dropdown {string} ,then Page should automatically refresh and display the details of the selected FD")
    public void selectsADifferentDepositFromDepositDropdownThenPageShouldAutomaticallyRefreshAndDisplayTheDetailsOfTheSelectedFD(String opt) {
        refreshThePage();
        details.verifyDepositSelectorDropdownRefresh(opt, "");
    }

    @And("Selects a different Deposit from Co Deposit Dropdown {string} ,then Page should automatically refresh and display the details of the selected FD")
    public void selectsADifferentDepositFromCoDepositDropdownThenPageShouldAutomaticallyRefreshAndDisplayTheDetailsOfTheSelectedFD(String opt) {
        details.verifyCoDepositSelectorDropdownRefresh(opt, "");

    }


    @Then("User Should be redirected to the {string} Details page {string}")
    public void userShouldBeRedirectedToTheDetailsPage(String arg0, String url) {
        verifyRedirectioninSameTabWithoutABack(url, "");
//        refreshThePage();
    }

    @Then("Below Menus {string} Should be displayed to the user on LHS of {string} Details page")
    public void belowMenusShouldBeDisplayedToTheUserOnLHSOfDetailsPage(String menus, String arg1) {
        String menu = changeCommaToHash(menus, "");
        verifyFieldsUsingCommonXpathAndMultipleTextWithHash("//ul[@class='loan-details-ul']//a//p", menu, "");
        details.verifyLogosLhsMenusFDDetailsPage(menus, "");

    }

    @And("Below {string} should be displayed in the Right hand Side of {string} Details Page")
    public void belowShouldBeDisplayedInTheRightHandSideOfDetailsPage(String btns, String arg1) {
        String menu = changeCommaToHash(btns, "");
        verifyFieldsUsingCommonXpathAndMultipleTextWithHash("//div[@class='agree-header-right']//button", menu, "");

    }

    @And("Clicks on LHS Option {string} in {string} Details Page")
    public void clicksOnLHSOptionInDetailsPage(String opt, String arg1) {
        details.clickLhsTabsFDDetailsPage(opt, "");

    }

    @Then("Below Options {string} should be displayed under the {string} section in {string} Details Page")
    public void belowOptionsShouldBeDisplayedUnderTheSectionInDetailsPage(String opts, String section, String arg2) {
        details.verifyLabelsFDDetailsPage(opts, section, "");

    }

    @And("Print the Options {string} in this Page")
    public void printTheOptionsInThisPage(String op) {
//        details.printLabels(op, "");
    }

    @And("Selects {string} Agreement No in Loan Details PAge")
    public void selectsAgreementNoInLoanDetailsPAge(String opt) {
        selectDropDownUsingText(DetailsPage.depositdropDown, opt);
    }

    @And("User should be able to view {string} tab if selected loan is having flexi flag =Y")
    public void userShouldBeAbleToViewTabIfSelectedLoanIsHavingFlexiFlagY(String tab) {
        verifyFieldsUsingCommonXpathAndMultipleTextWithHash("//ul[@class='loan-details-ul']//a//p", tab, "");
        details.verifyLogosLhsMenusFDDetailsPage(tab, "");


    }

    @Then("{string} tab should be hide for other loan except flexi loan")
    public void tabShouldBeHideForOtherLoanExceptFlexiLoan(String tab) {

        verifyFieldsNotDisplayedUsingCommonXpathAndMultipleTextWithHash("//ul[@class='loan-details-ul']//a//p", tab, "");

    }

    @Then("User should be able to view Device finance tabs {string} with below details")
    public void userShouldBeAbleToViewDeviceFinanceTabsWithBelowDetails(String buttons) {
        verifymultipleButtonIsDisplayedInThePageusingText(buttons, "");
    }

    @Then("User should be able to view below pop up message: {string}")
    public void userShouldBeAbleToViewBelowPopUpMessage(String pop) {
        verifyPopupDisplayedUsingTagAndText("h2", pop, "");
    }

    @Then("User should be able to view below details under Flexi partpayment transactions {string}")
    public void userShouldBeAbleToViewBelowDetailsUnderFlexiPartpaymentTransactions(String tab) {
        verifyFieldDisplayedUsingTagAndTextUsingScroll("h2", tab, "");
        details.verifyTableContentsDetailsPageFlexiDisbu(tab, "Agreement No#Payment Source#Reciept Amount#Receipt Date#Txn No/Ref ID#Payment Status#Payment Channel#Payment Mode#SOA Upload Date & Time#Payment Intimation Time", "");
    }

    @Then("User should be able to view below details under Flexi Drawdown Transactions {string}")
    public void userShouldBeAbleToViewBelowDetailsUnderFlexiDrawdownTransactions(String tab) {
        verifyFieldDisplayedUsingTagAndTextUsingScroll("h2", tab, "");
        details.verifyTableContentsDetailsPageFlexiDisbu(tab, "Agreement No#Flexi Lite#Source#Req ID/Portal ID#Req Time#Amount (INR )#UTR No#UTR TIME", "");


    }

    @Then("{string} Dropdown should be displayed on Loan details page with available LANs")
    public void dropdownShouldBeDisplayedOnLoanDetailsPageWithAvailableLANs(String field) {
        verifyDropdownIsDisplayedAndPrintOptions(DetailsPage.depositdropDown, "");
    }

    @Then("Selected LAN number {string} should be displayed in the dropdown, and the details related to that LAN number should update accordingly")
    public void selectedLANNumberShouldBeDisplayedInTheDropdownAndTheDetailsRelatedToThatLANNumberShouldUpdateAccordingly(String drop) {
        details.verifyLoanSelectorDropdownRefresh("Loan", drop, "Sourcing Information", "Application ID", "");
    }

    @Then("Below Options {string} should not be displayed under the {string} section")
    public void belowOptionsShouldNotBeDisplayedUnderTheSection(String opts, String sect) {
        String opt = changeCommaToHash(opts, "");
        verifyFieldsNotDisplayedUsingCommonXpathAndMultipleTextWithHash("//h2", opt, "");

    }

    @Then("User should be able to view below details under Disbursment Banking Details {string}")
    public void userShouldBeAbleToViewBelowDetailsUnderDisbursmentBankingDetails(String tab) {
        verifyFieldDisplayedUsingTagAndTextUsingScroll("h2", tab, "");
        details.verifyTableContentsDetailsPageFlexiDisbu(tab, "Transaction Date#Disbursement Type#Account No#IFSC#Account Holder Name#Payment Mode#Amount#Value Date#UTR#Status#Reject Reason", "");

    }

    @Then("Only last four digit of account number should be displayed under Disbursment Banking Details")
    public void onlyLastFourDigitOfAccountNumberShouldBeDisplayedUnderDisbursmentBankingDetails() {
        String value = getTextPresent(DetailsPage.disburseAccountNo);
        int unmasked = (value.length() - 4);

        verifyMaskedAndUnmaskedFormatUsingValue(value, "Account No", "*", 0, 4, true, "0");
        verifyMaskedAndUnmaskedFormatUsingValue(value, "Account No", "*", unmasked, 4, false, "1");


    }

    @Then("All amounts should be formatted correctly to two decimal places under Disbursment Banking Details")
    public void allAmountsShouldBeFormattedCorrectlyToTwoDecimalPlacesUnderDisbursmentBankingDetails() {
        verifyAmountsWithStartSymbols(DetailsPage.disburseAmount, "₹", "");
        details.verifyDisburseBankAmount("");

    }

    @And("Clicks on {string} Tab in Device Finance Section")
    public void clicksOnTabInDeviceFinanceSection(String tab) {
        clickOnButtonUsingXpathAndText("//ul[contains(@class,'devicefinance')]//li//a", tab);

    }


    @Then("User should be able to view below details under Device information section in Device Finance")
    public void userShouldBeAbleToViewBelowDetailsUnderDeviceInformationSectionInDeviceFinance() {
        details.verifyTableContentsDetailsPageDeviceFinance("Device Information", "device-info", "Agreement No#IMEI#Device Brand#Device Model#Product Code#Loan Status#EMI Overdue#Total Overdue#Last Staircase Action#Last Staircase Action Status#Last Staircase Trigger Date#Device Status#Action Application Date", "");

    }


    @Then("User should be able to view below details under Lock Details section in Device Finance")
    public void userShouldBeAbleToViewBelowDetailsUnderLockDetailsSectionInDeviceFinance() {
        details.verifyTableContentsDetailsPageDeviceFinance("Lock Details", "lock-info", "AGREEMENT NO#IMEI#LAST STAIRCASE TRIGGER DATE#LAST STAIRCASE DESCRIPTION#NEXT STAIRCASE DATE#NEXT STAIRCASE DESCRIPTION#EMI OVERDUE#TOTAL OVERDUE#BUCKET#PRODUCT CODE#LOAN STATUS#API STATUS#API ERROR DESC#DEVICE STATUS", "");

    }

    @Then("User should be able to view below details under Unlock Details section in Device Finance")
    public void userShouldBeAbleToViewBelowDetailsUnderUnlockDetailsSectionInDeviceFinance() {
        details.verifyTableContentsDetailsPageDeviceFinance("Unlock Details", "unlock-info", "AGREEMENT NO#IMEI#EMI OVERDUE#TOTAL OVERDUE#PRODUCT CODE#LOAN STATUS#API STATUS#API ERROR DESC#UNLOCK TRIGGER DATE#DEVICE STATUS#UNLOCK APPLICATION STATUS", "");

    }

    @Then("User should be able to view below details under Release Details section in Device Finance")
    public void userShouldBeAbleToViewBelowDetailsUnderReleaseDetailsSectionInDeviceFinance() {
        details.verifyTableContentsDetailsPageDeviceFinance("Release Details", "release-info", "AGREEMENT NO#IMEI#PRODUCT CODE#LOAN STATUS#API STATUS#API ERROR DESC#RELEASE TRIEGGER DATE#DEVICE STATUS#RELEASE APPLICATION DATE", "");
    }

    @Then("User should be able to view Get Details CTA under EMI card Tile {string}")
    public void userShouldBeAbleToViewGetDetailsCTAUnderEMICardTile(String tile) {
        String tileGetDetailsBtn = "Tile : " + tile + " Button: #xpath=(//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card pink')]//button[contains(@class,'get-details-btn')])";
        verifyElementIsDisplayedOrNot(tileGetDetailsBtn);
    }

    @Then("{string} Dropdown should be displayed on {string} page with available {string}")
    public void dropdownShouldBeDisplayedOnPageWithAvailable(String tag, String arg1, String arg2) {
        verifyFieldsDisplayedUsingTextAndForLoop(tag, "");
        verifyDropdownIsDisplayedAndPrintOptions(DetailsPage.depositdropDown, "");

    }

    @Then("Selected Card number {string} should be displayed in the dropdown, and the details related to that Card number should update accordingly")
    public void selectedCardNumberShouldBeDisplayedInTheDropdownAndTheDetailsRelatedToThatCardNumberShouldUpdateAccordingly(String drop) {
        details.verifyLoanSelectorDropdownRefresh("Cards", drop, "EMI Card Details", "Date of Activation", "");

    }

    @And("User should be able to view below details under Card Block-Unblock Status {string}")
    public void userShouldBeAbleToViewBelowDetailsUnderCardBlockUnblockStatus(String tab) {
        verifyFieldDisplayedUsingTagAndTextUsingScroll("h2", tab, "");
        details.verifyTableContentsDetailsPageFlexiDisbu(tab, "Date#Type#Activity#Reason", "");

    }

    @And("User should be able to view below details under Annual Fees Payment History {string}")
    public void userShouldBeAbleToViewBelowDetailsUnderAnnualFeesPaymentHistory(String tab) {
        verifyFieldDisplayedUsingTagAndTextUsingScroll("h2", tab, "");
        details.verifyTableContentsDetailsPageFlexiDisbu(tab, "Due Month#Receipt Date#Payment Status#Amount", "");

    }

    @And("User should be able to view below details under Transaction Details {string}")
    public void userShouldBeAbleToViewBelowDetailsUnderTransactionDetails(String tab) {
        verifyFieldDisplayedUsingTagAndTextUsingScroll("h2", tab, "");
        details.verifyTableContentsDetailsPageFlexiDisbu(tab, "Card Number#Deal ID#Txn Date Time#Dealer/Merchant#Txn Amount#Txn Type#Txn Status#LAN", "");

    }

    @Then("User should be able to view date under date section of Card Block-Unblock Status")
    public void userShouldBeAbleToViewDateUnderDateSectionOfCardBlockUnblockStatus() {
        verifyDateFormatLocator(DetailsPage.dateCardBlockStatus, "Date", "yyyy-MM-dd HH:mm:ss", "");

    }

    @Then("User should be able to view below pop up with header: {string}")
    public void userShouldBeAbleToViewBelowPopUpWithHeader(String pop) {
        verifyPopupDisplayedUsingTagAndText("h2", pop, "");

    }

    @And("Below message {string} should be displayed under {string} Table")
    public void belowMessageShouldBeDisplayedUnderTable(String msg, String table) {
        String ctrBitly = "CTR BITLY Expired #xpath=//h2[normalize-space(text())='" + table.trim() + "']/parent::div/descendant::table[@class='emi-table']//td[normalize-space(text())='" + msg.trim() + "']";
        verifyElementIsDisplayedAndGetText(ctrBitly);
    }

    @And("User should be able to view below details under CTR Report {string}")
    public void userShouldBeAbleToViewBelowDetailsUnderCTRReport(String tab) {
        verifyFieldDisplayedUsingTagAndTextUsingScroll("h2", tab, "");
        details.verifyTableContentsDetailsPageFlexiDisbu(tab, "CUSTOMER ID#AGREEMENT NO.#CTR#SEND SMS", "");

    }

    @Then("Customer id and Email id should be passed to Raise SR URL")
    public void customerIdAndEmailIdShouldBePassedToRaiseSRURL() {
        details.verifyRaiseSRUrl("cid, emailid", "");
    }

    @And("User should be able to view below details under Offers Table {string}")
    public void userShouldBeAbleToViewBelowDetailsUnderOffersTable(String tab) {
        verifyFieldDisplayedUsingTagAndTextUsingScroll("h2", tab, "");
        details.verifyTableContentsDetailsPageFlexiDisbu(tab, "Customer ID#Offer Type/Process#Offer Product#PO Name#Offer Amount#Offer Status#Hold Reason#Offer Created Date#Offer Refresh Date", "");

    }

    @Then("Offer amount value should be display style uniform \\(Currency Indian Rupee and Post decimal two digits) across platform.")
    public void offerAmountValueShouldBeDisplayStyleUniformCurrencyIndianRupeeAndPostDecimalTwoDigitsAcrossPlatform() {
        details.verifyOfferAmountOfferPage("Offers", "");

    }

    @Then("User should be able to view systemModstamp value in Offer Created date")
    public void userShouldBeAbleToViewSystemModstampValueInOfferCreatedDate() {
        details.verifyOfferCreatedRefreshDateOfferPage("Offers", 8, "dd-mm-yyyy", "");
    }

    @Then("User should be able to view icorsDate value in Offer Refresh Date")
    public void userShouldBeAbleToViewIcorsDateValueInOfferRefreshDate() {
        details.verifyOfferCreatedRefreshDateOfferPage("Offers", 9, "dd-mm-yyyy", "");

    }

    @Then("User should be  able to view Offer Created Date in descending order")
    public void userShouldBeAbleToViewOfferCreatedDateInDescendingOrder() {
        details.verifyOfferCreatedRefreshDateOrderOfferPage("Offers", 8, "dd-mm-yyyy", "");
    }

    @And("User should be able to view Offer Refresh Date in descending order")
    public void userShouldBeAbleToViewOfferRefreshDateInDescendingOrder() {
        details.verifyOfferCreatedRefreshDateOrderOfferPage("Offers", 9, "dd-mm-yyyy", "");

    }

    @Then("User should be able to view Offer created date and Offer refresh date columns format as DD-MM-YYYY")
    public void userShouldBeAbleToViewOfferCreatedDateAndOfferRefreshDateColumnsFormatAsDDMMYYYY() {

    }

    @Then("User should be able to view Offer created date and Offer refresh date columns format as {string}")
    public void userShouldBeAbleToViewOfferCreatedDateAndOfferRefreshDateColumnsFormatAs(String format) {
        details.verifyOfferCreatedRefreshDateOfferPage("Offers", 8, format, "");
        details.verifyOfferCreatedRefreshDateOfferPage("Offers", 9, format, "");

    }

    @Then("Pagination should be required in case there are multiple rows or entries")
    public void paginationShouldBeRequiredInCaseThereAreMultipleRowsOrEntries() {
        details.verifyOffersPaginationOffersPage("Offers", "");
    }

    @Then("User should be able to view sorting option for {string}")
    public void userShouldBeAbleToViewSortingOptionFor(String head) {
        details.verifySortingOptionOffersPage("Offers", head, "");
    }

    @Then("User should be able to view below details under Identification PII {string}")
    public void userShouldBeAbleToViewBelowDetailsUnderIdentificationPII(String tab) {
        verifyFieldDisplayedUsingTagAndTextUsingScroll("h2", tab, "");
        details.verifyTableContentsDetailsPageFlexiDisbu(tab, "Customer Id#PAN Number#DOB#CKYC Number", "");

    }

    @Then("User should be able to view DOB in format {string} for {string}")
    public void userShouldBeAbleToViewDOBInFormatFor(String format, String head) {
        details.verifyOfferCreatedRefreshDateOfferPage(head, 3, format, "");
    }

    @Then("User should be able to view below details under Communication PII {string}")
    public void userShouldBeAbleToViewBelowDetailsUnderCommunicationPII(String tab) {
        verifyFieldDisplayedUsingTagAndTextUsingScroll("h2", tab, "");
        details.verifyTableContentsDetailsPageFlexiDisbu(tab, "Customer Id#Mobile Number#Phone 1#Phone 2#Email#Address", "");

    }

    @Then("User should be able to view {string} under {string}")
    public void userShouldBeAbleToViewUnder(String head, String tab) {
        details.verifyTableLabelsIndividual(tab, head, "");
    }

    @Then("{string} message should be displayed for {string} when no data available")
    public void messageShouldBeDisplayedForWhenNoDataAvailable(String msg, String tab) {
        details.verifynoDataAvailable(tab, msg, "");
    }

    @Then("User should be able to view below details under Demographic Details {string}")
    public void userShouldBeAbleToViewBelowDetailsUnderDemographicDetails(String tab) {
        verifyFieldDisplayedUsingTagAndTextUsingScroll("h2", tab, "");
        details.verifyTableContentsDetailsPageFlexiDisbu(tab, "Customer Id#Customer Name#Address 1#Address 2#Address 3#Bank Name#DOB#Mobile No.#PAN No#Phone#MICR Code#Finware Ac No#Business Date#Process Date#Segment#Email#Last Update", "");

    }

    @Then("{string} icon in {string} column should be displayed under {string}")
    public void iconInColumnShouldBeDisplayedUnder(String logo, String column, String tab) {
        details.verifyTableLabelsIcon(tab, column, logo, "");
    }

    @And("Clicks on CTR Report")
    public void clicksOnCTRReport() {
        clickOn(DetailsPage.ctrReportLogo);
        waitForPageToLoad();
    }

    @And("Enters {string} Password in the Password Box in CTR Validation Page")
    public void entersPasswordInThePasswordBoxInCTRValidationPage(String pwd) {
        scrollToWebElementIfPresent(DetailsPage.ctrPasswordBox);
        typeIn(DetailsPage.ctrPasswordBox, pwd);
    }

    @And("Clicks on Submit Button in CTR Validation Page")
    public void clicksOnSubmitButtonInCTRValidationPage() {
        clickOn(DetailsPage.ctrSubmitButton);
        waitForPageToLoad();
    }

    @And("Clicks on SMS icon in Send SMS Column in CTR Report")
    public void clicksOnSMSIconInSendSMSColumnInCTRReport() {
        clickOn(DetailsPage.smsSendSMSLogo);
    }

    @Then("Below toaster message {string} should be displayed for CTR Report")
    public void belowToasterMessageShouldBeDisplayedForCTRReport(String msg) {
        handleToastByClass("toast-message", msg, "");

    }

    @Then("User should be able to view below details under Reward Service {string}")
    public void userShouldBeAbleToViewBelowDetailsUnderRewardService(String tab) {
        verifyFieldDisplayedUsingTagAndTextUsingScroll("h2", tab, "");
        details.verifyTableContentsDetailsPageFlexiDisbu(tab, "CUSTOMER ID#FLAG#REWARD#ELIGIBILITY DATE#TRANSACTION ID", "");

    }

    @Then("User should be able to view below details under Flexi Rewards {string}")
    public void userShouldBeAbleToViewBelowDetailsUnderFlexiRewards(String tab) {
        verifyFieldDisplayedUsingTagAndTextUsingScroll("h2", tab, "");
        details.verifyTableContentsDetailsPageFlexiDisbu(tab, "CUSTOMER ID#AGREEMENT NO#PRODUCT#AVAILABLE LIMIT#MIN-DRAWDOWN AMOUNT#CAMPAIGN START DATE#CAMPAIGN END DATE#CAMPAIGN ID", "");


    }

    @Then("Below Options {string} should be displayed under the BFL Credit Summary section {string}")
    public void belowOptionsShouldBeDisplayedUnderTheBFLCreditSummarySection(String opts, String section) {
        verifyFieldDisplayedUsingTagAndText("h2", section, "");
        String opt = changeCommaToHash(opts, "");
        verifyFieldsUsingCommonXpathAndMultipleTextWithHash("//h3", opt, "");

    }

    @And("Below Details {string} should be displayed under {string} Section in Credit Summary Page")
    public void belowDetailsShouldBeDisplayedUnderSectionInCreditSummaryPage(String opts, String section) {
        details.verifycreditSummaryPage(opts, section, "");
    }

    @And("User should be able to view below details under Live Tradeline Table {string}")
    public void userShouldBeAbleToViewBelowDetailsUnderLiveTradelineTable(String tab) {
        verifyFieldDisplayedUsingTagAndTextUsingScroll("h3", tab, "");
        details.verifyTableContentsCreditSummary(tab, "Agreement Number#Product Category#Product Type#Disbursal Date#Loan Amount#POS#Status#MOB#DPD (Y/N)#DPD#Facility Status#Restructure Status#Member", "");
        details.verifyTableLabelsIconCreditSummary(tab, "Details", "Details", "");
        details.verifyTableLabelsIconCreditSummary(tab, "SOA", "Reports", "");
    }

    @And("User should be able to view below details under Cancelled & Closed Tradeline Table {string}")
    public void userShouldBeAbleToViewBelowDetailsUnderCancelledClosedTradelineTable(String tab) {
        verifyFieldDisplayedUsingTagAndTextUsingScroll("h3", tab, "");
        details.verifyTableContentsCreditSummary(tab, "Agreement Number#Product Category#Product Type#Disbursal Date#Loan Amount#POS#Status#MOB#DPD (Y/N)#DPD#Facility Status#Restructure Status#Member", "");
        details.verifyTableLabelsIconCreditSummary(tab, "Details", "Details", "");
        details.verifyTableLabelsIconCreditSummary(tab, "SOA", "Reports", "");

    }

    @And("Verify the details displayed under Identification section {string}")
    public void verifyTheDetailsDisplayedUnderIdentificationSection(String tab) {
        verifyFieldDisplayedUsingTagAndTextUsingScroll("h3", tab, "");
        details.verifyIdentificationTableContentsCreditSummary(tab, "Identification Type#Identification Number", "");

    }

    @And("Click on View Details Link of {string} Section in Credit Summary Page")
    public void clickOnViewDetailsLinkOfSectionInCreditSummaryPage(String sect) {
        details.clickViewReportsCreditSummary(sect, "");
    }

    @Then("User should redirect to View Details page and below sections should be displayed")
    public void userShouldRedirectToViewDetailsPageAndBelowSectionsShouldBeDisplayed() {
        verifyFieldsUsingCommonXpathAndMultipleTextWithHash("//h3", "Co Applicant#Tradeline Details", "");
        verifyFieldsUsingCommonXpathAndMultipleTextWithHash("//p", "LAN#CoApplicant Customer ID", "");
        verifyDropdownIsDisplayedAndPrintOptions(DetailsPage.lanDropdownCreditSummary, "");
        verifyDropdownIsDisplayedAndPrintOptions(DetailsPage.coApplicantDropdownCreditSummary, "");
    }

    @And("Below Details {string} should be displayed under {string} Section in View Details Page")
    public void belowDetailsShouldBeDisplayedUnderSectionInViewDetailsPage(String opts, String section) {
        details.verifycreditSummaryPage(opts, section, "");

    }

    @Then("Customer ID dropdown should be displayed in BFL Credit Summary Page")
    public void customerIDDropdownShouldBeDisplayedInBFLCreditSummaryPage() {
        verifyDropdownIsDisplayedAndPrintOptions(DetailsPage.custIddropDown, "");
    }

    @And("Select Another lan available, then details should be updated as per LAN selected")
    public void selectAnotherLanAvailableThenDetailsShouldBeUpdatedAsPerLANSelected() {
        details.lanAgreementNumberSelectedViewDetailsCreditSummary("");
    }

    @And("On clicking the PDF Logo of the Label SOA {string}, then the Document should be downloaded along with a Toast message")
    public void onClickingThePDFLogoOfTheLabelSOAThenTheDocumentShouldBeDownloadedAlongWithAToastMessage(String doc) {
        details.verifyPDFDownloadViewDetailsCreditSummary(doc, "SOA", "");
    }

    @And("On clicking the PDF Logo of the Label Repayment Schedule {string}, then the Document should be downloaded along with a Toast message")
    public void onClickingThePDFLogoOfTheLabelRepaymentScheduleThenTheDocumentShouldBeDownloadedAlongWithAToastMessage(String doc) {
        details.verifyPDFDownloadViewDetailsCreditSummary(doc, "RPS", "");

    }


    @Then("{string} icon should be displayed before the financial amount for {string} in {string} Table")
    public void iconShouldBeDisplayedBeforeTheFinancialAmountForInTable(String icon, String label, String section) {
        details.verifyAmountFormatCreditSummaryTables(icon, label, section, "");
    }


    @And("Verify the Date for {string} Label in {string} Section in Credit Summary Pages")
    public void verifyTheDateForLabelInSectionInCreditSummaryPages(String label, String section) {
        details.verifyDateFormatCreditSummaryPage(label, section, "");

    }

    @Then("{string} icon should be displayed before the financial amount for {string} in {string} Section")
    public void iconShouldBeDisplayedBeforeTheFinancialAmountForInSection(String icon, String labels, String section) {
        details.verifyAmountFormatCreditSummaryPage(icon, labels, section, "");
    }

    @And("Verify the Date for {string} Label in {string} Table in Credit Summary Pages")
    public void verifyTheDateForLabelInTableInCreditSummaryPages(String label, String section) {
        details.verifyDateFormatCreditSummaryTables(label, section, "");
    }

    @And("User should be able to download document on clicking Pdf logo of {string} Document in {string} Section of Credit Summary Page")
    public void userShouldBeAbleToDownloadDocumentOnClickingPdfLogoOfDocumentInSectionOfCreditSummaryPage(String doc, String section) {
        details.verifyPDFDownloadFromTableCreditSummary(doc, "SOA", section, "");
    }

    @Then("User should be able to view Get Details CTA under Insurance Tile {string}")
    public void userShouldBeAbleToViewGetDetailsCTAUnderInsuranceTile(String tile) {
        String tileGetDetailsBtn = "Tile : " + tile + " Button: #xpath=(//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card')]//button[contains(@class,'get-details-btn')])";
        verifyElementIsDisplayedOrNot(tileGetDetailsBtn);

    }

    @Then("Below Options {string} should be displayed under the {string} section in Insurance Details Page")
    public void belowOptionsShouldBeDisplayedUnderTheSectionInInsuranceDetailsPage(String opts, String sect) {
        details.verifyReportsInsuranceDetailsPage(opts, sect, "");
    }


    @And("Selects a Date {string} in the Select Date Calendar")
    public void selectsADateInTheSelectDateCalendar(String date) {
        typeIn(DetailsPage.selectDataFdInput, date);
    }

    @And("Clicks on {string} CTA")
    public void clicksOnCTA(String button) {
        clickOnButtonUsingTextUsingForLoop(button);
    }

    @Then("{string} CTA should be Enabled and Clickable")
    public void ctaShouldBeEnabledAndClickable(String button) {
        verifyButtonIsEnabledInThePageusingText(button);
    }

    @Then("{string} Popup should be displayed for TDS Report")
    public void popupShouldBeDisplayedForTDSReport(String pop) {
        verifyPopupDisplayedUsingTagAndText("h2", pop, "");
    }

    @Then("Popup should be displayed exactly with the last {int} financial years")
    public void popupShouldBeDisplayedExactlyWithTheLastFinancialYears(int years) {
        verifyGetAllOptionsInDropDownAndCompare(DetailsPage.financialYearDropdown, DashboardPage.generateFinancialYearsNew(5));

    }

    @Then("Validation message or alert should be displayed, and the download should not proceed")
    public void validationMessageOrAlertShouldBeDisplayedAndTheDownloadShouldNotProceed() {
        handleToastByClass("toast-title", "Error", "");
    }

    @Then("Below Documents {string} should be displayed under the {string} section in {string} Details Page")
    public void belowDocumentsShouldBeDisplayedUnderTheSectionInDetailsPage(String opts, String sect, String arg2) {
        details.verifyReportsInsuranceDetailsPage(opts, sect, "");

    }

    @Then("Click on PDF icon of {string} report in {string} Section")
    public void clickOnPDFIconOfReportInSection(String doc, String sect) {
        details.clickReportsInsuranceDetailsPage(doc, sect, "");
    }

    @Then("{string} File should be downloaded")
    public void fileShouldBeDownloaded(String file) {
        verifyDownLoadAndDeleteLatestFileNameFromLocalMachine(file);
    }


    @Then("User should be able to view CheckList {string} for death critical illness in the file {string}")
    public void userShouldBeAbleToViewCheckListForDeathCriticalIllnessInTheFile(String text, String file) {
        details.checkDocsContentInsurance(text, "" + getCurrentPath() + "\\Downloads\\checklistdeath.xls", "Document Check List", "");
        deleteFileFromLocalMachine(file);
    }

    @And("Verify {string} File is downloaded for death critical illness")
    public void verifyFileIsDownloadedForDeathCriticalIllness(String file) {
        getLatestFileFromLocalMachine(file);
    }


    @Then("User should be able to view {string} under CheckList {string} for death critical illness in the file {string}")
    public void userShouldBeAbleToViewUnderCheckListForDeathCriticalIllnessInTheFile(String arg0, String text, String file) {
        details.checkDocsContentInsurance(text, "" + getCurrentPath() + "\\Downloads\\checklistdeath.xls", "Document Check List", "");
        deleteFileFromLocalMachine(file);

    }

    @Then("User should be able to view {string} under Guidelines {string} for death critical illness in the file {string} under sheet {string}")
    public void userShouldBeAbleToViewUnderGuidelinesForDeathCriticalIllnessInTheFileUnderSheet(String header, String text, String file, String sheet) {
        details.checkDocsContentInsurance(header, "" + getCurrentPath() + "\\Downloads\\checklistdeath.xls", sheet, "");
        details.checkDocsContentInsurance(text, "" + getCurrentPath() + "\\Downloads\\checklistdeath.xls", sheet, "");
        deleteFileFromLocalMachine(file);

    }

    @And("Selects a different Policy from Policy Dropdown {string} ,then Page should automatically refresh and display the details of the selected Policy")
    public void selectsADifferentPolicyFromPolicyDropdownThenPageShouldAutomaticallyRefreshAndDisplayTheDetailsOfTheSelectedPolicy(String policy) {
        details.verifyPolicyNoSelectorDropdownRefresh(policy, "");
    }


    @Then("user should land on Bajaj Pay menu landing page with below details available:")
    public void userShouldLandOnBajajPayMenuLandingPageWithBelowDetailsAvailable() {
        verifyElementIsPresentUsingLocator(DetailsPage.searchByCustomerDropdown);
        verifyElementIsPresentUsingLocator(DetailsPage.searchByCustomerInput);
        verifyElementIsPresentUsingLocator(DetailsPage.searchByCustomerProceed);
    }

    @Then("below list of components should be displayed:")
    public void belowListOfComponentsShouldBeDisplayed() {
        verifyElementIsPresentUsingLocator(DetailsPage.searchByCustomerDropdown);
        verifyElementIsPresentUsingLocator(DetailsPage.personalInfoHeader);
        verifyElementIsPresentUsingLocator(DetailsPage.serviceSegmanetHeader);
        verifyElementIsPresentUsingLocator(DetailsPage.quickLinksHeader);
        verifyElementIsPresentUsingLocator(DetailsPage.bbpsSection);
        verifyElementIsPresentUsingLocator(DetailsPage.walletSection);
        verifyElementIsPresentUsingLocator(DetailsPage.upiSection);
        verifyElementIsPresentUsingLocator(DetailsPage.gamesSection);
    }

    @And("Verify “Personal Widget Info”")
    public void verifyPersonalWidgetInfo() {
        verifyElementIsPresentUsingLocator(DetailsPage.personalInfoHeader);
    }

    @Then("below list of details should be displayed in Personal Info:")
    public void belowListOfDetailsShouldBeDisplayedInPersonalInfo() {
        getValueUsingLabel("Gender");
        getValueUsingLabel("PAN");
        getValueUsingLabel("Marital Status");
        getValueUsingLabel("DOB");
        getValueUsingLabel("Mobile No");
        getValueUsingLabel("Email ID");
        getValueUsingLabel("Address");
    }

    @And("Verify “Customer Name”")
    public void verifyCustomerName() {
        verifyElementIsPresentUsingLocator(DetailsPage.customerName);
        verifyElementIsPresentUsingLocator(DetailsPage.customerID);
    }

    @Then("Only last four digits of mobile number should be unmasked and rest should be masked")
    public void onlyLastFourDigitsOfMobileNumberShouldBeUnmaskedAndRestShouldBeMasked() {
        getValueUsingLabel("Mobile No");
    }

    @And("Verify the DOB field")
    public void verifyTheDOBField() {
        getValueUsingLabel("DOB");
    }

    @Then("only last {int} char of PAN should be unmasked and rest should be masked")
    public void onlyLastCharOfPANShouldBeUnmaskedAndRestShouldBeMasked(int arg0) {
        getValueUsingLabel("PAN");
    }

    @And("Verify the emailid field")
    public void verifyTheEmailidField() {
        verifyElementIsPresentUsingLocator(DetailsPage.emailIDField);
    }

    @Then("first letter, the letter prefix to “@” symbol and the domain name of emailid should be unmasked")
    public void firstLetterTheLetterPrefixToSymbolAndTheDomainNameOfEmailidShouldBeUnmasked() {
        getValueUsingLabel("Email ID");
    }

    @And("Verify the Address  field")
    public void verifyTheAddressField() {
        verifyElementIsPresentUsingLocator(DetailsPage.emailIDField);
    }

    @Then("City, state and pincode should be unmasked and rest of the address should be masked")
    public void cityStateAndPincodeShouldBeUnmaskedAndRestOfTheAddressShouldBeMasked() {
        getValueUsingLabel("Address");
    }

    @And("Verify “Customer ID”")
    public void verifyCustomerID() {
        verifyElementIsPresentUsingLocator(DetailsPage.customerID);
    }

    @Then("When customer id is not found against searched parameter then below details should be displayed:")
    public void whenCustomerIdIsNotFoundAgainstSearchedParameterThenBelowDetailsShouldBeDisplayed() {
        getValueUsingLabel("Gender");
        getValueUsingLabel("PAN");
        getValueUsingLabel("Marital Status");
        getValueUsingLabel("DOB");
        getValueUsingLabel("Mobile No");
        getValueUsingLabel("Email ID");
        getValueUsingLabel("Address");
    }


    @Then("records should be updated as per the selected cust id from dropdown")
    public void recordsShouldBeUpdatedAsPerTheSelectedCustIdFromDropdown() {
//
        getValueUsingLabel("Gender");
        getValueUsingLabel("PAN");
        getValueUsingLabel("Marital Status");
        getValueUsingLabel("DOB");
        getValueUsingLabel("Mobile No");
        getValueUsingLabel("Email ID");
        getValueUsingLabel("Address");
//
        getValueUsingLabel("Gender");
        getValueUsingLabel("PAN");
        getValueUsingLabel("Marital Status");
        getValueUsingLabel("DOB");
        getValueUsingLabel("Mobile No");
        getValueUsingLabel("Email ID");
        getValueUsingLabel("Address");
    }

    @And("Verify “SERVICE SEGMENT”")
    public void verifySERVICESEGMENT() {
        verifyElementIsPresentUsingLocator(DetailsPage.serviceSegmanetHeader);
    }

    @And("Verify the details displayed under service segment")
    public void verifyTheDetailsDisplayedUnderServiceSegment() {
        getValueUsingLabel("Service Segment");
        getValueUsingLabel("DNC Status");
        getValueUsingLabel("Preferred Language");
        getValueUsingLabel("KYC Flag | Type");
        getValueUsingLabel("BBPS | WALLET | UPI Status");
        getValueUsingLabel("Bajaj Finserv App Status");
        getValueUsingLabel("Type");
    }

    @And("Verify the details displayed under service segments")
    public void verifyTheDetailsDisplayedUnderServiceSegments() {
        getValueUsingLabel("Type");
    }

    @Then("Then “type = NTB” should be displayed")
    public void thenTypeNTBShouldBeDisplayed() {
        getValueUsingLabelandVerify("Type", "NTB");
    }

    @And("Verify “QUICK LINKS”")
    public void verifyQUICKLNKS() {
        verifyElementIsPresentUsingLocator(DetailsPage.quickLinksHeader);
    }

    @And("Verify the Links are displayed")
    public void verifyTheLinksAreDisplayed() {
        verifyLinkIsPresent("Chat History");
        verifyLinkIsPresent("RMS");
//        verifyLinkIsPresent("Raise SR");
//        verifyLinkIsPresent("Request History");

    }

    @And("Verify the options displayed under Quick Links Widget")
    public void verifyTheOptionsDisplayedUnderQuickLinksWidget() {
        verifyLinkIsPresent("Chat History");
        verifyLinkIsPresent("RMS");
//        verifyLinkIsPresent("Raise SR");
//        verifyLinkIsPresent("Request History");
    }

    @And("Verify the No Details Available displayed under Transactions")
    public void verifyTheNoDetailsAvailableDisplayedUnderTransactions() {
        verifyElementIsPresentUsingLocator(DetailsPage.noDetailsAvailable);
    }

    @And("Verify the No Details Available displayed under BBPS Dispute")
    public void verifyTheNoDetailsAvailableDisplayedUnderBBPSDispute() {
        verifyElementIsPresentUsingLocator(DetailsPage.noDetailsAvailable);
    }

    @And("Verify the No Details Available displayed under PG Complaint Details")
    public void verifyTheNoDetailsAvailableDisplayedUnderPGComplaintDetails() {
        verifyElementIsPresentUsingLocator(DetailsPage.noDetailsAvailable);
    }

    @And("Verify the No Details Available displayed under Interop Transactions")
    public void verifyTheNoDetailsAvailableDisplayedUnderInteropTransactions() {
        verifyElementIsPresentUsingLocator(DetailsPage.noDetailsAvailable);
    }

    @And("Verify the No Details Available displayed under Wallet Activity")
    public void verifyTheNoDetailsAvailableDisplayedUnderWalletActivity() {
        verifyElementIsPresentUsingLocator(DetailsPage.noDetailsAvailable);
    }

    @And("Verify the No Details Available displayed under Wallet Auto Load")
    public void verifyTheNoDetailsAvailableDisplayedUnderWalletAutoLoad() {
        manualScreenshot("Wallet Auto Load");
    }

    @And("Verify the No Details Available displayed under TXN History")
    public void verifyTheNoDetailsAvailableDisplayedUnderTXNHistory() {
        verifyElementIsPresentUsingLocator(DetailsPage.noDetailsAvailable);
    }

    @And("Verify the No Details Available displayed under OTP History")
    public void verifyTheNoDetailsAvailableDisplayedUnderOTPHistory() {
        verifyElementIsPresentUsingLocator(DetailsPage.noDetailsAvailable);
    }

    @And("Verify the No Details Available displayed under Refund Transactions")
    public void verifyTheNoDetailsAvailableDisplayedUnderRefundTransactions() {
        verifyElementIsPresentUsingLocator(DetailsPage.noDetailsAvailable);
    }

    @Then("user should be redirect to below URL in new Fast tag Tab:")
    public void userShouldBeRedirectToBelowURLInNewFastTagTab() {
        transferControlToWindow(2, false);
        waitTime(8);
        manualScreenshot("FastTag");
        transferControlToWindow(1, true);
    }

    @Then("user should be redirect to below URL in new Gift Card Tab:")
    public void userShouldBeRedirectToBelowURLInNewGiftCardTab() {
        transferControlToWindow(2, false);
        waitTime(8);
        manualScreenshot("Gift Card");
        transferControlToWindow(1, true);
    }

    @And("Verify the No Details Available displayed under Refer")
    public void verifyTheNoDetailsAvailableDisplayedUnderRefer() {
        verifyElementIsPresentUsingLocator(DetailsPage.noDetailsAvailable);
    }

    @And("Check all the pages on which details are available in tabular format")
    public void checkAllThePagesOnWhichDetailsAreAvailableInTabularFormat() {
        verifyElementIsPresentUsingLocator(DetailsPage.tabelHome);
    }

    @Then("Horizontal scroll option should be available when details are available in tabular format")
    public void horizontalScrollOptionShouldBeAvailableWhenDetailsAreAvailableInTabularFormat() {
        verifyElementIsPresentUsingLocator(DetailsPage.tabelHome);
        manualScreenshot("Horizontal Scroll is present");
    }

    @Then("Vertical scroll option should be available when details are available in tabular format")
    public void verticalScrollOptionShouldBeAvailableWhenDetailsAreAvailableInTabularFormat() {
        verifyElementIsPresentUsingLocator(DetailsPage.tabelHome);
        manualScreenshot("Horizontal Scroll is present");
    }

    @And("Verify the No Details Available displayed under Games")
    public void verifyTheNoDetailsAvailableDisplayedUnderGames() {
        manualScreenshot("No Details present");
    }

    ////Mustaq
    @Then("Selected date {string} should be confirmed without any errors in the Calendar")
    public void selectedDateShouldBeConfirmedWithoutAnyErrorsInTheCalendar(String date) {
        details.verifyBCLReportCalendarDate(date, "");
    }

    @And("Selects Invalid date in Select a Date Calendar")
    public void selectsInvalidDateInSelectADateCalendar() {
        String future = generateFutureDate(7, "ddmmyyyy");
        typeIn(DetailsPage.selectDataFdInput, future);
    }

    @Then("User should be able to view below details under TDS Details {string}")
    public void userShouldBeAbleToViewBelowDetailsUnderTDSDetails(String tab) {
        verifyFieldDisplayedUsingTagAndTextUsingScroll("h2", tab, "");
        details.verifyTableContentsDetailsPageFlexiDisbu(tab, "Effective Date#Financial Year#TDS Applied#TDS Waiver#Document Submitted Date#Reason#Tax", "");


    }

    @Then("User should be able to view below details under Courier Details {string}")
    public void userShouldBeAbleToViewBelowDetailsUnderCourierDetails(String tab) {
        verifyFieldDisplayedUsingTagAndTextUsingScroll("h2", tab, "");
        details.verifyTableContentsDetailsPageFlexiDisbu(tab, "Courier Date#Courier From#Courier To#Courier Address#AWB No.#Latest Status#Manifestation Date/Time#Status Details", "");

    }

    @Then("Disclaimer {string} Note Should be displayed in the {string} Section")
    public void disclaimerNoteShouldBeDisplayedInTheSection(String discl, String arg1) {
        verifyFieldDisplayedUsingTagAndText("h2", "Disclaimer:", "");
        verifyGetTextUsingLocatorAndCompareWithText(DetailsPage.disclaimerPrematurity, discl, "");

    }

    @Then("{string} report Should be downloaded in user system")
    public void reportShouldBeDownloadedInUserSystem(String file) {
        verifyDownLoadAndDeleteLatestFileNameFromLocalMachine(file);
    }

    @And("Selects the Previous Financial Year from Year Dropdown")
    public void selectsThePreviousFinancialYearFromYearDropdown() {
        selectDropDownUsingIndex(DetailsPage.financialYearDropdown, 2);
    }

    @And("Selects the First {int} Quarter from Quarter Dropdown")
    public void selectsTheFirstQuarterFromQuarterDropdown(int quarter) {
        selectDropDownUsingIndex(DetailsPage.quarterDropdown, quarter);

    }

    @Then("{string} report for the selected financial year and quarter should be downloaded successfully")
    public void reportForTheSelectedFinancialYearAndQuarterShouldBeDownloadedSuccessfully(String file) {
        verifyDownLoadAndDeleteLatestFileNameFromLocalMachine(file);
    }

    @Then("Disclaimer {string} Note Should be displayed in the Device Finance Section")
    public void disclaimerNoteShouldBeDisplayedInTheDeviceFinanceSection(String discl) {
        verifyFieldDisplayedUsingTagAndText("strong", "Disclaimer :", "");
        verifyGetTextContains(DetailsPage.disclaimerDeviceFinance, discl);

    }

    @Then("Below Tabs {string} should be displayed under {int} in {int} data")
    public void belowTabsShouldBeDisplayedUnderInData(String tabs, int arg1, int arg2) {
        details.verifyTabIsDisplayedInThe3in1PageusingText(tabs, "");
    }

    @Then("Count for the Tab {string} should be displayed under {int} in {int} data")
    public void countForTheTabShouldBeDisplayedUnderInData(String tab, int arg1, int arg2) {
        details.tabCountIn3in1Page(tab, "");
    }

    @And("Clicks on Tab {string} under {int}in{int} data Section")
    public void clicksOnTabUnderInDataSection(String tab, int arg1, int arg2) {
        clickOnButtonUsingXpathAndText("//ul[contains(@class,'devicefinance')]//li//a", tab);
    }

    @And("Below details should be displayed for Loans under {int} in {int} data")
    public void belowDetailsShouldBeDisplayedForLoansUnderInData(int arg0, int arg1) {
        details.verifyTableContentsDetailsPageDeviceFinance("Loans", "device-info", "AGREEMENT NO#DESCRIPTION#STATUS", "");

    }

    @And("Below details should be displayed for Insurance under {int} in {int} data")
    public void belowDetailsShouldBeDisplayedForInsuranceUnderInData(int arg0, int arg1) {
        details.verifyTableContentsDetailsPageDeviceFinance("Insurance", "release-info", "POLICY NO#DESCRIPTION#STATUS", "");

    }

    @And("Below details should be displayed for Cards under {int} in {int} data")
    public void belowDetailsShouldBeDisplayedForCardsUnderInData(int arg0, int arg1) {
        details.verifyTableContentsDetailsPageDeviceFinance("Cards", "lock-info", "CARD NO#DESCRIPTION#STATUS", "");

    }

    @And("Below details should be displayed for Deposits under {int} in {int} data")
    public void belowDetailsShouldBeDisplayedForDepositsUnderInData(int arg0, int arg1) {
        details.verifyTableContentsDetailsPageDeviceFinance("Deposits", "unlock-info", "DEPOSIT NO#DESCRIPTION#STATUS", "");

    }

    @And("Card Number should be in masked format for Cards")
    public void cardNumberShouldBeInMaskedFormatForCards() {
        details.verifyCardsNumberMasked3in1Page("Cards", "lock-info", "");
    }

    @Then("Favourite Status under Flexi Lite and Favourite Status of Flexi Information should be {string}")
    public void favouriteStatusUnderFlexiLiteAndFavouriteStatusOfFlexiInformationShouldBe(String status) {
        verifyGetTextUsingLocatorAndCompareWithText(DetailsPage.favouriteStatus, status, "");
    }

    @Then("{string} message should be displayed for Device Information when no data available")
    public void messageShouldBeDisplayedForDeviceInformationWhenNoDataAvailable(String text) {
        dashboard.verifynoDataAvailable("device-info", text, "");

    }

    @Then("{string} message should be displayed for Lock Details when no data available")
    public void messageShouldBeDisplayedForLockDetailsWhenNoDataAvailable(String text) {
        dashboard.verifynoDataAvailable("lock-info", text, "");

    }

    @Then("{string} message should be displayed for UnLock Details when no data available")
    public void messageShouldBeDisplayedForUnLockDetailsWhenNoDataAvailable(String text) {
        dashboard.verifynoDataAvailable("unlock-info", text, "");

    }

    @Then("{string} message should be displayed for Release Details when no data available")
    public void messageShouldBeDisplayedForReleaseDetailsWhenNoDataAvailable(String text) {
        dashboard.verifynoDataAvailable("release-info", text, "");

    }

    @Then("{string} Toast message should be displayed to the User for Invalid date for BCL Report")
    public void toastMessageShouldBeDisplayedToTheUserForInvalidDateForBCLReport(String toast) {
        handleToastByClass("toast-title", toast, "");
    }

    @Then("Customer Id Dropdown should be displayed for co-applicant tab")
    public void customerIdDropdownShouldBeDisplayedForCoApplicantTab() {
        verifyDropdownIsDisplayedAndPrintOptions(DetailsPage.custIddropDown, "");

    }

    @And("Verify No drop-down for Deposit Number selection should be shown")
    public void verifyNoDropDownForDepositNumberSelectionShouldBeShown() {
        verifyElementIsNotPresentUsingLocator(DetailsPage.depositdropDown);
    }

    @And("Bank Acc Number under EMI Card Details should be masked in required format")
    public void bankAccNumberUnderEMICardDetailsShouldBeMaskedInRequiredFormat() {
        String value = DetailsPage.getLabelValueDetailsPage("EMI Card Details", "Bank Acc Number", "");
        verifyMaskedAndUnmaskedFormatUsingValue(value, "Bank Acc Number", "*", 0, 4, true, "0");
        int unmasked = (value.length() - 4);
        verifyMaskedAndUnmaskedFormatUsingValue(value, "Bank Acc Number", "*", unmasked, 4, false, "1");

    }

    @And("Verify masked format for PAN in Identification Section")
    public void verifyMaskedFormatForPANInIdentificationSection() {
        String value = DetailsPage.getLabelValueDetailsPage("Identification", "PAN", "");
        verifyMaskedAndUnmaskedFormatUsingValue(value, "PAN", "X", 0, 4, true, "0");
        int unmasked = (value.length() - 4);
        verifyMaskedAndUnmaskedFormatUsingValue(value, "PAN", "X", unmasked, 4, false, "1");

    }

    @And("Verify masked format for CKYC in Identification Section")
    public void verifyMaskedFormatForCKYCInIdentificationSection() {
        String value = DetailsPage.getLabelValueDetailsPage("Identification", "CKYC", "");
        verifyMaskedAndUnmaskedFormatUsingValue(value, "CKYC", "X", 0, 4, true, "0");
        int unmasked = (value.length() - 4);
        verifyMaskedAndUnmaskedFormatUsingValue(value, "CKYC", "X", unmasked, 4, false, "1");

    }

    @Then("Below details should be displayed in the GST Details Page")
    public void belowDetailsShouldBeDisplayedInTheGSTDetailsPage() {
        verifyFieldDisplayedUsingTagAndText("h2", "GST INVOICE DETAILS", "");
        verifyFieldDisplayedUsingTagAndText("h3", "Identification Details", "");
        verifyDropdownIsDisplayedAndPrintOptions(DetailsPage.agreementDropGstPage, "");
        verifyDropdownIsDisplayedAndPrintOptions(DetailsPage.invoiceDropGstPage, "");
        verifyButtonIsDisabledInThePageusingText("Tax Invoice");
        verifyButtonIsDisabledInThePageusingText("Credit Note");
    }

    @Then("User will be able to view all LAN's against the customer ID in drop down in GST Details Page")
    public void userWillBeAbleToViewAllLANSAgainstTheCustomerIDInDropDownInGSTDetailsPage() {
        verifyDropdownIsDisplayedAndPrintOptions(DetailsPage.agreementDropGstPage, "");

    }

    @Then("User should be able to select Agreement Number {string} from drop down in GST Details Page")
    public void userShouldBeAbleToSelectAgreementNumberFromDropDownInGSTDetailsPage(String agr) {
        getSelectedOptionInDropDown(DetailsPage.agreementDropGstPage, agr);
    }

    @And("Select Agreement Number {string} from drop down in GST Details Page")
    public void selectAgreementNumberFromDropDownInGSTDetailsPage(String agr) {
        selectDropDownUsingText(DetailsPage.agreementDropGstPage, agr);

    }

    @Then("User should be able to view all the Invoice number against the selected LAN's in GST Details Page")
    public void userShouldBeAbleToViewAllTheInvoiceNumberAgainstTheSelectedLANSInGSTDetailsPage() {
        verifyDropdownIsDisplayedAndPrintOptions(DetailsPage.invoiceDropGstPage, "");
    }

    @And("Select Invoice Number {string} from drop down in GST Details Page")
    public void selectInvoiceNumberFromDropDownInGSTDetailsPage(String inv) {
        selectDropDownUsingText(DetailsPage.invoiceDropGstPage, inv);

    }

    @Then("User Should be able to select Invoice Number {string} from drop down in GST Details Page")
    public void userShouldBeAbleToSelectInvoiceNumberFromDropDownInGSTDetailsPage(String inv) {
        getSelectedOptionInDropDown(DetailsPage.invoiceDropGstPage, inv);

    }

    @Then("User Should be able to view automatically highlighted corresponding {string} report type")
    public void userShouldBeAbleToViewAutomaticallyHighlightedCorrespondingReportType(String button) {
        verifyButtonIsEnabledInThePageusingText(button);
    }

    @Then("Verify {string} CTA is displayed")
    public void verifyCTAIsDisplayed(String button) {
        verifyButtonIsDisplayedInThePage(button);
    }

    @Then("Below Fields {string} should be displayed for credit note")
    public void belowFieldsShouldBeDisplayedForCreditNote(String opts) {
        verifyElementIsDisplayedUsingLocator(DetailsPage.creditNoteGstPage);
        String opt = changeCommaToHash(opts, "");
        verifyFieldsUsingCommonXpathAndMultipleTextWithHash("//th", opt, "");
    }

    @Then("Below Fields {string} should be displayed for Tax Invoice")
    public void belowFieldsShouldBeDisplayedForTaxInvoice(String opts) {
        verifyFieldDisplayedUsingTagAndText("td", "tax invoice", "");
        String opt = changeCommaToHash(opts, "");
        verifyFieldsUsingCommonXpathAndMultipleTextWithHash("//th", opt, "");

    }

    @Then("User should be on same {string} Page")
    public void userShouldBeOnSamePage(String url) {
        verifyRedirectionURLIfContains(url);
    }

    @Then("{string} Report should be download in PDF format in GST Page")
    public void reportShouldBeDownloadInPDFFormatInGSTPage(String doc) {
        details.gstPagePdfDownload(doc, "");
    }

    @And("Clicks on Back CTA")
    public void clicksOnBackCTA() {
        navigateToBack();
    }

    @And("Delete the Recent Downloaded File")
    public void deleteTheRecentDownloadedFile() {
        deleteAllFilesInInternalDownloadsFolder();
    }

    @And("User should be able to view Cibil Triggers is be static in the Bureau Dropdown")
    public void userShouldBeAbleToViewCibilTriggersIsBeStaticInTheBureauDropdown() {
        verifyDropdownIsDisplayedAndPrintOptions(DetailsPage.bureauDropBureauInsightPage, "");
        verifyDropDownOptionIsPresent(DetailsPage.bureauDropBureauInsightPage, "Cibil Triggers");


    }

    @And("Click on {string} option in Bureau Dropdown")
    public void clickOnOptionInBureauDropdown(String opt) {
        selectDropDownUsingText(DetailsPage.bureauDropBureauInsightPage, opt);
    }

    @And("User should be able to view Cibil triggers details on the screen")
    public void userShouldBeAbleToViewCibilTriggersDetailsOnTheScreen() {
        verifyFieldDisplayedUsingTagAndText("h2", "Cibil Triggers", "");
    }

    @Then("User should be able to view below details under Cibil Triggers {string}")
    public void userShouldBeAbleToViewBelowDetailsUnderCibilTriggers(String head) {
        verifyFieldDisplayedUsingTagAndTextUsingScroll("h2", head, "");
        details.verifyTableContentsDetailsPageFlexiDisbu(head, "DateTime#Subject Name#Member Reference No#Bureau ID#Subscribed Account No#Subscribed Branch Code#PAN#CIN#Other Identifiers#Product Name#Product Component Name#Institution Type#Member Name#Branch Code#Alert Details#File ID", "");

    }

    @Then("User should be able to view the pagination and scrolling functionality")
    public void userShouldBeAbleToViewThePaginationAndScrollingFunctionality() {
        dashboard.verifyCommunicationTrailsPaginationCommnPage("");
    }

    @And("Click on {string} option in Product Dropdown")
    public void clickOnOptionInProductDropdown(String opt) {
        selectDropDownUsingText(DetailsPage.productDropBureauInsightPage, opt);

    }

    @Then("Below Menus {string} Should be displayed to the user on LHS of Bureau Insights page")
    public void belowMenusShouldBeDisplayedToTheUserOnLHSOfBureauInsightsPage(String menus) {
        String menu = changeCommaToHash(menus, "");
        verifyFieldsUsingCommonXpathAndMultipleTextWithHash("//ul[@class='loan-details-ul']//a//p", menu, "");
        details.verifyLogosLhsMenusFDDetailsPage(menus, "");

    }

    @Then("User should be able to view below details {string} under {string} in Bureau Insights Page")
    public void userShouldBeAbleToViewBelowDetailsUnderInBureauInsightsPage(String opts, String head) {
        verifyFieldDisplayedUsingTagAndTextUsingScroll("h2", head, "");
        String opt = changeCommaToHash(opts, "");
        details.verifyTableContentsDetailsPageFlexiDisbu(head, opt, "");

    }

    @Then("User should be able to view additional fields for Process and Ownership Type will become available")
    public void userShouldBeAbleToViewAdditionalFieldsForProcessAndOwnershipTypeWillBecomeAvailable() {
        verifyDropdownIsDisplayedAndPrintOptions(DetailsPage.processDropBureauInsightPage, "");
        verifyDropdownIsDisplayedAndPrintOptions(DetailsPage.ownerDropBureauInsightPage, "");
    }

    @Then("User should be able to view below given options {string} under Process Dropdown in Bureau Insights Page")
    public void userShouldBeAbleToViewBelowGivenOptionsUnderProcessDropdownInBureauInsightsPage(String opts) {
        String opt = changeCommaToHash(opts, "");
        verifyGetAllOptionsInDropDownAndCompare(DetailsPage.processDropBureauInsightPage, opt);
    }

    @Then("User should be able to view below given options {string} under Ownership Type Dropdown in Bureau Insights Page")
    public void userShouldBeAbleToViewBelowGivenOptionsUnderOwnershipTypeDropdownInBureauInsightsPage(String opts) {
        String opt = changeCommaToHash(opts, "");
        verifyGetAllOptionsInDropDownAndCompare(DetailsPage.ownerDropBureauInsightPage, opt);

    }

    @And("Click on {string} option in Process Dropdown")
    public void clickOnOptionInProcessDropdown(String opt) {
        selectDropDownUsingText(DetailsPage.processDropBureauInsightPage, opt);
    }

    @And("Click on {string} option in Ownership Type Dropdown")
    public void clickOnOptionInOwnershipTypeDropdown(String opt) {
        selectDropDownUsingText(DetailsPage.ownerDropBureauInsightPage, opt);
    }

    @And("Clicks on Generate Pdf Button in Bureau Insights Page")
    public void clicksOnGeneratePdfButtonInBureauInsightsPage() {
        clickOn(DetailsPage.generatePdfButtonBureauInsightPage);
        waitTime(5);
    }

    @Then("Verify {string} file should be downloaded")
    public void verifyFileShouldBeDownloaded(String file) {
        verifyDownLoadAndDeleteLatestFileNameFromLocalMachine(file);
    }

    @Then("User should be able to switch between products from selection dropdown")
    public void userShouldBeAbleToSwitchBetweenProductsFromSelectionDropdown() {
        verifyElementIsDisplayedUsingLocator(DetailsPage.generatePdfButtonBureauInsightPage);

    }

    @And("User should be able to view below details under Dedupe Details {string}")
    public void userShouldBeAbleToViewBelowDetailsUnderDedupeDetails(String tab) {
        verifyFieldDisplayedUsingTagAndTextUsingScroll("h2", tab, "");
        details.verifyTableContentsDetailsPageFlexiDisbu(tab, "AGREEMENT NO.#OLD CUSTOMER ID#NEW CUSTOMER ID#ACTIVITY DATE", "");

    }

    @Then("User should be able to view below details under Scheduled Withdrawal Summary {string}")
    public void userShouldBeAbleToViewBelowDetailsUnderScheduledWithdrawalSummary(String tab) {
        verifyFieldDisplayedUsingTagAndTextUsingScroll("h2", tab, "");
        details.verifyTableContentsDetailsPageFlexiDisbu(tab, "AGREEMENT NO#PORTAL ID#REQ PLACED DATE TIME#SOURCE#AMT (INR)#SCHEDULED WITHDRAWAL DATE#SCHEDULED WITHDRAWAL EXECUTION STATUS", "");

    }

    @And("Only last four digit of account number should be displayed under Repayment Bank Ac No")
    public void onlyLastFourDigitOfAccountNumberShouldBeDisplayedUnderRepaymentBankACNo() {
        String value = getTextPresent(DetailsPage.repayBankAccNo);
        int unmasked = (value.length() - 4);

        verifyMaskedAndUnmaskedFormatUsingValue(value, "Repayment Bank A/c No", "*", 0, 4, true, "0");
        verifyMaskedAndUnmaskedFormatUsingValue(value, "Repayment Bank A/c No", "*", unmasked, 4, false, "1");

    }

    @And("User should be able to view below details under Covenant Enquiry {string}")
    public void userShouldBeAbleToViewBelowDetailsUnderCovenantEnquiry(String tab) {
        verifyFieldDisplayedUsingTagAndTextUsingScroll("h2", tab, "");
        details.verifyTableContentsDetailsPageFlexiDisbu(tab, "Document Name#Document Type#Reference Number#Status#Criticality#Document Received Date#Cov Receivable Date#Remarks#Risk Remarks", "");

    }

    @And("User should be able to view below details under Basic Maintainence Details {string}")
    public void userShouldBeAbleToViewBelowDetailsUnderBasicMaintainenceDetails(String tab) {
        verifyFieldDisplayedUsingTagAndTextUsingScroll("h2", tab, "");
        details.verifyTableContentsDetailsPageFlexiDisbu(tab, "Document Name#Document Type#Reference Number#Status#Document Received Date#Document Target Date#Criticality#Remarks#Risk Remarks", "");

    }

    @And("User should be able to view below details under CAM Enquiry Docs Details {string}")
    public void userShouldBeAbleToViewBelowDetailsUnderCAMEnquiryDocsDetails(String tab) {
        verifyFieldDisplayedUsingTagAndTextUsingScroll("h2", tab, "");
        details.verifyTableContentsDetailsPageFlexiDisbu(tab, "Document Name#Document Type#Reference Number#Status#Document Received Date#Document Target Date#Criticality#Remarks#Risk Remarks", "");

    }

    @And("User should be able to view below details under Collateral Documents {string}")
    public void userShouldBeAbleToViewBelowDetailsUnderCollateralDocuments(String tab) {
        verifyFieldDisplayedUsingTagAndTextUsingScroll("h2", tab, "");
        details.verifyTableContentsDetailsPageFlexiDisbu(tab, "Document Name#Document Type#Reference Number#Status#Document Received Date#Document Target Date#Criticality#Remarks#Risk Remarks", "");

    }

    @Then("User should be able to view below details under EMI Status {string}")
    public void userShouldBeAbleToViewBelowDetailsUnderEMIStatus(String tab) {
        verifyFieldDisplayedUsingTagAndTextUsingScroll("h2", tab, "");
        details.verifyTableContentsDetailsPageFlexiDisbu(tab, "Due Date#Type#Presentation Date#Repay Mode#Sub Repay Mode#Bank Name#Account No.#MICR#Account Holder Name#Amount#Status#Reason", "");

    }

    @And("Customer Id Selection dropdown is to be displayed for Co-Applicant Section")
    public void customerIdSelectionDropdownIsToBeDisplayedForCoApplicantSection() {
        verifyDropdownIsDisplayedAndPrintOptions(DetailsPage.custIddropDownAgreementPage, "");
    }

    @And("Account Number in EMI Status Table should be masked")
    public void accountNumberInEMIStatusTableShouldBeMasked() {
        details.verifyAccountNumberMaskedEmiTableAgreePage("EMI Status", "");
    }

    @And("Verify Page is refreshed on selection of another Agreement Number {string}")
    public void verifyPageIsRefreshedOnSelectionOfAnotherAgreementNumber(String opt) {
        details.verifyAgreementNumberDropdownRefresh(opt, "");
    }

    @Then("Below Menus {string} Should not be displayed to the user on LHS of {string} Details page")
    public void belowMenusShouldNotBeDisplayedToTheUserOnLHSOfDetailsPage(String menus, String arg1) {
        String menu = changeCommaToHash(menus, "");
        verifyFieldsNotDisplayedUsingCommonXpathAndMultipleTextWithHash("//ul[@class='loan-details-ul']//a//p", menu, "");

    }

    @Then("Below Options {string} should be unmasked under the {string} section")
    public void belowOptionsShouldBeUnmaskedUnderTheSection(String opts, String sect) {
        details.verifyLabelsLoansDetailsUnmasked(opts, sect, "");
    }

    @And("Only last four digit of account number should be displayed under Repayment Bank Ac No under Sourcing Information")
    public void onlyLastFourDigitOfAccountNumberShouldBeDisplayedUnderRepaymentBankAcNoUnderSourcingInformation() {
        String value = getTextPresent(DetailsPage.repayBankAccNo);
        int unmasked = (value.length() - 4);

        verifyMaskedAndUnmaskedFormatUsingValue(value, "Repayment Bank A/c No", "X", 0, 4, true, "0");
        verifyMaskedAndUnmaskedFormatUsingValue(value, "Repayment Bank A/c No", "X", unmasked, 4, false, "1");

    }

    @And("Below Options {string} should be displayed under the {string} section in Agreement Details Page")
    public void belowOptionsShouldBeDisplayedUnderTheSectionInAgreementDetailsPage(String opts, String section) {
        details.verifyLabelsCoApplicantAgreementDetailsPage(opts, section, "");

    }

    @And("Verify the masking format for Email {string} under {string} Section in FD Details Page")
    public void verifyTheMaskingFormatForEmailUnderSectionInFDDetailsPage(String label, String head) {
        String value = details.fdDetailsValues(head, label, "");
        dashboard.verifyEmailIdMaskedUnderwriting(value, "");

    }

    @And("Verify the masking format for Address {string} under {string} Section in FD Details Page")
    public void verifyTheMaskingFormatForAddressUnderSectionInFDDetailsPage(String label, String head) {
        String value = details.fdDetailsValues(head, label, "");
        dashboard.verifyAddressMaskedUnderwriting(value, "");


    }

    @And("Verify the masking format for Mobile {string} under {string} Section in FD Details Page")
    public void verifyTheMaskingFormatForMobileUnderSectionInFDDetailsPage(String label, String head) {
        String value = details.fdDetailsValues(head, label, "");

        verifyMaskedAndUnmaskedFormatUsingValue(value, "Mobile", "X", 0, 4, true, "0");
        verifyMaskedAndUnmaskedFormatUsingValue(value, "Mobile", "X", 6, 4, false, "1");


    }

    @And("Verify the masking format for Pan {string} under {string} Section in FD Details Page")
    public void verifyTheMaskingFormatForPanUnderSectionInFDDetailsPage(String label, String head) {
        String value = details.fdDetailsValues(head, label, "");
        verifyMaskedAndUnmaskedFormatUsingValue(value, "PAN", "X", 0, 4, true, "0");
        verifyMaskedAndUnmaskedFormatUsingValue(value, "PAN", "X", 6, 4, false, "1");

    }

    @And("Verify the masking format for Dob {string} under {string} Section in FD Details Page")
    public void verifyTheMaskingFormatForDobUnderSectionInFDDetailsPage(String label, String head) {
        String values = details.fdDetailsValues(head, label, "");
        String value = values.replaceAll("-", "");
        verifyMaskedAndUnmaskedFormatUsingValue(value, "DOB", "X", 0, 4, true, "0");
        verifyMaskedAndUnmaskedFormatUsingValue(value, "DOB", "X", 4, 4, false, "1");

    }
}
