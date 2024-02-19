package StudentPage;

import Base.BaseTestStudent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SolutionsPage extends BaseTestStudent {
    public SolutionsPage () {
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//a[@href='/solutions/personal'] ")
    WebElement myselfbutton;

    public void myselfButtonClick () {
        wdWait.until(ExpectedConditions.visibilityOf(myselfbutton)).click();
    }


    @FindBy (xpath = "//input[@placeholder='Search']")
    WebElement searchField;

    public void searchFieldSendKeys () {
        wdWait.until(ExpectedConditions.visibilityOf(searchField)).clear();
        searchField.sendKeys("hate");

    }

    @FindBy (xpath = "//div[contains(text(),'Connect with counselor')]")
    WebElement connectWithTheCounselorButton;

    public void connectWithTheCounselorButtonClick () {
        wdWait.until(ExpectedConditions.visibilityOf(connectWithTheCounselorButton)).click();
    }

    @FindBy (xpath = "//input[@placeholder='Topic']")
    WebElement topicInputField;

    public void topicInputFieldSendKeys () {
        wdWait.until(ExpectedConditions.visibilityOf(topicInputField)).clear();
        topicInputField.sendKeys("Automation");
    }

    @FindBy (xpath = "//textarea[@placeholder='Message']")
    WebElement messageInputField;

    public void messageInputFieldSendKeys () {
        wdWait.until(ExpectedConditions.visibilityOf(messageInputField)).clear();
        messageInputField.sendKeys("Automation message to the Counselor sent from Solutions");
    }

    @FindBy (xpath = "//button[@class='contact-coach-send-button']")
    WebElement sendMessageButton;

    public void sendMessageButtonClick () {
        wdWait.until(ExpectedConditions.visibilityOf(sendMessageButton)).click();
    }

    @FindBy (xpath = "//div[@class='react-toast-notifications__toast__content css-1ad3zal']")
    WebElement notificationSolutions;

    public boolean notificationSolutionsIsDisplayed () {
        wdWait.until(ExpectedConditions.visibilityOf(notificationSolutions));
        return notificationSolutions.isDisplayed();
    }

    public String notificationSolutionsGetText () {
        wdWait.until(ExpectedConditions.visibilityOf(notificationSolutions));
        return notificationSolutions.getText();
    }

}
