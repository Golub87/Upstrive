package TeacherPage;

import Base.BaseTestTeacher;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

public class DashboardPage extends BaseTestTeacher {
    public DashboardPage () {
        PageFactory.initElements(driver, this);

    }

    @FindBy (xpath = "//div[contains(@class,'flex flex-col items-center h-[100vh] w-full')]")
    WebElement linkList;

    @FindBy (xpath = "//span[contains(@class,'px-3 flex justify-between items-center w-full ellipsis')]")
    WebElement createContent;

    @FindBy (xpath = "//*[@id=\"sideBar\"]/div/div[5]/div/div[1]/div[2]/div/div[2]/a[1]")
    WebElement createYourOwn;

    @FindBy (xpath = "//span[normalize-space()='Chat']")
    WebElement chat;

    @FindBy (xpath = "//*[@id=\"home-container\"]/div/div[1]/div[1]/div/div[2]/div[1]/button[2]")
    WebElement buttonResult;

    @FindBy (xpath = "//*[@id=\"c-scroll-inf-task\"]/div[1]/div/div[1]" )
    WebElement clickContent;
    @FindBy (xpath = "//div[contains(@class,'w-full p-5 rounded-xl mt-[15px] hover:border-darkenPurple border flex flex-col gap-[20px] border-containerGray pointer question-background')]//h2[@class='text-darkPurple font-bold text-base text-left max-w-xl'][normalize-space()='Automation testing']")
    WebElement clickContentQuestion;

    @FindBy (xpath = "//h2[normalize-space()='Automation testing']")
    WebElement clickContentPoll;

    @FindBy (xpath = "//span[normalize-space()='Delete']" )
    WebElement buttonDeleteContent;

    @FindBy (xpath = "//div[@class='border pointer flex items-center justify-center border-deleteRed text-deleteRed text-base font-semibold rounded-xl w-[250px] h-[55px] transition-all !duration-[250ms] ease-in-out hover:bg-deleteRed hover:text-white']")
    WebElement buttonConfirmDeleteContent;

    @FindBy (xpath = "//div[normalize-space()='Feed Posts']")
    WebElement buttonFeedPosts;

    @FindBy (id="delete-icon-0")
    WebElement xbuttonDeleteFeedPost;

    @FindBy (xpath = "//div[@class='border pointer flex items-center justify-center border-deleteRed text-deleteRed text-base font-semibold rounded-xl w-[250px] h-[55px] transition-all !duration-[250ms] ease-in-out hover:bg-deleteRed hover:text-white']")
    WebElement buttonConfirmDeleteFeedPost;

    @FindBy (xpath = "//*[@id=\"sideBar\"]/div/div[5]/div/div[1]/div[2]/div/div[2]/a[2]/div")
    WebElement readyToGo;

    @FindBy (xpath = "//*[@id=\"home-container\"]/div/div[1]")
    WebElement dashBoard;

    @FindBy (css = "body > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(6) > a:nth-child(1) > div:nth-child(1) > span:nth-child(2)")
    WebElement userManagement;

    @FindBy (xpath = "//*[@id=\"sideBar\"]/div/div[5]/div/div[1]/div[8]/a/div")
    WebElement catchUp;

    @FindBy (xpath = "//div[@class='text-highlightColor font-bold text-xl']")
    WebElement notificationContentDeleted;

    @FindBy (xpath = "//*[@id=\"sideBar\"]/div/div[5]/div/div[2]/div[1]/a/div")
    WebElement settingsButton;

    @FindBy (xpath = "//span[@class='px-3 cursor-pointer']")
    WebElement logoutButton;

    @FindBy (xpath = "//p[normalize-space()='Logout']")
    WebElement confirmLogout;

    @FindBy (xpath = "//*[@id=\"scroll-inf-feed\"]/div[2]/div/div[1]/div[2]/div/div[2]/div[4]")
    WebElement openLinkButton;

    @FindBy (xpath = "//img[@alt='inspired']")
    WebElement emotionInspired;

    @FindBy (xpath = "//p[normalize-space()='achievement']")
    WebElement achievement;


    @FindBy (xpath = "//textarea[@placeholder='Type any additional text here']")
    WebElement textField;

    @FindBy (xpath = "//p[@class='text-[18px] font-semibold text-highlightColor']")
    WebElement continueButton;

