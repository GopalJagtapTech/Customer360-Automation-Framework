package stepdefinitions;

import io.cucumber.java.en.When;
import pageobjects.DashboardPage;
import base.ApplicationKeywords;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.DetailsPage;

public class DashboardSteps extends ApplicationKeywords {

    DashboardPage dashboard;

    public DashboardSteps() {
        dashboard = new DashboardPage();
    }


    @And("Verify Top Section is displayed same as in Landing Page")
    public void verifyTopSectionIsDisplayedSameAsInLandingPage() {
        dashboard.dashBoardPageTopContents();
    }

    @And("Verify {int} Sections of Dashboard Page")
    public void verifySectionsOfDashboardPage(int arg0) {
        verifyElementIsDisplayedOrNot(DashboardPage.personalInfo);
        verifyElementIsDisplayedOrNot(DashboardPage.appService);
        verifyElementIsDisplayedOrNot(DashboardPage.quickLinks);
    }

    @And("Verify Contents of Personal Info Section in DashBoard Page")
    public void verifyContentsOfPersonalInfoSectionInDashBoardPage() {
        dashboard.personalInfoDashBoardPage();
    }

    @And("Verify Additional Info of User in Personal Info Section in DashBoard Page")
    public void verifyAdditionalInfoOfUserInPersonalInfoSectionInDashBoardPage() {
        dashboard.personalInfoLabels();
    }

    @And("Verify Service Segment Section in DashBoard Page")
    public void verifyServiceSegmentSectionInDashBoardPage() {
        dashboard.serviceSegmentSectionDashboardPage();
    }

    @And("Verify Quick Links Section in DashBoard Page with Links {string}")
    public void verifyQuickLinksSectionInDashBoardPageWithLinks(String opts) {
        verifyFieldDisplayedUsingTagAndText("h6", "QUICK LINKS", "");
        verifyFieldDisplayedUsingTagAndText("h2", "QUICK LINKS", "");
        verifyFieldsUsingCommonXpathAndMultipleTextWithHash("//ul[@class='quicklink-list']//a", opts, "");

    }

    @And("Verify Date of Birth Masking Pattern in Personal Info")
    public void verifyDateOfBirthMaskingPatternInPersonalInfo() {
        dashboard.verifyDOBMasked("");
    }

    @And("Verify PAN Masking Pattern in Personal Info")
    public void verifyPANMaskingPatternInPersonalInfo() {
        dashboard.verifyPanMasked("");
    }

    @And("Verify Mobile Number Masking Pattern in Personal Info")
    public void verifyMobileNumberMaskingPatternInPersonalInfo() {
        dashboard.verifyMobileMasked("");
    }

    @And("Verify Email ID Masking Pattern in Personal Info")
    public void verifyEmailIDMaskingPatternInPersonalInfo() {
        dashboard.verifyEmailIdMasked("");
    }

    @And("Verify Address Masking Pattern in Personal Info")
    public void verifyAddressMaskingPatternInPersonalInfo() {
        dashboard.verifyAddressMasked("");
    }

    @And("Verify Bajaj Finserv App Status in Service Segment Section- {string}")
    public void verifyBajajFinservAppStatusInServiceSegmentSection(String status) {
        dashboard.verifyBajajFinservStatus(status, "");
    }

    @And("Verify Mandate Status in Service Segment Section- {string}")
    public void verifyMandateStatusInServiceSegmentSection(String status) {
        dashboard.verifyMandateStatus(status, "");
    }

    @And("Verify {string} Section is displayed in DashBoard Page")
    public void verifySectionIsDisplayedInDashBoardPage(String head) {
        verifyFieldDisplayedUsingTagAndTextUsingScroll("h5", head, "");
//        scrollToWebElement(DashboardPage.relationsTilesSection);

    }

    @And("Relation Tabs {string} are displayed under Relations Overview")
    public void relationTabsAreDisplayedUnderRelationsOverview(String opts) {
        verifyElementIsDisplayedUsingLocator(DashboardPage.relationsTabs);
        String tabs = changeCommaToHash(opts, "");
        verifyFieldsUsingCommonXpathAndMultipleTextWithHash("//div[@class='relation-tabs']//ul//li//a", tabs, "");

    }

    @And("Verify Tiles are displayed under Relations")
    public void verifyTilesAreDisplayedUnderRelations() {
        verifyElementAndPrintSize(DashboardPage.relationsTiles, "");
    }

    @Then("Customer should be able to view below details on loan cards")
    public void customerShouldBeAbleToViewBelowDetailsOnLoanCards() {
        dashboard.verifyLoanDetailsDashboardPage("Loan", 1, "");
    }

    @Then("Loan details\\(Loan amount,EMI amount,total overdue,last payment date,POS outstanding,Disbursement date) should be fetched from loan details API")
    public void loanDetailsLoanAmountEMIAmountTotalOverdueLastPaymentDatePOSOutstandingDisbursementDateShouldBeFetchedFromLoanDetailsAPI() {
        dashboard.verifyLoanDetailsFromApi(1, "");
    }

    @Then("Customer should be able to view below Icons for the {string}")
    public void customerShouldBeAbleToViewBelowIconsForThe(String doc) {
        dashboard.verifyDocuments(doc, "");
    }

    @And("Clicks on a {string} Document in {string} Relation Tile")
    public void clicksOnADocumentInRelationTile(String doc, String tile) {
        dashboard.clickDocsInTile(tile, doc, "");
    }


    @Then("User should be able to view {string} pop up for language selection")
    public void userShouldBeAbleToViewPopUpForLanguageSelection(String pop) {
        verifyPopupDisplayedUsingTagAndText("h2", pop, "");

    }

    @And("Clicks on {string} Icon of the {string} Document")
    public void clicksOnIconOfTheDocument(String icon, String doc) {
        dashboard.clickFilesInDocPopup(doc, icon, "");
    }


    @Then("User should be able to view number of language options {string} on pop up")
    public void userShouldBeAbleToViewNumberOfLanguageOptionsOnPopUp(String opts) {
        verifyGetAllOptionsInDropDownAndCompare(DashboardPage.languageDropdown, opts);

    }


    @Then("Customer should be able to view loans cards according to latest disbursement date")
    public void customerShouldBeAbleToViewLoansCardsAccordingToLatestDisbursementDate() {
        dashboard.disbursementDates("dd/mm/yyyy", "");
    }


    @Then("User should be able to view close loan after the active loans")
    public void userShouldBeAbleToViewCloseLoanAfterTheActiveLoans() {
        dashboard.verifyRelationsOrder("Loans", "");
    }

    @Then("{string} should be displayed only for loan which is marked as Active {string}")
    public void shouldBeDisplayedOnlyForLoanWhichIsMarkedAsActive(String letter, String relation) {
        dashboard.verifyFCDocDisplayed(relation, letter, "");

    }

    @Then("{string} should be displayed only for loan which is marked as Closed {string}")
    public void shouldBeDisplayedOnlyForLoanWhichIsMarkedAsClosed(String doc, String relation) {
        dashboard.verifyNDCDocDisplayed(doc, relation, "");
    }

    @Then("{string} popup for sms should be displayed")
    public void popupForSmsShouldBeDisplayed(String pop) {
        verifyPopupDisplayedUsingTagAndText("h2", pop, "");
        verifyElementIsDisplayedOrNot(DashboardPage.yesSMSPop);
        verifyElementIsDisplayedOrNot(DashboardPage.noSMSPop);
    }

    @Then("On click of Yes CTA User should receive notification message")
    public void onClickOfYesCTAUserShouldReceiveNotificationMessage() {
        clickOn(DashboardPage.yesSMSPop);
        handleToastByClass("toast-title", "Success", "");
        handleToastByClass("toast-message", "SMS with", "");
    }


    @Then("On click of Cancel CTA SMS pop should be closed")
    public void onClickOfCancelCTASMSPopShouldBeClosed() {
        clickUsingMouse(DashboardPage.noSMSPopUp);
        waitTime(3);
        verifyElementIsNotDisplayedUsingLocator(DashboardPage.noSMSPop);
    }


    @And("verify {string} Symbol is displayed in front of all the Amounts in Relation tile {string}")
    public void verifySymbolIsDisplayedInFrontOfAllTheAmountsInRelationTile(String symbol, String tile) {
        dashboard.verifyAmountsSymbolRelationTile(tile, symbol, "Loan Amount", "");
        dashboard.verifyAmountsSymbolRelationTile(tile, symbol, "POS", "");
        dashboard.verifyAmountsSymbolRelationTile(tile, symbol, "EMI Amount", "");
        dashboard.verifyAmountsSymbolRelationTile(tile, symbol, "Total Overdue", "");

    }

    @And("verify Date Formats for Labels in the Relation tile {string}")
    public void verifyDateFormatsForLabelsInTheRelationTile(String tile) {
        dashboard.verifyDateFormatsRelationTile(tile, "dd/mm/yyyy", "Disbursement Date", "");
        dashboard.verifyDateFormatsRelationTile(tile, "dd/mm/yyyy", "Next EMI Due Date", "");
    }

    @And("Verify By Default {string} Tabs is Selected")
    public void verifyByDefaultTabsIsSelected(String tab) {
        verifyByDefaultSelectedTab(tab, "");

    }

    @And("Select a Tab {string} in Relations Overview")
    public void selectATabInRelationsOverview(String tab) {
        dashboard.selectTabRelationsOverview(tab, "");
    }

    @And("Verify Respective Count is displayed for the Tab {string}")
    public void verifyRespectiveCountIsDisplayedForTheTab(String tab) {
        dashboard.tabCountForRelations(tab, "");

    }


