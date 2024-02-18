package TeacherPage;

import Base.BaseTestTeacher;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ChatTeacherPage extends BaseTestTeacher {

    public ChatTeacherPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy (xpath = "//span[normalize-space()='Student Tester']")
    WebElement messageStudentTester;

    @FindBy (xpath = "//input[@id='message_input']")
    WebElement messageInputField;

    @FindBy (xpath = "//img[@alt='Send']")
    WebElement buttonSendMessage;

    @FindBy (xpath = "//input[@placeholder='Search']")
    WebElement searchMessage;

    @FindBy (xpath = "//span[@class='flex-1']")
    WebElement searchResult;




    public String searchResultGetText () {
        wdWait.until(ExpectedConditions.visibilityOf(searchResult));
        return searchResult.getText();
    }

    public boolean searchResultIsDisplayed () {
        wdWait.until(ExpectedConditions.visibilityOf(searchResult));
        return searchResult.isDisplayed();
    }


    public void searchMessageSendKeys () {
        wdWait.until(ExpectedConditions.visibilityOf(searchMessage)).clear();
        searchMessage.sendKeys("james");
    }

    public void messageStudentTesterClick () {
        wdWait.until(ExpectedConditions.visibilityOf(messageStudentTester));
        messageStudentTester.click();
    }

    public void messageInputFieldSendKeys(String message) {
        wdWait.until(ExpectedConditions.visibilityOf(messageInputField)).clear();
        messageInputField.sendKeys(message);
    }

    public void buttonSendMessageClick () {
        wdWait.until(ExpectedConditions.visibilityOf(buttonSendMessage));
        buttonSendMessage.click();

    }

}


