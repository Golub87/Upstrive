package TeacherPage;

import Base.BaseTestTeacher;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
public class Analytics extends BaseTestTeacher {

    public Analytics () {
        PageFactory.initElements(driver, this);
    }


    @FindBy (xpath = "//input[@placeholder='Search question']")
    WebElement searchQuestionField;

    @FindBy (xpath = "//p[@class='flex-1 text-[16px] leading-5 font-bold text-darkenPurple']")
    WebElement searchResult;

    @FindBy (xpath = "//button[@class='create-report-button-reversed']")
    WebElement createReport;


    @FindBy (xpath = "//input[@placeholder='Search report']")
    WebElement searchReportField;

    @FindBy (xpath = "//div[@class='flex-1 text-[#413F5E] font-bold text-[14px]']")
    WebElement searchResultReport;

    @FindBy (xpath = "//p[normalize-space()='Start date:']")
    WebElement calendarStartDate;

    @FindBy (xpath = "//p[normalize-space()='End date:']" )
    WebElement calendarEndDate;

    @FindBy (xpath = "//div[@class='MuiPickersCalendarHeader-label css-1v994a0']")
    WebElement monthAndYear;

    @FindBy (xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeSmall MuiPickersArrowSwitcher-button css-h1vjls']")
    WebElement arrowPreviousMonth;

    @FindBy (xpath = "//button[@fdprocessedid='amez78']")
    WebElement arrowNextMonth;

    @FindBy (xpath = "//button[@class='MuiButtonBase-root MuiPickersDay-root MuiPickersDay-dayWithMargin css-ub1r1']")
    List<WebElement> days;

    @FindBy (xpath = "//p[@class='text-[#413F5E] font-semibold text-[16px]']")
    List <WebElement> targetUsersYears;

    @FindBy (xpath = "//button[@class='h-[49px] filter-button hover:bg-[#ECEBF8] bg-[#F8F8FB]']")
    List <WebElement> userGenderOutput;

    @FindBy (xpath = "//p[normalize-space()='Create report']")
    WebElement createReportButton;

    @FindBy (xpath = "//input[@placeholder='Enter file name']")
    WebElement fileName;

    @FindBy (xpath = "//button[contains(@class,'px-[25px] min-w-[250px] h-[50px] text-white hover:bg-[#FDDF6D] hover:text-deepPurple')]")
    WebElement createReportButtonLastStep;

   @FindBy (xpath = "//p[normalize-space()='Male']")
   WebElement genderMale;

   @FindBy (xpath = "//p[normalize-space()='Female']")
   WebElement genderFemale;


   @FindBy (xpath = "//p[normalize-space()='Other']")
   WebElement genderOther;

    @FindBy (xpath = "//div[@class='w-[362px] bg-white rounded-[10px] flex flex-col overflow-hidden']")
    WebElement createReportsScroll;

    @FindBy (xpath = "//p[contains(@class,'text-center font-bold text-[30px] text-[#5E639B]')]")
    WebElement notificationReportCreated;

    @FindBy (xpath = "//button[contains(@class,'px-[25px] min-w-[250px] h-[50px] text-white hover:bg-[#FDDF6D] hover:text-deepPurple')]")
    WebElement closeButton;

    @FindBy (xpath = "//div[@class='h-[50px] px-[20px]  bg-deepPurple hover:bg-highlightColor text-highlightColor hover:text-deepPurple rounded-full flex items-center justify-center cursor-pointer ease-in-out duration-300']")
    WebElement getInsightsButton;

    @FindBy (xpath = "//a[@class='text-[14px] text-[#413F5E] ease-out transition-all duration-200 hover:underline']")
    WebElement addNewTrend;

    @FindBy (xpath = "//div[@class='w-[40px] analytics-trash-button']//*[name()='svg']")
    WebElement deleteTrendInAnalyticsButton;

    @FindBy (xpath = "//div[@class='border pointer flex items-center justify-center border-deleteRed text-deleteRed text-base font-semibold rounded-xl w-[250px] h-[55px] transition-all !duration-[250ms] ease-in-out hover:bg-deleteRed hover:text-white']")
    WebElement confirmDeleteTrendInAnalytics;

    @FindBy (xpath = "//div[@class='text-highlightColor font-bold text-xl']")
    WebElement notificationTrendDeleted;

    @FindBy (xpath = "//button[@class='report-format-item ']")
    WebElement pdfButton;

    public void pdfButtonClick () {
        wdWait.until(ExpectedConditions.visibilityOf(pdfButton)).click();
    }
    public String notificationTrendDeletedGetText () {
        wdWait.until(ExpectedConditions.visibilityOf(notificationTrendDeleted));
        return notificationTrendDeleted.getText();
    }

    public boolean notificationTrendDeletedIsDisplayed () {
        wdWait.until(ExpectedConditions.visibilityOf(notificationTrendDeleted));
        return notificationTrendDeleted.isDisplayed();
    }
    public void confirmDeleteTrendInAnalyticsClick () {
        wdWait.until(ExpectedConditions.visibilityOf(confirmDeleteTrendInAnalytics)).click();
    }

    public void searchFieldAnalyticsSendKeys () {
        wdWait.until(ExpectedConditions.visibilityOf(searchQuestionField)).clear();
        searchQuestionField.sendKeys("automation");

    }
    public void deleteTrendInAnalyticsButtonClick () {
        wdWait.until(ExpectedConditions.visibilityOf(deleteTrendInAnalyticsButton)).click();
    }

    public void addNewTrendClick () {
        wdWait.until(ExpectedConditions.visibilityOf(addNewTrend)).click();


    }

    public void getInsightsButtonClick () {
        wdWait.until(ExpectedConditions.visibilityOf(getInsightsButton)).click();
    }

    public void closeButtonClick () {
        wdWait.until(ExpectedConditions.visibilityOf(closeButton)).click();
    }
    public String notificationReportCreatedGetText () {
        wdWait.until(ExpectedConditions.visibilityOf(notificationReportCreated));
        return notificationReportCreated.getText();
    }

    public boolean notificationReportCreatedIsDisplayed () {
        wdWait.until(ExpectedConditions.visibilityOf(notificationReportCreated));
        return notificationReportCreated.isDisplayed();
    }


    public void genderMaleClick () {
        wdWait.until(ExpectedConditions.visibilityOf(genderMale)).click();
    }

    public void genderFemaleClick () {
        wdWait.until(ExpectedConditions.visibilityOf(genderFemale)).click();
    }

    public void genderOtherClick () {
        wdWait.until(ExpectedConditions.visibilityOf(genderOther)).click();
    }


    public void createReportsScrollDown () {
        wdWait.until(ExpectedConditions.visibilityOf(createReportsScroll));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        String script = "arguments[0].scrollTop = arguments[1];";
        jsExecutor.executeScript(script, createReportsScroll, 400);
    }



    public void genderSelect () {
        wdWait.until(ExpectedConditions.visibilityOfAllElements(userGenderOutput));
        int count = userGenderOutput.size();
        for (int i = 0; i < count; i++) {
            String text = userGenderOutput.get(i).getText();
            if (text.equalsIgnoreCase("Gender")) {
                userGenderOutput.get(i).click();
                break;

            }

        }

    }
    public void createReportButtonLastStepClick () {
        wdWait.until(ExpectedConditions.visibilityOf(createReportButtonLastStep)).click();
    }

    public void fileNameSendKeys () {
        wdWait.until(ExpectedConditions.visibilityOf(fileName)).clear();
        fileName.sendKeys("Automated report");
    }



    public void createReportButtonClick () {
        wdWait.until(ExpectedConditions.visibilityOf(createReportButton)).click();
    }


    public void targetUserYearsClick () {
        wdWait.until(ExpectedConditions.visibilityOfAllElements(targetUsersYears));
        int count = targetUsersYears.size();
        for (int i = 0; i < count; i++) {
            String text = targetUsersYears.get(i).getText();
            if (text.equalsIgnoreCase("Year 01")) {
                targetUsersYears.get(i).click();
            }
            if (text.equalsIgnoreCase("Year 02")) {
                targetUsersYears.get(i).click();
                break;
            }

        }


    }

    public void targetUserClick () {
        wdWait.until(ExpectedConditions.visibilityOfAllElements(userGenderOutput));
        int count = userGenderOutput.size();
        for (int i = 0; i < count; i++) {
            String text = userGenderOutput.get(i).getText();
            if (text.equalsIgnoreCase("Target users")) {
                userGenderOutput.get(i).click();
                break;

            }

        }
    }
    public void daysEndDateClick () {
        wdWait.until(ExpectedConditions.visibilityOfAllElements(days));
        int count = days.size();
        for (int i = 0; i<count; i++) {
            String text = days.get(i).getText();
            if (text.equalsIgnoreCase("25")) {
                days.get(i).click();
                break;

            }
        }



    }
    public void daysStartDateClick () {
        wdWait.until(ExpectedConditions.visibilityOfAllElements(days));
        int count = days.size();
        for (int i = 0; i<count; i++) {
            String text = days.get(i).getText();
            if (text.equalsIgnoreCase("1")) {
                days.get(i).click();
                break;

            }
        }

    }


    public void arrowNextMonthClick () {
        wdWait.until(ExpectedConditions.visibilityOf(arrowNextMonth)).click();
    }

    public void arrowPreviousMonthClick () {
        wdWait.until(ExpectedConditions.visibilityOf(arrowPreviousMonth));
        int repeatArrowClick = 3;
        for (int i = 0; i<repeatArrowClick; i++) {
            arrowPreviousMonth.click();
        }

    }
    public void calendarEndDateClick () {
        wdWait.until(ExpectedConditions.visibilityOf(calendarEndDate)).click();
    }
    public void calendarStartDateClick () {
        wdWait.until(ExpectedConditions.visibilityOf(calendarStartDate)).click();
    }

    public String searchResultReportGetText () {
        wdWait.until(ExpectedConditions.visibilityOf(searchResultReport));
        return searchResultReport.getText();
    }

    public void searchReportSendKeys () {
        wdWait.until(ExpectedConditions.visibilityOf(searchReportField)).clear();
        searchReportField.sendKeys("check");
    }

    public void createReportClick () {
        wdWait.until(ExpectedConditions.visibilityOf(createReport)).click();
    }

    public String searchResultGetText () {
        wdWait.until(ExpectedConditions.visibilityOf(searchResult));
        return searchResult.getText();
    }


    public void searchQuestionFieldSendKeys () {
        wdWait.until(ExpectedConditions.visibilityOf(searchQuestionField)).clear();
        searchQuestionField.sendKeys("much");
    }










}