    @And("Verify Customer ID in Personal Info And of Relation Tile {string} for {string} Relation")
    public void verifyCustomerIDInPersonalInfoAndOfRelationTileForRelation(String relation, String type) {
        dashboard.verifyCustomerIdMatch(relation, type, "");

    }

    @And("Verify Text {string} and Count {int} displayed for the Relation {string}")
    public void verifyTextAndCountDisplayedForTheRelation(String text, int count, String relation) {
        dashboard.verifyIfNoRelationsPresent(text, count, relation, "");
    }

    @Then("Customer should be able to view below details on {string} tile {string}")
    public void customerShouldBeAbleToViewBelowDetailsOnTile(String tiletype, String tile) {
        dashboard.verifyTileDetailsDashboardPage(tiletype, tile, "");
    }

    @And("verify {string} Symbol is displayed in front of all the Amounts in Relation tile {string} - Cards")
    public void verifySymbolIsDisplayedInFrontOfAllTheAmountsInRelationTileCards(String symbol, String tile) {
        dashboard.verifyAmountsSymbolRelationTile(tile, symbol, "Card Limit", "");
        dashboard.verifyAmountsSymbolRelationTile(tile, symbol, "Available Limit", "");
        dashboard.verifyAmountsSymbolRelationTile(tile, symbol, "Utilized Limit", "");
    }

    @And("verify Date Formats for Labels in the Relation tile {string} - Cards")
    public void verifyDateFormatsForLabelsInTheRelationTileCards(String tile) {
        dashboard.verifyDateFormatsRelationTile(tile, "dd/mm/yyyy", "Date of Activation", "");
        dashboard.verifyDateFormatsRelationTile(tile, "dd/mm/yyyy", "Date of Expiry", "");

    }

    @And("verify {string} Symbol is displayed in front of all the Amounts in Relation tile {string} - Insurance")
    public void verifySymbolIsDisplayedInFrontOfAllTheAmountsInRelationTileInsurance(String symbol, String tile) {
        dashboard.verifyAmountsSymbolRelationTile(tile, symbol, "Sum Assured", "");

    }

    @Then("{string} Badge should be displayed in Red Colour for {string} Relation")
    public void badgeShouldBeDisplayedInRedColourForRelation(String badge, String tile) {
        dashboard.verifyClosedBadge(badge, tile, "");
    }

    @Then("{string} Badge should be displayed in Green Colour for {string} Relation")
    public void badgeShouldBeDisplayedInGreenColourForRelation(String badge, String tile) {
        dashboard.verifyActiveBadge(badge, tile, "");

    }

    @And("verify {string} Symbol is displayed in front of all the Amounts in Relation tile {string} - Fixed Deposit")
    public void verifySymbolIsDisplayedInFrontOfAllTheAmountsInRelationTileFixedDeposit(String symbol, String tile) {
        dashboard.verifyAmountsSymbolRelationTile(tile, symbol, "Deposit Amount", "");
        dashboard.verifyAmountsSymbolRelationTile(tile, symbol, "Interest Amount", "");
        dashboard.verifyAmountsSymbolRelationTile(tile, symbol, "Maturity Amount", "");

    }

    @And("verify Date Formats for Labels in the Relation tile {string} - Fixed Deposits")
    public void verifyDateFormatsForLabelsInTheRelationTileFixedDeposits(String tile) {
        dashboard.verifyDateFormatsRelationTile(tile, "dd/mm/yyyy", "Interest Start Date", "");
        dashboard.verifyDateFormatsRelationTile(tile, "dd/mm/yyyy", "Maturity Date", "");

    }

    @Then("User should be able to view Matured FDs after the Open FDs - {string}")
    public void userShouldBeAbleToViewMaturedFDsAfterTheOpenFDs(String relation) {
        dashboard.verifyRelationsOrder(relation, "");
    }

    @And("Verify {string} button is displayed for {string} Section in DashBoard Page")
    public void verifyButtonIsDisplayedForSectionInDashBoardPage(String btn, String sctn) {
        dashboard.verifyViewAllDashboardPage(btn, sctn, "");
    }


    @And("Verify Headers are displayed for Communication Trails Section in DashBoard Page")
    public void verifyHeadersAreDisplayedForCommunicationTrailsSectionInDashBoardPage() {
        dashboard.verifyCommunicationTrailsTableHeaders("");
    }

    @And("Verify Time Stamp for Sent Date for Communication Trails Section in DashBoard Page")
    public void verifyTimeStampForSentDateForCommunicationTrailsSectionInDashBoardPage() {
        waitTime(3);
        dashboard.verifyCommunicationTrialsTableDateFormat("");
    }

    @And("User Clicks on {string} Button of {string} Section")
    public void userClicksOnButtonOfSection(String btn, String sctn) {
        dashboard.clickViewAllDashboardPage(btn, sctn, "");
    }

    @And("Verify Headers are displayed for Service request Section in DashBoard Page")
    public void verifyHeadersAreDisplayedForServiceRequestSectionInDashBoardPage() {
        dashboard.verifyServiceRequestTableHeaders("");
    }

    @And("Verify Date Format for Date for Service request Section in DashBoard Page")
    public void verifyDateFormatForDateForServiceRequestSectionInDashBoardPage() {
        dashboard.verifyServiceRequestableDateFormat("");
    }

    @And("Verify Content on Communication Trails Page")
    public void verifyContentOnCommunicationTrailsPage() {
        verifyFieldDisplayedUsingTagAndText("h2", "Communication Trails", "");
        verifyElementIsDisplayedOrNot(DashboardPage.auditTrailsTable);
    }

    @And("Verify Time Stamp for Sent Date as per Latest Order for Communication Trails Section in DashBoard Page")
    public void verifyTimeStampForSentDateAsPerLatestOrderForCommunicationTrailsSectionInDashBoardPage() {
        waitTime(3);
        dashboard.verifyCommunicationTrialsTableDateRecent("yyyy-mm-dd hh:mm:ss", "");
    }

    @And("Verify Dates for Service request Section as per Latest Order in DashBoard Page")
    public void verifyDatesForServiceRequestSectionAsPerLatestOrderInDashBoardPage() {
        dashboard.verifyServiceRequestTableDateRecent("mm/dd/yyyy hh:mm:ss aa", "");
    }

    @And("Verify Content on Communication Trails Table - Communication Trails Page")
    public void verifyContentOnCommunicationTrailsTableCommunicationTrailsPage() {
        dashboard.verifyCommunicationTrailsTableCommnPage("");
    }

    @And("Verify Headers are displayed for Communication Trails Section - Communication Trails Page")
    public void verifyHeadersAreDisplayedForCommunicationTrailsSectionCommunicationTrailsPage() {
        dashboard.verifyCommunicationTrailsTableHeadersCommnPage("");
    }

    @And("Verify Time Stamp for Sent Date for Communication Trails Section - Communication Trails Page")
    public void verifyTimeStampForSentDateForCommunicationTrailsSectionCommunicationTrailsPage() {
        dashboard.verifyCommunicationTrialsTableDateFormatCommnPage("");
    }

    @And("Verify Time Stamp for Sent Date in Latest Order for Communication Trails Section - Communication Trails Page")
    public void verifyTimeStampForSentDateInLatestOrderForCommunicationTrailsSectionCommunicationTrailsPage() {
        dashboard.verifyCommunicationTrialsTableDateRecentCommnPage("yyyy-mm-dd hh:mm:ss", "");
    }

    @And("User Clicks on a Filter type {string} in Communication Trails")
    public void userClicksOnAFilterTypeInCommunicationTrails(String filter) {
        waitTime(3);
        clickOnButtonUsingXpathAndText("//div[@class='filter-box-wrapper']//a//p", filter);
    }

    @Then("User should be able to view Filtered Channel {string}")
    public void userShouldBeAbleToViewFilteredChannel(String filter) {
        dashboard.verifyCommunicationTrailsFilterChannelsCommnPage(filter, "");
    }

    @And("Verify the Pages are displayed for Communication Trails Table - Communication Trails Page")
    public void verifyThePagesAreDisplayedForCommunicationTrailsTableCommunicationTrailsPage() {
        dashboard.verifyCommunicationTrailsPaginationCommnPage("");
    }

    @And("Verify When User Clicks on Next Button in Communication Trails Table - Communication Trails Page")
    public void verifyWhenUserClicksOnNextButtonInCommunicationTrailsTableCommunicationTrailsPage() {
        dashboard.verifyCommunicationTrailsPaginationNextCommnPage("");
    }

    @And("Verify Customer Portfolio Section is displayed in DashBoard Page")
    public void verifyCustomerPortfolioSectionIsDisplayedInDashBoardPage() {
        verifyElementIsDisplayedOrNot(DashboardPage.custPortfolioSection);
    }

    @And("Verify Contents in Customer Portfolio Section is displayed in DashBoard Page")
    public void verifyContentsInCustomerPortfolioSectionIsDisplayedInDashBoardPage() {
        dashboard.verifyCustPortfolioSectionContents("");
    }

    @And("Verify verify Amount format of Total POS in Customer Portfolio Section on Dashboard Page")
    public void verifyVerifyAmountFormatOfTotalPOSInCustomerPortfolioSectionOnDashboardPage() {
        verifyAmountsWithStartSymbols(DashboardPage.totalPos, "₹", "");
    }

    @And("Verify User is able to view the Options {string} under Widgets Section")
    public void verifyUserIsAbleToViewTheOptionsUnderWidgetsSection(String opts) {
        dashboard.verifyWidgetsDashboardPage(opts, "");
    }

