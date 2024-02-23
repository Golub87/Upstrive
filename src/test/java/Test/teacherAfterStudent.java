package Test;

import Base.BaseTestTeacher;
import Base.DataReader;
import Base.ExtentReporter;
import TeacherPage.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class teacherAfterStudent extends BaseTestTeacher {
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






    @Test (priority = 1, groups = "afterStudent")
    public void sendMessageFromClassroomToNG () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        Thread.sleep(2000);
        dashboardPage.myClassroomClick();
        ((JavascriptExecutor) driver).executeScript("window.scrollBy (0,400)");
        classroomPage.studentNikolaGolubovicClick();
        classroomPage.sendMessageClassroomClick();
        classroomPage.inputFieldMessageSendKeys();
        classroomPage.submitMessageClick();
        Assert.assertTrue(classroomPage.notificationIsDisplayed());
        Assert.assertEquals(classroomPage.notificationGetText(), "Message has been sent");
        catchUpPage.xButtonCatchUpClick();
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);

    }

    @Test (priority = 2, groups = "afterStudent")

    public void assignActionTeacher () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        dashboardPage.linkListHover();
        Thread.sleep(1000);
        dashboardPage.catchUpClick();
        catchUpPage.studentTesterClick();
        catchUpPage.assignActionClick();
        catchUpPage.selectTeacherClick();
        catchUpPage.teacherTester2Click();
        catchUpPage.textInputFieldSendKeys("Automated assign");
        catchUpPage.submitButtonClick();
        Assert.assertTrue(catchUpPage.notificationActionAssignedIsDisplayed());
        Assert.assertEquals(catchUpPage.notificationActionAssignedGetText(), "Action has been assigned to teacher" );
        catchUpPage.xButtonCatchUpClick();
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);


    }

    @Test (priority = 3, groups = "afterStudent")
    public void assignActionFromClassroomStudentTester() throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        Thread.sleep(2000);
        dashboardPage.myClassroomClick();
        ((JavascriptExecutor) driver).executeScript("window.scrollBy (0,600)");
        classroomPage.studentTesterClick();
        classroomPage.assignActionClick();
        classroomPage.selectTeacherClick();
        classroomPage.searchInSelectTeacherSendKeys();
        //assert
        classroomPage.selectTeacherTesterClick();
        classroomPage.inputFieldAssignActionSendKeys();
        classroomPage.submitAction();
        Assert.assertTrue(classroomPage.notificationIsDisplayed());
        Assert.assertEquals(classroomPage.notificationGetText(), "Action has been assigned to teacher");
        classroomPage.xButtonClassroomClick();
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);

    }

    @Test (priority = 4, groups = "afterStudent")
    public void iWillTakeActionFromClassNemanjaP () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        Thread.sleep(2000);
        dashboardPage.myClassroomClick();
        ((JavascriptExecutor) driver).executeScript("window.scrollBy (0,800)");
        classroomPage.studentNemanjaPClick();
        classroomPage.buttonIWillTakeActionClick();
        classroomPage.inputFieldIWillTakeActionSendKeys();
        classroomPage.submitAction();
        Assert.assertTrue(classroomPage.actionTakenIsDisplayed());
        Assert.assertEquals(classroomPage.actionTakenGetText(), "Action taken");
        classroomPage.xButtonClassroomClick();
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);

    }



    @Test (priority = 5, groups = "afterStudent")

    public void deleteContentTeacher() throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        dashboardPage.buttonResultClick();
        int repeatDeletionProcess = 1;
        for (int i = 0; i < repeatDeletionProcess; i++)
        {dashboardPage.clickContent();
            dashboardPage.buttonDeleteContentClick();
            dashboardPage.buttonConfirmDeleteContentClick();
            Assert.assertTrue(dashboardPage.contentDeletedIsDisplayed());
            Assert.assertEquals(dashboardPage.contentDeletedGetText(), "Content deleted");}
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);

    }


    @Test (priority = 6, groups = "afterStudent")

    public void deleteFeed () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        int repeatDeletionProcess = 1;
        for (int i = 0; i < repeatDeletionProcess; i++)
        {dashboardPage.feedPostsClick();
            Thread.sleep(1000);
            dashboardPage.xButtonFeedPostsClick();
            dashboardPage.confirmDeletionFeedPostsClick();
            Assert.assertTrue(dashboardPage.contentDeletedIsDisplayed());
            Assert.assertEquals(dashboardPage.contentDeletedGetText(), "Content deleted");
        }
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);
    }


    @Test (priority = 7, groups = "afterStudent")
    public void checkEmotionFilterInClassroom () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        Thread.sleep(2000);
        dashboardPage.myClassroomClick();
        //int leftPickerMultipleClick = 1;
        //for (int i = 0; i<leftPickerMultipleClick; i++){
        //classroomPage.leftButtonDayPickerClick();}
        classroomPage.emotionsDropDownSelect();
        classroomPage.emotionsFilterHappy();
        Thread.sleep(2000);
        classroomPage.emotionsImageAssert();
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);



    }

    @Test (priority = 8, groups = "afterStudent")
    public void checkSearchFieldInClassroom () throws InterruptedException {
        loginPageTeacher.emailSendKeys("us_test_t1@we-deliver.net");
        loginPageTeacher.passwordSendKeys("Golub1987!");
        loginPageTeacher.loginButtonClick();
        Thread.sleep(1000);
        dashboardPage.myClassroomClick();
        int leftPickerMultipleClick = 3;
        //for (int i = 0; i<leftPickerMultipleClick; i++){
           // classroomPage.leftButtonDayPickerClick();}
        Thread.sleep(1000);
        classroomPage.searchInClassroomSendKeys();
        Thread.sleep(2000);
        List<WebElement> allStudents = driver.findElements(By.xpath("//div[@class='classroom-wellbeing-student']"));
        List<WebElement> filteredList = allStudents.stream().filter(student->student.getText().contains("Nikola")).toList();
        Assert.assertEquals(allStudents.size(), filteredList.size());
        dashboardPage.linkListHover();
        dashboardPage.logoutButtonClick();
        dashboardPage.confirmLogoutClick();
        Thread.sleep(1000);
        String expectedUrl1 = "https://web-staging.upstrivesystem.com/login";
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1, actualUrl1);


    }




}
