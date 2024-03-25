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

    @FindBy (xpath = "//div[contains(text(),'Assign action')]")
    WebElement assignAction;

    @FindBy (xpath = "//p[normalize-space()='Select teacher']")
    WebElement selectTeacher;

    @FindBy (xpath = "//input[contains(@placeholder,'Search')]")
    WebElement search;

    @FindBy (xpath = "//div[@class='feedback-teacher-item']")
    List<WebElement> teachers;

    @FindBy (xpath = "//textarea[contains(@placeholder,'Type an action')]")
    WebElement inputFieldAssignAction;

    @FindBy (xpath = "//p[normalize-space()='Submit']")
    WebElement submitAction;

    @FindBy (xpath = "//div[@class='animate-enter max-w-md p-4 w-full rounded-xl pointer-events-auto flex']")
    WebElement notification;

    @FindBy (xpath = "//textarea[@placeholder='Enter your note here']")
    WebElement noteInputField;

    @FindBy (xpath = "//div[contains(text(),'Add note')]")
    WebElement addNote;

    @FindBy (xpath = "//div[@class='feedback-modal-icon']")
    WebElement xButton;

    @FindBy (xpath = "//div[@class='wellprofile-bell']")
    WebElement addReminderButton;

    @FindBy (xpath = "//div[@class='reminder-submit']")
    WebElement doneButton;

    @FindBy (xpath = "//div[@data-tip='Edit reminder']")
    WebElement editReminder;

    @FindBy (xpath = "//div[@data-tip='Remove reminder']")
    WebElement removeReminder;


    @FindBy (xpath = "//button[normalize-space()='Ok']")
    WebElement confirmRemoveReminder;



    public void confirmRemoveReminder () {
        wdWait.until(ExpectedConditions.visibilityOf(confirmRemoveReminder)).click();
    }

    public void removeReminder () {
        wdWait.until(ExpectedConditions.visibilityOf(removeReminder)).click();
    }

    public void editReminder () {
        wdWait.until(ExpectedConditions.visibilityOf(editReminder)).click();
    }

    public void editNoteReminder () {
        wdWait.until(ExpectedConditions.visibilityOf(noteInputField));
        noteInputField.sendKeys(" AUTOMATION EDIT");
    }
    public void noteReminder () {
        wdWait.until(ExpectedConditions.visibilityOf(noteInputField)).clear();
        noteInputField.sendKeys("Automation add reminder");
    }
    public void doneButton () {
        wdWait.until(ExpectedConditions.visibilityOf(doneButton)).click();
    }

    public void addReminderButton () {
        wdWait.until(ExpectedConditions.visibilityOf(addReminderButton)).click();
    }

    public void xButton () {
        wdWait.until(ExpectedConditions.visibilityOf(xButton)).click();
    }



    public void addNoteButton () {
        wdWait.until(ExpectedConditions.visibilityOf(addNote)).click();
    }

    public void noteInputField () {
        wdWait.until(ExpectedConditions.visibilityOf(noteInputField)).clear();
        noteInputField.sendKeys("Automation add note");
    }

    public String notificationGetText () {
        wdWait.until(ExpectedConditions.visibilityOf(notification));
        return notification.getText();
    }
    public boolean notificationIsDisplayed () {
        wdWait.until(ExpectedConditions.visibilityOf(notification));
        return notification.isDisplayed();
    }

    public void assignAction () {
        wdWait.until(ExpectedConditions.visibilityOf(assignAction)).click();
    }

    public void selectTeacher () {
        wdWait.until(ExpectedConditions.visibilityOf(selectTeacher)).click();

    }

    public void searchTeacher () throws InterruptedException {
        wdWait.until(ExpectedConditions.visibilityOf(search)).clear();
        search.sendKeys("teacher");
        Thread.sleep(2000);
    }

    public void teacherTester (){
        wdWait.until(ExpectedConditions.visibilityOfAllElements(teachers));
        teachers.get(0).click();
    }

    public void inputField () {
        wdWait.until(ExpectedConditions.visibilityOf(inputFieldAssignAction)).clear();
        inputFieldAssignAction.sendKeys("Assign action from Wellbeing Tracker");

    }

    public void submitAction () {
        wdWait.until(ExpectedConditions.visibilityOf(submitAction)).click();
    }



    public void profileClick () {
        wdWait.until(ExpectedConditions.visibilityOfAllElements(wellbeingProfileCards));
        wellbeingProfileCards.get(0).click();

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