    @Then("User should be able to {string} under Customer Portfolio ribbon")
    public void userShouldBeAbleToUnderCustomerPortfolioRibbon(String opt) {
        verifyValueUsingLabel("//div[@class='ppc-contant-box']//p", opt, "/following-sibling::h3//a", "");

    }

    @And("Click on Bounce count under Customer Portfolio Section")
    public void clickOnBounceCountUnderCustomerPortfolioSection() {
        clickUsingMouse(DashboardPage.bounceCountButton);
    }

    @And("Below Options {string} should be displayed on Bounce Count Page")
    public void belowOptionsShouldBeDisplayedOnBounceCountPage(String opts) {
        String options = changeCommaToHash(opts, "");
        verifyFieldsUsingCommonXpathAndMultipleTextWithHash("//table[@class='emi-table']//th", options, "");
    }

    @And("Verify {string} Header in Bounce Count Page")
    public void verifyHeaderInBounceCountPage(String head) {
        verifyFieldDisplayedUsingTagAndText("h2", head, "");
    }

    @And("Verify the Contents of Repayment SOA Table")
    public void verifyTheContentsOfRepaymentSOATable() {
        dashboard.verifyRepaymentSOATableBounceCountPage("");
    }

    @And("On Clicks on SOA Pdf for Row {int}, SOA Document should be downloaded after selecting Language")
    public void onClicksOnSOAPdfForRowSOADocumentShouldBeDownloadedAfterSelectingLanguage(int num) {
        dashboard.verifyRepaymentSOAPdfDownload(num, "");
    }

    @Then("User should be able to view Loan Status under repayment SOA page")
    public void userShouldBeAbleToViewLoanStatusUnderRepaymentSOAPage() {
        dashboard.verifyLoanStatusBounceCountPage("");
    }

    @Then("No Bounce should be display in green color under repayment SOA page")
    public void noBounceShouldBeDisplayInGreenColorUnderRepaymentSOAPage() {
        dashboard.verifyTrackRecordBounceCountPage("No Bounce", "");
    }

    @Then("Bounce should be displayed in RED color under repayment SOA page")
    public void bounceShouldBeDisplayedInREDColorUnderRepaymentSOAPage() {
        dashboard.verifyTrackRecordBounceCountPage("Bounce", "");

    }

    @And("Clicks on Bounce Count in repayment SOA page")
    public void clicksOnBounceCountInRepaymentSOAPage() {
        clickUsingMouse(DashboardPage.bounceCountSOA);
    }

    @Then("Pop up should be displayed with details when user clicks on bounce")
    public void popUpShouldBeDisplayedWithDetailsWhenUserClicksOnBounce() {
        verifyElementIsDisplayedAndGetText(DashboardPage.bounceMonthPopupSOA);
    }

    @And("Verify {string} Status in Service request Section in {string} Colour Badge")
    public void verifyStatusInServiceRequestSectionInColourBadge(String badge, String color) {
        dashboard.verifyServiceRequestStatusBadge("");
    }

    @And("Verify Contents are displayed for Service request Section in DashBoard Page")
    public void verifyContentsAreDisplayedForServiceRequestSectionInDashBoardPage() {
        dashboard.verifyServiceRequestTable("");
    }

    @And("Verify Status in Service request Section in has relevant Colour Badge")
    public void verifyStatusInServiceRequestSectionInHasRelevantColourBadge() {
        dashboard.verifyServiceRequestStatusBadge("");

    }

    @And("Clicks on Mandate Status {string} in Service Segment Section")
    public void clicksOnMandateStatusInServiceSegmentSection(String opt) {
        clickOnButtonUsingXpathAndText("//div[@class='service-div']//li//p[normalize-space(text())='Mandate Status']/following-sibling::a//strong", opt);
    }

    @And("Verify Contents in Mandate Details Page")
    public void verifyContentsInMandateDetailsPage() {
        verifyFieldDisplayedUsingTagAndText("h2", "Mandate Details", "");
        verifyFieldsUsingCommonXpathAndMultipleTextWithHash("//table[contains(@class,'emi-table')]//th", "CUSTOMER ID#LAN NO#CUSTOMER NAME#MICR CODE#BANK ACC NUMBER#BANK NAME#REJECTION REASON#DATE OF REJECTION", "");
    }

    @And("Verify Contents in Mandate Details Page for Accepted")
    public void verifyContentsInMandateDetailsPageForAccepted() {
        verifyFieldDisplayedUsingTagAndText("h2", "Mandate Details", "");
        verifyValueUsingLabel("//table[contains(@class,'emi-table')]//th", "CUSTOMER ID", "/following::td[1]", "");
        verifyValueUsingLabel("//table[contains(@class,'emi-table')]//th", "MICR CODE", "/following::td[2]", "");
        verifyValueUsingLabel("//table[contains(@class,'emi-table')]//th", "BANK ACC NUMBER", "/following::td[3]", "");
        verifyValueUsingLabel("//table[contains(@class,'emi-table')]//th", "BANK NAME", "/following::td[4]", "");


    }

    @And("Clicks on Bajaj Finserv App Status - Not Downloaded")
    public void clicksOnBajajFinservAppStatusNotDownloaded() {
        clickUsingMouse(DashboardPage.notDownlddAppStatus);
    }

    @Then("Toast message should be displayed with text {string}")
    public void toastMessageShouldBeDisplayedWithText(String text) {
        verifyElementIsDisplayedOrNot(DashboardPage.notDownlddToast);
        verifyGetTextContains(DashboardPage.notDownlddToast, text);
        verifyLocatorColorUsingCssValue(DashboardPage.notDownlddToast, "#51a351", "Green", "background-color");

    }

    @And("Verify Content on Service Request Page")
    public void verifyContentOnServiceRequestPage() {
        verifyFieldDisplayedUsingTagAndText("h2", "Service Request", "");
        verifyFieldsDisplayedUsingText("Request ID");
        verifyElementIsPresentUsingLocator(DashboardPage.reqIdInputBox);
        verifyElementIsDisplayedOrNot(DashboardPage.servReqTable);
    }

    @And("Verify Headers are displayed for Service Request Section - Service Request Page")
    public void verifyHeadersAreDisplayedForServiceRequestSectionServiceRequestPage() {
        verifyFieldsUsingCommonXpathAndMultipleTextWithHash("//div[@class='audit-tbl-box']//th", "Origin#Date#Request ID#Customer ID#Relationship No#Request Type#Sub Request Type#TAT in Days#Status#Category(Case Reason)#Disposition", "");
    }

    @And("Verify Content on Service Request Table - Service Request Page")
    public void verifyContentOnServiceRequestTableServiceRequestPage() {
        dashboard.verifyServiceRequestTableServiceRequestPage("");
    }

    @And("Verify Time Stamp for Date for Service Request Section - Service Request Page")
    public void verifyTimeStampForDateForServiceRequestSectionServiceRequestPage() {
        dashboard.verifyServiceTableDateFormatServicePage("");
    }

    @And("Verify Time Stamp for Date in Latest Order for Service Request Table - Service Request Page")
    public void verifyTimeStampForDateInLatestOrderForServiceRequestTableServiceRequestPage() {
        dashboard.verifyServiceRequestTableDateRecentServicePage("mm/dd/yyyy hh:mm:ss aa", "");
    }

    @And("Verify the Pages are displayed for Service Request Table - Service Request Page")
    public void verifyThePagesAreDisplayedForServiceRequestTableServiceRequestPage() {
        dashboard.verifyServiceRequestPaginationServicePage("");
    }

    @And("Verify When User Clicks on Next Button in Service Request Table - Service Request Page")
    public void verifyWhenUserClicksOnNextButtonInServiceRequestTableServiceRequestPage() {
        dashboard.verifyServiceRequestPaginationNextServicePage("");
    }

    @And("Verify Search Icon is displayed for {string}")
    public void verifySearchIconIsDisplayedFor(String arg0) {
        verifyElementIsDisplayedOrNot(DashboardPage.searchIconDashboard);
    }

    @And("Clicks on Search Icon in Relations Overview")
    public void clicksOnSearchIconInRelationsOverview() {
        clickOn(DashboardPage.searchIconDashboard);

    }

    @Then("verify Placeholder {string} for Search Icon in Relations Overview")
    public void verifyPlaceholderForSearchIconInRelationsOverview(String ph) {
        verifyPlaceHolder(DashboardPage.searchInputRelationsOverview, ph);
    }

    @And("Verify Search Icon is not displayed for {string}")
    public void verifySearchIconIsNotDisplayedFor(String arg0) {
        verifyElementIsNotDisplayedUsingLocator(DashboardPage.searchIconDashboard);
    }

    @And("Enters Request Id {string} in the Request Id Search Box")
    public void entersRequestIdInTheRequestIdSearchBox(String req) {
        typeIn(DashboardPage.reqIdInputBox, req);
    }

    @Then("The Requests should be filtered and Only the Specific Request {string} should be shown")
    public void theRequestsShouldBeFilteredAndOnlyTheSpecificRequestShouldBeShown(String req) {
        dashboard.verifyServiceRequestFilterServiceReqPage(req, "");
    }

    @And("Enters Date {string} in the Sent Date - Date Picker in Communication Trails Page")
    public void entersDateInTheSentDateDatePickerInCommunicationTrailsPage(String date) {
        typeIn(DashboardPage.sentDateInputBox, date);
    }

    @Then("The Filtered Trails should be displayed for the entered Date {string}")
    public void theFilteredTrailsShouldBeDisplayedForTheEnteredDate(String date) {
        dashboard.verifySentDateFilterCommnPage(date, "");
    }

    @Then("That Particular Relation {string} should be displayed")
    public void thatParticularRelationShouldBeDisplayed(String tile) {
        dashboard.verifySearchFilterDashboardPage(tile, "");
    }

