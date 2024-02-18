package TeacherPage;

import Base.BaseTestTeacher;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPageTeacher extends BaseTestTeacher {

    public LoginPageTeacher() {
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath = "//input[@placeholder='Email']")
    WebElement emailInputField;

    @FindBy (xpath = "//input[@placeholder='Password']")
    WebElement passwordInputField;

    @FindBy (xpath = "//button[@class='bg-highlightColor text-deepPurple py-3 text-lg font-semibold rounded-full w-full h-[50px] hover:bg-darkPurple hover:text-white duration-[250ms] ease-in-out transition-all flex items-center justify-center']")
    WebElement loginButton;

    @FindBy (xpath = "//span[@class='login-missing-text-action']")
    WebElement requestNewPassword;

    @FindBy (xpath = "//input[@placeholder='Email']")
    WebElement enterEmail;

    @FindBy (xpath = "//button[@class='auth-form-button text-deepPurple']")
    WebElement sendRequestNewPassword;

    @FindBy (xpath = "//input[@placeholder='Token']")
    WebElement tokenInputField;

    @FindBy (xpath = "//div[@class='text-sm text-deselectPurple text-left mt-2']//p[1]")
    WebElement notificationRequestedNewPassword;

    @FindBy (xpath = "//button[@class='auth-form-button text-deepPurple']")
    WebElement submitTokenButton;

    @FindBy (xpath = "//input[@placeholder='Password']")
    WebElement newPassword;

    @FindBy (xpath = "//input[@placeholder='Repeat password']")
    WebElement repeatNewPassword;

    @FindBy (xpath = "//button[@class='auth-form-button text-deepPurple']")
    WebElement submitNewPassword;



    public void submitNewPasswordClick () {
        wdWait.until(ExpectedConditions.visibilityOf(submitNewPassword)).click();
    }

    public void newPasswordSendKeys () {
        wdWait.until(ExpectedConditions.visibilityOf(newPassword));
        newPassword.sendKeys("Golub1987!");

    }

    public void repeatNewPasswordSendKeys () {
        wdWait.until(ExpectedConditions.visibilityOf(repeatNewPassword));
        repeatNewPassword.sendKeys("Golub1987!");
    }


    public void submitTokenButtonClick () {
        wdWait.until(ExpectedConditions.visibilityOf(submitTokenButton)).click();
    }
    public String notificationRequestedNewPasswordGetText () {
        wdWait.until(ExpectedConditions.visibilityOf(notificationRequestedNewPassword));
        return notificationRequestedNewPassword.getText();
    }
    public boolean notificationRequestedNewPasswordIsDisplayed () {
        wdWait.until(ExpectedConditions.visibilityOf(notificationRequestedNewPassword));
        return notificationRequestedNewPassword.isDisplayed();
    }


    public void tokenInputFieldSendKeys (String token) {
        wdWait.until(ExpectedConditions.visibilityOf(tokenInputField));
        tokenInputField.sendKeys(token);
    }
    public void sendRequestNewPasswordClick () {
        wdWait.until(ExpectedConditions.visibilityOf(sendRequestNewPassword));
        sendRequestNewPassword.click();
    }
    public void enterEmailSendKeys () {
        wdWait.until(ExpectedConditions.visibilityOf(enterEmail)).clear();
        enterEmail.sendKeys("us_test_t1@we-deliver.net");
    }

    public void requestNewPasswordClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(requestNewPassword));
        requestNewPassword.click();
    }
    public void emailSendKeys (String email){
        wdWait.until(ExpectedConditions.elementToBeClickable(emailInputField)).clear();
        emailInputField.sendKeys(email);

    }
    public void passwordSendKeys (String password){
        wdWait.until(ExpectedConditions.elementToBeClickable(passwordInputField)).clear();
        passwordInputField.sendKeys(password);

    }
    public void loginButtonClick (){
        wdWait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();

    }

}
