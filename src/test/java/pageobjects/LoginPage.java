package pageobjects;

import base.ApplicationKeywords;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends ApplicationKeywords {


    public static final String loginSection = "Login Section#xpath=//div[@class='login-form-bg-left']";
    public static final String domain_Dropdown = "Domain Dropdown#xpath=//select[contains(@class,'cust-input-box cust-select-box')]";
    public static final String userNameBox = "User Name Input Box#xpath=//input[contains(@placeholder,'Enter Username')]";
    public static final String passwordBox = "Password Input Box#xpath=//input[contains(@placeholder,'Enter Password')]";
    public static final String loginButton = "Login Button#xpath=//button[contains(@class,'login-bg-btn')]";

    public static final String accessUrl1 = "Access Url 1#xpath=(//a[normalize-space(text())='https://access360.bajajfinserv.in/'])[1]";
    public static final String azureUrl = "Azure Url #xpath=(//a[normalize-space(text())='https://dev.azure.com/BFLDevOpsOrg/IT%20Requests'])";
    public static final String serviceNowUrl = "Login Button#xpath=(//a[normalize-space(text())='https://bajajfinserv.service-now.com/bfl'])";
    public static final String bajajFinservLogo = "Bajaj Finserv Logo#xpath=//div[@class='logo-box']//img[contains(@src,'images/Bajaj_Finserv_Logo_Primary.png')]";

    public static final String profileIcon = "Profile Icon#xpath=//img[@class='user-profile-icon']";
    public static final String showPassword = "Show Password Logo#xpath=//img[contains(@src,'showPassword')]";
    public static final String otpText = "OTP Text#xpath=//p[@class='otpsent-desc']";


    public boolean isElementDisplayedWithWait(String locator) {
        boolean flag = false;
        try {
            WebElement element = findWebElement(locator);
            WebDriverWait wait = new WebDriverWait(driver, 2);
            wait.until(ExpectedConditions.visibilityOf(element));
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    public void logInPageRhs() {
        try {
            String rhs = "RHS Side of Login Page#xpath=//div[@class='login-contant-right-box']";
            String info = "RHS Side Info Points#xpath=//div[@class='portal-list-bgbox']";
            int size = sizeOfLocator(info);
            for (int i = 1; i <= size; i++) {
                String txtBox = "Info line " + i + "#xpath=(//div[@class='portal-list-bgbox'])[" + i + "]";
                String txtBoxLogo = "Info line Logo " + i + "#xpath=(//div[@class='portal-list-bgbox']/..//img)[" + i + "]";
                verifyElementIsDisplayedAndGetText(txtBox);
                verifyElementIsDisplayedOrNot(txtBoxLogo);
            }
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at log in Page Rhs" + e.getClass());
        }

    }

    public void logInPageLhs() {
        try {
            verifyElementIsDisplayedOrNot(LoginPage.loginSection);
            verifyElementIsDisplayedOrNot(bajajFinservLogo);
            verifyFieldDisplayedUsingTagAndText("h2", "Login to your account", "");
            verifyFieldsDisplayedUsingText("Kindly log in to gain access to your account.");
            verifyFieldDisplayedUsingTagAndText("label", "Domain", "");
            verifyElementIsDisplayedOrNot(domain_Dropdown);
            verifyElementIsDisplayedOrNot(userNameBox);
            verifyElementIsDisplayedOrNot(passwordBox);
            verifyFieldDisplayedUsingTagAndText("label", "Username", "");
            verifyFieldDisplayedUsingTagAndText("label", "Password", "");
            verifyElementIsDisplayedOrNot(LoginPage.loginButton);

        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed at log in Page Lhs " + e.getClass());
        }

    }



}