    @And("Enters the Number {string} in Search Field")
    public void entersTheNumberInSearchField(String num) {
        typeIn(DashboardPage.searchInputRelationsOverview, num);

    }

    @And("Verify Search Icon is disabled when there are no Relations for {string}")
    public void verifySearchIconIsDisabledWhenThereAreNoRelationsFor(String arg0) {
        verifyElementIsDisplayedOrNot(DashboardPage.searchIconZeroCountDashboard);
    }

    @Then("{string} File Should be downloaded for FC Letter")
    public void fileShouldBeDownloadedForFCLetter(String num) {
        verifyDownLoadAndDeleteLatestFileNameFromLocalMachine("" + num.trim() + "_FCR.pdf");

    }

    @Then("{string} Popup should be displayed along with Years dropdown")
    public void popupShouldBeDisplayedAlongWithYearsDropdown(String head) {
        verifyPopupDisplayedUsingTagAndText("h2", head, "");
//        verifyGetAllOptionsInDropDownAndCompare(DashboardPage.financialDropdown,"2024-2025#2023-2024#2022-2023#2021-2022#2020-2021");
        verifyGetAllOptionsInDropDownAndCompare(DashboardPage.financialDropdown, DashboardPage.generateFinancialYearsNew(5));

    }

    @Then("User should be redirected to Dashboard Page {string} without clicking Popup")
    public void userShouldBeRedirectedToDashboardPageWithoutClickingPopup(String url) {
        verifyRedirectioninSameTabWithoutABack(url, "");
        waitTime(2);

    }

    @And("Verify Notifications Popup on Dashboard Page")
    public void verifyNotificationsPopupOnDashboardPage() {
        verifyElementIsDisplayedOrNot(DashboardPage.notificationPop);
    }

    @Then("Verify User ia able to view masked Relation for Cards Relation {string}")
    public void verifyUserIaAbleToViewMaskedRelationForCardsRelation(String tile) {
        dashboard.verifyCardsNumberMasked(tile);
    }

    @And("Clicks on Get details CTA of {string} Relation - {string}")
    public void clicksOnGetDetailsCTAOfRelation(String type, String tile) {
        dashboard.clickGetDetailsButton(type, tile, "");
    }

    @And("Clicks on {string} Option under QUICK LINKS section")
    public void clicksOnOptionUnderQUICKLINKSSection(String opt) {
        clickOnButtonUsingXpathAndText("//ul[@class='quicklink-list']//a", opt);
    }

    @Then("User should be redirected to {string} Page")
    public void userShouldBeRedirectedToPage(String url) {
        verifyRedirectioninSameTabWithoutABack(url, "");

    }

    @And("Clicks on {string} Option under Widgets section")
    public void clicksOnOptionUnderWidgetsSection(String opt) {

        String option = "Widget Option #xpath=//ul[@class='widgets-items']//p[normalize-space(text())='" + opt.trim() + "']/parent::a";
//        clickOnButtonUsingLocatorUsingForLoop(option);
        clickUsingMouse(option);

    }

    @Then("User should be redirected to {string} Page in New Tab")
    public void userShouldBeRedirectedToPageInNewTab(String url) {
        waitForPageToLoad();
        verifyRedirectioninNewTabWithoutABack(url, "");
    }

    @Then("User should be able to view Bajaj Pay Section")
    public void userShouldBeAbleToViewBajajPaySection() {
        waitTime(3);
        verifyElementIsDisplayedOrNotusingScroll(DashboardPage.bajajPay);
    }

    @And("Clicks on Bajaj Pay tab Option {string}")
    public void clicksOnBajajPayTabOption(String opt) {
        dashboard.clickBBPSTabs(opt, "");
    }

    @Then("User should be able to view {string} option under Bajaj Pay tab")
    public void userShouldBeAbleToViewOptionUnderBajajPayTab(String opt) {
        dashboard.verifyBBPSTabOptions(opt, "");
    }

    @And("Clicks on {string} Bajaj Pay Sub Option")
    public void clicksOnBajajPaySubOption(String opt) {
        dashboard.clickBBPSTabOptions(opt, "");
    }


    @Then("User should be able to view {string} tab is displayed under Top Section on dashboard page")
    public void userShouldBeAbleToViewTabIsDisplayedUnderTopSectionOnDashboardPage(String tab) {
        verifyFieldsUsingCommonXpathAndMultipleTextWithHash("//ul[@class='navbar-ul']//a", tab, "");
    }

    @Then("User should be redirected to {string} Url in New Tab")
    public void userShouldBeRedirectedToUrlInNewTab(String url) {
        verifyRedirectioninNewTab(url, "");

    }

    @Then("Below Headers {string} should be displayed under {string} Tab")
    public void belowHeadersShouldBeDisplayedUnderTab(String opts, String sect) {
        dashboard.verifyTabSubOptions(sect, opts, "");
    }

    @Then("User should be redirected to Bajaj Pay Dashboard {string} Page")
    public void userShouldBeRedirectedToBajajPayDashboardPage(String url) {
        verifyRedirectioninSameTabWithoutABack(url, "");
    }

    @And("Clicks on Bajaj Pay tab Sub Option {string}")
    public void clicksOnBajajPayTabSubOption(String opt) {
        dashboard.clickBBPSSubTabs(opt, "");
    }

    @Then("Below Sub Headers {string} should be displayed under {string} Header")
    public void belowSubHeadersShouldBeDisplayedUnderHeader(String opts, String sect) {
        dashboard.verifySubTabSubOptions(sect, opts, "");
    }


    @And("User should be able to view below details under Games {string} Section")
    public void userShouldBeAbleToViewBelowDetailsUnderGamesSection(String sect) {
        dashboard.verifyTableContentsBajajPay(sect, "game", "Customer Mobile#Game Name#Game Tag#Number Of Questions#Number Of Correct answers#Game status#Game Launch Date and Time#Game End Date and Time#Reward Eligibility#Reward Type#Unique ID", "");

    }

    @Then("{string} message should be displayed for Games when no data available")
    public void messageShouldBeDisplayedForGamesWhenNoDataAvailable(String text) {
        dashboard.verifynoDataAvailable("game", text, "");
    }

    @And("User should be able to view below details under Transactions {string} Section")
    public void userShouldBeAbleToViewBelowDetailsUnderTransactionsSection(String sect) {
        dashboard.verifyTableContentsBajajPay(sect, "BBPStab1", "TRANSACTION DATE#TRANSACTION ID#STATUS#BILLER ID#STATUS UPDATE DATE#TXN AMOUNT#NET AMOUNT#CONVENIENCE FEE#OFFER AMOUNT#BILLER STATUS#BAJAJ PAY ID#PG STATUS#PG ID#PRIMARY MODE#PRIMARY MODE AMOUNT#SECONDARY MODE#SECONDARY MODE AMOUNT#REFUND STATUS#BBPS REFUND REFERENCE ID#OFFER TYPE#OFFER CODE#GIFT CODE", "");

    }

    @And("User should be able to view below details under BBPS Dispute {string} Section")
    public void userShouldBeAbleToViewBelowDetailsUnderBBPSDisputeSection(String sect) {
        dashboard.verifyTableContentsBajajPay(sect, "BBPStab2", "Type Of Complaint#Complaint Assigned#Mobile#BBPS Complaint No#Complaint Desc#Participation Type#Complaint Reason#Status#Complaint Date#Biller ID", "");
    }


    //Vignesh

    @And("Verify the details displayed under Transactions {string}")
    public void verifyTheDetailsDisplayedUnderTransactions(String header) {
        verifyTransactionHeaders(header, "");
    }

    @And("Verify the details displayed under BBPS Dispute {string}")
    public void verifyTheDetailsDisplayedUnderBBPSDispute(String header) {
        verifyTransactionHeaders(header, "");
    }

    @And("Verify the details displayed under PG Complaint Details {string}")
    public void verifyTheDetailsDisplayedUnderPGComplaintDetails(String header) {
        verifyTransactionHeaders(header, "");
    }

//    @And("Click on {string}")
//    public void clickOn(String sec) {
//        dashboard.clickOnSubTabsCategory(sec, "");
//    }

    @And("Verify the details displayed under Wallet Transactions {string}")
    public void verifyTheDetailsDisplayedUnderWalletTransactions(String header) {
        verifyTransactionHeaders(header, "");
    }

    @Then("Below table Headers {string} should be displayed under {string} Tab")
    public void belowTableHeadersShouldBeDisplayedUnderTab(String opts, String sect) {
        dashboard.verifyTabsHeader(sect, opts, "");
    }

////Mustaq

    @Then("{string} message should be displayed for Transactions when no data available")
    public void messageShouldBeDisplayedForTransactionsWhenNoDataAvailable(String text) {
        dashboard.verifynoDataAvailable("BBPStab1", text, "");

    }

    @Then("{string} message should be displayed for BBPS Dispute when no data available")
    public void messageShouldBeDisplayedForBBPSDisputeWhenNoDataAvailable(String text) {
        dashboard.verifynoDataAvailable("BBPStab2", text, "");

    }

    @And("User should be able to view below details under PG Complaint Details {string} Section")
    public void userShouldBeAbleToViewBelowDetailsUnderPGComplaintDetailsSection(String sect) {
        dashboard.verifyTableContentsBajajPay(sect, "BBPStab3", "Complaint ID#Biller ID#Complaint Status#Reference ID#Biller Reply", "");

    }

    @Then("{string} message should be displayed for PG Complaint Details when no data available")
    public void messageShouldBeDisplayedForPGComplaintDetailsWhenNoDataAvailable(String text) {
        dashboard.verifynoDataAvailable("BBPStab3", text, "");

    }

