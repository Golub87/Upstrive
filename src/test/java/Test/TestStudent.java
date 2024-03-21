package Test;

import Base.BaseTestStudent;
import Base.DataReader;
import Base.ExtentReporter;
import Base.Retry;
import StudentPage.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class TestStudent extends BaseTestStudent {
    LoginStudentPage loginStudentPage;
    FeedTasksPage feedTasksPage;
    ChatStudentPage chatStudentPage;

    ProfileStudentPage profileStudentPage;

    SolutionsPage solutionsPage;

    WebmailLoginPage webmailLoginPage;

    Listeners listeners;

    DataReader dataReader;

    ExtentReporter extentReporter;

    @BeforeMethod
    public void setUpPageStudent () {
        loginStudentPage = new LoginStudentPage();
        feedTasksPage = new FeedTasksPage();
        chatStudentPage = new ChatStudentPage();
        profileStudentPage = new ProfileStudentPage();
        solutionsPage = new SolutionsPage();
        webmailLoginPage = new WebmailLoginPage();
        extentReporter = new ExtentReporter();
        listeners = new Listeners();
        dataReader = new DataReader();

    }

    @Test (priority = 1)
    public void studentLoginAndLogout () throws InterruptedException {
        loginStudentPage.emailSendKeys("us_test_s1@we-deliver.net");
        loginStudentPage.passwordSendKeys("Golub1987!");
        loginStudentPage.loginButtonClick();
        Assert.assertTrue(feedTasksPage.homeButtonIsDisplayed());
        feedTasksPage.profileClick();
        ((JavascriptExecutor) driver).executeScript("window.scrollBy (0,400)");
        profileStudentPage.logoutButtonClick();
        profileStudentPage.confirmLogoutClick();
        Thread.sleep(2000);
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://student-staging.upstrivesystem.com/";
        Assert.assertEquals(actualUrl, expectedUrl);


    }

    @Test (priority = 2)
    public void requestNewPassword () throws InterruptedException {
        loginStudentPage.requestNewPasswordClick();
        loginStudentPage.emailForgotPasswordSendKeys("us_test_s2@we-deliver.net");
        loginStudentPage.sendRequestButtonClick();
        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get("https://webmail.we-deliver.net/");
        webmailLoginPage.emailSendKeys("us_test_s2@we-deliver.net");
        webmailLoginPage.passwordSendKeys("(v=IlNv.J{3;");
        webmailLoginPage.loginButtonClick();
        Thread.sleep(55000);
        driver.navigate().refresh();
        Thread.sleep(15000);
        driver.navigate().refresh();
        webmailLoginPage.emailsClickFirst();
        driver.switchTo().frame("messagecontframe");
        String token1 = webmailLoginPage.tokenGetText();
        System.out.println(webmailLoginPage.tokenGetText());
        driver.switchTo().defaultContent();
        driver.switchTo().window(tabs.get(0));
        loginStudentPage.emailForgotPasswordSendKeys(token1);
        loginStudentPage.sendRequestButtonClick();
        loginStudentPage.newPasswordSendKeys();
        loginStudentPage.repeatNewPasswordSendKeys();
        loginStudentPage.submitNewPasswordClick();
        Thread.sleep(2000);
        String dashboardPage = driver.getCurrentUrl();
        String expectedUrl = "https://student-staging.upstrivesystem.com/home";
        Assert.assertEquals(dashboardPage, expectedUrl);


    }

    @Test (priority = 3)
    public void showPassword () {
        loginStudentPage.emailSendKeys("us_test_s1@we-deliver.net");
        loginStudentPage.passwordSendKeys("Golub1987!");
        loginStudentPage.showPasswordClick();
        Assert.assertTrue(loginStudentPage.passwordInputFieldIsDisplayed());
        Assert.assertEquals(loginStudentPage.passwordInputFieldGetAtribute(), "Golub1987!");
    }


    @Test (priority = 4)
    public void studentS1EmotionAngry() throws InterruptedException {
        loginStudentPage.emailSendKeys("us_test_s1@we-deliver.net");
        loginStudentPage.passwordSendKeys("Golub1987!");
        loginStudentPage.loginButtonClick();
        int repeatCount = 8;
        int i;
        for (i = 0; i < repeatCount; i++) {
            feedTasksPage.dialyEmotionArowClick();
        }
        feedTasksPage.emotionAngryClick();
        feedTasksPage.socialMediaIcon();
        feedTasksPage.wellBeingIconClick();
        feedTasksPage.textEmotionSendKeys("ANGRY!!!!");
        feedTasksPage.buttonSubmitEmotionClick();
        Assert.assertTrue(feedTasksPage.notificationStudentIsDisplayed());
        Assert.assertEquals(feedTasksPage.notificationStudentGetText(), "Your emotion is confirmed");
        //feedTasksPage.buttonXEmotionClick();
        Thread.sleep(1000);
        feedTasksPage.notificationCloseButton();
        feedTasksPage.sliderButtonMoveToElement();
        feedTasksPage.continueButtonClick();
        feedTasksPage.secretKeyEmotionsSendKeys("123");
        feedTasksPage.saveSecretKeyClick();
        Assert.assertTrue(feedTasksPage.notificationStudentIsDisplayed());
        Assert.assertEquals("Secret key has been saved", feedTasksPage.notificationStudentGetText());
        feedTasksPage.personalNotesSendKeys("Selenium automation testing");
        feedTasksPage.improveThingsInputFieldSendKeys("Test");
        feedTasksPage.emotionElementScroll();
        feedTasksPage.suggestionClick();
        feedTasksPage.continueButtonClick();
        feedTasksPage.todayNotesSendKeys("Test");
        feedTasksPage.continue2();
        Thread.sleep(1000);
        feedTasksPage.notificationCloseButton();
        Thread.sleep(4000);
        feedTasksPage.profileClick();
        ((JavascriptExecutor) driver).executeScript("window.scrollBy (0,400)");
        profileStudentPage.logoutButtonClick();
        profileStudentPage.confirmLogoutClick();
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://student-staging.upstrivesystem.com/";
        Assert.assertEquals(actualUrl, expectedUrl);


    }




    @Test (priority = 5)
    public void studentNikolaGolubovicEmotionHappy() throws InterruptedException {
        loginStudentPage.emailSendKeys("nikola87.golubovic@gmail.com");
        loginStudentPage.passwordSendKeys("Golub1987!");
        loginStudentPage.loginButtonClick();
        feedTasksPage.emotionHappyClick();
        feedTasksPage.mySelfIconClick();
        feedTasksPage.familyIconClick();
        feedTasksPage.friendsIconClick();
        feedTasksPage.textEmotionSendKeys("I am very happy because I love Selenium Java!!!!!");
        feedTasksPage.buttonSubmitEmotionClick();
        Assert.assertTrue(feedTasksPage.notificationStudentIsDisplayed());
        Assert.assertEquals(feedTasksPage.notificationStudentGetText(), "Your emotion is confirmed");
        feedTasksPage.buttonXEmotionClick();
        Thread.sleep(1000);
        feedTasksPage.notificationCloseButton();
        feedTasksPage.profileClick();
        ((JavascriptExecutor) driver).executeScript("window.scrollBy (0,400)");
        profileStudentPage.logoutButtonClick();
        profileStudentPage.confirmLogoutClick();
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://student-staging.upstrivesystem.com/";
        Assert.assertEquals(actualUrl, expectedUrl);


    }

    @Test (priority = 6)
    public void studentMilenaNastasovicEmotionEstatic() throws InterruptedException {
        loginStudentPage.emailSendKeys("nikola87.golubovic+1@gmail.com");
        loginStudentPage.passwordSendKeys("Golub1987!");
        loginStudentPage.loginButtonClick();
        feedTasksPage.emotionStaticClick();
        feedTasksPage.mySelfIconClick();
        feedTasksPage.familyIconClick();
        feedTasksPage.friendsIconClick();
        feedTasksPage.textEmotionSendKeys("FEELING GOOD!!!!");
        feedTasksPage.buttonSubmitEmotionClick();
        Assert.assertTrue(feedTasksPage.notificationStudentIsDisplayed());
        Assert.assertEquals(feedTasksPage.notificationStudentGetText(), "Your emotion is confirmed");
        feedTasksPage.buttonXEmotionClick();
        Thread.sleep(1000);
        feedTasksPage.notificationCloseButton();
        feedTasksPage.profileClick();
        ((JavascriptExecutor) driver).executeScript("window.scrollBy (0,400)");
        profileStudentPage.logoutButtonClick();
        profileStudentPage.confirmLogoutClick();
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://student-staging.upstrivesystem.com/";
        Assert.assertEquals(actualUrl, expectedUrl);


    }

    @Test (priority = 7)
    public void studentAnaPetrovicEmotionCalm() throws InterruptedException {
        loginStudentPage.emailSendKeys("nikola87.golubovic+4@gmail.com");
        loginStudentPage.passwordSendKeys("Golub1987!");
        loginStudentPage.loginButtonClick();
        feedTasksPage.emotionCalmClick();
        feedTasksPage.mySelfIconClick();
        feedTasksPage.friendsIconClick();
        feedTasksPage.textEmotionSendKeys("Feeling calm about myself and my friends");
        feedTasksPage.buttonSubmitEmotionClick();
        Assert.assertTrue(feedTasksPage.notificationStudentIsDisplayed());
        Assert.assertEquals(feedTasksPage.notificationStudentGetText(), "Your emotion is confirmed");
        feedTasksPage.buttonXEmotionClick();
        Thread.sleep(1000);
        feedTasksPage.notificationCloseButton();
        feedTasksPage.profileClick();
        ((JavascriptExecutor) driver).executeScript("window.scrollBy (0,400)");
        profileStudentPage.logoutButtonClick();
        profileStudentPage.confirmLogoutClick();
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://student-staging.upstrivesystem.com/";
        Assert.assertEquals(actualUrl, expectedUrl);



    }

    @Test (priority = 8)
    public void studentMarkoNikolicEmotionHappy() throws InterruptedException {
        loginStudentPage.emailSendKeys("nikola87.golubovic+2@gmail.com");
        loginStudentPage.passwordSendKeys("Golub1987!");
        loginStudentPage.loginButtonClick();
        feedTasksPage.emotionHappyClick();
        feedTasksPage.mySelfIconClick();
        feedTasksPage.textEmotionSendKeys(":D :D :D :D");
        feedTasksPage.buttonSubmitEmotionClick();
        Assert.assertTrue(feedTasksPage.notificationStudentIsDisplayed());
        Assert.assertEquals(feedTasksPage.notificationStudentGetText(), "Your emotion is confirmed");
        feedTasksPage.buttonXEmotionClick();
        Thread.sleep(1000);
        feedTasksPage.notificationCloseButton();
        feedTasksPage.profileClick();
        ((JavascriptExecutor) driver).executeScript("window.scrollBy (0,400)");
        profileStudentPage.logoutButtonClick();
        profileStudentPage.confirmLogoutClick();
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://student-staging.upstrivesystem.com/";
        Assert.assertEquals(actualUrl, expectedUrl);


    }

    @Test (priority = 9)
    public void studentNemanjaPetrovicEmotionWorried() throws InterruptedException {
        loginStudentPage.emailSendKeys("nikola87.golubovic+3@gmail.com");
        loginStudentPage.passwordSendKeys("Golub1987!");
        loginStudentPage.loginButtonClick();
        int repeatArrowClick = 4;
        int i;
        for (i=0; i<repeatArrowClick; i++){
        feedTasksPage.dialyEmotionArowClick();}
        feedTasksPage.emotionWorriedClick();
        feedTasksPage.mySelfIconClick();
        feedTasksPage.textEmotionSendKeys("I am worried about exams :(");
        feedTasksPage.buttonSubmitEmotionClick();
        Assert.assertTrue(feedTasksPage.notificationStudentIsDisplayed());
        Assert.assertEquals(feedTasksPage.notificationStudentGetText(), "Your emotion is confirmed");
        feedTasksPage.buttonXEmotionClick();
        Thread.sleep(1000);
        feedTasksPage.notificationCloseButton();
        feedTasksPage.profileClick();
        ((JavascriptExecutor) driver).executeScript("window.scrollBy (0,400)");
        profileStudentPage.logoutButtonClick();
        profileStudentPage.confirmLogoutClick();
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://student-staging.upstrivesystem.com/";
        Assert.assertEquals(actualUrl, expectedUrl);


    }


    @Test (priority = 10)
    public void studentDejanGajinEmotionGood() throws InterruptedException {
        loginStudentPage.emailSendKeys("nikola87.golubovic+5@gmail.com");
        loginStudentPage.passwordSendKeys("Golub1987!");
        loginStudentPage.loginButtonClick();
        int repeatArrowClick = 4;
        int i;
        for (i=0; i<repeatArrowClick; i++){
            feedTasksPage.dialyEmotionArowClick();}
        feedTasksPage.emotionGoodClick();
        feedTasksPage.mySelfIconClick();
        feedTasksPage.achievementIconClick();
        feedTasksPage.healthIconClick();
        feedTasksPage.textEmotionSendKeys("Today is a good day!!! :D");
        feedTasksPage.buttonSubmitEmotionClick();
        Assert.assertTrue(feedTasksPage.notificationStudentIsDisplayed());
        Assert.assertEquals(feedTasksPage.notificationStudentGetText(), "Your emotion is confirmed");
        feedTasksPage.buttonXEmotionClick();
        Thread.sleep(1000);
        feedTasksPage.notificationCloseButton();
        feedTasksPage.profileClick();
        ((JavascriptExecutor) driver).executeScript("window.scrollBy (0,400)");
        profileStudentPage.logoutButtonClick();
        profileStudentPage.confirmLogoutClick();
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://student-staging.upstrivesystem.com/";
        Assert.assertEquals(actualUrl, expectedUrl);


    }

    @Test (priority = 11)
    public void studentMilosMazalicaEmotionSad() throws InterruptedException {
        loginStudentPage.emailSendKeys("nikola87.golubovic+6@gmail.com");
        loginStudentPage.passwordSendKeys("Golub1987!");
        loginStudentPage.loginButtonClick();
        int repeatArrowClick = 8;
        int i;
        for (i=0; i<repeatArrowClick; i++){
            feedTasksPage.dialyEmotionArowClick();}
        feedTasksPage.emotionSadClick();
        feedTasksPage.mySelfIconClick();
        feedTasksPage.healthIconClick();
        feedTasksPage.sleepIconClick();
        feedTasksPage.textEmotionSendKeys("I am ill!!!!");
        feedTasksPage.buttonSubmitEmotionClick();
        Assert.assertTrue(feedTasksPage.notificationStudentIsDisplayed());
        Assert.assertEquals(feedTasksPage.notificationStudentGetText(), "Your emotion is confirmed");
        feedTasksPage.buttonXEmotionClick();
        Thread.sleep(1000);
        feedTasksPage.notificationCloseButton();
        feedTasksPage.profileClick();
        ((JavascriptExecutor) driver).executeScript("window.scrollBy (0,400)");
        profileStudentPage.logoutButtonClick();
        profileStudentPage.confirmLogoutClick();
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://student-staging.upstrivesystem.com/";
        Assert.assertEquals(actualUrl, expectedUrl);


    }

    @Test (priority = 12)
    public void studentNebojsaSpasojevicEmotionStressed() throws InterruptedException {
        loginStudentPage.emailSendKeys("nikola87.golubovic+7@gmail.com");
        loginStudentPage.passwordSendKeys("Golub1987!");
        loginStudentPage.loginButtonClick();
        int repeatArrowClick = 8;
        int i;
        for (i=0; i<repeatArrowClick; i++){
            feedTasksPage.dialyEmotionArowClick();}
        feedTasksPage.emotionStressedClick();
        feedTasksPage.mySelfIconClick();
        feedTasksPage.healthIconClick();
        feedTasksPage.sleepIconClick();
        feedTasksPage.textEmotionSendKeys("Stress day for me!!");
        feedTasksPage.buttonSubmitEmotionClick();
        Assert.assertTrue(feedTasksPage.notificationStudentIsDisplayed());
        Assert.assertEquals(feedTasksPage.notificationStudentGetText(), "Your emotion is confirmed");
        feedTasksPage.buttonXEmotionClick();
        Thread.sleep(1000);
        feedTasksPage.notificationCloseButton();
        feedTasksPage.profileClick();
        ((JavascriptExecutor) driver).executeScript("window.scrollBy (0,400)");
        profileStudentPage.logoutButtonClick();
        profileStudentPage.confirmLogoutClick();
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://student-staging.upstrivesystem.com/";
        Assert.assertEquals(actualUrl, expectedUrl);


    }



    @Test (priority = 13)
    public void studentS1SendMessage() throws InterruptedException {
        loginStudentPage.emailSendKeys("us_test_s1@we-deliver.net");
        loginStudentPage.passwordSendKeys("Golub1987!");
        loginStudentPage.loginButtonClick();
        feedTasksPage.buttonChatClick();
        chatStudentPage.sendMessageTeacher1Click();
        chatStudentPage.messageInputFieldSendKeys("Hello Teacher");
        chatStudentPage.buttonSendMessageClick();
        Thread.sleep(1000);
        feedTasksPage.profileClick();
        ((JavascriptExecutor) driver).executeScript("window.scrollBy (0,400)");
        profileStudentPage.logoutButtonClick();
        profileStudentPage.confirmLogoutClick();
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://student-staging.upstrivesystem.com/";
        Assert.assertEquals(actualUrl, expectedUrl);


    }


    @Test (priority = 14, enabled = false)
    public void answerNewTrend () throws InterruptedException {
        loginStudentPage.emailSendKeys("us_test_s1@we-deliver.net");
        loginStudentPage.passwordSendKeys("Golub1987!");
        loginStudentPage.loginButtonClick();
        feedTasksPage.scrollBarscroll();
        feedTasksPage.answerTrendClickYes();
        feedTasksPage.buttonSubmitPollClick();
        Thread.sleep(1000);
        Assert.assertTrue(feedTasksPage.notificationStudentIsDisplayed());
        Assert.assertEquals(feedTasksPage.notificationStudentGetText(), "Your answer is saved" );
        feedTasksPage.feedbackCloseButtonClick();
        Thread.sleep(3000);
        feedTasksPage.profileClick();
        ((JavascriptExecutor) driver).executeScript("window.scrollBy (0,400)");
        profileStudentPage.logoutButtonClick();
        profileStudentPage.confirmLogoutClick();
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://student-staging.upstrivesystem.com/";
        Assert.assertEquals(actualUrl, expectedUrl);

    }


    @Test (priority = 15)
    public void answerSurveyS1() throws InterruptedException {
        loginStudentPage.emailSendKeys("us_test_s1@we-deliver.net");
        loginStudentPage.passwordSendKeys("Golub1987!");
        loginStudentPage.loginButtonClick();
        feedTasksPage.scrollBarscroll();
        feedTasksPage.answerSurveyClick();
        feedTasksPage.buttonTakeItClick();
        feedTasksPage.buttonYesSurveyClick();
        feedTasksPage.buttonFinishSurveyClick();
        Thread.sleep(1000);
        Assert.assertTrue(feedTasksPage.notificationStudentIsDisplayed());
        Assert.assertEquals(feedTasksPage.notificationStudentGetText(), "Your results are saved!" );
        feedTasksPage.feedbackCloseButtonClick();
        Thread.sleep(3000);
        feedTasksPage.profileClick();
        ((JavascriptExecutor) driver).executeScript("window.scrollBy (0,400)");
        profileStudentPage.logoutButtonClick();
        profileStudentPage.confirmLogoutClick();
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://student-staging.upstrivesystem.com/";
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    @Test (priority = 16)
    public void answerQuestionS1() throws InterruptedException {
        loginStudentPage.emailSendKeys("us_test_s1@we-deliver.net");
        loginStudentPage.passwordSendKeys("Golub1987!");
        loginStudentPage.loginButtonClick();
        feedTasksPage.scrollBarscroll();
        feedTasksPage.answerQuestionInputFieldSendKeys("I am good.");
        feedTasksPage.buttonSubmitQuestionClick();
        Thread.sleep(1000);
        Assert.assertTrue(feedTasksPage.notificationStudentIsDisplayed());
        Assert.assertEquals(feedTasksPage.notificationStudentGetText(), "Your answer is saved");
        feedTasksPage.feedbackCloseButtonClick();
        Thread.sleep(3000);
        feedTasksPage.profileClick();
        ((JavascriptExecutor) driver).executeScript("window.scrollBy (0,400)");
        profileStudentPage.logoutButtonClick();
        profileStudentPage.confirmLogoutClick();
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://student-staging.upstrivesystem.com/";
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    @Test (priority = 17)
    public void answerPollS1 () throws InterruptedException {
        loginStudentPage.emailSendKeys("us_test_s1@we-deliver.net");
        loginStudentPage.passwordSendKeys("Golub1987!");
        loginStudentPage.loginButtonClick();
        feedTasksPage.scrollBarscroll();
        feedTasksPage.answerPollYesClick();
        feedTasksPage.buttonSubmitPollClick();
        Thread.sleep(1000);
        Assert.assertTrue(feedTasksPage.notificationStudentIsDisplayed());
        Assert.assertEquals(feedTasksPage.notificationStudentGetText(), "Your answer is saved");
        feedTasksPage.feedbackCloseButtonClick();
        Thread.sleep(3000);
        feedTasksPage.profileClick();
        ((JavascriptExecutor) driver).executeScript("window.scrollBy (0,400)");
        profileStudentPage.logoutButtonClick();
        profileStudentPage.confirmLogoutClick();
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://student-staging.upstrivesystem.com/";
        Assert.assertEquals(actualUrl, expectedUrl);
    }



    @Test (priority = 18)
    public void changeSecurityKey () throws InterruptedException {
        loginStudentPage.emailSendKeys("us_test_s1@we-deliver.net");
        loginStudentPage.passwordSendKeys("Golub1987!");
        loginStudentPage.loginButtonClick();
        Assert.assertTrue(feedTasksPage.homeButtonIsDisplayed());
        feedTasksPage.profileClick();
        profileStudentPage.changeSecurutyKeySendKeys("12345");
        profileStudentPage.saveButtonClick();
        Assert.assertTrue(profileStudentPage.notificationIsDisplayed());
        Assert.assertEquals(profileStudentPage.notificationGetText(), "Your secret key is saved");
        Thread.sleep(3000);
        feedTasksPage.profileClick();
        ((JavascriptExecutor) driver).executeScript("window.scrollBy (0,400)");
        profileStudentPage.logoutButtonClick();
        profileStudentPage.confirmLogoutClick();
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://student-staging.upstrivesystem.com/";
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    @Test (priority = 19)
    public void changePassword () throws InterruptedException {
        loginStudentPage.emailSendKeys("us_test_s1@we-deliver.net");
        loginStudentPage.passwordSendKeys("Golub1987!");
        loginStudentPage.loginButtonClick();
        Assert.assertTrue(feedTasksPage.homeButtonIsDisplayed());
        feedTasksPage.profileClick();
        ((JavascriptExecutor) driver).executeScript("window.scrollBy (0,400)");
        profileStudentPage.changePasswordSendKeys("Golub1987!");
        profileStudentPage.retypePasswordSendKeys("Golub1987!");
        profileStudentPage.passwordSaveButtonClick();
        Assert.assertTrue(profileStudentPage.notificationIsDisplayed());
        Assert.assertEquals(profileStudentPage.notificationGetText(), "User is updated");
        Thread.sleep(3000);
        feedTasksPage.profileClick();
        ((JavascriptExecutor) driver).executeScript("window.scrollBy (0,400)");
        profileStudentPage.logoutButtonClick();
        profileStudentPage.confirmLogoutClick();
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://student-staging.upstrivesystem.com/";
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    @Test (priority = 20)
    public void howWasYourDay () throws InterruptedException {
        loginStudentPage.emailSendKeys("us_test_s1@we-deliver.net");
        loginStudentPage.passwordSendKeys("Golub1987!");
        loginStudentPage.loginButtonClick();
        Assert.assertTrue(feedTasksPage.homeButtonIsDisplayed());
        feedTasksPage.dialyReflectionClick();
        feedTasksPage.secretKeyEmotionsSendKeys("123");
        feedTasksPage.saveSecretKeyClick();
        Assert.assertTrue(feedTasksPage.notificationStudentIsDisplayed());
        Assert.assertEquals("Secret key has been saved", feedTasksPage.notificationStudentGetText());
        feedTasksPage.firstSectionFirstAnswerSendKeys();
        feedTasksPage.firstSectionSecondAnswerSendKeys();
        feedTasksPage.firstSectionThirdAnswerSendKeys();
        feedTasksPage.secondSectionFirstAnswerSendKeys();
        feedTasksPage.secondSectionSecondAnswerSendKeys();
        feedTasksPage.secondSectionThirdAnswerSendKeys();
        feedTasksPage.thirdSectionInputFieldSendKeys();
        feedTasksPage.saveAndContinueClick();
        feedTasksPage.todayNotesSendKeys("test");
        Thread.sleep(4000);
        feedTasksPage.continue1ButtonClick();
        Assert.assertTrue(feedTasksPage.notificationStudentIsDisplayed());
        Assert.assertEquals("Private note has been saved", feedTasksPage.notificationStudentGetText());
        feedTasksPage.feedbackCloseButtonClick();
        Thread.sleep(4000);
        feedTasksPage.profileClick();
        ((JavascriptExecutor) driver).executeScript("window.scrollBy (0,400)");
        profileStudentPage.logoutButtonClick();
        profileStudentPage.confirmLogoutClick();
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://student-staging.upstrivesystem.com/";
        Assert.assertEquals(actualUrl, expectedUrl);

    }


    @Test (priority = 21, retryAnalyzer = Retry.class)
    public void deletePrivateNotes () throws InterruptedException {
        loginStudentPage.emailSendKeys("us_test_s1@we-deliver.net");
        loginStudentPage.passwordSendKeys("Golub1987!");
        loginStudentPage.loginButtonClick();
        Assert.assertTrue(feedTasksPage.homeButtonIsDisplayed());
        feedTasksPage.profileClick();
        profileStudentPage.privateNotestClick();
        profileStudentPage.secretKeySendKeys();
        profileStudentPage.saveSecretKeyClick();
        Assert.assertTrue(feedTasksPage.notificationStudentIsDisplayed());
        Assert.assertEquals(feedTasksPage.notificationStudentGetText(), "Secret key has been saved");
        Thread.sleep(5000);
        int repeatDeletePrivateNotes = 1;
        for (int i = 0; i<repeatDeletePrivateNotes; i++){
        profileStudentPage.reflectionFeedbackClick();
        ((JavascriptExecutor) driver).executeScript("window.scrollBy (0,400)");
        profileStudentPage.deleteNoteClick();
        profileStudentPage.confirmDeleteNoteClick();
        Assert.assertTrue(profileStudentPage.notificationIsDisplayed());
        Assert.assertEquals(profileStudentPage.notificationGetText(), "Note has been deleted");
        profileStudentPage.closeNotificationButtonClick();

         }
        Thread.sleep(2000);
        feedTasksPage.profileClick();
        //((JavascriptExecutor) driver).executeScript("window.scrollBy (0,400)");
        profileStudentPage.logoutButtonClick();
        profileStudentPage.confirmLogoutClick();
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://student-staging.upstrivesystem.com/";
        Assert.assertEquals(actualUrl, expectedUrl);
    }


    @Test (priority = 22)
    public void checkLinkFeedPage () throws InterruptedException {
        loginStudentPage.emailSendKeys("us_test_s1@we-deliver.net");
        loginStudentPage.passwordSendKeys("Golub1987!");
        loginStudentPage.loginButtonClick();
        feedTasksPage.openLinkButtonClick();
        Thread.sleep(3000);
        //System.out.println(driver.findElements(By.xpath("//div[@class='open-link-button']")).size());
        Set<String> handles = driver.getWindowHandles();
        List<String> handlesList = new ArrayList<>(handles);
        driver.switchTo().window(handlesList.get(1));
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.youtube.com/");
        driver.switchTo().window(handlesList.get(0));
        Thread.sleep(2000);
        feedTasksPage.profileClick();
        ((JavascriptExecutor) driver).executeScript("window.scrollBy (0,400)");
        profileStudentPage.logoutButtonClick();
        profileStudentPage.confirmLogoutClick();
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://student-staging.upstrivesystem.com/";
        Assert.assertEquals(actualUrl, expectedUrl);
    }


    @Test (priority = 23)
    public void checkSearchFieldFeed () throws InterruptedException {
        loginStudentPage.emailSendKeys("us_test_s1@we-deliver.net");
        loginStudentPage.passwordSendKeys("Golub1987!");
        loginStudentPage.loginButtonClick();
        feedTasksPage.searchInputFieldSendKeys();
        Thread.sleep(2000);
        Assert.assertEquals(feedTasksPage.searchResultGetText(), "Test search field");
        Thread.sleep(2000);
        feedTasksPage.profileClick();
        ((JavascriptExecutor) driver).executeScript("window.scrollBy (0,400)");
        profileStudentPage.logoutButtonClick();
        profileStudentPage.confirmLogoutClick();
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://student-staging.upstrivesystem.com/";
        Assert.assertEquals(actualUrl, expectedUrl);
        //Thread.sleep(2000);


    }


    @Test (priority = 24)
    public void checkSearchFieldMessage() throws InterruptedException {
        loginStudentPage.emailSendKeys("us_test_s1@we-deliver.net");
        loginStudentPage.passwordSendKeys("Golub1987!");
        loginStudentPage.loginButtonClick();
        feedTasksPage.buttonChatClick();
        chatStudentPage.searchFieldInChatSendKeys();
        Thread.sleep(2000);
        chatStudentPage.assertSearch();
        Thread.sleep(2000);
        feedTasksPage.profileClick();
        ((JavascriptExecutor) driver).executeScript("window.scrollBy (0,400)");
        profileStudentPage.logoutButtonClick();
        profileStudentPage.confirmLogoutClick();
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://student-staging.upstrivesystem.com/";
        Assert.assertEquals(actualUrl, expectedUrl);
        //prebaciti u java stream

    }

    @Test (priority = 25)
    public void checkLinkSolutions () throws InterruptedException {
        loginStudentPage.emailSendKeys("nikola87.golubovic+5@gmail.com");
        loginStudentPage.passwordSendKeys("Golub1987!");
        loginStudentPage.loginButtonClick();
        feedTasksPage.buttonSolutionClick();
        Thread.sleep(2000);
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://student-staging.upstrivesystem.com/solutions";
        Assert.assertEquals(actualUrl, expectedUrl);
        Thread.sleep(2000);
        feedTasksPage.profileClick();
        ((JavascriptExecutor) driver).executeScript("window.scrollBy (0,400)");
        profileStudentPage.logoutButtonClick();
        profileStudentPage.confirmLogoutClick();
        String actualUrl1 = driver.getCurrentUrl();
        String expectedUrl1 = "https://student-staging.upstrivesystem.com/";
        Assert.assertEquals(actualUrl1, expectedUrl1);




    }


    @Test (priority = 26)
    public void checkSearchInMyselfInSolutions () throws InterruptedException {
        loginStudentPage.emailSendKeys("nikola87.golubovic+5@gmail.com");
        loginStudentPage.passwordSendKeys("Golub1987!");
        loginStudentPage.loginButtonClick();
        feedTasksPage.buttonSolutionClick();
        Thread.sleep(2000);
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://student-staging.upstrivesystem.com/solutions";
        Assert.assertEquals(actualUrl, expectedUrl);
        solutionsPage.myselfButtonClick();
        solutionsPage.searchFieldSendKeys();
        Thread.sleep(2000);
        List<WebElement> solutionsList = driver.findElements(By.xpath("//div[@class='issue-topic-title']"));
        List<WebElement> filteredList = solutionsList.stream().filter(student->student.getText().contains("hate")).toList();
        Assert.assertEquals(solutionsList.size(), filteredList.size());


    }


    @Test (priority = 27)
    public void checkLinksInSolutions() throws InterruptedException, IOException {
        loginStudentPage.emailSendKeys("nikola87.golubovic+5@gmail.com");
        loginStudentPage.passwordSendKeys("Golub1987!");
        loginStudentPage.loginButtonClick();
        feedTasksPage.buttonSolutionClick();
        Thread.sleep(3000);
        List<WebElement> links = driver.findElements(By.xpath("//a[@class='solutions-groups-link']"));
        SoftAssert a = new SoftAssert();
        for (WebElement link : links) {
            String url = link.getAttribute("href");
            HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
            conn.setRequestMethod("HEAD");
            conn.connect();
            int respCode = conn.getResponseCode();
            System.out.println(respCode);
            a.assertTrue(respCode < 400, "The link with Text" + link.getText() + "is broken with code" + respCode);
        }
        a.assertAll();

    }

    @Test (priority = 28)
    public void checkLinksInSolutionsMyself () throws InterruptedException, IOException {
        loginStudentPage.emailSendKeys("nikola87.golubovic+5@gmail.com");
        loginStudentPage.passwordSendKeys("Golub1987!");
        loginStudentPage.loginButtonClick();
        feedTasksPage.buttonSolutionClick();
        solutionsPage.myselfButtonClick();
        Thread.sleep(3000);
        List<WebElement> links = driver.findElements(By.xpath("//a[contains(@href, '/solutions/personal/')]"));
        SoftAssert a = new SoftAssert();
        for (WebElement link : links) {
            String url = link.getAttribute("href");
            HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
            conn.setRequestMethod("HEAD");
            conn.connect();
            int respCode = conn.getResponseCode();
            System.out.println(respCode);
            a.assertTrue(respCode < 400, "The link with Text" + link.getText() + "is broken with code" + respCode);
        }
        a.assertAll();

    }



    @Test (priority = 29)
    public void sendMessageFromSolutions () throws InterruptedException {
        loginStudentPage.emailSendKeys("nikola87.golubovic+5@gmail.com");
        loginStudentPage.passwordSendKeys("Golub1987!");
        loginStudentPage.loginButtonClick();
        feedTasksPage.buttonSolutionClick();
        solutionsPage.myselfButtonClick();
        solutionsPage.connectWithTheCounselorButtonClick();
        solutionsPage.topicInputFieldSendKeys();
        solutionsPage.messageInputFieldSendKeys();
        solutionsPage.sendMessageButtonClick();
        Thread.sleep(1000);
        Assert.assertTrue(solutionsPage.notificationSolutionsIsDisplayed());
        Assert.assertEquals(solutionsPage.notificationSolutionsGetText(), "Your message is sent! Someone will contact you soon");
        Thread.sleep(5000);
        feedTasksPage.profileClick();
        ((JavascriptExecutor) driver).executeScript("window.scrollBy (0,400)");
        profileStudentPage.logoutButtonClick();
        profileStudentPage.confirmLogoutClick();
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://student-staging.upstrivesystem.com/";
        Assert.assertEquals(actualUrl, expectedUrl);


    }

    @Test (priority = 30)
    public void answerSurveyReadyToGo () throws InterruptedException {
        loginStudentPage.emailSendKeys("us_test_s1@we-deliver.net");
        loginStudentPage.passwordSendKeys("Golub1987!");
        loginStudentPage.loginButtonClick();
        feedTasksPage.answerSurveyClick();
        feedTasksPage.buttonTakeItClick();
        feedTasksPage.answerSurveyQuestions();
        feedTasksPage.buttonFinishSurveyClick();
        Thread.sleep(1000);
        Assert.assertTrue(feedTasksPage.notificationStudentIsDisplayed());
        Assert.assertEquals(feedTasksPage.notificationStudentGetText(), "Your results are saved!" );
        feedTasksPage.feedbackCloseButtonClick();
        feedTasksPage.notificationCloseButton();
        feedTasksPage.profileClick();
        ((JavascriptExecutor) driver).executeScript("window.scrollBy (0,400)");
        profileStudentPage.logoutButtonClick();
        profileStudentPage.confirmLogoutClick();
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://student-staging.upstrivesystem.com/";
        Assert.assertEquals(actualUrl, expectedUrl);


    }




}
