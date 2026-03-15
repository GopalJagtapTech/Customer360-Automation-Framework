package stepdefinitions;

import org.assertj.core.api.SoftAssertions;
import pageobjects.LandingPage;
import pageobjects.LoginPage;
import base.ApplicationKeywords;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import testdata.GOR;

public class LoginSteps extends ApplicationKeywords {

    LoginPage login;


    public LoginSteps() {
        login = new LoginPage();
    }


    @Given("User is on Customer {int} Login Page")
    public void userIsOnCustomerLoginPage(int arg0) {
        waitTime(2);
        redirectToUrl("https://customer360uat.bajajfinserv.in/", "");
        waitForPageToLoad();
    }


    @And("User should be able to see below Domains {string}")
    public void userShouldBeAbleToSeeBelowDomains(String opts) {
        verifyGetAllOptionsInDropDownAndCompare(LoginPage.domain_Dropdown, opts);

    }

    @And("User should select Domain {string}")
    public void userShouldSelectDomain(String domain) {
        selectDropDownUsingText(LoginPage.domain_Dropdown, domain);
    }

    @And("Verify RHS side of Login Page")
    public void verifyRHSSideOfLoginPage() {
        login.logInPageRhs();
    }

    @And("Customer clicks on First Access {int} Url")
    public void customerClicksOnFirstAccessUrl(int arg0) {
        clickOn(LoginPage.accessUrl1);
    }

    @Then("Verify Customer redirected to {string} Url")
    public void verifyCustomerRedirectedToUrl(String Url) {
        verifyRedirectionInCommon(Url, "");
    }

    @And("Customer clicks on Second Access {int} Url")
    public void customerClicksOnSecondAccessUrl(int arg0) {
//        clickOn(LoginPage.accessUrl2);

    }

    @Then("Verify Customer redirected to {string} Url in New Tab")
    public void verifyCustomerRedirectedToUrlInNewTab(String Url) {
        verifyRedirectioninNewTab(Url, "");
    }

    @Then("Verify User redirected to {string} Url in New Tab")
    public void verifyUserRedirectedToUrlInNewTab(String Url) {
        waitForPageToLoad();
        verifyRedirectioninNewTab(Url, "");
    }

    @And("Customer clicks on Service Now Url")
    public void customerClicksOnServiceNowUrl() {
        clickOn(LoginPage.serviceNowUrl);

    }

    @And("Verify LHS side of Login Page")
    public void verifyLHSSideOfLoginPage() {
        login.logInPageLhs();
    }

    @And("User should be able to select Domain {string}")
    public void userShouldBeAbleToSelectDomain(String opt) {
        selectDropDownUsingText(LoginPage.domain_Dropdown, opt);
        getSelectedOptionInDropDown(LoginPage.domain_Dropdown, opt);

    }

    @And("User should be able to enter the {string} in Username Box")
    public void userShouldBeAbleToEnterTheInUsernameBox(String values) {
        verifyTextBoxIsAcceptedUsingMultipleValuesUsingLocator(LoginPage.userNameBox, values);
    }

    @And("User should be able to enter the {string} in Password Box")
    public void userShouldBeAbleToEnterTheInPasswordBox(String values) {
        verifyTextBoxIsAcceptedUsingMultipleValuesUsingLocator(LoginPage.passwordBox, values);


    }

    @Then("User should be redirected to Landing Page {string}")
    public void userShouldBeRedirectedToLandingPage(String url) {

        verifyRedirectioninSameTabWithoutABack(url, "");
        boolean flag = false;
        flag = verifyFieldsDisplayedUsingLocator(LandingPage.cust360Logo);
        if (flag) {
            GOR.isLoggedIn = true;
        }

        if (!flag) {
            ApplicationKeywords.quitBrowser = true;
            GOR.login = false;
            SoftAssertions sa = new SoftAssertions();
            testStepFailed("Login is Unsuccessfull");
            sa.fail("Login is Unsuccessful");
            sa.assertAll();
        }

    }

    @And("User enters UserName {string}")
    public void userEntersUserName(String user) {

        typeInIfDisplayed(LoginPage.userNameBox, user);
    }

    @And("User enters Password {string}")
    public void userEntersPassword(String pwd) {
        typeInIfDisplayedMasked(LoginPage.passwordBox, pwd);

    }

    @And("Clicks on LogIn Button")
    public void clicksOnLogInButton() {
        clickOnIfDisplayed(LoginPage.loginButton);
        waitForPageToLoad();
    }


    @And("Customer clicks on Azure Url")
    public void customerClicksOnAzureUrl() {
        clickOn(LoginPage.azureUrl);
    }

    @And("Clicks on Profile Icon")
    public void clicksOnProfileIcon() {
        clickOn(LoginPage.profileIcon);
    }

    @Then("Verify Customer is Logged out")
    public void verifyCustomerIsLoggedOut() {
        verifyElementIsNotDisplayedUsingLocator(LoginPage.profileIcon);

    }

    @And("Verify the OTP Popup {string} for Login Page")
    public void verifyTheOTPPopupForLoginPage(String pop) {
        verifyPopupDisplayedUsingTagAndText("h2", pop, "");
    }

    @And("Verify First OTP should be triggered on user email {string}")
    public void verifyFirstOTPShouldBeTriggeredOnUserEmail(String text) {
        verifyPopupDisplayedUsingTagAndText("p", text, "");

    }

    @And("Verify Other Contents on Login Page OTP Popup")
    public void verifyOtherContentsOnLoginPageOTPPopup() {
        verifyOtpTextBoxes("otpValue", "");
        verifyElementIsDisplayedOrNot(LoginPage.showPassword);
        verifyButtonIsDisplayedInThePage("Resend OTP");
        verifyButtonIsDisplayedInThePage("Verify");
    }

    @And("Verify that the OTP sent should be of {int} digit only")
    public void verifyThatTheOTPSentShouldBeOfDigitOnly(int value) {
        verifyGetTextContainsIfPresent(LoginPage.otpText,"six digit code");
    }
}
