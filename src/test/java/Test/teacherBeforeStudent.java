package Test;

import Base.BaseTestTeacher;
import Base.DataReader;
import Base.ExtentReporter;
import Base.Retry;
import TeacherPage.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class teacherBeforeStudent extends BaseTestTeacher {
    LoginPageTeacher loginPageTeacher;
    DashboardPage dashboardPage;
    CreateFeedPage createFeedPage;
    CreateQuestionPage createQuestionPage;
    CreatePollPage createPollPage;
    CreateSurveyPage createSurveyPage;
    ChatTeacherPage sendMessageTeacher;

    ReadyToGoContentPage readyToGoContentPage;

    UserManagementPage userManagementPage;

    GmailLoginPage gmailLoginPage;

    CatchUpPage catchUpPage;

    WebmailLoginPage webmailLoginPage;

    SettingsPage settingsPage;

    ClassroomPage classroomPage;

    WellbeingTrackerPage wellbeingTrackerPage;

    Analytics analytics;

    Listeners listeners;

    DataReader dataReader;

    ExtentReporter extentReporter;


    @BeforeMethod
    public void setUpPage() throws InterruptedException {
        loginPageTeacher = new LoginPageTeacher();
        dashboardPage = new DashboardPage();
        createFeedPage = new CreateFeedPage();
        createQuestionPage = new CreateQuestionPage();
        createPollPage = new CreatePollPage();
        createSurveyPage = new CreateSurveyPage();
        sendMessageTeacher = new ChatTeacherPage();
        readyToGoContentPage = new ReadyToGoContentPage();
        userManagementPage = new UserManagementPage();
        gmailLoginPage = new GmailLoginPage();
        catchUpPage = new CatchUpPage();
        webmailLoginPage = new WebmailLoginPage();
        settingsPage = new SettingsPage();
        classroomPage = new ClassroomPage();
        wellbeingTrackerPage = new WellbeingTrackerPage();
        analytics = new Analytics();
        listeners = new Listeners();
        dataReader = new DataReader();
        extentReporter = new ExtentReporter();

    }


    @Test (priority = 1, groups = "beforeStudent")
    public void loginAndLogout () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        Thread.sleep(1000);
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://web-staging.upstrivesystem.com/dashboard";
        Assert.assertEquals(expectedUrl, actualUrl);
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);

    }



    @Test (priority = 2, groups = "beforeStudent", retryAnalyzer = Retry.class)
    public void emotionTeacher () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        dashboardPage.emotionInspiredClick();
        dashboardPage.achievementClick();
        dashboardPage.textFieldSendKeys();
        dashboardPage.continueButtonClick();
        dashboardPage.sliderButtonDragAndDrop();
        dashboardPage.continueButton1Click();
        dashboardPage.secretKeySendKeys();
        dashboardPage.saveSecretKeyClick();
        Assert.assertTrue(dashboardPage.notificationPrivateNoteIsDisplayed());
        Assert.assertEquals(dashboardPage.notificationPrivateNoteGetText(), "Secret key has been saved");
        Thread.sleep(3000);
        dashboardPage.textFieldPersonalNotesSendKeys();
        dashboardPage.suggestionInputFieldSendKeys();
        dashboardPage.suggestion1InputFieldSendKeys();
        dashboardPage.suggestionClick();
        dashboardPage.continueButton2Click();
        dashboardPage.continueButton3Click();
        Assert.assertTrue(dashboardPage.notificationPrivateNoteIsDisplayed());
        Assert.assertEquals(dashboardPage.notificationPrivateNoteGetText(), "Private note has been saved");
        dashboardPage.feedbackCloseButtonClick();
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);



    }


    @Test (priority = 3, groups = "beforeStudent")
    public void deletePrivateNotes () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        dashboardPage.linkListHover();
        Thread.sleep(1000);
        dashboardPage.settingsButtonClick();
        settingsPage.inputFieldSecurityKeySendKeys("123");
        settingsPage.saveButtonClick();
        Assert.assertTrue(settingsPage.notificationsIsDisplayed());
        Assert.assertEquals(settingsPage.notificationsGetText(), "Secret key has been saved");
        Thread.sleep(4000);
        int repeatDeleteDailyNote = 1;
        int a;
        for (a=0; a<repeatDeleteDailyNote; a++)
        {
        settingsPage.dailyReviewClick();
        settingsPage.deletePrivateNoteClick();
        settingsPage.confirmDeletePrivateNotesClick();
        Thread.sleep(1000);
        Assert.assertTrue(settingsPage.notificationsIsDisplayed());
        Assert.assertEquals(settingsPage.notificationsGetText(), "Note has been deleted");
        }
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);

    }



    @Test (priority = 4, groups = "beforeStudent",  retryAnalyzer = Retry.class)
    public void createAndDeleteNewClass () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        dashboardPage.linkListHover();
        Thread.sleep(1000);
        dashboardPage.userManagementClick();
        userManagementPage.addNewClass();
        userManagementPage.classInputFieldSendKeys();
        userManagementPage.yearInputFieldSendKeys();
        userManagementPage.saveButtonClassClick();
        Assert.assertTrue(userManagementPage.notificationClassIsDisplayed());
        Assert.assertEquals(userManagementPage.notificationClassGetText(), "The class is made!");
        driver.navigate().refresh();
        userManagementPage.searchFieldClassSendKeys();
        Thread.sleep(2000);
        userManagementPage.deleteClassClick();
        userManagementPage.confirmDeleteClassClick();
        Assert.assertTrue(userManagementPage.notificationPopupClassDeletedIsDisplayed());
        userManagementPage.classDeletedClosePopupButtonClick();
        Thread.sleep(3000);
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);

    }



    @Test (priority = 5, groups = "beforeStudent")
    public void createContentFeed() throws InterruptedException, IOException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        dashboardPage.linkListHover();
            Thread.sleep(1000);
            dashboardPage.createContentClick();
            dashboardPage.createYourOwnClick();
            createFeedPage.headlineInputFieldSendKeys("Automation testing");
            createFeedPage.supportiveTextInputFieldSendKeys("Selenium");
            ((JavascriptExecutor) driver).executeScript("window.scrollBy (0,400)");
            createFeedPage.enterLinkSendKeys("https://www.youtube.com/");
            createFeedPage.selectTargetClick();
            createFeedPage.selectFavoritesClick();
            createFeedPage.selectFavoritesTestClick();
            createFeedPage.buttonOkClick();
            ((JavascriptExecutor) driver).executeScript("window.scrollBy (0,400)");
            createFeedPage.uploadPhotoVideoClick();
            Thread.sleep(3000);
            Runtime.getRuntime().exec("E:\\AutoIt files\\uploadImageFeedUpstrive.exe");
            Thread.sleep(1000);
            createFeedPage.buttonPublishClick();
            Assert.assertTrue(createFeedPage.contentIsCreatedIsDisplayed());
            Assert.assertEquals(createFeedPage.contentIsCreatedGetText(), "Content is created!");
            //Thread.sleep(1000);
            driver.navigate().refresh();
            dashboardPage.feedPostsClick();
            dashboardPage.openLinkButtonClick();
            Set<String> handles = driver.getWindowHandles();
            List<String> handlesList = new ArrayList<>(handles);
            driver.switchTo().window(handlesList.get(1));
            String actualUrl = driver.getCurrentUrl();
            String expectedUrl = "https://www.youtube.com/";
            Thread.sleep(1000);
            Assert.assertEquals(actualUrl, expectedUrl);
            driver.switchTo().window(handlesList.get(0));
            Thread.sleep(1000);
            dashboardPage.linkListHover();
            dashboardPage.logoutButtonClick();
            dashboardPage.confirmLogoutClick();
            Thread.sleep(1000);
            String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
            String actualUrl1 = driver.getCurrentUrl();
            Assert.assertEquals(expectedUrl1, actualUrl1);

    }




    @Test (priority = 6, groups = "beforeStudent", retryAnalyzer = Retry.class)
    public void createProgram() throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        dashboardPage.linkListHover();
        Thread.sleep(1000);
        dashboardPage.createContentClick();
        dashboardPage.readyToGoClick();
        readyToGoContentPage.programsClick();
        ((JavascriptExecutor) driver).executeScript("window.scrollBy (0,400)");
        //readyToGoContentPage.readyToGoPageScrool();
        readyToGoContentPage.programsGratitudeUpstrivedClick();
        readyToGoContentPage.runProgramClick();
        readyToGoContentPage.selectTargetClick();
        readyToGoContentPage.selectFavoritesClick();
        readyToGoContentPage.selectFavoritesTestClick();
        readyToGoContentPage.buttonOkClick();
        readyToGoContentPage.dayMondayClick();
        readyToGoContentPage.runProgramButtonClick();
        try {
            readyToGoContentPage.programRunningOkButtonClick();
            Assert.assertTrue(readyToGoContentPage.contentIsCreatedIsDisplayed());
            Assert.assertEquals(readyToGoContentPage.contentIsCreatedGetText(), "You successfully run this program");
        } catch (Exception e){System.out.println("Program is not running");}
        readyToGoContentPage.readyToGoPageScroolUp();
        readyToGoContentPage.surveyReadyToGoClick();
        readyToGoContentPage.readyToGoPageScrool();
        readyToGoContentPage.resilienceSurveyReadyToGoClick();
        readyToGoContentPage.readyToGoPageScrool();
        readyToGoContentPage.selectTargetReadyToGoClick();
        readyToGoContentPage.selectFavoritesReadyToGoClick();
        readyToGoContentPage.selectTestReadyToGoClick();
        readyToGoContentPage.buttonOkReadyToGoClick();
        Thread.sleep(2000);
        readyToGoContentPage.runSurveyReadyToGoClick();
        Assert.assertTrue(readyToGoContentPage.contentIsCreatedIsDisplayed());
        Assert.assertEquals(readyToGoContentPage.contentIsCreatedGetText(), "Survey is created");
        dashboardPage.linkListHover();
        Thread.sleep(1000);
        dashboardPage.createContentClick();
        dashboardPage.readyToGoClick();
        readyToGoContentPage.manageRuningProgramClick();
        readyToGoContentPage.manageProgramsHover();
        readyToGoContentPage.deleteProgramButtonClick();
        readyToGoContentPage.confirmDeletionProgramClick();
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);


    }


    @Test (priority = 7, groups = "beforeStudent")
    public void createContentPoll() throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        dashboardPage.linkListHover();
        Thread.sleep(1000);
        dashboardPage.createContentClick();
        dashboardPage.createYourOwnClick();
        createPollPage.buttonPollClick();
        createPollPage.headlineInputFieldSendKeys("Automation Poll");
        createPollPage.supportiveTextInputFieldSendKeys("Selenium");
        ((JavascriptExecutor) driver).executeScript("window.scrollBy (0,400)");
        createPollPage.option1SendKeys("Yes");
        createPollPage.option2SendKeys("No");
        createPollPage.selectTargetClick();
        createPollPage.selectFavoritesClick();
        createPollPage.selectFavoritesTestClick();
        createPollPage.buttonOkClick();
        Thread.sleep(1000);
        createPollPage.buttonPublishClick();
        Assert.assertTrue(createFeedPage.contentIsCreatedIsDisplayed());
        Assert.assertEquals( createFeedPage.contentIsCreatedGetText(), "Content is created!");
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);

}
    @Test (priority = 8, groups = "beforeStudent")
    public void createContentQuestion() throws InterruptedException, IOException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        dashboardPage.linkListHover();
        Thread.sleep(1000);
        dashboardPage.createContentClick();
        dashboardPage.createYourOwnClick();
        createQuestionPage.buttonQuestionClick();
        createQuestionPage.headlineInputFieldSendKeys("Automation question");
        createQuestionPage.supportiveTextInputFieldSendKeys("Selenium");
        ((JavascriptExecutor) driver).executeScript("window.scrollBy (0,400)");
        createQuestionPage.selectTargetClick();
        createQuestionPage.selectFavoritesClick();
        createQuestionPage.selectFavoritesTestClick();
        createQuestionPage.buttonOkClick();
        Thread.sleep(1000);
        createQuestionPage.buttonPublishClick();
        Assert.assertTrue(createFeedPage.contentIsCreatedIsDisplayed());
        Assert.assertEquals("Content is created!", createFeedPage.contentIsCreatedGetText());
        //File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       // FileUtils.copyFile(src,new File("E:\UpStriveGMBH\src\test\Images\Image.png"));
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);



    }
    @Test (priority = 9, groups = "beforeStudent")
        public void createContentSurvey() throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        dashboardPage.linkListHover();
        Thread.sleep(1000);
        dashboardPage.createContentClick();
        dashboardPage.createYourOwnClick();
        createSurveyPage.buttonSurveyClick();
        createSurveyPage.headlineInputFieldSendKeys("Automation Survey");
        createSurveyPage.supportiveTextInputFieldSendKeys("Selenium");
        createSurveyPage.headLineSection1InputFieldSendKeys("WELLBEING");
        ((JavascriptExecutor) driver).executeScript("window.scrollBy (-0,400)");
        createSurveyPage.question1SendKeys("Are you ok?");
        ((JavascriptExecutor) driver).executeScript("window.scrollBy (-0,400)");
        createSurveyPage.selectTargetClick();
        createSurveyPage.selectFavoritesClick();
        createSurveyPage.selectFavoritesTestClick();
        createSurveyPage.buttonOkClick();
        ((JavascriptExecutor) driver).executeScript("window.scrollBy (-0,400)");
        Thread.sleep(1000);
        createSurveyPage.buttonPublishClick();
        Assert.assertTrue(createFeedPage.contentIsCreatedIsDisplayed());
        Assert.assertEquals( createFeedPage.contentIsCreatedGetText(), "Content is created!");
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);

}

    @Test (priority = 10, groups = "beforeStudent")
    public void sendMessageStudentS1() throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        dashboardPage.linkListHover();
        Thread.sleep(1000);
        dashboardPage.chatClick();
        sendMessageTeacher.messageStudentTesterClick();
        sendMessageTeacher.messageInputFieldSendKeys("Automated message");
        sendMessageTeacher.buttonSendMessageClick();
        Thread.sleep(2000);
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);

    }




    @Test (priority = 11, groups = "beforeStudent")
        public void createStudent () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        dashboardPage.linkListHover();
        Thread.sleep(1000);
        dashboardPage.userManagementClick();
        userManagementPage.addNewClass();
        userManagementPage.classInputFieldSendKeys();
        userManagementPage.yearInputFieldSendKeys();
        userManagementPage.saveButtonClassClick();
        Assert.assertTrue(userManagementPage.notificationClassIsDisplayed());
        Assert.assertEquals(userManagementPage.notificationClassGetText(), "The class is made!");
        driver.navigate().refresh();
        userManagementPage.searchFieldClassSendKeys();
        Thread.sleep(1000);
        userManagementPage.arrowDownButtonClick();
        userManagementPage.addStudentClick();
        userManagementPage.enterNameSendKeys("Nikola");
        userManagementPage.enterSurnameSendKeys("Golubovic");
        userManagementPage.enterEmailSendKeys("nikola87.golubovic+101@gmail.com");
        Thread.sleep(1000);
        userManagementPage.saveButtonClick();
        Assert.assertTrue(userManagementPage.notificationDataIsSavedIsDisplayed());
        Thread.sleep(1000);
        Assert.assertEquals(userManagementPage.notificationDataIsSavedGetText(),"Data is saved");
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);


    }


    @Test (priority = 12, groups = "beforeStudent")
        public void createStudentWithPassword () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        dashboardPage.linkListHover();
        Thread.sleep(1000);
        dashboardPage.userManagementClick();
        userManagementPage.searchFieldClassSendKeys();
        Thread.sleep(1000);
        userManagementPage.arrowDownButtonClick();
        userManagementPage.addStudentClick();
        userManagementPage.enterNameSendKeys("Maksa");
        userManagementPage.enterSurnameSendKeys("Mayer");
        userManagementPage.enterEmailSendKeys("nikola87.golubovic+102@gmail.com");
        Thread.sleep(1000);
        userManagementPage.studentInfoScroll();
        userManagementPage.setStudentPasswordManuallyClick();
        userManagementPage.studentInfoScroll();
        userManagementPage.passwordAddStudentSendKeys("123");
        userManagementPage.repeatPasswordAddStudentSendKeys("123");
        userManagementPage.saveButtonClick();
        Assert.assertTrue(userManagementPage.notificationDataIsSavedIsDisplayed());
        Thread.sleep(1000);
        Assert.assertEquals(userManagementPage.notificationDataIsSavedGetText(),"Data is saved");
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);


    }

    @Test (priority = 13, groups = "beforeStudent")
    public void createStudentToSetPasswordTheirOwn() throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        dashboardPage.linkListHover();
        Thread.sleep(1000);
        dashboardPage.userManagementClick();
        userManagementPage.searchFieldClassSendKeys();
        Thread.sleep(1000);
        userManagementPage.arrowDownButtonClick();
        userManagementPage.addStudentClick();
        Thread.sleep(1000);
        userManagementPage.enterNameSendKeys("Dule");
        userManagementPage.enterSurnameSendKeys("Radovic");
        userManagementPage.enterEmailSendKeys("nikola87.golubovic+103@gmail.com");
        Thread.sleep(1000);
        userManagementPage.studentInfoScroll();
        userManagementPage.setStudentPasswordManuallyClick();
        userManagementPage.studentInfoScroll();
        userManagementPage.letThemSetTheirOwnPasswordClick();
        userManagementPage.passwordAddStudentSendKeys("123");
        userManagementPage.repeatPasswordAddStudentSendKeys("123");
        userManagementPage.saveButtonClick();
        Assert.assertTrue(userManagementPage.notificationDataIsSavedIsDisplayed());
        Thread.sleep(1000);
        Assert.assertEquals(userManagementPage.notificationDataIsSavedGetText(),"Data is saved");
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);
    }

    @Test (priority = 14, groups = "beforeStudent")
    public void generateNewPasswordStudent () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        dashboardPage.linkListHover();
        Thread.sleep(1000);
        dashboardPage.userManagementClick();
        userManagementPage.searchFieldClassSendKeys();
        Thread.sleep(2000);
        userManagementPage.arrowDownButtonClick();
        userManagementPage.studentNikolaGolubovicClick();
        userManagementPage.studentInfoScroll();
        userManagementPage.generateNewPasswordClick();
        userManagementPage.confirmGeneratePasswordClick();
        Assert.assertTrue(userManagementPage.newPasswordGeneratedIsDisplayed());
        Thread.sleep(1000);
        Assert.assertEquals(userManagementPage.newPasswordGeneratedGetText(), "New password is generated");
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);


}

        @Test (priority = 15)
        public void transferStudent () throws InterruptedException {
            loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
            loginPageTeacher.passwordSendKeys("Golub1987!");
            loginPageTeacher.loginButtonClick();
            dashboardPage.linkListHover();
            Thread.sleep(1000);
            dashboardPage.userManagementClick();
            userManagementPage.searchFieldClassSendKeys();
            Thread.sleep(2000);
            userManagementPage.arrowDownButtonClick();
            userManagementPage.studentNikolaGolubovicClick();
            userManagementPage.transferToAnotherClassClick();
            userManagementPage.selectClassClick();
            dashboardPage.linkListHover();
            dashboardPage.logoutButtonClick();
            dashboardPage.confirmLogoutClick();
            Thread.sleep(1000);
            String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
            String actualUrl1 = driver.getCurrentUrl();
            Assert.assertEquals(expectedUrl1, actualUrl1);

        }


        @Test (priority = 16, groups = "beforeStudent")
        public void deleteStudentsAndClass () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        dashboardPage.linkListHover();
        Thread.sleep(1000);
        dashboardPage.userManagementClick();
        userManagementPage.searchFieldClassSendKeys();
        Thread.sleep(2000);
        userManagementPage.arrowDownButtonClick();
        int repeatDeleteStudent = 2;
        for (int i = 0; i < repeatDeleteStudent; i++) {
            userManagementPage.studentClickForDelete();
            userManagementPage.deleteStudentButtonClick();
            userManagementPage.confirmDeleteStudentClick();
            Assert.assertTrue(userManagementPage.notificationStudentRemovedIsDisplayed());
            Assert.assertEquals(userManagementPage.notificationStudentRemovedGetText(), "Student removed");
            Thread.sleep(1000);
            }
        userManagementPage.deleteClassClick();
        userManagementPage.confirmDeleteClassClick();
        Assert.assertTrue(userManagementPage.notificationPopupClassDeletedIsDisplayed());
        userManagementPage.classDeletedClosePopupButtonClick();
        userManagementPage.searchFieldSendKeys();
        Thread.sleep(2000);
        userManagementPage.arrowDownButtonClick();
        userManagementPage.studentClickForDelete();
        userManagementPage.deleteStudentButtonClick();
        userManagementPage.confirmDeleteStudentClick();
        Assert.assertTrue(userManagementPage.notificationStudentRemovedIsDisplayed());
        Assert.assertEquals(userManagementPage.notificationStudentRemovedGetText(), "Student removed");
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);
        }


    @Test (priority = 17, groups = "beforeStudent")
        public void createAndDeleteTeacher () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        dashboardPage.linkListHover();
        Thread.sleep(1000);
        dashboardPage.userManagementClick();
        userManagementPage.teacherManagementClick();
        userManagementPage.addTeacherClick();
        userManagementPage.teacherFirstNameSendKeys("Marko");
        userManagementPage.teacherLastNameSendKeys("Markovic");
        userManagementPage.dayOfBirthClick();
        Thread.sleep(1000);
        userManagementPage.arrowSelectYearClick();
        userManagementPage.calendarScroll();
        userManagementPage.chooseYear1987Click();
        int repeatClickingArrow = 9;
        for (int i = 0; i < repeatClickingArrow; i++){
            //Thread.sleep(1000);
        userManagementPage.arrowSelectMonthClick();}
        userManagementPage.dayOfBirth8OctoberClick();
        userManagementPage.genderClick();
        userManagementPage.genderMaleClick();
        userManagementPage.selectRoleClick();
        userManagementPage.selectRoleAdminClick();
        userManagementPage.submitRoleClick();
        userManagementPage.emailTeacherSendKeys("nikola87.golubovic+888@gmail.com");
        Thread.sleep(2000);
        userManagementPage.saveButtonTeacherClick();
        Assert.assertTrue(userManagementPage.notificationTeacherIsCreatedIsDisplayed());
        Assert.assertEquals(userManagementPage.notificationTeacherIsCreatedGetText(), "Teacher is created and password has been sent.");
        driver.navigate().refresh();
        userManagementPage.teacherManagementClick();
        userManagementPage.searchFieldSendKeys("Marko");
        Thread.sleep(2000);
        userManagementPage.manageTeacherClick();
        userManagementPage.generateNewPasswordTeacherClick();
        Assert.assertTrue(userManagementPage.notificationTeacherIsCreatedIsDisplayed());
        Assert.assertEquals(userManagementPage.notificationTeacherIsCreatedGetText(), "The new password has been sent!" );
        Thread.sleep(3000);
        userManagementPage.deleteTeacherClick();
        userManagementPage.confirmDeleteTeacherClick();
        Assert.assertTrue(userManagementPage.notificationTeacherIsDeletedIsDisplayed());
        Assert.assertEquals(userManagementPage.notificationTeacherIsDeletedGetText(), "Teacher is removed!");
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);

    }



    @Test (priority = 18, groups = "beforeStudent")
    public void testSettings () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        dashboardPage.linkListHover();
        Thread.sleep(1000);
        dashboardPage.settingsButtonClick();
        //try {settingsPage.xButtonSecretKeyClick();} catch (Exception e){System.out.println("xButtonIsNotShowed");}
        settingsPage.inputFieldSecurityKeySendKeys("12345");
        settingsPage.saveButtonClick();
        Assert.assertTrue(settingsPage.notificationsIsDisplayed());
        Assert.assertEquals(settingsPage.notificationsGetText(), "Secret key has been saved");
        Thread.sleep(4000);
        settingsPage.typePasswordSendKeys("Golub1987!");
        settingsPage.retypePasswordSendKeys("Golub1987!");
        settingsPage.saveButtonChangePasswordClick();
        Assert.assertTrue(settingsPage.notificationsIsDisplayed());
        Assert.assertEquals(settingsPage.notificationsGetText(), "User is updated");
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);
    }

    @Test (priority = 19, groups = "beforeStudent")
    public void requestNewPassword () throws InterruptedException {
        loginPageTeacher.requestNewPasswordClick();
        loginPageTeacher.enterEmailSendKeys();
        loginPageTeacher.sendRequestNewPasswordClick();
        Assert.assertTrue(loginPageTeacher.notificationRequestedNewPasswordIsDisplayed());
        Assert.assertEquals(loginPageTeacher.notificationRequestedNewPasswordGetText(), "We've sent you a validation token to get back into your account. Check your mail and copy your token here.");
        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get("https://webmail.we-deliver.net/");
        webmailLoginPage.emailSendKeys("us_test_t1@we-deliver.net");
        webmailLoginPage.passwordSendKeys("10Biljaka!!");
        webmailLoginPage.loginButtonClick();
        Thread.sleep(65000);
        driver.navigate().refresh();
        Thread.sleep(15000);
        driver.navigate().refresh();
        webmailLoginPage.emailsClickFirst();
        driver.switchTo().frame("messagecontframe");
        String token1 = webmailLoginPage.tokenGetText();
        System.out.println(webmailLoginPage.tokenGetText());
        driver.switchTo().defaultContent();
        driver.switchTo().window(tabs.get(0));
        loginPageTeacher.tokenInputFieldSendKeys(token1);
        loginPageTeacher.submitTokenButtonClick();
        loginPageTeacher.newPasswordSendKeys();
        loginPageTeacher.repeatNewPasswordSendKeys();
        loginPageTeacher.submitNewPasswordClick();
        Thread.sleep(2000);
        String dashboardPage = driver.getCurrentUrl();
        String expectedUrl = "https://web-staging.upstrivesystem.com/dashboard";
        Assert.assertEquals(dashboardPage, expectedUrl);






    }




    @Test (priority = 20, groups = "beforeStudent", retryAnalyzer = Retry.class)
    public void searchFeedPosts () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        dashboardPage.feedPostsClick();
        Thread.sleep(1000);
        dashboardPage.searchFieldFeedPostsSendKeys();
        Thread.sleep(3000);
        Assert.assertTrue(dashboardPage.feedPostWhatDoesConfidenceMeanToYouIsDisplayed());
        Assert.assertEquals(dashboardPage.feedPostWhatDoesConfidenceMeanToYouGetText(), "Test search field");
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);
    }



    @Test (priority = 21, groups = "beforeStudent", retryAnalyzer = Retry.class)
    public void searchInResultInSurvey () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        dashboardPage.buttonResultClick();
        dashboardPage.searchFieldResultSendKeys();
        Thread.sleep(2000);
        Assert.assertTrue(dashboardPage.searchResultIsDisplayed());
        Assert.assertEquals(dashboardPage.searchResultGetText(), "Test Survey automation search in dashboard");
        dashboardPage.searchedResultSurveyClick();
        dashboardPage.surveyArrowInPopupClick();
        dashboardPage.searchInsideSurveySendKeys();
        dashboardPage.surveyResultScrollDown();
        Thread.sleep(2000);
        Assert.assertTrue(dashboardPage.searchedResultMilenaSurveyIsDisplayed());
        Assert.assertEquals(dashboardPage.searchedStudentMilenaSurveyGetText(), "Milena Nastasovic");
        System.out.println(dashboardPage.searchedStudentMilenaSurveyGetText());
        dashboardPage.xButtonResultClick();
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);
    }





    @Test (priority = 22, groups = "beforeStudent", retryAnalyzer = Retry.class)
    public void testSearchMessage () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        dashboardPage.linkListHover();
        Thread.sleep(1000);
        dashboardPage.chatClick();
        sendMessageTeacher.searchMessageSendKeys();
        Thread.sleep(2000);
        Assert.assertTrue(sendMessageTeacher.searchResultIsDisplayed());
        Assert.assertEquals(sendMessageTeacher.searchResultGetText(), "James Morales");
        System.out.println(sendMessageTeacher.searchResultGetText());
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);


    }


    @Test (priority = 23, groups = "beforeStudent", retryAnalyzer = Retry.class)
    public void testSearchCatchUp () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        dashboardPage.linkListHover();
        Thread.sleep(1000);
        dashboardPage.catchUpClick();
        catchUpPage.searchFieldSendKeys();
        Thread.sleep(1000);
        Assert.assertTrue(catchUpPage.searchResultMazalicaIsDisplayed());
        Assert.assertEquals(catchUpPage.searchResultMazalicaGetText(), "Milos Mazalica");
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);
    }


    @Test (priority = 24, groups = "beforeStudent", retryAnalyzer = Retry.class)
    public void testSearchWellbeingTracker () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        dashboardPage.linkListHover();
        Thread.sleep(1000);
        dashboardPage.wellBeingTrackerClick();
        wellbeingTrackerPage.searchInputFieldSendKeys();
        Thread.sleep(1000);
        Assert.assertTrue(wellbeingTrackerPage.searchResultIsDisplayed());
        Assert.assertEquals(wellbeingTrackerPage.searchResultGetText(), "Student Tester");
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);

    }

    @Test (priority = 25, groups = "beforeStudent", retryAnalyzer = Retry.class)
    public void searchInAnalytics () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        dashboardPage.linkListHover();
        Thread.sleep(1000);
        dashboardPage.analyticsButtonClick();
        analytics.searchQuestionFieldSendKeys();
        Thread.sleep(2000);
        System.out.println(analytics.searchResultGetText());
        Assert.assertEquals(analytics.searchResultGetText(), "How much time do you spend on homework every night?");
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);


    }

    @Test (priority = 26, groups = "beforeStudent", retryAnalyzer = Retry.class)
    public void searchReportInAnalytics () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        dashboardPage.linkListHover();
        Thread.sleep(1000);
        dashboardPage.analyticsButtonClick();
        analytics.createReportClick();
        analytics.searchReportSendKeys();
        Thread.sleep(2000);
        System.out.println(analytics.searchResultReportGetText());
        Assert.assertEquals(analytics.searchResultReportGetText(), "Report-check assign actions");
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);


    }


    @Test (priority = 27, groups = "beforeStudent", retryAnalyzer = Retry.class)
    public void createReportInAnalytics () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        dashboardPage.linkListHover();
        Thread.sleep(1000);
        dashboardPage.analyticsButtonClick();
        analytics.createReportClick();
        analytics.calendarStartDateClick();
        Thread.sleep(2000);
        analytics.arrowPreviousMonthClick();
        analytics.daysStartDateClick();
        analytics.calendarEndDateClick();
        Thread.sleep(2000);
        analytics.arrowPreviousMonthClick();
        analytics.daysEndDateClick();
        analytics.targetUserClick();
        analytics.targetUserYearsClick();
        analytics.createReportsScrollDown();
        analytics.genderSelect();
        analytics.genderMaleClick();
        analytics.genderFemaleClick();
        analytics.genderOtherClick();
        analytics.createReportButtonClick();
        analytics.fileNameSendKeys();
        analytics.createReportButtonLastStepClick();
        Assert.assertTrue(analytics.notificationReportCreatedIsDisplayed());
        Assert.assertEquals(analytics.notificationReportCreatedGetText(), "You will be notified once your report is ready");
        analytics.closeButtonClick();
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);

    }

    @Test(priority = 28, retryAnalyzer = Retry.class)
    public void createPdfReport () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        dashboardPage.linkListHover();
        Thread.sleep(1000);
        dashboardPage.analyticsButtonClick();
        analytics.createReportClick();
        analytics.pdfButtonClick();
        analytics.calendarStartDateClick();
        Thread.sleep(2000);
        analytics.arrowPreviousMonthClick();
        analytics.daysStartDateClick();
        Thread.sleep(1000);
        analytics.calendarEndDateClick();
        Thread.sleep(2000);
        analytics.arrowPreviousMonthClick();
        analytics.daysEndDateClick();
        analytics.targetUserClick();
        analytics.targetUserYearsClick();
        Thread.sleep(1000);
        analytics.createReportButtonClick();
        analytics.fileNameSendKeys();
        analytics.createReportButtonLastStepClick();
        Assert.assertTrue(analytics.notificationReportCreatedIsDisplayed());
        Assert.assertEquals(analytics.notificationReportCreatedGetText(), "You will be notified once your report is ready");
        analytics.closeButtonClick();
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);



    }


    @Test (priority = 28, groups = "beforeStudent", retryAnalyzer = Retry.class)
    public void searchFieldInLoginData () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        dashboardPage.linkListHover();
        Thread.sleep(1000);
        dashboardPage.userManagementClick();
        userManagementPage.loginDataButtonClick();
        userManagementPage.searchInLoginDataSendKeys();
        Thread.sleep(2000);
        Assert.assertEquals(userManagementPage.resultInLoginDataJamesTaylorGetText(), "James Taylor");
        userManagementPage.xButtonLoginDataClick();
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);
    }

    @Test (priority = 29, groups = "beforeStudent", retryAnalyzer = Retry.class)
        public void checkSelectButtonInLoginData () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        dashboardPage.linkListHover();
        Thread.sleep(2000);
        dashboardPage.userManagementClick();
        userManagementPage.loginDataButtonClick();
        userManagementPage.selectButtonClick();
        userManagementPage.class2AClick();
        Thread.sleep(2000);
        Assert.assertEquals(userManagementPage.resultSearchClass2AGetText(), "Mattie Berg");
        userManagementPage.xButtonLoginDataClick();
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);


    }

    @Test (priority = 30, groups = "beforeStudent", retryAnalyzer = Retry.class)
    public void checkFilterButtonInCatchUp () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        dashboardPage.linkListHover();
        Thread.sleep(1000);
        dashboardPage.catchUpClick();
        catchUpPage.filterButtonClick();
        catchUpPage.select2AClick();
        catchUpPage.applyButtonClick();
        Thread.sleep(2000);
        List<WebElement> resultElements = driver.findElements(By.xpath("//p[@class='catch-up-student-class']"));
        String expectedClass = "Class 2-A";
        for (WebElement resultElement : resultElements) {
            String studentClass = resultElement.getText();
            Assert.assertTrue(studentClass.contains(expectedClass));
            //Thread.sleep(2000);
        }
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);

    }

    @Test (priority = 31, groups = "beforeStudent", retryAnalyzer = Retry.class)
    public void checkFilterInFeedPosts () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        dashboardPage.feedPostsClick();
        Thread.sleep(1000);
        dashboardPage.filterButtonClick();
        dashboardPage.calendarDateFromInFeedPostsClick();
        dashboardPage.arrowPreviousMonth();
        dashboardPage.daysStartDateClick();
        Thread.sleep(2000);
        dashboardPage.calendarDateToInFeedPostsClick();
        dashboardPage.arrowPreviousMonth();
        dashboardPage.daysEndDateClick();
        Thread.sleep(2000);
        String expectedDate = "08 Dec 2023";
        String actualDate = dashboardPage.firstDateResultGetText();
        Assert.assertTrue(actualDate.contains(expectedDate));
        //Assert.assertEquals(dashboardPage.firstDateResultGetText(), "08 Dec 2023");
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);

    }





    @Test (priority = 32, groups = "beforeStudent", retryAnalyzer = Retry.class)
    public void checkFilterInResults () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        dashboardPage.buttonResultClick();
        dashboardPage.filterButtonClick();
        dashboardPage.calendarInResultClick();
        dashboardPage.arrowPreviousMonthInResultClick();
        dashboardPage.daysFromInResultClick();
        dashboardPage.daysToInResultClick();
        dashboardPage.calendarOkButtonClick();
        Thread.sleep(2000);
        Assert.assertEquals(dashboardPage.filterResultDateInFeedGetText(), "08 Dec 2023");
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);

    }

    @Test (priority = 33, groups = "beforeStudent", retryAnalyzer = Retry.class)
    public void checkFilterDisplayOnlyQuestionsInResult () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        dashboardPage.buttonResultClick();
        dashboardPage.filterButtonClick();
        dashboardPage.calendarInResultClick();
        dashboardPage.period3MonthsClick();
        dashboardPage.displayAllButtonClick();
        dashboardPage.questionsButtonClick();
        Thread.sleep(3000);
        String expectedContent = "Question";
        List<WebElement> resultsFilterDisplayButton = driver.findElements(By.xpath("//span[@class='text-[#413F5E] font-medium text-[16px] mr-[15px]']"));
        for (WebElement resultFilterDisplayButton: resultsFilterDisplayButton) {
            String resultOnlyQuestions = resultFilterDisplayButton.getText();
            Assert.assertTrue(resultOnlyQuestions.contains(expectedContent));
        }
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);

    }

    @Test (priority = 34, groups = "beforeStudent", retryAnalyzer = Retry.class)
    public void checkFilterDisplayOnlyPollsInResult () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        dashboardPage.buttonResultClick();
        dashboardPage.filterButtonClick();
        dashboardPage.calendarInResultClick();
        dashboardPage.period3MonthsClick();
        dashboardPage.displayAllButtonClick();
        dashboardPage.pollsButtonClick();
        Thread.sleep(3000);
        String expectedContent = "Poll";
        List<WebElement> resultsFilterDisplayButton = driver.findElements(By.xpath("//span[@class='text-[#413F5E] font-medium text-[16px] mr-[15px]']"));
        for (WebElement resultFilterDisplayButton: resultsFilterDisplayButton) {
            String resultOnlyPolls = resultFilterDisplayButton.getText();
            Assert.assertTrue(resultOnlyPolls.contains(expectedContent));
        }
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);

    }

    @Test (priority = 35, groups = "beforeStudent", retryAnalyzer = Retry.class)
    public void checkFilterDisplayOnlySurveysInResult () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        dashboardPage.buttonResultClick();
        dashboardPage.filterButtonClick();
        dashboardPage.calendarInResultClick();
        dashboardPage.period3MonthsClick();
        dashboardPage.displayAllButtonClick();
        dashboardPage.surveysButtonClick();
        Thread.sleep(3000);
        String expectedContent = "Survey";
        List<WebElement> resultsFilterDisplayButton = driver.findElements(By.xpath("//span[@class='text-darkenPurple font-medium text-sm mr-[50px]']"));
        for (WebElement resultFilterDisplayButton: resultsFilterDisplayButton) {
            String resultOnlySurveys = resultFilterDisplayButton.getText();
            Assert.assertTrue(resultOnlySurveys.contains(expectedContent));
        }
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);

    }

    // Display All button-journal,

    @Test (priority = 36, groups = "beforeStudent")
    public void createGroupDashboard () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        Thread.sleep(2000);
        dashboardPage.sampleGroupClick();
        Thread.sleep(1000);
        dashboardPage.createGroupClick();
        dashboardPage.nameNewGroupSendKeys();
        dashboardPage.happyEmoticonClick();
        dashboardPage.allYearsButtonClick();
        dashboardPage.continueButtonCreateGroupClick();
        Assert.assertTrue(dashboardPage.notificationPrivateNoteIsDisplayed());
        Assert.assertEquals(dashboardPage.notificationPrivateNoteGetText(), "Created new monitoring group!");
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);

    }


    @Test (priority = 37, groups = "beforeStudent")
    public void editGroupDashboard () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy (0,400)");
        dashboardPage.sampleGroupClick();
        Thread.sleep(1000);
        dashboardPage.happySampleGroupHover();
        Thread.sleep(3000);
        dashboardPage.editSampleGroupClick();
        Thread.sleep(3000);
        dashboardPage.happyEmoticonClick();
        dashboardPage.ecstaticEmotikonClick();
        dashboardPage.continueButtonCreateGroupClick();
        Assert.assertTrue(dashboardPage.notificationPrivateNoteIsDisplayed());
        Assert.assertEquals(dashboardPage.notificationPrivateNoteGetText(), "Updated monitoring group!");
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);


    }

    @Test (priority = 38, groups = "beforeStudent")
    public void deleteGroupDashboard () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy (0,400)");
        dashboardPage.sampleGroupClick();
        Thread.sleep(1000);
        dashboardPage.happySampleGroupHover();
        dashboardPage.deleteSampleGroupClick();
        dashboardPage.confirmDeletionFeedPostsClick();
        Assert.assertTrue(dashboardPage.notificationPrivateNoteIsDisplayed());
        Assert.assertEquals(dashboardPage.notificationPrivateNoteGetText(), "You deleted target group");
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);

    }

    @Test (priority = 39, groups = "beforeStudent")
    public void checkLinkStudentChat () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        ((JavascriptExecutor) driver).executeScript("window.scrollBy (0,400)");
        Thread.sleep(3000);
        dashboardPage.linkStudentChatClick();
        Thread.sleep(2000);
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://web-staging.upstrivesystem.com/chat";
        Assert.assertEquals(actualUrl, expectedUrl);
        Thread.sleep(3000);
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);


    }


    @Test (priority = 40, groups = "beforeStudent")
    public void checkLinkActionsAssignedToMe () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t2@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        ((JavascriptExecutor) driver).executeScript("window.scrollBy (0,400)");
        dashboardPage.linkStudentActionsAssignedToMeClick();
        Assert.assertTrue(dashboardPage.popupWindowTitleIsDisplayed());
        Assert.assertEquals(dashboardPage.popupWindowTitleGetText(), "Actions assigned to me");
        dashboardPage.iWillTakeActionClick();
        dashboardPage.actionNoteSendKeys();
        dashboardPage.confirmActionClick();
        dashboardPage.linkListHover();
        dashboardPage.xButtonAssignedActionPopUpClick();
        Thread.sleep(2000);
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);


    }

    @Test (priority = 41, groups = "beforeStudent")
    public void checkIWillTakeActionFromLink () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t2@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        ((JavascriptExecutor) driver).executeScript("window.scrollBy (0,400)");
        dashboardPage.linkStudentActionsAssignedToMeClick();
        int repeatTakeAction = 1;
        int i;
        for (i=0; i<repeatTakeAction; i++){
        dashboardPage.iWillTakeActionClick();
        dashboardPage.actionNoteSendKeys();
        dashboardPage.confirmActionClick();
        Thread.sleep(1000);}
        dashboardPage.linkListHover();
        dashboardPage.xButtonAssignedActionPopUpClick();
        Thread.sleep(2000);
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);
    }

    @Test (priority = 42, groups = "beforeStudent")
    public void checkAnalyticsLinkDashboard () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        Thread.sleep(1000);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy (0,400)");
        dashboardPage.analyticsButtonDashboardClick();
        Thread.sleep(2000);
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://web-staging.upstrivesystem.com/analytics";
        Assert.assertEquals(actualUrl, expectedUrl);
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);


    }


    @Test (priority = 43, groups = "beforeStudent")
    public void checkAnalyticsGetInsightsButton () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        dashboardPage.linkListHover();
        Thread.sleep(1000);
        dashboardPage.analyticsButtonClick();
        ((JavascriptExecutor) driver).executeScript("window.scrollBy (0,400)");
        analytics.getInsightsButtonClick();
        Thread.sleep(2000);
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://web-staging.upstrivesystem.com/analytics/data?type=data&content=how-do-you-feel";
        Assert.assertEquals(actualUrl, expectedUrl);
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);


    }


    @Test (priority = 44, groups = "beforeStudent")
    public void checkAddNewTrendInAnalytics () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        dashboardPage.linkListHover();
        Thread.sleep(1000);
        dashboardPage.analyticsButtonClick();
        analytics.addNewTrendClick();
        Thread.sleep(1000);
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://web-staging.upstrivesystem.com/content?type=poll";
        Assert.assertEquals(actualUrl, expectedUrl);
        createPollPage.headlineInputFieldSendKeys("Automation add New Trend");
        createPollPage.supportiveTextInputFieldSendKeys("Add new trend in Analytics");
        ((JavascriptExecutor) driver).executeScript("window.scrollBy (0,400)");
        createPollPage.option1SendKeys("Yes");
        createPollPage.option2SendKeys("No");
        createPollPage.selectTargetClick();
        createPollPage.selectFavoritesClick();
        createPollPage.testEmotionAndAnalyticsClick();
        createPollPage.buttonOkClick();
        createPollPage.scheduleButtonClick();
        createPollPage.rightArrowScheduleClick();
        createPollPage.repeatButtonInScheduleClick();
        createPollPage.dayMondayClick();
        //createPollPage.dayTuesdayClick();
        createPollPage.dayWednesdayClick();
        createPollPage.dayThursdayClick();
        createPollPage.dayFridayClick();
        //createPollPage.calendarEndDateInScheduleClick();
        //createPollPage.endDaysCalendarInScheduleClick();
        createPollPage.continueScheduleButtonClick();
        createPollPage.buttonAddToAnalyticsClick();
        Thread.sleep(2000);
        createPollPage.buttonPublishClick();
        Thread.sleep(2000);
        Assert.assertTrue(createFeedPage.contentIsCreatedIsDisplayed());
        Assert.assertEquals( createFeedPage.contentIsCreatedGetText(), "Content is created!");
        Thread.sleep(2000);
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);


    }

    @Test(priority = 45, groups = "afterStudent")
    public void deleteTrendInAnalytics () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        dashboardPage.linkListHover();
        Thread.sleep(1000);
        dashboardPage.analyticsButtonClick();
        analytics.searchFieldAnalyticsSendKeys();
        Thread.sleep(2000);
        analytics.deleteTrendInAnalyticsButtonClick();
        analytics.confirmDeleteTrendInAnalyticsClick();
        Assert.assertTrue(analytics.notificationTrendDeletedIsDisplayed());
        Assert.assertEquals( analytics.notificationTrendDeletedGetText(), "Content has been removed from trends");
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);
    }


    @Test (priority = 46, groups = "beforeStudent")
    public void checkLinkMoreDetailsInClassroom () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        Thread.sleep(1000);
        dashboardPage.myClassroomClick();
        classroomPage.moreDetailsButtonClick();
        Thread.sleep(1000);
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://web-staging.upstrivesystem.com/analytics/data?type=data&content=how-do-you-feel";
        Assert.assertEquals(actualUrl, expectedUrl);
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);

    }

    @Test (priority = 47, groups = "beforeStudent")
    public void checkFilterClassroom () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        Thread.sleep(1000);
        dashboardPage.myClassroomClick();
        classroomPage.filterClassroomButtonClick();
        classroomPage.yearOneClick();
        classroomPage.classOneClick();
        classroomPage.applyButtonClick();
        Thread.sleep(1000);
        List<WebElement> allYearsAndClasses = driver.findElements(By.xpath("//div[@class='classroom-year-text']/p[1]"));
        List<WebElement> filteredYearsAndClasses = allYearsAndClasses.stream().filter(year->year.getText().contains("Year 1")).toList();
        Assert.assertEquals(allYearsAndClasses.size(), filteredYearsAndClasses.size());
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);


    }




    @Test (priority = 48, groups = "beforeStudent")
    public void createTemplateFeed () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        dashboardPage.linkListHover();
        Thread.sleep(1000);
        dashboardPage.createContentClick();
        dashboardPage.createYourOwnClick();
        createFeedPage.headlineInputFieldSendKeys("Automation template");
        createFeedPage.supportiveTextInputFieldSendKeys("AUTOMATION");
        ((JavascriptExecutor) driver).executeScript("window.scrollBy (0,400)");
        createFeedPage.selectTargetClick();
        createFeedPage.selectFavoritesClick();
        createFeedPage.selectFavoritesTestClick();
        createFeedPage.buttonOkClick();
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy (0,400)");
        createFeedPage.createTemplateFeedClick();
        Assert.assertTrue(createFeedPage.contentIsCreatedIsDisplayed());
        Assert.assertEquals(createFeedPage.contentIsCreatedGetText(), "Template is created!");
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);


    }

    @Test (priority = 49, groups = "beforeStudent")
    public void editTemplateFeed () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        dashboardPage.linkListHover();
        Thread.sleep(1000);
        dashboardPage.createContentClick();
        dashboardPage.createYourOwnClick();
        createFeedPage.useTemplateButtonClick();
        createFeedPage.editTemplateButtonClick();
        createFeedPage.enterLinkSendKeys("https://www.youtube.com/");
        createFeedPage.updateTemplateButtonClick();
        createFeedPage.selectTemplateButtonClick();
        //Thread.sleep(2000);
        Assert.assertEquals(createFeedPage.enterLinkGetAttribute(), "https://www.youtube.com/");
        createFeedPage.buttonPublishClick();
        Assert.assertTrue(createFeedPage.contentIsCreatedIsDisplayed());
        Assert.assertEquals(createFeedPage.contentIsCreatedGetText(), "Content is created!");
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);



    }


    @Test (priority = 50, groups = "beforeStudent")
    public void deleteTemplateFeed () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        dashboardPage.linkListHover();
        Thread.sleep(1000);
        dashboardPage.createContentClick();
        dashboardPage.createYourOwnClick();
        createFeedPage.useTemplateButtonClick();
        createFeedPage.deleteTemplateButtonClick();
        createFeedPage.confirmDeleteTemplateClick();
        Assert.assertEquals(createFeedPage.contentIsCreatedGetText(), "Template deleted");
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);



    }

    @Test (priority = 51, groups = "beforeStudent")
    public void upcomingContentLinkCreateYourOwn () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        dashboardPage.upcomingContentClick();
        dashboardPage.createYourOwnContentLinkClick();
        Thread.sleep(2000);
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://web-staging.upstrivesystem.com/content";
        Assert.assertEquals(actualUrl, expectedUrl);
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);

    }

    @Test (priority = 52, groups = "beforeStudent")
    public void upcomingContentLinkReadyToGo () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        dashboardPage.upcomingContentClick();
        dashboardPage.createReadyToGoContentLinkClick();
        Thread.sleep(2000);
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://web-staging.upstrivesystem.com/readytogo";
        Assert.assertEquals(actualUrl, expectedUrl);
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);

    }

    @Test (priority = 53, groups = "beforeStudent")
    public void upcomingContentLinkEdit () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        dashboardPage.upcomingContentClick();
        dashboardPage.editUpcomingContentClick();
        Thread.sleep(2000);
        String actualUrl = driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.startsWith("https://web-staging.upstrivesystem.com/content?editId="));
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);

    }


    @Test (priority = 54, groups = {"beforeStudent"})
    public void upcomingContentLinkDelete () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        dashboardPage.upcomingContentClick();
        dashboardPage.deleteUpcomingContent();
        Thread.sleep(2000);
        Assert.assertTrue(dashboardPage.contentDeletedIsDisplayed());
        Assert.assertEquals(dashboardPage.contentDeletedGetText(), "Content deleted");
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);

    }

    @Test (priority = 55, groups = "beforeStudent")
    public void checkCommentsForReview () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        Thread.sleep(2000);
        dashboardPage.commentsFroReviewClick();
        Thread.sleep(2000);
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://web-staging.upstrivesystem.com/classroom?emotion=comments";
        Assert.assertEquals(actualUrl, expectedUrl);
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);


    }

    @Test (priority = 56, groups = "beforeStudent")
    public void instructionVideosCheckLink () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        dashboardPage.linkListHover();
        Thread.sleep(1000);
        dashboardPage.instructionVideosClick();
        Thread.sleep(2000);
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://web-staging.upstrivesystem.com/videos";
        Assert.assertEquals(actualUrl, expectedUrl);
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);
    }

    @Test (priority = 57, groups = "beforeStudent", retryAnalyzer = Retry.class)
    public void uploadUserData () throws InterruptedException, IOException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        dashboardPage.linkListHover();
        Thread.sleep(1000);
        dashboardPage.userManagementClick();
        userManagementPage.uploadUserDataClick();
        userManagementPage.attachFileClick();
        String exeFilePath = "E:\\AutoIt files\\uploadUserDataUpstrive.exe";
        Thread.sleep(3000);
        ProcessBuilder builder = new ProcessBuilder(exeFilePath);
        builder.start();
        Thread.sleep(1000);
        userManagementPage.uploadDataClick();
        Assert.assertEquals(userManagementPage.notificationUploadedDataGetText(), "File has been uploaded. Data will be updated within 24 hours");
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);


    }

    @Test (priority = 58, groups = "beforeStudent", retryAnalyzer = Retry.class)
    public void deleteUploadedData () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        dashboardPage.linkListHover();
        Thread.sleep(1000);
        dashboardPage.userManagementClick();
        userManagementPage.uploadUserDataClick();
        userManagementPage.deleteUploadedDataClick();
        userManagementPage.confirmDeleteTeacherClick();
        Assert.assertEquals(userManagementPage.notificationUploadedDataGetText(), "File has been removed");
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);
    }




    @Test (priority = 59, retryAnalyzer = Retry.class)
    public void downloadData () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        dashboardPage.linkListHover();
        Thread.sleep(1000);
        dashboardPage.userManagementClick();
        userManagementPage.uploadUserDataClick();
        userManagementPage.fileLinkClick();
        Thread.sleep(4000);
        File file = new File ("C:\\Users\\nikol\\Downloads\\users-data-f03bc726-c9c8-11ed-bd21-02c0080cd71c.xlsx");
        if (file.exists())
        {System.out.println("File downloaded");}
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);

    }

    @Test (priority = 60, retryAnalyzer = Retry.class)
    public void downloadTemplateFile () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        dashboardPage.linkListHover();
        Thread.sleep(1000);
        dashboardPage.userManagementClick();
        userManagementPage.uploadUserDataClick();
        userManagementPage.downloadTemplate();
        Thread.sleep(4000);
        File templateFile = new File ("C:\\Users\\nikol\\Downloads\\School_Info_template.xlsx");
        if (templateFile.exists())
        {System.out.println("File downloaded");}
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);

    }


    @Test (priority = 61, retryAnalyzer = Retry.class)
    public void checkSearchInReadyToGo () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        dashboardPage.linkListHover();
        Thread.sleep(1000);
        dashboardPage.createContentClick();
        dashboardPage.readyToGoClick();
        readyToGoContentPage.programsClick();
        Thread.sleep(1000);
        readyToGoContentPage.searchPrograms();
        readyToGoContentPage.assertSearch();
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);

    }


    @Test (priority = 62, retryAnalyzer = Retry.class)
    public void searchInCreateWellbeingProfile () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        dashboardPage.linkListHover();
        Thread.sleep(1000);
        dashboardPage.wellBeingTrackerClick();
        wellbeingTrackerPage.addButton();
        wellbeingTrackerPage.searchCreateWellProfile();
        wellbeingTrackerPage.assertSearch();
        wellbeingTrackerPage.xButton();
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);


    }

    @Test (priority = 63, retryAnalyzer = Retry.class)
    public void exportDataInWellbeingTracker () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        dashboardPage.linkListHover();
        Thread.sleep(1000);
        dashboardPage.wellBeingTrackerClick();
        wellbeingTrackerPage.profileClick();
        Thread.sleep(2000);
        wellbeingTrackerPage.exportData();
        Thread.sleep(4000);
        File templateFile = new File ("C:\\Users\\nikol\\Downloads\\Counseling report.pdf");
        if (templateFile.exists())
        {System.out.println("File downloaded");}
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);


    }















}





