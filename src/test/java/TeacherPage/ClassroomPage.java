package TeacherPage;

import Base.BaseTestTeacher;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

public class ClassroomPage extends BaseTestTeacher {

    public ClassroomPage () {
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//p[contains(text(),'Nikola')]")
    WebElement studentNikolaGolubovic;

    @FindBy (xpath = "//p[normalize-space()='Send Message']")
    WebElement sendMessageClassroom;

    @FindBy (xpath = "//textarea[@placeholder='Write personal message for the student here']")
    WebElement inputFieldMessage;

    @FindBy (xpath = "//p[normalize-space()='Submit']")
    WebElement submitMessage;

    @FindBy (xpath = "//p[normalize-space()='Assign action']")
    WebElement assignAction;

    @FindBy (xpath = "//p[normalize-space()='Select teacher']")
    WebElement selectTeacher;

    @FindBy (xpath = "//body//div//div[contains(@role,'dialog')]//div//div//div//div//div//div[3]")
    WebElement teacher;

    @FindBy (xpath = "//textarea[contains(@placeholder,'Type an action')]")
    WebElement inputFieldAssignAction;

    @FindBy (xpath = "//p[normalize-space()='Submit']")
    WebElement submitAction;

    @FindBy (xpath = "//p[normalize-space()='I will take action']")
    WebElement buttonIWillTakeAction;


    @FindBy (xpath = "//div[contains(@role,'dialog')]//div//div[contains(@class,'animate-enter max-w-md p-4 w-full rounded-xl pointer-events-auto flex')]")
    WebElement notification;

    @FindBy (xpath = "//div[6]//div[2]//div[2]")
    WebElement studentMilenaNastasovic;

    @FindBy (xpath = "//div[6]//div[2]//div[3]")
    WebElement studentNemanjaP;

    @FindBy (xpath = "//textarea[@placeholder='Write your personal notes here (only you can see this)']")
    WebElement inputFieldIWillTakeAction;


    @FindBy (xpath = "//p[normalize-space()='Action taken']")
    WebElement actionTaken;

    @FindBy (xpath = "//div[@class='classroom-wellbeing-student' and contains(p, 'Student Tester')]")
    WebElement studentTester;

    @FindBy (xpath = "//input[@placeholder='Search']")
    WebElement searchInSelectTeacher;

    @FindBy (xpath = "//div[@class='w-full min-h-[50px] bg-white rounded-[5px] flex flex-row items-center justify-between mb-2 px-5 cursor-pointer border border-highlightColor hover:bg-highlightColor']")
    WebElement selectTeacherTester;

    @FindBy (xpath = "//input[@placeholder='Search for student']")
    WebElement searchInClassroom;

    @FindBy (xpath = "//div[@class='font-semibold text-[#5e639b] ease-out transition-all duration-200 bg-[#FAFAFF] min-h-[40px] px-[20px] rounded-full items-center justify-center flex border-[#bebece] border hover:border-[#5e639b] hover:bg-lightBG text-center']")
    WebElement moreDetailsButton;

    @FindBy (xpath = "//div[@class='all-target-button bg-[#FAFAFF] z-20 hover:bg-lightBG']")
    WebElement filterClassroomButton;

    @FindBy (xpath = "//div//div//div//div//div//div[5]//div[2]//div[1]//div[2]")
    WebElement yearOne;

    @FindBy (xpath = "//div[contains(@class,'bg-lightBG text-mudPurple')]//p[contains(@class,'whitespace-nowrap')][normalize-space()='1']")
    WebElement classOne;

    @FindBy (xpath = "//p[normalize-space()='Apply']")
    WebElement applyButton;

    @FindBy (xpath = "//button[@class='left-button-picker'][1]")
    WebElement leftButtonDayPicker;

    @FindBy (xpath = "//div[@class='classroom-emotions-dropdown bg-[#FAFAFF] hover:bg-lightBG']")
    WebElement emotionsDropDown;

    @FindBy (xpath = "//p[@class='text-[16px] leading-[20px] font-semibold text-mudPurple hover:text-darkenPurple pl-[15px] pt-[15px] capitalize ']")
    List<WebElement> emotionsFilter;

    @FindBy (xpath = "//div[@class='classroom-wellbeing-student']/img")
    List<WebElement> emotionsImage;

    @FindBy (xpath = "//div[@class='classroom-wellbeing-student']")
    List<WebElement> emotions;

    @FindBy (xpath = "//div[@class='feedback-modal-icon false']")
    WebElement xButtonClassroom;

    public void xButtonClassroomClick () {
        wdWait.until(ExpectedConditions.visibilityOf(xButtonClassroom)).click();
    }



    public void emotionsGetText () {
        wdWait.until(ExpectedConditions.visibilityOfAllElements(emotions));
        System.out.println(emotions.get(0).getAttribute("src"));
    }
    public void emotionsImageAssert () {
        wdWait.until(ExpectedConditions.visibilityOfAllElements(emotionsImage));
        for (WebElement emotionHappy: emotionsImage) {
            Assert.assertEquals(emotionHappy.getAttribute("src"), "https://web-staging.upstrivesystem.com/static/media/01-Happy.0277e14bd30fb25b00713558771eefd8.svg");
        }
    }

    public void emotionsFilterHappy () {
        wdWait.until(ExpectedConditions.visibilityOfAllElements(emotionsFilter));
        int countEmotions = emotionsFilter.size();
        for (int i = 0; i<countEmotions; i++) {
            String emotionHappy = emotionsFilter.get(i).getText();
            if (emotionHappy.equalsIgnoreCase("Happy")) {
                emotionsFilter.get(i).click();
                break;
            }
        }



    }
    public void emotionsDropDownSelect () {
        wdWait.until(ExpectedConditions.visibilityOf(emotionsDropDown)).click();

    }

    public void leftButtonDayPickerClick () {
        wdWait.until(ExpectedConditions.visibilityOf(leftButtonDayPicker)).click();


    }


    public void applyButtonClick () {
        wdWait.until(ExpectedConditions.visibilityOf(applyButton)).click();
    }


    public void classOneClick () {
        wdWait.until(ExpectedConditions.visibilityOf(classOne)).click();



    }
    public void yearOneClick () {
        wdWait.until(ExpectedConditions.visibilityOf(yearOne)).click();
    }


    public void filterClassroomButtonClick () {
        wdWait.until(ExpectedConditions.visibilityOf(filterClassroomButton)).click();
    }

    public void moreDetailsButtonClick () {
        wdWait.until(ExpectedConditions.visibilityOf(moreDetailsButton)).click();
    }

    public void searchInClassroomSendKeys () {
        wdWait.until(ExpectedConditions.visibilityOf(searchInClassroom)).clear();
        searchInClassroom.sendKeys("Nikola ");
    }

    public void studentTesterClick () {
        wdWait.until(ExpectedConditions.visibilityOf(studentTester)).click();
    }
    public void selectTeacherTesterClick () {
        wdWait.until(ExpectedConditions.visibilityOf(selectTeacherTester)).click();
    }
    public void searchInSelectTeacherSendKeys () {
        wdWait.until(ExpectedConditions.visibilityOf(searchInSelectTeacher)).clear();
        searchInSelectTeacher.sendKeys("teacher");
    }

    public boolean actionTakenIsDisplayed () {
        wdWait.until(ExpectedConditions.visibilityOf(actionTaken));
        return actionTaken.isDisplayed();
    }
    public String actionTakenGetText () {
        wdWait.until(ExpectedConditions.visibilityOf(actionTaken));
        return actionTaken.getText();
    }

    public void inputFieldIWillTakeActionSendKeys () {
        wdWait.until(ExpectedConditions.visibilityOf(inputFieldIWillTakeAction)).clear();
        inputFieldIWillTakeAction.sendKeys("Check I will take action from class section");
    }


    public void studentNemanjaPClick () {
        wdWait.until(ExpectedConditions.visibilityOf(studentNemanjaP)).click();
    }

    public void studentMilenaNastasovicClick () {
        wdWait.until(ExpectedConditions.visibilityOf(studentMilenaNastasovic));
        studentMilenaNastasovic.click();
    }

    public String notificationGetText () {
        wdWait.until(ExpectedConditions.visibilityOf(notification));
        return notification.getText();
    }
    public boolean notificationIsDisplayed () {
        wdWait.until(ExpectedConditions.visibilityOf(notification));
        return notification.isDisplayed();
    }
    public void studentNikolaGolubovicClick () {
        wdWait.until(ExpectedConditions.visibilityOf(studentNikolaGolubovic)).click();
    }

    public void sendMessageClassroomClick () {
        wdWait.until(ExpectedConditions.visibilityOf(sendMessageClassroom)).click();

    }

    public void inputFieldMessageSendKeys () {
        wdWait.until(ExpectedConditions.visibilityOf(inputFieldMessage)).clear();
        inputFieldMessage.sendKeys("Check send message from classroom");
    }

    public void submitMessageClick () {
        wdWait.until(ExpectedConditions.visibilityOf(submitMessage)).click();
    }

    public void assignActionClick () {
        wdWait.until(ExpectedConditions.visibilityOf(assignAction)).click();
    }

    public void selectTeacherClick () {
        wdWait.until(ExpectedConditions.visibilityOf(selectTeacher)).click();
    }

    public void teacherClick () {
        wdWait.until(ExpectedConditions.visibilityOf(teacher)).click();
    }

    public void inputFieldAssignActionSendKeys () {
        wdWait.until(ExpectedConditions.visibilityOf(inputFieldAssignAction)).clear();
        inputFieldAssignAction.sendKeys("Check assign action from classroom");
    }

    public void submitAction () {
        wdWait.until(ExpectedConditions.visibilityOf(submitAction)).click();
    }

    public void buttonIWillTakeActionClick () {
        wdWait.until(ExpectedConditions.visibilityOf(buttonIWillTakeAction)).click();
    }




}
