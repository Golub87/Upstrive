package TeacherPage;

import Base.BaseTestTeacher;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class CreatePollPage extends BaseTestTeacher {

public CreatePollPage() {
    PageFactory.initElements(driver, this);

}
    @FindBy (xpath = "//*[@id=\"home-container\"]/div/div/div[1]/div/div[3]")
    WebElement buttonPoll;

    @FindBy(xpath = "//input[@placeholder='Type headline here']")
    WebElement headlineInputField;

    @FindBy (xpath = "//textarea[@placeholder='Type any additional text here']")
    WebElement supportiveTextInputField;

    @FindBy (xpath = "//*[@id=\"home-container\"]/div/div/div[2]/div/div[2]/div[2]/div/div[1]/div/input")
    WebElement option1;

    @FindBy (css = "body > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)")
    WebElement option2;

    @FindBy (xpath = "//div[normalize-space()='Select target']")
    WebElement selectTarget;

    @FindBy (xpath = "//span[@class='ml-2']")
    WebElement favorites;

    @FindBy (xpath = "//span[normalize-space()='Test']")
    WebElement favoritesTest;

    @FindBy (xpath = "//div[@class='bg-deepPurple hover:bg-highlightColor text-highlightColor hover:text-deepPurple text-lg font-semibold items-center justify-center flex h-[65px] w-[120px] pointer uppercase rounded-full']")
    WebElement buttonOk;

    @FindBy (xpath = "//button[normalize-space()='Publish']")
    WebElement buttonPublish;

    @FindBy (xpath = "//div[@class='animate-enter max-w-md p-4 w-full rounded-xl pointer-events-auto flex']")
    WebElement notificationContentIsCreated;

    @FindBy (xpath = "//div[contains(@class,'flex flex-row justify-between items-center pointer bg-containerGray h-[40px] px-[15px] rounded-full')]//div[contains(@class,'rounded-full w-[40px] p-1 flex flex-row items-center switcher-animation bg-deselectPurple')]")
    WebElement scheduleButton;

    @FindBy (xpath = "//div[contains(@class,'flex flex-row items-center justify-between')]//div[contains(@class,'rounded-full w-[40px] p-1 flex flex-row items-center switcher-animation bg-deselectPurple')]")
    WebElement repeatButtonInSchedule;

    @FindBy (xpath = "//button[normalize-space()='Mon']")
    WebElement dayMonday;

    @FindBy (xpath = "//button[normalize-space()='Tue']")
    WebElement dayTuesday;

    @FindBy (xpath = "//button[normalize-space()='Wed']")
    WebElement dayWednesday;

    @FindBy (xpath = "//button[normalize-space()='Thu']")
    WebElement dayThursday;

    @FindBy (xpath = "//button[normalize-space()='Fri']")
    WebElement dayFriday;

    @FindBy (xpath = "//button[normalize-space()='Sat']")
    WebElement daySaturday;

    @FindBy (xpath = "//button[normalize-space()='Sun']")
    WebElement daySunday;

    @FindBy (xpath = "//p[contains(@class,'text-base text-[#413F5E] font-semibold')]")
    WebElement calendarEndDateInSchedule;

    @FindBy (xpath = "//button[@class='MuiButtonBase-root MuiPickersDay-root MuiPickersDay-dayWithMargin css-ub1r1']")
    List<WebElement> endDaysCalendarInSchedule;

    @FindBy (xpath = "//button[contains(@class,'bg-deepPurple hover:bg-highlightColor transition-all duration-300 ease-in-out rounded-full h-[50px] px-7 text-highlightColor hover:text-deepPurple font-semibold text-lg')]")
    WebElement continueScheduleButton;


    @FindBy (xpath = "//body/div/div[contains(@aria-hidden,'true')]/div/div/div/div/div/div/div/div/div[6]/button[1]/div[2]")
    WebElement buttonAddToAnalytics;

    @FindBy (xpath = "//span[normalize-space()='Test emotions and analitycs']")
    WebElement testEmotionsAndAnalytics;

    @FindBy (xpath = "//body//div//div[@role='dialog']//div//div//div//div//div//div//div[2]//button[2]//*[name()='svg']")
    WebElement rightArrowScheduleTime;

    public void rightArrowScheduleClick () {
        wdWait.until(ExpectedConditions.visibilityOf(rightArrowScheduleTime)).click();
    }



    public void testEmotionAndAnalyticsClick () {
        wdWait.until(ExpectedConditions.visibilityOf(testEmotionsAndAnalytics)).click();
    }

    public void buttonAddToAnalyticsClick () {
        wdWait.until(ExpectedConditions.visibilityOf(buttonAddToAnalytics)).click();
    }

    public void continueScheduleButtonClick () {
        wdWait.until(ExpectedConditions.visibilityOf(continueScheduleButton)).click();
    }

    public void endDaysCalendarInScheduleClick () {
        wdWait.until(ExpectedConditions.visibilityOfAllElements(endDaysCalendarInSchedule));
        int count = endDaysCalendarInSchedule.size();
        for (int i = 0; i<count; i++){
            String text = endDaysCalendarInSchedule.get(i).getText();
            if (text.equalsIgnoreCase("24")) {
                endDaysCalendarInSchedule.get(i).click();
                break;

            }
        }
    }

    public void calendarEndDateInScheduleClick () {
        wdWait.until(ExpectedConditions.visibilityOf(calendarEndDateInSchedule)).click();
    }

    public void dayMondayClick () {
        wdWait.until(ExpectedConditions.visibilityOf(dayMonday)).click();
    }

    public void dayTuesdayClick () {
        wdWait.until(ExpectedConditions.visibilityOf(dayTuesday)).click();
    }

    public void dayWednesdayClick () {
        wdWait.until(ExpectedConditions.visibilityOf(dayWednesday)).click();
    }

    public void dayThursdayClick () {
        wdWait.until(ExpectedConditions.visibilityOf(dayThursday)).click();
    }

    public void dayFridayClick () {
        wdWait.until(ExpectedConditions.visibilityOf(dayFriday)).click();
    }

    public void daySaturdayClick () {
        wdWait.until(ExpectedConditions.visibilityOf(daySaturday)).click();
    }

    public void daySundayClick () {
        wdWait.until(ExpectedConditions.visibilityOf(daySunday)).click();
    }



    public void repeatButtonInScheduleClick () {
        wdWait.until(ExpectedConditions.visibilityOf(repeatButtonInSchedule)).click();
    }


    public void scheduleButtonClick () {
        wdWait.until(ExpectedConditions.visibilityOf(scheduleButton)).click();
    }

    public boolean contentIsCreatedIsDisplayed () {
        wdWait.until(ExpectedConditions.visibilityOf(notificationContentIsCreated));
        return notificationContentIsCreated.isDisplayed();
    }

    public String contentIsCreatedGetText () {
        wdWait.until(ExpectedConditions.visibilityOf(notificationContentIsCreated));
        return notificationContentIsCreated.getText();
    }


    public void buttonPollClick () {
        wdWait.until(ExpectedConditions.visibilityOf(buttonPoll));
        buttonPoll.click();
    }

    public void headlineInputFieldSendKeys (String headline) {
        wdWait.until(ExpectedConditions.elementToBeClickable(headlineInputField)).clear();
        headlineInputField.sendKeys(headline);

    }

    public void supportiveTextInputFieldSendKeys (String text) {
        wdWait.until(ExpectedConditions.elementToBeClickable(supportiveTextInputField)).clear();
        supportiveTextInputField.sendKeys(text);
    }

    public void option1SendKeys (String text) {
        wdWait.until(ExpectedConditions.elementToBeClickable(option1)).clear();
        option1.sendKeys(text);

    }

    public void option2SendKeys (String text) {
        wdWait.until(ExpectedConditions.elementToBeClickable(option2)).clear();
        option2.sendKeys(text);

    }

    public void selectTargetClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(selectTarget));
        selectTarget.click();


    }

    public void selectFavoritesClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(favorites));
        favorites.click();

    }

    public void selectFavoritesTestClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(favoritesTest));
        favoritesTest.click();

    }

    public void buttonOkClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(buttonOk));
        buttonOk.click();
    }

    public void buttonPublishClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(buttonPublish));
        buttonPublish.click();
    }



}