    @And("Clicks on Bajaj Pay tab Sub Option {string} under {string}")
    public void clicksOnBajajPayTabSubOptionUnder(String opt, String arg1) {
        dashboard.clickWalletSubTabs(opt, "");
    }

    @And("User should be able to view below details under Transactions {string} Section under {string}")
    public void userShouldBeAbleToViewBelowDetailsUnderTransactionsSectionUnder(String sect, String arg1) {
        dashboard.verifyTableContentsBajajPay(sect, "Wallettab1", "DATETIME#STATUS#WALLET ID#AMOUNT#CONVENIENCE FEE#MODE#TXN ID#PG ID#ORDER TYPE#FSS PAY ID#REFUND TXNID#REFUND DATE#REFUND STATUS#PG STATUS#FSS STATUS#BILLER STATUS", "");

    }

    @And("User should be able to view below details under Passbook {string} Section under {string}")
    public void userShouldBeAbleToViewBelowDetailsUnderPassbookSectionUnder(String sect, String arg1) {
        dashboard.verifyTableContentsBajajPay(sect, "Wallettab2", "Transaction Date Time#Transaction RRN#Billing Amount#Transaction Type#Response Description#Merchant Name#Transaction Fees#Transaction Amount#Wallet Identifier#Remarks#Beneficiary Id", "");

    }

    @Then("{string} message should be displayed for Transactions under Wallet when no data available")
    public void messageShouldBeDisplayedForTransactionsUnderWalletWhenNoDataAvailable(String text) {
        dashboard.verifynoDataAvailable("Wallettab1", text, "");


    }

    @Then("{string} message should be displayed for Passbook under Wallet when no data available")
    public void messageShouldBeDisplayedForPassbookUnderWalletWhenNoDataAvailable(String text) {
        dashboard.verifynoDataAvailable("Wallettab2", text, "");
    }

    @And("User should be able to view below details under Interop Transactions {string} Section under {string}")
    public void userShouldBeAbleToViewBelowDetailsUnderInteropTransactionsSectionUnder(String sect, String arg1) {
        dashboard.verifyTableContentsBajajPay(sect, "Wallettab3", "TXN ID#REF ID#MODE#TXN TYPE#TXN DESC#TXN AMT#BENEFICIARY NAME#TXN DATE#DEBIT VPA#CREDIT VPA#ORDER STATUS#FSS STATUS#FSS MESSAGE#MG STATUS#MG MESSAGE", "");
    }

    @Then("{string} message should be displayed for Interop Transactions under Wallet when no data available")
    public void messageShouldBeDisplayedForInteropTransactionsUnderWalletWhenNoDataAvailable(String text) {
        dashboard.verifynoDataAvailable("Wallettab3", text, "");
    }

    @And("User should be able to view below details \\(Single Record) under Wallet Details {string} Section under {string}")
    public void userShouldBeAbleToViewBelowDetailsSingleRecordUnderWalletDetailsSectionUnder(String sect, String arg1) {
        dashboard.verifyTableContentsBajajPaySingleRecord(sect, "Wallettab4", "WALLET CREATION DATE#WALLET ID#DIGI INIT DATE#DIGI UPGRADE DATE#QC STATUS#QC REMARKS#SUB WALLET BALANCE#REWARD BALANCE#GIFTCARD BALANCE#MAIN WALLET BALANCE#LEDGER BALANCE#INTEROP DATE#INTEROP STATUS#KYC ID", "");
    }

    @Then("{string} message should be displayed for Wallet Details under Wallet when no data available")
    public void messageShouldBeDisplayedForWalletDetailsUnderWalletWhenNoDataAvailable(String text) {
        dashboard.verifynoDataAvailable("Wallettab4", text, "");
    }

    @And("User should be able to view below details \\(Single Record) under Wallet Auto Load {string} Section under {string}")
    public void userShouldBeAbleToViewBelowDetailsSingleRecordUnderWalletAutoLoadSectionUnder(String sect, String arg1) {
        dashboard.verifyTableContentsBajajPaySingleRecord(sect, "Wallettab5", "Auto Load Amount#UMRN#AUTOLOAD STATUS#Auto Load Status Update Date#Recurring Failed Reason#Registration Id#Mandate Status Reason", "");
    }

    @Then("{string} message should be displayed for Wallet Auto Load under Wallet when no data available")
    public void messageShouldBeDisplayedForWalletAutoLoadUnderWalletWhenNoDataAvailable(String text) {
        dashboard.verifynoDataAvailable("Wallettab5", text, "");
    }

    @And("User should be able to view below details under Wallet Activity {string} Section under {string}")
    public void userShouldBeAbleToViewBelowDetailsUnderWalletActivitySectionUnder(String sect, String arg1) {
        dashboard.verifyTableContentsBajajPay(sect, "Wallettab6", "Date/Time#Activity#User#Source#Remarks", "");
    }

    @Then("{string} message should be displayed for Wallet Activity under Wallet when no data available")
    public void messageShouldBeDisplayedForWalletActivityUnderWalletWhenNoDataAvailable(String text) {
        dashboard.verifynoDataAvailable("Wallettab6", text, "");
    }

    @And("User should be able to view below details under TXN History {string} Section under {string}")
    public void userShouldBeAbleToViewBelowDetailsUnderTXNHistorySectionUnder(String sect, String arg1) {
        dashboard.verifyTableContentsBajajPay(sect, "WalletS2Stab1", "Transaction Date#Merchant ID#Sub Merchant ID#End Merchant Name#BFL Transaction Ref#Customer Name ID#Merchant Ref. No#Transaction Amount#Transaction Type#Transaction Status#Transaction Status in FSS#Wallet Response Description#Transaction Wallet ID#UDF1#UDF2#UDF3#UDF4#UDF5#UDF6#Remark 1#Remark 2#Remark 3", "");

    }

    @Then("{string} message should be displayed for TXN History when no data available")
    public void messageShouldBeDisplayedForTXNHistoryWhenNoDataAvailable(String text) {
        dashboard.verifynoDataAvailable("WalletS2Stab1", text, "");

    }

    @And("User should be able to view below details under OTP History {string} Section under {string}")
    public void userShouldBeAbleToViewBelowDetailsUnderOTPHistorySectionUnder(String sect, String arg1) {
        dashboard.verifyTableContentsBajajPay(sect, "WalletS2Stab2", "CREATED DATE#ACCESS TOKEN#REQUEST ID#OTP", "");
    }

    @Then("{string} message should be displayed for OTP History when no data available")
    public void messageShouldBeDisplayedForOTPHistoryWhenNoDataAvailable(String text) {
        dashboard.verifynoDataAvailable("WalletS2Stab2", text, "");

    }

    @And("User should be able to view below details under Refund Transactions {string} Section under {string}")
    public void userShouldBeAbleToViewBelowDetailsUnderRefundTransactionsSectionUnder(String sect, String arg1) {
        dashboard.verifyTableContentsBajajPay(sect, "WalletS2Stab3", "REFUND DATE#MERCHANT ID#SUB MERCHANT ID#SUB MERCHANT NAME#BFL TRANSACTION REF#REFUND ORDER ID#WALLET ID#REFUND AMT#ORDER STATUS#FSS STATUS#FSS MESSAGE#FSS REF NO#REMARK1#REMARK2#REMARK3", "");
    }

    @Then("{string} message should be displayed for Refund Transactions when no data available")
    public void messageShouldBeDisplayedForRefundTransactionsWhenNoDataAvailable(String text) {
        dashboard.verifynoDataAvailable("WalletS2Stab3", text, "");

    }

    @And("User should be able to view below details under Transactions {string} Section under UPI")
    public void userShouldBeAbleToViewBelowDetailsUnderTransactionsSectionUnderUPI(String sect) {
        dashboard.verifyTableContentsBajajPay(sect, "upitab1", "DATETIME#CUSTOMER ID#TRANSACTION ID#REFERENCE ID#PAYEE#AMOUNT#CURRENCY#STATUS#BENEFICIARY NAME#PAYER DETAILS#TXN TYPE#MODE#CREDIT CARD#TXN MODE#LITE REF NO#TXN REFERENCE#FLOWTYPE:DEBIT/CREDIT#PAYEE VPA ID#PAYER VPA ID#HANDLE#TXN DESCRIPTION#ERROR DESC", "");

    }

    @Then("{string} message should be displayed for Transactions of UPI when no data available")
    public void messageShouldBeDisplayedForTransactionsOfUPIWhenNoDataAvailable(String text) {
        dashboard.verifynoDataAvailable("upitab1", text, "");

    }

    @And("User should be able to view below details under Refer {string} Section under UPI")
    public void userShouldBeAbleToViewBelowDetailsUnderReferSectionUnderUPI(String sect) {
        dashboard.verifyTableContentsBajajPay(sect, "upitab2", "Sl. No.#Referee Mobile Number#Referral Flag#Referrer Mobile Number#Referral Code#Created On", "");

    }

    @Then("{string} message should be displayed for Refer of UPI when no data available")
    public void messageShouldBeDisplayedForReferOfUPIWhenNoDataAvailable(String text) {
        dashboard.verifynoDataAvailable("upitab2", text, "");

    }

    @And("Verify Service Segment Section in Bajaj Pay Page")
    public void verifyServiceSegmentSectionInBajajPayPage() {
        dashboard.serviceSegmentSectionBajajPayPage();
    }

