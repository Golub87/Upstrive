package TeacherPage;

import Base.BaseTestTeacher;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class CatchUpPage extends BaseTestTeacher {
    public CatchUpPage () {
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//p[normalize-space()='Student Tester']")
    WebElement studentTester;

    @FindBy (xpath = "//p[normalize-space()='Assign action']")
    WebElement assignAction;

    @FindBy (xpath = "//p[normalize-space()='Select teacher']")
    WebElement selectTeacher;

    @FindBy (xpath = "//div[@class='w-full min-h-[50px] bg-white rounded-[5px] flex flex-row items-center justify-between mb-2 px-5 cursor-pointer border border-highlightColor hover:bg-highlightColor']")
    WebElement teacherTester2;

    @FindBy (xpath = "//textarea[contains(@placeholder,'Type an action')]")
    WebElement textInputField;

    @FindBy (xpath = "//p[normalize-space()='Submit']")
    WebElement submitButton;

    @FindBy (xpath = "//div[contains(@role,'dialog')]//div//div[contains(@class,'text-highlightColor font-bold text-xl')][normalize-space()='Action has been assigned to teacher']")
    WebElement notificationActionAssigned;

    @FindBy (xpath = "//input[@placeholder='Search students']")
    WebElement searchField;

    @FindBy (xpath = "//p[@class='catch-up-student-name']")
    WebElement searchResultMazalica;

    @FindBy (xpath = "//div[@class='feedback-modal-icon false']")
    WebElement xButtonStudent;

    @FindBy (xpath = "//div[@class='all-target-button catchup-filter-button  z-20 h-[50px] bg-[#FAFAFF] hover:bg-lightBG']")
    WebElement filterButton;
    @FindBy (xpath = "//p[contains(@class,'whitespace-nowrap')][normalize-space()='2-A']")
    WebElement select2A;

    @FindBy (xpath = "//button[contains(@class,'flex flex-row items-center justify-center rounded-full cursor-pointer h-10 flex-1 bg-highlightColor')]")
    WebElement applyButton;

    @FindBy (xpath = "//p[@class='catch-up-student-class']")
    List<WebElement> resultClassList;

    @FindBy (xpath = "//div[@class='feedback-modal-icon false']")
    WebElement xButtonCatchUp;

    public void xButtonCatchUpClick () {
        wdWait.until(ExpectedConditions.visibilityOf(xButtonCatchUp)).click();
    }


    public void applyButtonClick () {
        wdWait.until(ExpectedConditions.visibilityOf(applyButton)).click();
    }
    public void select2AClick () {
        wdWait.until(ExpectedConditions.visibilityOf(select2A)).click();
    }
    public void filterButtonClick () {
        wdWait.until(ExpectedConditions.visibilityOf(filterButton)).click();
    }

    public void xButtonStudentClick () {
        wdWait.until(ExpectedConditions.visibilityOf(xButtonStudent)).click();
    }

    public String searchResultMazalicaGetText () {
        wdWait.until(ExpectedConditions.visibilityOf(searchResultMazalica));
        return searchResultMazalica.getText();

    }
    public boolean searchResultMazalicaIsDisplayed () {
        wdWait.until(ExpectedConditions.visibilityOf(searchResultMazalica));
        return searchResultMazalica.isDisplayed();
    }

    public void searchFieldSendKeys () {
        wdWait.until(ExpectedConditions.visibilityOf(searchField)).clear();
        searchField.sendKeys("maza");
    }

    public void studentTesterClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(studentTester));
        studentTester.click();
    }

    public void assignActionClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(assignAction));
        assignAction.click();
    }

    public void selectTeacherClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(selectTeacher));
        selectTeacher.click();
    }

    public void teacherTester2Click () {
        wdWait.until(ExpectedConditions.elementToBeClickable(teacherTester2));
        teacherTester2.click();
    }

    public void textInputFieldSendKeys (String action) {
        wdWait.until(ExpectedConditions.elementToBeClickable(textInputField)).clear();
        textInputField.sendKeys(action);
    }

    public void submitButtonClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(submitButton));
        submitButton.click();
    }

    public boolean notificationActionAssignedIsDisplayed () {
        wdWait.until(ExpectedConditions.visibilityOf(notificationActionAssigned));
        return notificationActionAssigned.isDisplayed();
    }

    public String notificationActionAssignedGetText (){
        wdWait.until(ExpectedConditions.visibilityOf(notificationActionAssigned));
        return notificationActionAssigned.getText();
    }














}
