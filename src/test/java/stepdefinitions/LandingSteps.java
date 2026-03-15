package stepdefinitions;

import pageobjects.DashboardPage;
import pageobjects.DetailsPage;
import pageobjects.LandingPage;
import base.ApplicationKeywords;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LandingSteps extends ApplicationKeywords {

    LandingPage landing;


    public LandingSteps() {
        landing = new LandingPage();
    }


    @And("Verify User is able to view below content for Landing Page")
    public void verifyUserIsAbleToViewBelowContentForLandingPage() {
        landing.landingPageContents();
    }

    @And("Verify User is able to view below content for Top Section on Landing Page")
    public void verifyUserIsAbleToViewBelowContentForTopSectionOnLandingPage() {
        landing.topSectionContents();
    }

    @And("Verify User is able to view below content for Search Section on Landing Page")
    public void verifyUserIsAbleToViewBelowContentForSearchSectionOnLandingPage() {
        landing.searchSectionContents();
    }

    @And("Verify User is able to view Below Options {string} for Search By Dropdown")
    public void verifyUserIsAbleToViewBelowOptionsForSearchByDropdown(String opts) {
        verifyGetAllOptionsInDropDownAndCompare(LandingPage.searchDropdown, opts);
    }

    @And("Selects {string} Option from Search Dropdown")
    public void selectsOptionFromSearchDropdown(String drop) {
//        selectDropDownUsingText(LandingPage.searchDropdown, drop);
        selectDropdownByCleanText(LandingPage.searchDropdown, drop);

    }

    @And("Enters {string} into Search Input Box")
    public void entersIntoSearchInputBox(String input) {
        typeIn(LandingPage.searchByInput, input);
    }

    @Then("User should be redirected to Dashboard Page {string}")
    public void userShouldBeRedirectedToDashboardPage(String url) {
//        waitForPageToLoad();
        verifyRedirectioninSameTabWithoutABack(url, "");
        if (isElementDisplayed(DashboardPage.notificationPop)) {
            manualScreenshot(getRefOfXpath(DashboardPage.notificationPop) + " is Displayed");
            clickOnButtonUsingTextUsingForLoop("got it!");
            waitTime(2);
        }
    }

    @And("Clicks on {string} Button")
    public void clicksOnButton(String btn) {
        clickOnButtonUsingTextUsingForLoop(btn);

    }

    @And("Verify Notifications Popup on Landing Page")
    public void verifyNotificationsPopupOnLandingPage() {
        verifyPopupDisplayedUsingTagAndText("h2", "Notifications", "");
        clickOnButtonUsingTextUsingForLoop("got it!");
    }

    @And("Clicks on {string} Option under Top Section")
    public void clicksOnOptionUnderTopSection(String opt) {
        clickOnAnyThingUsingTextAndTagWithForLoop("ul[@class='navbar-ul']//a", opt, "");
    }

    @And("User should be able to view {string} under header section on landing page")
    public void userShouldBeAbleToViewUnderHeaderSectionOnLandingPage(String opt) {
        verifyFieldsUsingCommonXpathAndMultipleTextWithHash("//ul[@class='navbar-ul']//li//a", opt, "");

    }

    @And("User Clicks on {string} Option in Top Menu under Landing page")
    public void userClicksOnOptionInTopMenuUnderLandingPage(String opt) {
        clickOnButtonUsingXpathAndText("//ul[@class='navbar-ul']//li//a", opt);
    }

    @And("User should be able to view {string} Radio Buttons under Customer Blocklist Page")
    public void userShouldBeAbleToViewRadioButtonsUnderCustomerBlocklistPage(String opts) {
        String opt = changeCommaToHash(opts, "");
        verifyFieldsUsingCommonXpathAndMultipleTextWithHash("//input/parent::label", opt, "");
    }


    @And("Clicks on {string} Radio Button in Customer Blocklist Page")
    public void clicksOnRadioButtonInCustomerBlocklistPage(String opt) {
        clickOnRadioButtonUsingLabel(opt, "");

    }

    @Then("User should be able to view below content for Search Customer")
    public void userShouldBeAbleToViewBelowContentForSearchCustomer() {
        verifyElementIsPresentUsingLocator(LandingPage.mobileNumInputCustBlocklist);
        verifyTextBoxIsEnabledUsingLocator(LandingPage.mobileNumInputCustBlocklist);
        verifyButtonIsDisplayedInThePage("Search");
        verifyButtonIsDisplayedInThePage("Reset");
    }

    @Then("User should be able to enter mobile number under mobile number field")
    public void userShouldBeAbleToEnterMobileNumberUnderMobileNumberField() {
        verifyElementIsPresentUsingLocator(LandingPage.mobileNumInputCustBlocklist);
        verifyTextBoxIsEnabledUsingLocator(LandingPage.mobileNumInputCustBlocklist);

    }

    @And("Enters {string} in Search Customer Mobile Number Box")
    public void entersInSearchCustomerMobileNumberBox(String num) {
        typeIn(LandingPage.mobileNumInputCustBlocklist, num);
    }

    @Then("User should be able to view Below Table for Search Customer")
    public void userShouldBeAbleToViewBelowTableForSearchCustomer() {
        landing.verifySearchCustomerTableCustBlocklist("MOBILE NUMBER#DNC#ORIGIN#SOURCE#CREATED BY (ADID)#CREATED BY (EMAIL)#CREATED ON", "");
    }

    @Then("User should be able to view Search Customer Table")
    public void userShouldBeAbleToViewSearchCustomerTable() {
        verifyElementIsDisplayedOrNot(LandingPage.searchCustTable);
    }

    @Then("User should be able to refresh the same page and the Table should disappear")
    public void userShouldBeAbleToRefreshTheSamePageAndTheTableShouldDisappear() {
        verifyElementIsNotDisplayedUsingLocator(LandingPage.searchCustTable);
    }

    @Then("Below fields should be displayed for Block Customer Button")
    public void belowFieldsShouldBeDisplayedForBlockCustomerButton() {
        verifyElementIsPresentUsingLocator(LandingPage.mobileNumInputBlockCustBlocklist);
        verifyTextBoxIsEnabledUsingLocator(LandingPage.mobileNumInputBlockCustBlocklist);
        verifyDropdownIsDisplayedAndPrintOptions(LandingPage.originDropdownBlockCustBlocklist, "");
        verifyElementIsDisplayedOrNot(LandingPage.inputBoxBlockCustBlocklist);
        verifyButtonIsDisplayedInThePage("Submit");
        verifyButtonIsDisplayedInThePage("Reset");

    }

    @Then("User should be able to enter mobile number under mobile number fields of Block Customer")
    public void userShouldBeAbleToEnterMobileNumberUnderMobileNumberFieldsOfBlockCustomer() {
        verifyElementIsPresentUsingLocator(LandingPage.mobileNumInputBlockCustBlocklist);
        verifyTextBoxIsEnabledUsingLocator(LandingPage.mobileNumInputBlockCustBlocklist);

    }

    @Then("User should be able to view Origin Dropdown {string} under origin section")
    public void userShouldBeAbleToViewOriginDropdownUnderOriginSection(String opts) {
        String opt = changeCommaToHash(opts, "");
        verifyGetAllOptionsInDropDownAndCompare(LandingPage.originDropdownBlockCustBlocklist, opt);

    }

    @And("Enters {string} Mobile Number in Mobile number Field")
    public void entersMobileNumberInMobileNumberField(String num) {
        typeIn(LandingPage.mobileNumInputBlockCustBlocklist, num);

    }

    @And("Selects {string} Option from Origin Dropdown")
    public void selectsOptionFromOriginDropdown(String origin) {
        selectDropDownUsingText(LandingPage.originDropdownBlockCustBlocklist, origin);
    }

    @Then("{string} Toast message should be displayed for Input")
    public void toastMessageShouldBeDisplayedForInput(String toast) {
        handleToastByClass("toast-message", toast, "");
//        handleToastTextAndColourByTextClassAndToastId("toast-message","toast-container",toast,"#fe2323","background-color","Red","");
    }

    @Then("Page should be refreshed and the Contents entered {string} should be removed")
    public void pageShouldBeRefreshedAndTheContentsEnteredShouldBeRemoved(String arg0) {
        waitTime(3);
        landing.verifyblockCustomerReset("");
    }

    @Then("{string} Toast message should be displayed")
    public void toastMessageShouldBeDisplayed(String toast) {
        handleToastByClass("toast-message", toast, "");

    }

    @Then("Mobile Number Field should not accept other than Numericals {string}")
    public void mobileNumberFieldShouldNotAcceptOtherThanNumericals(String chars) {
        String value = changeCommaToHash(chars, "");
        verifyTextBoxIsNotAcceptedUsingMultipleValuesUsingLocator(LandingPage.mobileNumInputBlocklistPage, value);
    }

    @And("Enters {string} in Block Customer Mobile Number Box")
    public void entersInBlockCustomerMobileNumberBox(String num) {
        typeIn(LandingPage.mobileNumInputBlockCustBlocklist,num);
    }

    @And("Verify the User Profile is {string}")
    public void verifyTheUserProfileIs(String user) {
        verifyGetTextUsingLocatorAndCompareWithText(LandingPage.userType,user,"");
    }

    @Then("User should be able to view {string} under landing page")
    public void userShouldBeAbleToViewUnderLandingPage(String opt) {
        verifyFieldsUsingCommonXpathAndMultipleTextWithHash("//ul[@class='navbar-ul']//li//a", opt, "");

    }


    @And("Verify User is able to view Below Options {string} for Search Customer By Dropdown")
    public void verifyUserIsAbleToViewBelowOptionsForSearchCustomerByDropdown(String opts) {

        findWebElement(LandingPage.searchDropdown).click();
        testStepScreenShot("");
        verifyGetAllOptionsInDropDownAndCompare(LandingPage.searchDropdown, opts);
    }


    @And("Selects {string} from Menu Tab of Landing Page")
    public void selectsFromMenuTabOfLandingPage(String cta) {
        clickOnButtonUsingXpathAndText("//li[@class='custom-others-toggle']//a",cta);
    }
}