    @Then("When Customer Id is not found against searched parameter then below details should be displayed")
    public void whenCustomerIdIsNotFoundAgainstSearchedParameterThenBelowDetailsShouldBeDisplayed() {
        dashboard.verifyCustIDNotAvailableBajajPay("Gender, DOB, PAN, Marital Status, Email ID, Address", "");
        dashboard.verifyMobileMasked("");

    }

    @Then("Then Type = NTB should be displayed when cust id is not found against mobile number")
    public void thenTypeNTBShouldBeDisplayedWhenCustIdIsNotFoundAgainstMobileNumber() {
        dashboard.verifytypeNtbBajajPay("");
    }

    @Then("Below Options {string} should be disabled if User is NTB")
    public void belowOptionsShouldBeDisabledIfUserIsNTB(String opts) {
        verifymultipleButtonIsDisabledInThePageusingText(opts, "");
    }

    @Then("Dropdown arrow should be displayed when customer is having multiple IDs")
    public void dropdownArrowShouldBeDisplayedWhenCustomerIsHavingMultipleIDs() {
        verifyDropdownIsDisplayedAndPrintOptions(DetailsPage.custIddropDown, "");

    }

    @And("Selects another Customer Id from Customer Id dropdown")
    public void selectsAnotherCustomerIdFromCustomerIdDropdown() {
        selectDropDownUsingIndex(DetailsPage.custIddropDown, 2);

    }


    @Then("Respective relations should be displayed for selected customer id")
    public void respectiveRelationsShouldBeDisplayedForSelectedCustomerId() {
        dashboard.verifycustIdChangeIn3in1Page("");
    }


    @And("User should be able to view Language Dropdown and Close Button for FC Letter")
    public void userShouldBeAbleToViewLanguageDropdownAndCloseButtonForFCLetter() {
        verifyDropdownIsDisplayedAndPrintOptions(DashboardPage.languageDropdown, "");
        verifyElementIsDisplayedOrNot(DashboardPage.languageDropdownCross);
    }

    @And("Clicks on cross icon of Language Popup")
    public void clicksOnCrossIconOfLanguagePopup() {
        clickOn(DashboardPage.languageDropdownCross);

    }

    @Then("On click of cross icon Language popup should be closed")
    public void onClickOfCrossIconLanguagePopupShouldBeClosed() {
        waitTime(2);
        verifyElementIsNotDisplayedUsingLocator(DashboardPage.languageDropdownCross);

    }

    @And("Selects a language {string} from Language Dropdown")
    public void selectsALanguageFromLanguageDropdown(String lang) {
        selectDropDownUsingText(DashboardPage.languageDropdown, lang);

    }

    @Then("Verify the Downloaded PDF {string} in selected language")
    public void verifyTheDownloadedPDFInSelectedLanguage(String pdf) {
        verifyDownLoadAndDeleteLatestFileNameFromLocalMachine(pdf);
    }

    @And("{string} Button should be displayed for Cashier Profile")
    public void buttonShouldBeDisplayedForCashierProfile(String button) {
        verifyButtonIsDisplayedInThePage(button);
    }

    @Then("User should be able to view Loan {string} CTA on the top-right corner of the dashboard")
    public void userShouldBeAbleToViewLoanCTAOnTheTopRightCornerOfTheDashboard(String cta) {
        verifyButtonIsDisplayedInThePage(cta);
    }

    @Then("User should be able to slide-over panel showing customer’s loan summary details")
    public void userShouldBeAbleToSlideOverPanelShowingCustomerSLoanSummaryDetails() {
        verifyElementIsDisplayedOrNot(DashboardPage.loanInsightsDropdown);
    }

    @And("Click on Loan {string} CTA on the top-right corner of the dashboard")
    public void clickOnLoanCTAOnTheTopRightCornerOfTheDashboard(String cta) {
        clickOnButtonUsingTextUsingForLoop(cta);
    }

    @Then("User should be able to view below loan insights details {string} under tile {string}")
    public void userShouldBeAbleToViewBelowLoanInsightsDetailsUnderTile(String details, String tile) {
        dashboard.verifyloanInsightsDetails(tile, details, "");
    }

    @And("The details of that specific loan {string} should be displayed in the loan insights tile")
    public void theDetailsOfThatSpecificLoanShouldBeDisplayedInTheLoanInsightsTile(String tile) {
        String loantile = "Loan Tile " + tile + "#xpath=//h3[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'loaninsights-accoridan-card active')]";
        verifyElementIsDisplayedOrNot(loantile);
    }

    @Then("User should be able to view dropdown if multiple loans in Loan Insights")
    public void userShouldBeAbleToViewDropdownIfMultipleLoansInLoanInsights() {
        dashboard.verifyMultipleLoanInInsights();
    }

    @And("Click on cross icon of Loan Insights panel")
    public void clickOnCrossIconOfLoanInsightsPanel() {
        clickOn(DashboardPage.loanInsightsClose);
    }

    @Then("User should be redirected to dashboard page and loan insight panel should be closed")
    public void userShouldBeRedirectedToDashboardPageAndLoanInsightPanelShouldBeClosed() {
        waitTime(2);
        verifyElementIsNotDisplayedUsingLocator(DashboardPage.loanInsightsClose);
    }

    @Then("Below field {string} should be visible in {string} section in Underwriting Dashboard")
    public void belowFieldShouldBeVisibleInSectionInUnderwritingDashboard(String labels, String head) {
        dashboard.underwritingDashboardLabels(head, labels, "");

    }


    @Then("Below fields {string} should be visible under Loan Summary section for Underwriting Dashboard")
    public void belowFieldsShouldBeVisibleUnderLoanSummarySectionForUnderwritingDashboard(String labels) {
        dashboard.underwritingDashboardLoanSummaryLabels("Loan Summary", labels, "");


    }

    @Then("Below fields {string} should be visible under Credit Portfolio section")
    public void belowFieldsShouldBeVisibleUnderCreditPortfolioSection(String labels) {
        dashboard.underwritingDashboardPortfolioSectionContents(labels, "");
    }

    @And("Verify Mobile Number Masking Pattern in Address Details in Underwriting Dashboard")
    public void verifyMobileNumberMaskingPatternInAddressDetailsInUnderwritingDashboard() {
        String value = dashboard.underDashboardValues("Address Details", "Mobile", "");
        verifyMaskedAndUnmaskedFormatUsingValue(value, "Mobile", "X", 0, 4, true, "0");
        verifyMaskedAndUnmaskedFormatUsingValue(value, "Mobile", "X", 6, 4, false, "1");

    }

    @And("Verify Email ID Masking Pattern in Address Details in Underwriting Dashboard")
    public void verifyEmailIDMaskingPatternInAddressDetailsInUnderwritingDashboard() {
        String value = dashboard.underDashboardValues("Address Details", "Email", "");
        dashboard.verifyEmailIdMaskedUnderwriting(value, "");
    }

    @And("Verify Address Masking Pattern in Address Details in Underwriting Dashboard")
    public void verifyAddressMaskingPatternInAddressDetailsInUnderwritingDashboard() {
        String value = dashboard.underDashboardValues("Address Details", "Address", "");
        dashboard.verifyAddressMaskedUnderwriting(value, "");
    }

    @Then("Address should be concate the address line{int}+{int}+{int},CityName and State name and partially masked")
    public void addressShouldBeConcateTheAddressLineCityNameAndStateNameAndPartiallyMasked(int arg0, int arg1, int arg2) {
        String value = dashboard.underDashboardValues("Address Details", "Address", "");
        dashboard.underWritingaddressFields(value, "");
    }

    @And("If any loan is write off then Credit Facility Status should be shown as {string}.")
    public void ifAnyLoanIsWriteOffThenCreditFacilityStatusShouldBeShownAs(String value) {
        verifyGetTextUsingLocatorAndCompareWithText(DashboardPage.creditFacilitystatus, value, "");

    }

    @And("If any loan is {string} then Credit Facility Status should be shown as {string}.")
    public void ifAnyLoanIsThenCreditFacilityStatusShouldBeShownAs(String arg0, String value) {
        verifyGetTextUsingLocatorAndCompareWithText(DashboardPage.creditFacilitystatus, value, "");

    }

    @And("Below Tabs {string} should be displayed under Underwriting Dashboard Page")
    public void belowTabsShouldBeDisplayedUnderUnderwritingDashboardPage(String opts) {
        verifyFieldsUsingCommonXpathAndMultipleTextWithHash("//div[@class='tradedetails-linksbox']//a", opts, "");
    }

    @And("Below SubTabs {string} should be displayed under {string} Tab in Underwriting Dashboard Page")
    public void belowSubTabsShouldBeDisplayedUnderTabInUnderwritingDashboardPage(String opts, String arg1) {
        verifyFieldsUsingCommonXpathAndMultipleTextWithHash("//ul[@id='tradline-tabs']//li//a", opts, "");

    }

    @And("Clicks on {string} tab under Underwriting Dashboard Page")
    public void clicksOnTabUnderUnderwritingDashboardPage(String tab) {
        clickOnButtonUsingXpathAndText("//div[@class='tradedetails-linksbox']//a", tab);
    }

    @And("Clicks on {string} Subtab under Underwriting Dashboard Page")
    public void clicksOnSubtabUnderUnderwritingDashboardPage(String sub) {
        clickOnButtonUsingXpathAndText("//ul[@id='tradline-tabs']//li//a", sub);

    }

    @And("{string} Button should not be displayed for Non Cashier Profile")
    public void buttonShouldNotBeDisplayedForNonCashierProfile(String button) {
        verifyElementIsNotDisplayedUsingLocator(DashboardPage.loanInsightsButton);

    }

