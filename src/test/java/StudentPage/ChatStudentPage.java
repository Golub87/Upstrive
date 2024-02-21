package StudentPage;

import Base.BaseTestStudent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

public class ChatStudentPage extends BaseTestStudent {
    public ChatStudentPage () {
        PageFactory.initElements(driver, this);
    }
@FindBy (xpath = "//div[@class='chat-name-text'][normalize-space()='Teacher Tester 1']")
    WebElement sendMessageTeacherT1;

@FindBy (xpath = "//*[@id=\"home\"]/div[2]/div[1]/div/div[2]/div/form/div/div/input")
    WebElement messageInputField;

@FindBy (xpath = "//*[name()='path' and contains(@d,'M10.6888 1')]")
    WebElement buttonSendMessage;

@FindBy (xpath = "//input[@placeholder='Search']")
WebElement searchFieldInChat;

@FindBy (xpath = "//div[@class='chat-name-text']")
WebElement searchResult;

@FindBy (xpath = "//div[@class='chat-name-text']")
List<WebElement> messengers;


public void assertSearch () {
    List<WebElement> filteredMessengers = messengers.stream().filter(messenger->messenger.getText().contains("Betty")).toList();
    Assert.assertEquals(messengers.size(), filteredMessengers.size());

}

public String searchResultGetText () {
    wdWait.until(ExpectedConditions.visibilityOf(searchResult));
    return searchResult.getText();
}

public void searchFieldInChatSendKeys () {
    wdWait.until(ExpectedConditions.visibilityOf(searchFieldInChat)).clear();
    searchFieldInChat.sendKeys("betty");
}

public void sendMessageTeacher1Click () {
    wdWait.until(ExpectedConditions.elementToBeClickable(sendMessageTeacherT1));
    sendMessageTeacherT1.click();
}

public void messageInputFieldSendKeys (String message) {
    wdWait.until(ExpectedConditions.visibilityOf(messageInputField));
    messageInputField.sendKeys(message);
}

public void buttonSendMessageClick () {
    wdWait.until(ExpectedConditions.visibilityOf(buttonSendMessage));
    buttonSendMessage.click();
}



}