    @FindBy (xpath = "//div[@class=\"how-slider-thumb how-slider-thumb-0 \"]")
    WebElement sliderButton;

    @FindBy (xpath = "//p[normalize-space()='Continue']")
    WebElement continueButton1;

    @FindBy (xpath = "//textarea[@placeholder='Write your personal notes here (only you can see this)']")
    WebElement textFieldPersonalNotes;

    @FindBy (xpath = "//div[@class='how-compare-details-continue']")
    WebElement continueButton2;

    @FindBy (xpath = "//p[@class='how-are-you-save-text']")
    WebElement continueButton3;

    @FindBy (xpath = "//input[@class='new-secret-key-input']")
    WebElement secretKey;

    @FindBy (xpath = "//p[@class='new-secret-save-text']")
    WebElement saveSecretKey;

    @FindBy (id = "suggestion-0")
    WebElement suggestionInputField;

    @FindBy (id = "suggestion-1")
    WebElement suggestion1InputField;

    @FindBy (xpath = "//div[@class='how-suggestion-item']")
    WebElement suggestion;

    @FindBy (xpath = "//div[@class='text-highlightColor font-bold text-xl']")
    WebElement notification;

    @FindBy (xpath = "//p[@class='text-center text-[16px] leading-5']")
    WebElement myClassroom;

    @FindBy (xpath = "//div[contains(@class,'leading-[20px]')]")
    WebElement feedPostSeaarchResult;

    @FindBy (xpath = "//input[@placeholder='Search results']")
    WebElement searchFieldFeedPosts;

    @FindBy (css = "input[placeholder='Search results']")
    WebElement searchFieldResult;

    @FindBy (xpath = "//h2[@class='text-[#413F5E] font-bold text-base text-left max-w-xl']")
    WebElement searchResult;

    @FindBy (xpath = "//div[@class='p-4 w-full  flex flex-col justify-center']")
    WebElement searchedResultSurvey;

    @FindBy (xpath = "//div[contains(@class,'pointer rounded-full w-[56px] h-[56px] flex items-center justify-center border border-deselectPurple')]")
    WebElement surveyArrowInPopup;

    @FindBy (xpath = "//input[@placeholder='Search']")
    WebElement searchInsideSurvey;

    @FindBy (xpath = "//p[@class='text-[16px] font-bold text-deepPurple']")
    WebElement searchedStudentMilenaSurvey;

    @FindBy (xpath = "//div[@class='gray-small-scroll px-5']")
    WebElement surveyResultScroll;

    @FindBy (xpath = "//*[@id=\"sideBar\"]/div/div[5]/div/div[1]/div[7]/a/div/span")
    WebElement wellbeingTracker;

    @FindBy (xpath = "//div[@data-title='Analytics']")
    WebElement analyticsButton;

    @FindBy (xpath = "//div[@class='h-[40px] ml-2 flex pointer items-center justify-center  font-semibold px-3 py-1 rounded-full bg-containerGray text-mudPurple']")
    WebElement filterButton;

    @FindBy (xpath = "//div[contains(@class,'w-full relative')]//p[1]")
    WebElement calendarDateFromInFeedPosts;

    @FindBy (xpath = "//div[contains(@class,'dashboard-left-side flex-1 xxs:max-w-[96%] xl:max-w-[865px] mx-auto')]//p[2]")
    WebElement calendarDateToInFeedPosts;