    @Then("User should be  able to view “I button” under last {int} EMI status on the tile, related C, B & P status")
    public void userShouldBeAbleToViewIButtonUnderLastEMIStatusOnTheTileRelatedCBPStatus(int arg0) {
        verifyElementIsDisplayedOrNot(DashboardPage.infoLast5Emi);
    }

    @Then("User should be able to view mon-yyyy format under month field on EMI Status")
    public void userShouldBeAbleToViewMonYyyyFormatUnderMonthFieldOnEMIStatus() {
        String status = "Status #xpath=(//h3[normalize-space(text())='P94CPNT10735528']/ancestor::div[contains(@class,'active')]//ul//li//p[normalize-space(text())='Last 5 EMI status']/following-sibling::div//p)";
        dashboard.tooltipsText(status, "");
    }

    @And("User should be able to view Statuses on hovering over Info Icon")
    public void userShouldBeAbleToViewStatusesOnHoveringOverInfoIcon() {
        dashboard.captureApptooltips(DashboardPage.infoLast5Emi, "");

    }

    @Then("User should be able to view mon-yyyy format under month field on EMI Status for tile {string}")
    public void userShouldBeAbleToViewMonYyyyFormatUnderMonthFieldOnEMIStatusForTile(String tile) {
        String status = "Status #xpath=(//h3[normalize-space(text())='" + tile + "']/ancestor::div[contains(@class,'active')]//ul//li//p[normalize-space(text())='Last 5 EMI status']/following-sibling::div//p)";
        String date = dashboard.tooltipsText(status, "");
        verifyDateFormatForDates(date, "MMM-yyyy", "");

    }

    @Then("Dropdown should be displayed when customer having multiple ID's under Underwriting Dashboard")
    public void dropdownShouldBeDisplayedWhenCustomerHavingMultipleIDSUnderUnderwritingDashboard() {
        verifyDropdownIsDisplayedAndPrintOptions(DashboardPage.custIdDropAppDetailsUnderwrit, "");
    }

    @Then("Dashboard page should be refreshed according to selected customer ID {string}")
    public void dashboardPageShouldBeRefreshedAccordingToSelectedCustomerID(String text) {
        selectDropDownUsingText(DashboardPage.custIdDropAppDetailsUnderwrit, text);
        waitTime(2);
    }

    @And("Verify If Individual Corporate Flag is {string}")
    public void verifyIfIndividualCorporateFlagIs(String flag) {
        verifyGetTextUsingLocatorAndCompareWithText(DashboardPage.indCorpFlagAppDetailsUnderwrit, flag, "");
    }

    @Then("DOB header & field value should be showcased in masked format")
    public void dobHeaderFieldValueShouldBeShowcasedInMaskedFormat() {
        dashboard.verifyDOBMaskedUnderwritingDashboard("");
    }

    @Then("{string} should be hidden in Applicant Details")
    public void shouldBeHiddenInApplicantDetails(String label) {
        verifyFieldsNotDisplayedUsingCommonXpathAndMultipleTextWithHash("//h6[normalize-space(text())='Applicant Details']/ancestor::div[@class='info-card']//li//p", label, "");
    }

    @Then("Below options {string} should be displayed under liveTradeline  tab in tabular format")
    public void belowOptionsShouldBeDisplayedUnderLiveTradelineTabInTabularFormat(String opts) {
        dashboard.verifyTableContentsUnderwritingDashboard("live-tradeline", opts, "");
    }

    @Then("Below options {string} should be displayed under Cancelled & closed tradeline details tab in tabular format")
    public void belowOptionsShouldBeDisplayedUnderCancelledClosedTradelineDetailsTabInTabularFormat(String opts) {
        dashboard.verifyTableContentsUnderwritingDashboard("closed-tradeline", opts, "");

    }

    @And("{string} icon in {string} column should be displayed under {string} table")
    public void iconInColumnShouldBeDisplayedUnderTable(String logo, String column, String tableid) {
        dashboard.verifyTableLabelsIconUnderwritingDashboard(tableid, column, logo, "");
    }

    @And("User should be able to view {string} under {string} in Underwriting Dashboard Page")
    public void userShouldBeAbleToViewUnderInUnderwritingDashboardPage(String label, String table) {
        dashboard.verifyTableLabelsUnderwritingDashboard(table, label, "");
    }


    @Then("Below options {string} should be displayed under Cards tab in tabular format")
    public void belowOptionsShouldBeDisplayedUnderCardsTabInTabularFormat(String opts) {
        dashboard.verifyTableContentsUnderwritingDashboard("live-tradeline", opts, "");

    }


    @And("User horizontally scrolls the Live Tradeline table")
    public void userHorizontallyScrollsTheLiveTradelineTable() {
        scrollToWebElementIfPresent(DashboardPage.liveTradeline);
        horizontalScrollTable(DashboardPage.liveTradeline, "");
        waitTime(2);

    }

    @And("User should be able to view {string} under {string} table is freezed")
    public void userShouldBeAbleToViewUnderTableIsFreezed(String label, String table) {
        dashboard.verifyTableLabelsDisplayedUnderwritingDashboardFreeze(table, label, "");
    }

    @And("Clicks on Card number {string} in cards")
    public void clicksOnCardNumberInCards(String num) {
        clickOnButtonUsingXpathAndText("//td//a", num);
    }

    @Then("User should be able to view {string} under Cards Table")
    public void userShouldBeAbleToViewUnderCardsTable(String head) {
        dashboard.verifyTableLabelsUnderwritingDashboard("live-tradeline", head, "");
    }

    @And("Verify the details displayed under Identification Tab in Underwriting Dashboard Page")
    public void verifyTheDetailsDisplayedUnderIdentificationTabInUnderwritingDashboardPage() {
        dashboard.verifyIdentificationTableContentsUnderwritingDashboard("tradeline-tablebox", "Identification Type#Identification Number", "");
    }

    @When("User has {string} in the Live Tradeline Table as {string}")
    public void userHasInTheLiveTradelineTableAs(String opts, String value) {
//        String opt = changeCommaToHash(opts, "");
        dashboard.verifyTableLabelsValueUnderwritingDashboard("live-tradeline", opts, value, "");
    }

    @Then("User should be able to view credit Facility Status as {string}")
    public void userShouldBeAbleToViewCreditFacilityStatusAs(String value) {
        verifyGetTextUsingLocatorAndCompareWithText(DashboardPage.creditFacilitystatus, value, "");

    }

    @And("Clicks on {string} - {string} in {string} Tab")
    public void clicksOnInTab(String arg0, String num, String arg2) {
        clickOnButtonUsingXpathAndText("//td//a", num);

    }

    @Then("User should be able to view tradeline overview option is preselected")
    public void userShouldBeAbleToViewTradelineOverviewOptionIsPreselected() {
        verifyElementIsDisplayedOrNot(DashboardPage.preselectTradeline);
    }

    @And("Below field {string} should be visible in {string} section in Commercial Lending Dashboard")
    public void belowFieldShouldBeVisibleInSectionInCommercialLendingDashboard(String labels, String head) {
        dashboard.underwritingDashboardLabels(head, labels, "");

    }

    @Then("Below fields {string} should be removed from quick links section")
    public void belowFieldsShouldBeRemovedFromQuickLinksSection(String opts) {
        verifyFieldDisplayedUsingTagAndText("h6", "QUICK LINKS", "");
        verifyFieldDisplayedUsingTagAndText("h2", "QUICK LINKS", "");
        verifyFieldsNotDisplayedUsingCommonXpathAndMultipleTextWithHash("//ul[@class='quicklink-list']//a", opts, "");

    }

    @And("Verify {string} Section is not displayed in DashBoard Page")
    public void verifySectionIsNotDisplayedInDashBoardPage(String head) {
        verifyFieldNotDisplayedUsingTagAndTextUsingScroll("h5", head, "");

    }

    @And("Verify {string} Section in DashBoard Page is displayed")
    public void verifySectionInDashBoardPageIsDisplayed(String sect) {
        verifyFieldDisplayedUsingTagAndText("h6", sect, "");

    }

    @Then("Below fields {string} should be removed from service segment section")
    public void belowFieldsShouldBeRemovedFromServiceSegmentSection(String opts) {
        verifyFieldsNotDisplayedUsingCommonXpathAndMultipleTextWithHash("//div[@class='service-div']//li//p", opts, "");
    }

    @Then("User should be able to view Get Details CTA under Loan Tile {string}")
    public void userShouldBeAbleToViewGetDetailsCTAUnderLoanTile(String tile) {
        String tileGetDetailsBtn = "Tile : " + tile + " - Get Details Button: #xpath=(//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card')]//button[contains(@class,'get-details-btn')])";
        verifyElementIsDisplayedOrNot(tileGetDetailsBtn);

    }


    @Then("User should be able to view UPI under bajaj pay dashboard page")
    public void userShouldBeAbleToViewUPIUnderBajajPayDashboardPage() {
        verifyFieldsDisplayedUsingLocatorWithScroll(DashboardPage.bpayDasboardUPI);
    }

    @And("Clicks on Bajaj Pay tab SubMenu Option {string}")
    public void clicksOnBajajPayTabSubMenuOption(String subMenu) {
        dashboard.clickBPaySubMenuTabs(subMenu, "");
    }

    @And("Clicks on Bajaj Pay tab SubMenu {string} Options {string}")
    public void clicksOnBajajPayTabSubMenuOptions(String subMenu, String opt) {
        dashboard.clickBPaySubMenuTabs(subMenu, "");
        dashboard.clickBPaySubMenuTabsOptions(subMenu, opt);
    }


    @Then("Below Headers {string} should be displayed under the {string} Tab")
    public void belowHeadersShouldBeDisplayedUnderTheTab(String headrs, String subMenu) {
        dashboard.verifyBPaySubMenuTableHeaders(headrs);
    }

