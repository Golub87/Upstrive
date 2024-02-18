package TeacherPage;

import Base.BaseTestTeacher;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class WebmailLoginPage extends BaseTestTeacher {
    public WebmailLoginPage() {

            PageFactory.initElements(driver, this);
    }


    @FindBy (id = "user")
    WebElement emailInputField;

    @FindBy (id = "pass")
    WebElement passwordInputField;

    @FindBy (id = "login_submit")
    WebElement loginButton;

    @FindBy (xpath = "//span[@class='subject']")
    WebElement emailFromUpstrive;

    @FindBy (xpath = "//*[@id=\"rcmrowMjA\"]/td[2]/span[4]/a")
    WebElement confirmMessage;

    @FindBy (xpath = "//*[@id=\"message-htmlpart1\"]/div/center/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table[3]/tbody/tr/td/div/div[5]/a/span")
    WebElement confirmLink;

    @FindBy (xpath = "//*[@id=\"remote-objects-message\"]/span[2]/a")
    WebElement buttonAllow;

    @FindBy (xpath= "//td[@class='subject']")
    List<WebElement> emailNewPassword;

    @FindBy (xpath ="//span[@class='v1button v1button--custom']")
    WebElement token;

    @FindBy (xpath = "//a[@onmouseover='rcube_webmail.long_subject_title(this,1)']")
    List<WebElement> emails;





    public void emailsClickFirst () {
        wdWait.until(ExpectedConditions.visibilityOfAllElements(emailNewPassword));
        emailNewPassword.get(0).click();
    }

    public String tokenGetText() {
        wdWait.until(ExpectedConditions.visibilityOf(token));
        return token.getText();

    }


    public void buttonAlowClick () {
        wdWait.until(ExpectedConditions.visibilityOf(buttonAllow));
        buttonAllow.click();
    }
    public boolean confirmLinkIsDisplayed () {
        wdWait.until(ExpectedConditions.visibilityOf(confirmLink));
        return confirmLink.isDisplayed();
    }

    public String confirmLinkGetText () {
        wdWait.until(ExpectedConditions.visibilityOf(confirmLink));
        return confirmLink.getText();
    }
    public void emailSendKeys (String email) {
        wdWait.until(ExpectedConditions.elementToBeClickable(emailInputField)).clear();
        emailInputField.sendKeys(email);
    }

    public void passwordSendKeys (String password) {
        wdWait.until(ExpectedConditions.elementToBeClickable(passwordInputField)).clear();
        passwordInputField.sendKeys(password);
    }

    public void loginButtonClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginButton.click();
    }

    public void emailFromUpstriveClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(emailFromUpstrive));
        emailFromUpstrive.click();
    }

    public boolean confirmMessageIsDisplayed () {
        wdWait.until(ExpectedConditions.visibilityOf(confirmMessage));
        return confirmMessage.isDisplayed();
    }

    public String confirmMessageGetText () {
        wdWait.until(ExpectedConditions.visibilityOf(confirmMessage));
        return confirmMessage.getText();
    }

}
