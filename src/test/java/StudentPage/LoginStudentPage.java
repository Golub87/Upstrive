package StudentPage;

import Base.BaseTestStudent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginStudentPage extends BaseTestStudent {
    public LoginStudentPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//*[@id=\"home\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/form/div[1]/input")
    WebElement emailInputField;

    @FindBy (xpath = "//*[@id=\"home\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/form/div[2]/input")
    WebElement passwordInputField;

    @FindBy (xpath = "//*[@id=\"home\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/form/div[5]/button")
    WebElement loginButton;

    @FindBy (xpath = "//*[@id=\"home\"]/div/div/div/div[2]/div[2]/div[1]")
    WebElement upstriveLoginContainer;

    @FindBy (xpath = "//*[@id=\"home\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/form/div[3]/div[1]/input")
    WebElement showPassword;

    @FindBy (xpath = "//span[@class='login-missing-text-action']")
    WebElement requestNewPassword;

    @FindBy (xpath = "//*[@id=\"home\"]/div/div/div/div[2]/div[2]/div[3]/div/form/div[1]/input")
    WebElement emailForgotPassword;

    @FindBy (xpath = "//*[@id=\"home\"]/div/div/div/div[2]/div[2]/div[3]/div/form/div[3]/button")
    WebElement sendRequestButton;

    @FindBy (xpath = "//input[@placeholder='Password']")
    WebElement newPassword;

    @FindBy (xpath = "//input[@placeholder='Repeat password']")
    WebElement repeatNewPassword;

    @FindBy (xpath = "//button[@class='auth-form-button']")
    WebElement submitNewPassword;


    public void generatedPasswordInput (String token) {
        wdWait.until(ExpectedConditions.visibilityOf(passwordInputField)).clear();
        passwordInputField.clear();
        passwordInputField.sendKeys(token);

    }
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




    public void requestNewPasswordClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(requestNewPassword));
        requestNewPassword.click();
    }

    public void emailForgotPasswordSendKeys (String email) {
        wdWait.until(ExpectedConditions.visibilityOf(emailForgotPassword));
        emailForgotPassword.sendKeys(email);
    }

    public void sendRequestButtonClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(sendRequestButton));
        sendRequestButton.click();
    }
    public boolean passwordInputFieldIsDisplayed () {
        wdWait.until(ExpectedConditions.visibilityOf(passwordInputField));
        return passwordInputField.isDisplayed();
    }

    public String passwordInputFieldGetAtribute () {
        wdWait.until(ExpectedConditions.visibilityOf(passwordInputField));
        return passwordInputField.getAttribute("value");
    }


    public void showPasswordClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(showPassword));
        showPassword.click();
    }
    public boolean upstriveLoginContainerIsDisplayed () {
        wdWait.until(ExpectedConditions.visibilityOf(upstriveLoginContainer));
        return upstriveLoginContainer.isDisplayed();
    }

    public String upstriveLoginContainerGetText () {
        wdWait.until(ExpectedConditions.visibilityOf(upstriveLoginContainer));
        return upstriveLoginContainer.getText();
    }

    public void emailSendKeys (String email) {
        wdWait.until(ExpectedConditions.visibilityOf(emailInputField));
        emailInputField.sendKeys(email);

    }
    public void passwordSendKeys(String password) {
        wdWait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys(password);
    }

    public void loginButtonClick () {
        wdWait.until(ExpectedConditions.visibilityOf(loginButton));
        loginButton.click();
    }



}