    @Then("{string} message should be displayed for Customer Profile when no data available")
    public void messageShouldBeDisplayedForCustomerProfileWhenNoDataAvailable(String message) {
        verifyElementIsDisplayedOrNot(dashboard.bpaySubMenuNoDataAvailableMessage);
    }


    @Then("Details should be display within a {int} second")
    public void detailsShouldBeDisplayWithinASecond(int arg0) {
        dashboard.verifyTableDetailsDisplayedWithIn2Sec(dashboard.bpaySubMenuOptionTableMandateNameColumn);

    }


    @And("User should be able to view below details under Customer Profile {string} Section under UPI")
    public void userShouldBeAbleToViewBelowDetailsUnderCustomerProfileSectionUnderUPI(String sect) {
        verifyFieldDisplayedUsingTagAndText("h2", "VPA Details", "");
        dashboard.verifyTableContentsBajajPay(sect, "upitab4", "Sl. No.#VPA Creation Date#VPA Status#Bank Name#Masked Bank Account Number", "");

    }

    @Then("{string} message should be displayed for Customer Profile of UPI when no data available")
    public void messageShouldBeDisplayedForCustomerProfileOfUPIWhenNoDataAvailable(String text) {
        dashboard.verifynoDataAvailable("upitab4", text, "");

    }

    @And("User should be able to view below details under AutoPay {string} Section under UPI")
    public void userShouldBeAbleToViewBelowDetailsUnderAutoPaySectionUnderUPI(String sect) {
        verifyFieldDisplayedUsingTagAndText("h2", "UPI Mandate Details", "");
        dashboard.verifyTableContentsBajajPay(sect, "upitab3", "Sl. No.#Mandate Name#Amount#Validity Start Date#Validity End Date#Status#Payer Revocable#Pause Start#Pause End#Payee VPA#Payer VPA", "");

    }

    @Then("{string} message should be displayed for AutoPay of UPI when no data available")
    public void messageShouldBeDisplayedForAutoPayOfUPIWhenNoDataAvailable(String text) {
        dashboard.verifynoDataAvailable("upitab3", text, "");

    }

    @Then("User should be able to view {string} nudge beside agreement no on Loan tile {string}")
    public void userShouldBeAbleToViewNudgeBesideAgreementNoOnLoanTile(String nudge, String tile) {
        dashboard.consentNudgeLoanTile(tile, nudge, "");
    }

    @Then("{string} Nudge should not be displayed when conditions are not matched for tile {string}")
    public void nudgeShouldNotBeDisplayedWhenConditionsAreNotMatchedForTile(String nudge, String tile) {
        dashboard.consentNoNudgeLoanTile(tile, nudge, "");
    }

    @Then("{string} Popup with options Yes and No should be displayed")
    public void popupWithOptionsYesAndNoShouldBeDisplayed(String pop) {
        verifyPopupDisplayedUsingTagAndText("h2", pop, "");
        verifyFieldsUsingCommonXpathAndMultipleTextWithHash("//a//p", "YES#NO", "");
        verifyElementIsDisplayedOrNot(DashboardPage.popupCross);
    }

    @Then("User should be able to view {string} CTA for {string} Tile")
    public void userShouldBeAbleToViewCTAForTile(String doc, String tile) {
        dashboard.verifyConsentSMSDocDisplayed(tile, doc, "");
    }

    @Then("Users should not able to view {string} CTA when below condition is not matched for {string}")
    public void usersShouldNotAbleToViewCTAWhenBelowConditionIsNotMatchedFor(String doc, String tile) {
        dashboard.verifyConsentSMSDocNotDisplayed(tile, doc, "");

    }

    @And("Clicks on {string} CTA of Consent SMS Popup")
    public void clicksOnCTAOfConsentSMSPopup(String cta) {
        clickOnButtonUsingXpathAndText("//a//p", cta);
        waitTime(2);
    }

    @Then("Docpod API should be triggered when user click on Yes CTA")
    public void docpodAPIShouldBeTriggeredWhenUserClickOnYesCTA() {
        handleToastByClass("toast-title", "Success", "");
        handleToastByClass("toast-message", "Consent SMS", "");

    }

    @Then("User should be able to view dashboard page when click on No CTA")
    public void userShouldBeAbleToViewDashboardPageWhenClickOnNoCTA() {
        verifyElementIsNotDisplayedUsingLocator(DashboardPage.popupCross);
    }

    @Then("Confirmation message {string} should be displayed on successful trigger")
    public void confirmationMessageShouldBeDisplayedOnSuccessfulTrigger(String text) {
        handleToastByClass("toast-title", "Success", "");
        handleToastByClass("toast-message", text, "");

    }


    @Then("User should be able to view {string} instead of Card Limit for Cards Relation {string}")
    public void userShouldBeAbleToViewInsteadOfCardLimitForCardsRelation(String label, String tile) {
        verifyValueUsingLabel("//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card pink')]//div[contains(@class,'amount-info-part')]//div[@class='label']", label, "/following-sibling::div[@class='value']", "");

    }

    @Then("User should be able to view {string} instead of Available Loan Offer for Cards Relation {string}")
    public void userShouldBeAbleToViewInsteadOfAvailableLoanOfferForCardsRelation(String label, String tile) {
        verifyValueUsingLabel("//h5[normalize-space(text())='" + tile.trim() + "']/ancestor::div[contains(@class,'tab-info-card pink')]//div[contains(@class,'amount-info-part')]//div[@class='label']", label, "/following-sibling::div[@class='value']", "");

    }


    @And("Verify User is {string} under Personal Info Section")
    public void verifyUserIsUnderPersonalInfoSection(String text) {
        verifyGetTextUsingLocatorAndCompareWithText(DashboardPage.userTypeDeceased,text,"");
    }

    @Then("Notification pop up should not be displayed for Deceased customer")
    public void notificationPopUpShouldNotBeDisplayedForDeceasedCustomer() {
        verifyElementIsNotDisplayedUsingLocator(DashboardPage.notificationPop);
    }

    @Then("Notification pop up should be displayed for Not Deceased customer")
    public void notificationPopUpShouldBeDisplayedForNotDeceasedCustomer() {
        verifyElementIsDisplayedOrNot(DashboardPage.notificationPop);

    }

    @Then("user should be able to view {string} field on dashboard page")
    public void userShouldBeAbleToViewFieldOnDashboardPage(String label) {
        verifyValueUsingLabel("//div[@class='service-div']//li//p", label, "/following-sibling::a//strong", "");

    }

    @And("Verify the Table Contents in Mandate Details Page")
    public void verifyTheTableContentsInMandateDetailsPage() {
        dashboard.verifyTableContentsBajajPay("Mandate Details","mandate-details","Customer ID#Agreement No#MICR Code#Bank Account Number#Bank Name#Status#Rejection Reason#Date of Rejection","");
    }

    @And("User should be able to view {string} under {string} in Mandate Details Page")
    public void userShouldBeAbleToViewUnderInMandateDetailsPage(String label, String arg1) {
        dashboard.verifyTableLabelsUnderwritingDashboard("mandate-details", label, "");

    }

    @Then("{string} should be displayed for loan {string}")
    public void shouldBeDisplayedForLoan(String letter, String relation) {
        dashboard.verifyFCDocDisplayed(relation, letter, "");

    }

    @Then("{string} should be displayed for Card {string}")
    public void shouldBeDisplayedForCard(String letter, String relation) {
        dashboard.verifyFCDocDisplayed(relation, letter, "");

    }

    @And("Verify the {string} is of {string} Day in Loan Tile {string}")
    public void verifyTheIsOfDayInLoanTile(String label, String type, String tile) {
        dashboard.verifyDisbursementDatePastorFuture(label,tile,type,"");
    }

    @Then("{string} should be displayed for loan {string} is downloadable")
    public void shouldBeDisplayedForLoanIsDownloadable(String doc, String tile) {
        dashboard.verifyFCDocActive(tile,doc,"");
    }

    @Then("{string} should be displayed for loan {string} is greyed")
    public void shouldBeDisplayedForLoanIsGreyed(String doc, String tile) {
        dashboard.verifyFCDocGreyed(tile,doc,"");

    }

    @Then("Verify Toast message {string} with title {string} is Displayed")
    public void verifyToastMessageWithTitleIsDisplayed(String title, String content) {
        waitTime(1);
        handleToastByClass("toast-title", title, "");
        handleToastByClass("toast-message", content, "");

    }

    @Then("Notification message should be displayed with below details for BHFL {string}")
    public void notificationMessageShouldBeDisplayedWithBelowDetailsForBHFL(String msg) {
        verifyPopupDisplayedUsingTagAndText("h2",msg,"");
    }


    @Then("Hyphen {string} should be displayed when data from BHFL sourcing is Unavailable")
    public void hyphenShouldBeDisplayedWhenDataFromBHFLSourcingIsUnavailable(String symb) {
      String firstTileName="First Tile Name#xpath=(//div[@class='status-div']//p)[1]";
        verifyGetTextContains(firstTileName,symb);
    }

    @Then("User should be able to view personal info labels {string} under dashboard page")
    public void userShouldBeAbleToViewPersonalInfoLabelsUnderDashboardPage(String labels) {
        dashboard.personalInfoLabelsThroughIteration(labels,"");
    }

    @And("Verify Service Segment Section Labels {string} in DashBoard Page")
    public void verifyServiceSegmentSectionLabelsInDashBoardPage(String labels) {
        dashboard.serviceSegmentSectionDashboardPageThroughIteration(labels,"");

    }
}
