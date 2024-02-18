package TeacherPage;

import Base.BaseTestTeacher;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WellbeingTrackerPage extends BaseTestTeacher {

    public WellbeingTrackerPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//input[@placeholder='Search']")
    WebElement searchInputField;

    @FindBy (xpath = "//div[contains(@class,'well-tracker-container')]//div[contains(@class,'well-card-name')]//p[1]")
    WebElement searchResult;

    @FindBy (xpath = "//p[@class='text-center']")
    WebElement assignedActions;


    @FindBy (xpath = "//div[@class='well-reminder-container']//div[@class='well-tracker-list light-small-scroll']")
    WebElement wellbeingReminderContainer;


    @FindBy (xpath = "//body/div/div/div/div/div/div[2]/div[1]/div[2]/div[1]")
    WebElement studentTesterAssignedAction;


    public String studentTesterGetText () {
        wdWait.until(ExpectedConditions.visibilityOf(studentTesterAssignedAction));
        return studentTesterAssignedAction.getText();
    }

    public void wellbeingReminderContainerScrollDown () {
        wdWait.until(ExpectedConditions.visibilityOf(wellbeingReminderContainer));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        String script = "arguments[0].scrollTop = arguments[1];";
        jsExecutor.executeScript(script, wellbeingReminderContainer, 200);
    }

    public void assignedActionsClick () {
        wdWait.until(ExpectedConditions.visibilityOf(assignedActions)).click();
    }

    public String searchResultGetText () {
        wdWait.until(ExpectedConditions.visibilityOf(searchResult));
        return searchResult.getText();
    }
    public boolean searchResultIsDisplayed () {
        wdWait.until(ExpectedConditions.visibilityOf(searchResult));
        return searchResult.isDisplayed();
    }

    public void searchInputFieldSendKeys () {
        wdWait.until(ExpectedConditions.visibilityOf(searchInputField)).clear();
        searchInputField.sendKeys("student");
    }

}
