package TeacherPage;

import Base.BaseTestTeacher;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

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

    @FindBy (xpath = "//div[@class='well-tracker-addbutton']")
    WebElement addButton;

    @FindBy (css = "div[class='create-feedback-input'] input[placeholder='Search']")
    WebElement searchCreateWellProfile;

    @FindBy (xpath = "//div[@class='create-feedback-card']")
    List<WebElement> wellbeingProfiles;

    @FindBy (xpath = "//div[normalize-space()='Export data']")
    WebElement exportData;


    @FindBy (xpath = "//div[@class='well-tracker-card']")
    List<WebElement> wellbeingProfileCards;


    public void profileClick () {
        wdWait.until(ExpectedConditions.visibilityOfAllElements(wellbeingProfileCards));
        wellbeingProfileCards.get(1).click();

    }
    public void exportData () {
        wdWait.until(ExpectedConditions.visibilityOf(exportData)).click();


    }

    public void assertSearch () {
        List<WebElement> filteredWellbeingProfiles = wellbeingProfiles.stream().filter(wellbeingProfile->wellbeingProfile.getText().contains("Andrea")).toList();
        Assert.assertEquals(wellbeingProfiles.size(), filteredWellbeingProfiles.size());

    }

    public void searchCreateWellProfile () throws InterruptedException {
        wdWait.until(ExpectedConditions.visibilityOf(searchCreateWellProfile)).clear();
        searchCreateWellProfile.sendKeys("andrea");
        Thread.sleep(2000);
    }


    public void addButton () {
        wdWait.until(ExpectedConditions.visibilityOf(addButton)).click();
    }

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
