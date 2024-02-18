package TeacherPage;

import Base.BaseTestTeacher;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GmailLoginPage extends BaseTestTeacher {

    public GmailLoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"identifierId\"]")
    WebElement emailInputField;

    @FindBy (xpath = "//*[@id=\"identifierNext\"]/div/button/span")
    WebElement nextButton;

    @FindBy(xpath = "//*[@id=\"password\"]/div[1]/div/div[1]/input")
    WebElement passwordInputField;

    @FindBy (xpath = "//button[@id='login_submit']")
    WebElement loginButton;


    public void emailInputFieldSendKeys (String email) {
        wdWait.until(ExpectedConditions.elementToBeClickable(emailInputField)).clear();
        emailInputField.sendKeys(email);
    }

    public void nextButtonClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(nextButton));
        nextButton.click();
    }
    public void passwordInputFieldSendKeys (String password) {
        wdWait.until(ExpectedConditions.elementToBeClickable(passwordInputField)).clear();
        passwordInputField.sendKeys(password);
    }

    public void loginButtonClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginButton.click();
    }















}