    @FindBy (xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeSmall MuiPickersArrowSwitcher-button css-h1vjls']")
    WebElement arrowPreviousMonth;

    @FindBy (xpath = "//button[@fdprocessedid='amez78']")
    WebElement arrowNextMonth;

    @FindBy (xpath = "//button[@class='MuiButtonBase-root MuiPickersDay-root MuiPickersDay-dayWithMargin css-ub1r1']")
    List<WebElement> days;

    @FindBy (xpath = "//div[@class='MuiPickersCalendarHeader-label css-1v994a0']")
    WebElement monthAndYear;

    @FindBy (xpath = "//span[@class='text-sm font-medium  text-darkenPurple']")
    WebElement firstDateResult;

    @FindBy (xpath = "//div[@class='h-[40px] ml-2 flex pointer items-center justify-center  font-semibold px-3 py-1 rounded-full bg-lightBG text-deepPurple']")
    WebElement filterButtonInResult;

    @FindBy (xpath = "//div[@class='calendar-date-range-button']")
    WebElement calendarInResult;

    @FindBy (xpath = "//button[@class='calendar-day-cell']")
    List <WebElement> daysInResult;

    @FindBy (xpath = "//button[@class='calendar-header-arrow']//*[name()='svg']")
    WebElement arrowPreviousMonthInResult;

    @FindBy (xpath = "//div[@class='calendar-header-month-text']")
    WebElement monthAndYearInResult;

    @FindBy (xpath = "//button[@class='calendar-ok-button']")
    WebElement calendarOkButton;

    @FindBy (xpath = "//span[normalize-space()='08 Dec 2023']")
    WebElement filterResultDateInFeed;

    @FindBy (xpath = "//div[@class='rounded-full flex items-center justify-center gap-3 w-full h-[40px] px-2 bg-containerGray']")
    WebElement displayAllButton;


    @FindBy (xpath = "//p[contains(@class,'text-darkPurple font-semibold text-sm my-2 ml-2 ellipsis')][normalize-space()='Questions']")
    WebElement questionsButton;

    @FindBy (xpath = "//p[normalize-space()='Polls']")
    WebElement pollsButton;

    @FindBy (xpath = "//p[contains(@class,'text-darkPurple font-semibold text-sm my-2 ml-2 ellipsis')][normalize-space()='Surveys']")
    WebElement surveysButton;

    @FindBy (xpath = "text-darkenPurple font-medium text-sm mr-[50px]")
    List<WebElement> resultsFilterDisplayButton;

    @FindBy (xpath = "//div[@class='flex flex-row items-center gap-[6px] flex-1']")
    WebElement sampleGroup;

    @FindBy (xpath = "//div[@class='w-full flex flex-row items-center justify-center gap-1 bg-white h-[40px] mt-[15px] rounded-[47px] cursor-pointer']")
    WebElement createGroup;

    @FindBy (xpath = "//input[@placeholder='Name a new group']")
    WebElement nameNewGroup;

    @FindBy (xpath = "//div[@class='p-10 w-full flex flex-col']//div[1]//div[1]//img[1]")
    WebElement happyEmotikon;

    @FindBy (xpath = "//p[normalize-space()='All']")
    WebElement allYearsButton;

    @FindBy (xpath = "//div[@class='flex items-center justify-center bg-deepPurple h-[60px] w-[280px] m-auto cursor-pointer rounded-full']")
    WebElement continueButtonCreateGroup;

    @FindBy (xpath = "//div[@id='root']//div[contains(@class,'flex items-center justify-between mt-[25px]')]//div[3]//div[1]//p[1]")
    WebElement happySampleGroup;

    @FindBy (xpath = "//body/div/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div[1]/div[2]/div[3]/div[1]//*[name()='svg']//*[name()='path' and contains(@fill-rule,'evenodd')]")
    WebElement deleteSampleGroup;

    @FindBy (xpath = "//body/div/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div[1]/div[2]/div[3]/div[1]//*[name()='svg']//*[name()='path' and contains(@d,'M5.47632 7')]")
    WebElement editSampleGroup;

    @FindBy (xpath = "//p[@class='text-darkenPurple text-[16px] leading-[20px] font-semibold capitalize noselect opacity-50 hover:opacity-100'][normalize-space()='ecstatic']")
    WebElement ecstaticEmotikon;

    @FindBy (xpath = "//button[@class='pointer flex flex-row justify-between items-center hover:bg-lightBG bg-containerGray rounded-xl pr-[25px] pl-[17px] py-[17px] h-[50%] duration-[230ms] ease-in-out transition-all'] [2]")
    WebElement linkStudentChat;

    @FindBy (xpath = "//button[@class='pointer flex flex-row justify-between items-center hover:bg-lightBG bg-containerGray rounded-xl pr-[25px] pl-[17px] py-[17px] h-[50%] duration-[230ms] ease-in-out transition-all'] [1]")
    WebElement linkStudentActionsAssignedToMe;

    @FindBy (xpath = "//h2[@class='text-deepPurple font-bold text-3xl mt-3 text-left']")
    WebElement popupWindowTitle;

    @FindBy (xpath = "//body//div//div[contains(@aria-label,'Example Modal')]//div//div//div//div//div[1]//div[1]//div[3]//div[1]//div[1]")
    WebElement iWillTakeAction;

    @FindBy (xpath = "//textarea[@placeholder='Enter your note here']")
    WebElement actionNote;

    @FindBy (xpath = "//button[@class='wellprofile-paperplane']")
    WebElement confirmAction;

    @FindBy (xpath = "//button[@class='text-[#FDDF6D] pointer rounded-[100px] bg-[#5E639B] h-[50px] px-[15px] font-bold hover:bg-highlightColor hover:text-[#5E639B] duration-[230ms] ease-in-out transition-all']")
    WebElement analyticsButtonDashboard;

    @FindBy (css = ".ml-3")
    WebElement upcomingContent;

    @FindBy (xpath = "//div[normalize-space() = 'Create Your Own Content']")
    WebElement createYourOwnContentLink;

    @FindBy (xpath = "//div[normalize-space() = 'Run ready-to-go content']")
    WebElement runReadyToGoContentLink;

    @FindBy (xpath = "//body/div/div/div[@role='dialog']/div/div/div/div/div/div[1]/div[1]/div[2]//*[name()='svg'][2]")
    WebElement deleteUpcomingContent;

    @FindBy (xpath = "//body/div/div/div[@role='dialog']/div/div/div/div/div/div[1]/div[1]/div[2]//*[name()='svg'][1]")
    WebElement editUpcomingContent;

    @FindBy (css = ".border-deleteRed")
    WebElement confirmDeleteUpcomingContent;

    @FindBy (xpath = "//div[@class='rounded-[10px] h-full w-[190px] flex flex-col justify-between pointer p-[20px]']")
    WebElement commentsForReview;

    @FindBy (xpath = "//span[normalize-space()='Instruction Videos']")
    WebElement instructionVideos;

    @FindBy (xpath = "//button[normalize-space()='3 Months']")
    WebElement period3Months;

    @FindBy (xpath = "//div[@class='teacher-feedback-close-button']")
    WebElement feedbackCloseButton;


    @FindBy (xpath = "//div[@class='hover:bg-darkenPurple pointer absolute top-[10px] flex bg-deepPurple rounded-full w-[60px] h-[60px] justify-center items-center']")
    WebElement xButtonResult;

    @FindBy (xpath = "//div[@class='hover:bg-deepPurple pointer absolute top-[10px] flex bg-darkenPurple rounded-full w-[60px] h-[60px] justify-center items-center']")
    WebElement xButtonAssignedActionPopUp;

    @FindBy (xpath = "//a[contains(@href, '/content?editId=')]")
    List<WebElement> editFeedButtons;

    @FindBy (xpath = "//span[normalize-space()='Open Question']")
    List<WebElement> openQuestions;

    @FindBy (xpath = "//span[normalize-space()='Edit']")
    WebElement editButton;

    @FindBy (xpath = "//span[normalize-space()='Download']")
    WebElement downloadButton;

    @FindBy (xpath = "//span[normalize-space()='Stop']")
    WebElement stopButton;

    @FindBy (xpath = "//span[normalize-space()='Open Poll']")
    List<WebElement> openPolls;


    public void openPoll () {
        wdWait.until(ExpectedConditions.visibilityOfAllElements(openPolls));
        openPolls.get(0).click();

    }


    public boolean stopButtonIsNotDisplayed (){
        wdWait.until(ExpectedConditions.invisibilityOf(stopButton));
        return true;

    }

    public void stopButton () {
        wdWait.until(ExpectedConditions.visibilityOf(stopButton)).click();
    }

    public void downloadButton () {
        wdWait.until(ExpectedConditions.visibilityOf(downloadButton)).click();
    }
    public void editButton () {
        wdWait.until(ExpectedConditions.visibilityOf(editButton)).click();
    }

    public void openQuestions () {
        wdWait.until(ExpectedConditions.visibilityOfAllElements(openQuestions));
        openQuestions.get(0).click();
    }


    public void editFeedButton () {
        wdWait.until(ExpectedConditions.visibilityOfAllElements(editFeedButtons));
        editFeedButtons.get(0).click();
    }

    public void xButtonAssignedActionPopUpClick () {
        wdWait.until(ExpectedConditions.visibilityOf(xButtonAssignedActionPopUp)).click();
    }
    public void xButtonResultClick () {
        wdWait.until(ExpectedConditions.visibilityOf(xButtonResult)).click();
    }

    public void feedbackCloseButtonClick () {
        wdWait.until(ExpectedConditions.visibilityOf(feedbackCloseButton)).click();
    }

    public void period3MonthsClick () {
        wdWait.until(ExpectedConditions.visibilityOf(period3Months)).click();
    }

    public void instructionVideosClick () {
        wdWait.until(ExpectedConditions.visibilityOf(instructionVideos)).click();


    }

    public void commentsFroReviewClick () {
        wdWait.until(ExpectedConditions.visibilityOf(commentsForReview)).click();
    }



    public void deleteUpcomingContent () throws InterruptedException {
        wdWait.until(ExpectedConditions.visibilityOf(deleteUpcomingContent)).click();
        wdWait.until(ExpectedConditions.visibilityOf(confirmDeleteUpcomingContent)).click();




    }


    public void editUpcomingContentClick () throws InterruptedException {
        wdWait.until(ExpectedConditions.visibilityOf(editUpcomingContent)).click();



    }





    public void createReadyToGoContentLinkClick () throws InterruptedException {
        wdWait.until(ExpectedConditions.visibilityOf(runReadyToGoContentLink)).click();




    }

    public void createYourOwnContentLinkClick () throws InterruptedException {
        wdWait.until(ExpectedConditions.visibilityOf(createYourOwnContentLink)).click();
        Thread.sleep(2000);
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://web-staging.upstrivesystem.com/content";
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    public void upcomingContentClick () {
        wdWait.until(ExpectedConditions.visibilityOf(upcomingContent)).click();

    }


    public void analyticsButtonDashboardClick () {
        wdWait.until(ExpectedConditions.visibilityOf(analyticsButtonDashboard)).click();
    }


    public void confirmActionClick () {
        wdWait.until(ExpectedConditions.visibilityOf(confirmAction)).click();
    }
    public void actionNoteSendKeys () {
        wdWait.until(ExpectedConditions.visibilityOf(actionNote)).clear();
        actionNote.sendKeys("Automation action taken");

    }
    public void iWillTakeActionClick () {
        wdWait.until(ExpectedConditions.visibilityOf(iWillTakeAction)).click();
    }

    public boolean popupWindowTitleIsDisplayed () {
        wdWait.until(ExpectedConditions.visibilityOf(popupWindowTitle));
        return popupWindowTitle.isDisplayed();
    }
    public String popupWindowTitleGetText () {
        wdWait.until(ExpectedConditions.visibilityOf(popupWindowTitle));
        return popupWindowTitle.getText();
    }

    public void linkStudentChatClick () {
        wdWait.until(ExpectedConditions.visibilityOf(linkStudentChat)).click();
    }

    public void linkStudentActionsAssignedToMeClick () {
        wdWait.until(ExpectedConditions.visibilityOf(linkStudentActionsAssignedToMe)).click();
    }



    public void ecstaticEmotikonClick () {
        wdWait.until(ExpectedConditions.visibilityOf(ecstaticEmotikon)).click();


    }
    public void editSampleGroupClick () {
        wdWait.until(ExpectedConditions.visibilityOf(editSampleGroup)).click();
    }

    public void deleteSampleGroupClick () {
        wdWait.until(ExpectedConditions.visibilityOf(deleteSampleGroup)).click();
    }

    public void happySampleGroupHover () {
        wdWait.until(ExpectedConditions.visibilityOf(happySampleGroup));
        actions.moveToElement(happySampleGroup).build().perform();
    }

    public void continueButtonCreateGroupClick () {
        wdWait.until(ExpectedConditions.visibilityOf(continueButtonCreateGroup)).click();
    }
    public void allYearsButtonClick () {
        wdWait.until(ExpectedConditions.visibilityOf(allYearsButton)).click();
    }

    public void happyEmoticonClick () {
        wdWait.until(ExpectedConditions.visibilityOf(happyEmotikon)).click();

    }
    public void nameNewGroupSendKeys () {
        wdWait.until(ExpectedConditions.visibilityOf(nameNewGroup)).clear();
        nameNewGroup.sendKeys("Happy");
    }

    public void createGroupClick () {
        wdWait.until(ExpectedConditions.visibilityOf(createGroup)).click();

    }
    public void sampleGroupClick () {
        wdWait.until(ExpectedConditions.visibilityOf(sampleGroup)).click();
    }

    public void surveysButtonClick () {
        wdWait.until(ExpectedConditions.visibilityOf(surveysButton)).click();
    }

    public void pollsButtonClick () {
        wdWait.until(ExpectedConditions.visibilityOf(pollsButton)).click();

    }
    public void questionsButtonClick () {
        wdWait.until(ExpectedConditions.visibilityOf(questionsButton)).click();
    }

    public void displayAllButtonClick () {
        wdWait.until(ExpectedConditions.visibilityOf(displayAllButton)).click();
    }
    public String filterResultDateInFeedGetText () {
        wdWait.until(ExpectedConditions.visibilityOf(filterResultDateInFeed));
        return filterResultDateInFeed.getText();
    }

    public void calendarOkButtonClick () {
        wdWait.until(ExpectedConditions.visibilityOf(calendarOkButton)).click();
    }

    public void arrowPreviousMonthInResultClick () {
        wdWait.until(ExpectedConditions.visibilityOf(arrowPreviousMonthInResult));
        while (!monthAndYearInResult.getText().contains("December")){
            arrowPreviousMonthInResult.click();

        }

    }

    public void arrowPreviousMonth () throws InterruptedException {
        wdWait.until(ExpectedConditions.visibilityOf(arrowPreviousMonth));
        int repeatArrowClick = 3;
        for (int i =0; i<repeatArrowClick; i++) {
            arrowPreviousMonth.click();
        }
    Thread.sleep(2000);
    }

    public void daysToInResultClick () {
        wdWait.until(ExpectedConditions.visibilityOfAllElements(daysInResult));
        int count = daysInResult.size();
        for (int i = 0; i<count; i++) {
            String text = daysInResult.get(i).getText();
            if (text.equalsIgnoreCase("10")) {
                daysInResult.get(i).click();
                break;

            }
        }

    }
    public void daysFromInResultClick () {
        wdWait.until(ExpectedConditions.visibilityOfAllElements(daysInResult));
        int count = daysInResult.size();
        for (int i = 0; i<count; i++) {
            String text = daysInResult.get(i).getText();
            if (text.equalsIgnoreCase("6")) {
                daysInResult.get(i).click();
                break;

            }
        }

    }

    public void calendarInResultClick () {
        wdWait.until(ExpectedConditions.visibilityOf(calendarInResult)).click();
    }

    public void filterButtonInResultClick () {
        wdWait.until(ExpectedConditions.visibilityOf(filterButtonInResult)).click();
    }

    public String firstDateResultGetText () {
        wdWait.until(ExpectedConditions.visibilityOf(firstDateResult));
        return firstDateResult.getText();
    }


    public void arrowPreviousMonthClick () {
        wdWait.until(ExpectedConditions.visibilityOf(monthAndYear));
        while (!monthAndYear.getText().contains("December 2023")) {
            wdWait.until(ExpectedConditions.visibilityOf(arrowPreviousMonth)).click();
        }
    }
    public void daysEndDateClick () {
        wdWait.until(ExpectedConditions.visibilityOfAllElements(days));
        int count = days.size();
        for (int i = 0; i<count; i++) {
            String text = days.get(i).getText();
            if (text.equalsIgnoreCase("8")) {
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
            if (text.equalsIgnoreCase("4")) {
                days.get(i).click();
                break;

            }
        }

    }
    public void calendarDateFromInFeedPostsClick () {
        wdWait.until(ExpectedConditions.visibilityOf(calendarDateFromInFeedPosts)).click();
    }

    public void calendarDateToInFeedPostsClick () {
        wdWait.until(ExpectedConditions.visibilityOf(calendarDateToInFeedPosts)).click();
    }



    public void filterButtonClick () {
        wdWait.until(ExpectedConditions.visibilityOf(filterButton)).click();
    }

    public void analyticsButtonClick () {
        wdWait.until(ExpectedConditions.visibilityOf(analyticsButton)).click();
    }

    public void wellBeingTrackerClick () {
        wdWait.until(ExpectedConditions.visibilityOf(wellbeingTracker)).click();
    }

    public void surveyResultScrollDown () {
        wdWait.until(ExpectedConditions.visibilityOf(surveyResultScroll));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        String script = "arguments[0].scrollTop = arguments[1];";
        jsExecutor.executeScript(script, surveyResultScroll, 400);
    }

    public String searchedStudentMilenaSurveyGetText () {
        wdWait.until(ExpectedConditions.visibilityOf(searchedStudentMilenaSurvey));
        return searchedStudentMilenaSurvey.getText();
    }
    public boolean searchedResultMilenaSurveyIsDisplayed () {
        wdWait.until(ExpectedConditions.visibilityOf(searchedStudentMilenaSurvey));
        return searchedResultSurvey.isDisplayed();
    }

    public void searchInsideSurveySendKeys () {
        wdWait.until(ExpectedConditions.visibilityOf(searchInsideSurvey)).clear();
        searchInsideSurvey.sendKeys("milena");
    }

    public void surveyArrowInPopupClick () {
        wdWait.until(ExpectedConditions.visibilityOf(surveyArrowInPopup)).click();
    }

    public void searchedResultSurveyClick () {
        wdWait.until(ExpectedConditions.visibilityOf(searchedResultSurvey)).click();
    }

    public String searchResultGetText () {
        wdWait.until(ExpectedConditions.visibilityOf(searchResult));
        return searchResult.getText();
    }
    public boolean searchResultIsDisplayed () {
        wdWait.until(ExpectedConditions.visibilityOf(searchResult));
        return searchResult.isDisplayed();
    }
    public void searchFieldResultSendKeys () {
        wdWait.until(ExpectedConditions.visibilityOf(searchFieldResult)).clear();
        searchFieldResult.sendKeys("search");
    }
    public void searchFieldFeedPostsSendKeys () {
        wdWait.until(ExpectedConditions.visibilityOf(searchFieldFeedPosts)).clear();
        searchFieldFeedPosts.sendKeys("search ");
    }
    public boolean feedPostWhatDoesConfidenceMeanToYouIsDisplayed () {
        wdWait.until(ExpectedConditions.visibilityOf(feedPostSeaarchResult));
        return feedPostSeaarchResult.isDisplayed();
    }
    public String feedPostWhatDoesConfidenceMeanToYouGetText () {
        wdWait.until(ExpectedConditions.visibilityOf(feedPostSeaarchResult));
        return feedPostSeaarchResult.getText();
    }

    public void myClassroomClick () {
        wdWait.until(ExpectedConditions.visibilityOf(myClassroom)).click();
    }

    public boolean notificationPrivateNoteIsDisplayed () {
        wdWait.until(ExpectedConditions.visibilityOf(notification));
        return notification.isDisplayed();

    }

    public String notificationPrivateNoteGetText () {
        wdWait.until(ExpectedConditions.visibilityOf(notification));
        return notification.getText();
    }



    public void suggestionInputFieldSendKeys () {
        wdWait.until(ExpectedConditions.visibilityOf(suggestionInputField)).clear();
        suggestionInputField.sendKeys("Testing");
    }

    public void suggestion1InputFieldSendKeys () {
        wdWait.until(ExpectedConditions.visibilityOf(suggestion1InputField)).clear();
        suggestion1InputField.sendKeys("Automation testing");
    }

    public void suggestionClick () {
        wdWait.until(ExpectedConditions.visibilityOf(suggestion)).click();
    }


    public void saveSecretKeyClick () {
        wdWait.until(ExpectedConditions.visibilityOf(saveSecretKey)).click();
    }
    public void secretKeySendKeys () {
        wdWait.until(ExpectedConditions.visibilityOf(secretKey)).clear();
        secretKey.sendKeys("123");
    }

    public void emotionInspiredClick () {
        wdWait.until(ExpectedConditions.visibilityOf(emotionInspired)).click();
    }

    public void achievementClick () {
        wdWait.until(ExpectedConditions.visibilityOf(achievement));
        achievement.click();
    }

    public void textFieldSendKeys () {
        wdWait.until(ExpectedConditions.visibilityOf(textField)).clear();
        textField.sendKeys("Automation testing");
    }

    public void continueButtonClick () {
        wdWait.until(ExpectedConditions.visibilityOf(continueButton)).click();
    }

    public void sliderButtonDragAndDrop () {
        wdWait.until(ExpectedConditions.visibilityOf(sliderButton));
        actions.dragAndDropBy(sliderButton,100, 0 ).build().perform();
    }

    public void continueButton1Click () {
        wdWait.until(ExpectedConditions.visibilityOf(continueButton1)).click();
    }

    public void textFieldPersonalNotesSendKeys () {
        wdWait.until(ExpectedConditions.visibilityOf(textFieldPersonalNotes)).clear();
        textFieldPersonalNotes.sendKeys("Selenium");
    }

    public void continueButton2Click () {
        wdWait.until(ExpectedConditions.visibilityOf(continueButton2)).click();
    }

    public void continueButton3Click () {
        wdWait.until(ExpectedConditions.visibilityOf(continueButton3)).click();
    }
    public void openLinkButtonClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(openLinkButton));
        openLinkButton.click();
    }

    public void confirmLogoutClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(confirmLogout));
        confirmLogout.click();
    }


    public void logoutButtonClick () {
        wdWait.until(ExpectedConditions.visibilityOf(logoutButton));
        logoutButton.click();
    }


    public void settingsButtonClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(settingsButton));
        settingsButton.click();
    }

    public boolean contentDeletedIsDisplayed () {
        wdWait.until(ExpectedConditions.visibilityOf(notificationContentDeleted));
        return notificationContentDeleted.isDisplayed();
    }

    public String contentDeletedGetText () {
        wdWait.until(ExpectedConditions.visibilityOf(notificationContentDeleted));
        return notificationContentDeleted.getText();
    }




    public void catchUpClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(catchUp));
        catchUp.click();


    }
    public void linkListHover () {
        wdWait.until(ExpectedConditions.visibilityOf(linkList));
        actions.moveToElement(linkList).perform();
    }

        public void createContentClick () {
        wdWait.until(ExpectedConditions.visibilityOf(createContent));
        createContent.click();

        }

        public void createYourOwnClick () {
        wdWait.until(ExpectedConditions.visibilityOf(createYourOwn));
        createYourOwn.click();
        }

        public void chatClick () {
        wdWait.until(ExpectedConditions.visibilityOf(chat));
        chat.click();

        }

        public void buttonResultClick () {
        wdWait.until(ExpectedConditions.visibilityOf(buttonResult));
        buttonResult.click();
        }
        public void clickContent () {
        wdWait.until(ExpectedConditions.elementToBeClickable(clickContent));
        clickContent.click();
        }
        public void buttonDeleteContentClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(buttonDeleteContent));
        buttonDeleteContent.click();
        }

        public void buttonConfirmDeleteContentClick () {
        wdWait.until(ExpectedConditions.visibilityOf(buttonConfirmDeleteContent));
        buttonConfirmDeleteContent.click();
        }


        public void contentQuestionClick () {
        wdWait.until(ExpectedConditions.visibilityOf(clickContentQuestion));
        clickContentQuestion.click();
        }
        public void contentPollClick () {
        wdWait.until(ExpectedConditions.visibilityOf(clickContentPoll));
        clickContentPoll.click();
        }

        public void readyToGoClick () {
        wdWait.until(ExpectedConditions.visibilityOf(readyToGo));
        readyToGo.click();
        }

        public void dashBoardScrool () {
        wdWait.until(ExpectedConditions.visibilityOf(dashBoard));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        String script = "arguments[0].scrollTop = arguments[1];";
        jsExecutor.executeScript(script, dashBoard, 400);
        }

        public void feedPostsClick () {
        wdWait.until(ExpectedConditions.visibilityOf(buttonFeedPosts));
        buttonFeedPosts.click();
        }

        public void xButtonFeedPostsClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(xbuttonDeleteFeedPost));
        xbuttonDeleteFeedPost.click();
        }

        public void confirmDeletionFeedPostsClick () {
        wdWait.until(ExpectedConditions.visibilityOf(buttonConfirmDeleteFeedPost));
        buttonConfirmDeleteFeedPost.click();
        }

        public void userManagementClick () {
        wdWait.until(ExpectedConditions.visibilityOf(userManagement)).click();

        }

}
