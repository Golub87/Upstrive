package StudentPage;

import Base.BaseTestStudent;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class FeedTasksPage extends BaseTestStudent {

    public FeedTasksPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='daily-emotions-arrow ']//*[name()='svg']")
    WebElement dialyEmotionArow;
    @FindBy(xpath = "//*[name()='path' and contains(@d,'M29.9362 3')]")
    WebElement emotionAngry;

    @FindBy(xpath = "//button[@class='how-comment-submit']")
    WebElement buttonSubmitEmotion;

    @FindBy(xpath = "//div[@class='student-feedback-close-button']//*[name()='svg']")
    WebElement buttonXEmotion;

    @FindBy(xpath = "//div[contains(text(),'Chat')]")
    WebElement buttonChat;

    @FindBy(xpath = "//body/div[@id='root']/div[@id='home']/div[@class='authenticated-section']/div[@id='feedid']/div[contains(@class,'home-tasks-section')]/div[@class='home-task-list']/div[@class='home-tasks-section-container']/div[@id='scroll-inf-task']/div[contains(@class,'all-tasks-container')]/div[@class='infinite-scroll-component__outerdiv']/div[contains(@class,'infinite-scroll-component')]/div[1]/div[1]/div[1]")
    WebElement answerSurvey;

    @FindBy(xpath = "//div[@class='new-survey-takeit-button']")
    WebElement buttonTakeIt;

    @FindBy(xpath = "//div[@class='new-survey-options-list']//div[1]")
    WebElement buttonYesSurvey;

    @FindBy(xpath = "//p[normalize-space()='Finish']")
    WebElement buttonFinishSurvey;

    @FindBy(xpath = "//div[@class='home-task-list']")
    WebElement scrollBar;

    @FindBy (xpath = "//*[@id=\"scroll-inf-task\"]/div/div[3]/div/div[1]/div/div[3]/div/textarea")
    WebElement answerQUestionInputField;

    @FindBy (xpath = "//*[@id=\"scroll-inf-task\"]/div/div[3]/div/div[1]/div/button")
    WebElement buttonSubmitQuestion;

    @FindBy (xpath = "//button[@class='feed-poll-option '] [1]")
    List<WebElement> answerPollYes;

    @FindBy (xpath = "//*[@id=\"scroll-inf-task\"]/div/div[3]/div/div[1]/div/button")
    WebElement buttonSubmitPoll;

    @FindBy (xpath = "//*[@id=\"survey-scrolled\"]/div[2]/div/div[1]/div/div/div[2]")
    WebElement answerFirstQuestionAgree;

    @FindBy (xpath = "//*[@id=\"survey-scrolled\"]/div[2]/div/div[2]/div/div/div[2]")
    WebElement answerSecondQuestionAgree;

    @FindBy (xpath = "//*[@id=\"survey-scrolled\"]/div[2]/div/div[3]/div/div/div[2]")
    WebElement answerThirdQuestionAgree;
    @FindBy (xpath= "//div[@class='new-survey-options-item noselect question-selected']")
    WebElement answerFourthQuestionAgree;

    @FindBy (xpath = "//*[@id=\"survey-scrolled\"]/div[2]/div/div[5]/div/div/div[2]")
    WebElement answerFifthQuestionAgree;

    @FindBy (xpath = "//div[6]//div[1]//div[1]//div[2]//p[1]")
    WebElement answerSixtQuestionAgree;

    @FindBy (xpath = "//div[7]//div[1]//div[1]//div[2]//p[1]")
    WebElement answerSeventhQuestionAgree;

    @FindBy (xpath = "//div[@class='new-survey-options-item noselect question-selected']//p[contains(text(),'Always')]")
    WebElement answerEighthQuestionAlways;

    @FindBy (xpath = "//div[9]//div[1]//div[1]//div[2]//p[1]")
    WebElement answerNineQuestionAgree;

    @FindBy (xpath = "//div[10]//div[1]//div[1]//div[2]//p[1]")
    WebElement answerTenthQuestionUsually;

    @FindBy (xpath = "//div[11]//div[1]//div[1]//div[2]//p[1]")
    WebElement answerEleventhQuestionAgree;

    @FindBy (xpath = "//div[12]//div[1]//div[1]//div[2]//p[1]")
    WebElement answerTwelvethQuestionAgree;

    @FindBy (xpath = "//p[normalize-space()='Myself']")
    WebElement myselfIcon;

    @FindBy (xpath = "//textarea[@placeholder='Type any additional text here']")
    WebElement textEmotion;

    @FindBy (xpath = "//div[@class='notify-text-title']")
    WebElement notificationStudent;

    @FindBy (id = "survey-scrolled")
    WebElement surveyElement;

    @FindBy (xpath = "//div[@role='slider']//div//*[name()='svg']//*[name()='g' and contains(@filter,'url(#filte')]//*[name()='rect'][1]")
    WebElement sliderButton;

    @FindBy (xpath = "//div[@class='how-horizontal-slider']")
    WebElement muchBetter;

    @FindBy (xpath = "//p[normalize-space()='Continue']")
    WebElement continueButton;

    @FindBy (xpath = "//input[@placeholder='Enter secret keys']")
    WebElement secretKeyEmotions;

    @FindBy (xpath = "//p[@class='new-secret-save-text']")
    WebElement saveSecretKey;

    @FindBy (xpath = "//textarea[@placeholder='Write your personal notes here (only you can see this)']")
    WebElement personalNotes;

    @FindBy (xpath = "//div[@class='how-are-you-container']//div[1]//input[1]")
    WebElement improveThingsInputField;

    @FindBy (xpath = "//div[@class='how-suggestion-item']")
    WebElement suggestion;

    @FindBy (xpath = "//input[@placeholder='Name of today note']")
    WebElement todayNotes;

    @FindBy (xpath= "//div[@class='ReactModal__Content ReactModal__Content--after-open student-feedback-no-scroll']")
    WebElement emotionElement;

    @FindBy (xpath= "//button[@class='how-are-you-save-button']")
    WebElement continue1Button;

    @FindBy (xpath = "//*[@id=\"my-header\"]/div/div[3]/a/div[2]")
    WebElement homeButton;

    @FindBy (xpath = "//*[@id=\"my-header\"]/div/div[6]/a/div[2]")
    WebElement profile;

    @FindBy (xpath = "//*[@id=\"scroll-inf-task\"]/div/div[2]")
    WebElement dialyReflection;

    @FindBy (xpath = "//div[@class='day-refletiocn-dboy']//div[2]//div[1]//div[1]//div[1]//input[1]")
    WebElement firstSectionFirstAnswer;

    @FindBy (xpath = "//div[@class='day-refletiocn-dboy']//div[2]//div[1]//div[2]//div[1]//input[1]")
    WebElement firstSectionSecondAnswer;

    @FindBy (xpath = "//div[@class='day-refletiocn-dboy']//div[2]//div[1]//div[3]//div[1]//input[1]")
    WebElement firstSectionThirdAnswer;


    @FindBy (xpath = "//div[3]//div[1]//div[1]//div[1]//input[1]")
    WebElement secondSectionFirstAnswer;

    @FindBy (xpath = "//div[3]//div[1]//div[2]//div[1]//input[1]")
    WebElement secondSectionSecondAnswer;

    @FindBy (xpath = "//div[3]//div[1]//div[3]//div[1]//input[1]")
    WebElement secondSectionThirdAnswer;

    @FindBy (xpath = "//textarea[@placeholder='Type one thing here']")
    WebElement thirdSectionInputField;

    @FindBy (xpath = "//p[@class='reflection-takeit-text']")
    WebElement saveAndContinue;

    @FindBy (xpath = "/html/body/div[6]/div/div/div[2]/div[2]")
    WebElement howWasYourDay;

    @FindBy (css = "div[class='how-load-more-suggestions'] p")
    WebElement loadMoreSuggestions;

    @FindBy (xpath = "//body/div[@id='root']/div[@id='home']/div[@class='authenticated-section']/div[@id='feedid']/div[@class='home-tasks-section ']/div[@class='home-task-list']/div[@class='home-tasks-section-container']/div[@id='scroll-inf-task']/div[@class='all-tasks-container ']/div[@class='daily-container']/div[@class='daily-inner-container ']/div[@class='daily-emotions-container']/div[@class='daily-emotions-inner-container']/div[@class='daily-list']/div[1]/div[1]//*[name()='svg']//*[name()='path' and contains(@d,'M29.9999 5')]")
    WebElement emotionHappy;

    @FindBy (xpath = "//body/div[@id='root']/div[@id='home']/div[@class='authenticated-section']/div[@id='feedid']/div[@class='home-tasks-section ']/div[@class='home-task-list']/div[@class='home-tasks-section-container']/div[@id='scroll-inf-task']/div[@class='all-tasks-container ']/div[@class='daily-container']/div[@class='daily-inner-container ']/div[@class='daily-emotions-container']/div[@class='daily-emotions-inner-container']/div[@class='daily-list']/div[2]/div[1]//*[name()='svg']//*[name()='path' and contains(@d,'M29.9999 5')]")
    WebElement emotionEstatic;

    @FindBy (xpath = "//body/div[@id='root']/div[@id='home']/div[@class='authenticated-section']/div[@id='feedid']/div[@class='home-tasks-section ']/div[@class='home-task-list']/div[@class='home-tasks-section-container']/div[@id='scroll-inf-task']/div[@class='all-tasks-container ']/div[@class='daily-container']/div[@class='daily-inner-container ']/div[@class='daily-emotions-container']/div[@class='daily-emotions-inner-container']/div[@class='daily-list']/div[3]/div[1]//*[name()='svg']//*[name()='path' and contains(@d,'M29.9999 5')]")
    WebElement emotionInspired;

    @FindBy (xpath = "//body/div[@id='root']/div[@id='home']/div[@class='authenticated-section']/div[@id='feedid']/div[@class='home-tasks-section ']/div[@class='home-task-list']/div[@class='home-tasks-section-container']/div[@id='scroll-inf-task']/div[@class='all-tasks-container ']/div[@class='daily-container']/div[@class='daily-inner-container ']/div[@class='daily-emotions-container']/div[@class='daily-emotions-inner-container']/div[@class='daily-list']/div[4]/div[1]//*[name()='svg']//*[name()='path' and contains(@d,'M29.9999 5')]")
    WebElement emotionCalm;

    @FindBy (xpath = "//body/div[@id='root']/div[@id='home']/div[@class='authenticated-section']/div[@id='feedid']/div[@class='home-tasks-section ']/div[@class='home-task-list']/div[@class='home-tasks-section-container']/div[@id='scroll-inf-task']/div[@class='all-tasks-container ']/div[@class='daily-container']/div[@class='daily-inner-container ']/div[@class='daily-emotions-container']/div[@class='daily-emotions-inner-container']/div[@class='daily-list']/div[1]/div[1]//*[name()='svg']//*[name()='path' and contains(@d,'M31.4999 6')]")
    WebElement emotionGood;

    @FindBy (xpath = "//body/div[@id='root']/div[@id='home']/div[@class='authenticated-section']/div[@id='feedid']/div[@class='home-tasks-section ']/div[@class='home-task-list']/div[@class='home-tasks-section-container']/div[@id='scroll-inf-task']/div[@class='all-tasks-container ']/div[@class='daily-container']/div[@class='daily-inner-container ']/div[@class='daily-emotions-container']/div[@class='daily-emotions-inner-container']/div[@class='daily-list']/div[2]/div[1]//*[name()='svg']//*[name()='path' and contains(@d,'M29.9999 5')]")
    WebElement emotionNumb;

    @FindBy (xpath = "//*[name()='path' and contains(@d,'M9.99998 2')]")
    WebElement emotionWorried;

    @FindBy (xpath = "//body/div[@id='root']/div[@id='home']/div[@class='authenticated-section']/div[@id='feedid']/div[@class='home-tasks-section ']/div[@class='home-task-list']/div[@class='home-tasks-section-container']/div[@id='scroll-inf-task']/div[@class='all-tasks-container ']/div[@class='daily-container']/div[@class='daily-inner-container ']/div[@class='daily-emotions-container']/div[@class='daily-emotions-inner-container']/div[@class='daily-list']/div[4]/div[1]//*[name()='svg']//*[name()='path' and contains(@d,'M29.9999 5')]")
    WebElement emotionLethargic;

    @FindBy (xpath = "//body/div[@id='root']/div[@id='home']/div[@class='authenticated-section']/div[@id='feedid']/div[contains(@class,'home-tasks-section')]/div[@class='home-task-list']/div[@class='home-tasks-section-container']/div[@id='scroll-inf-task']/div[contains(@class,'all-tasks-container')]/div[@class='daily-container']/div[contains(@class,'daily-inner-container')]/div[@class='daily-emotions-container']/div[@class='daily-emotions-inner-container']/div[@class='daily-list']/div[2]/div[1]//*[name()='svg']//*[name()='path' and contains(@d,'M29.9999 5')]")
    WebElement emotionSad;

    @FindBy (xpath = "//p[normalize-space()='Family']")
    WebElement familyIcon;

    @FindBy (xpath = "//p[normalize-space()='Friends']")
    WebElement friendsIcon;

    @FindBy (xpath = "//p[normalize-space()='School']")
    WebElement schoolIcon;

    @FindBy (xpath = "//p[normalize-space()='Social media']")
    WebElement socialMediaIcon;

    @FindBy (xpath = "//p[normalize-space()='Wellbeing']")
    WebElement wellbeingIcon;

    @FindBy (xpath = "//p[normalize-space()='Health']")
    WebElement healthIcon;

    @FindBy (xpath = "//p[normalize-space()='Achievement']")
    WebElement achievementIcon;

    @FindBy (xpath = "//p[normalize-space()='Sleep']")
    WebElement sleepIcon;

    @FindBy (xpath = "//body/div[@id='root']/div[@id='home']/div[@class='authenticated-section']/div[@id='feedid']/div[@class='home-tasks-section ']/div[@class='home-task-list']/div[@class='home-tasks-section-container']/div[@id='scroll-inf-task']/div[@class='all-tasks-container ']/div[@class='daily-container']/div[@class='daily-inner-container ']/div[@class='daily-emotions-container']/div[@class='daily-emotions-inner-container']/div[@class='daily-list']/div[3]/div[1]")
    WebElement emotionStressed;

    @FindBy (xpath = "//div[@class='open-link-button'] ")
    WebElement openLinkButton;


    @FindBy (xpath = "//input[@placeholder='Search']")
    WebElement searchInputField;


    @FindBy (xpath = "//div[@class='feed-content-title']")
    WebElement searchResult;

    @FindBy (xpath = "//button[@class='feed-poll-option ']")
    List<WebElement> answersPoll;

    @FindBy (xpath = "//a[@href='/solutions'] ")
    WebElement buttonSolutions;

    @FindBy (xpath = "//div[@class='student-feedback-close-button']")
    WebElement feedbackCloseButton;

    @FindBy (xpath = "//div[@class='notify-close-button']")
    WebElement notificationCloseButton;

    @FindBy (xpath = "//div[@class='how-suggestion-item']")
    List<WebElement> suggestions;


    @FindBy (xpath = "//button[@class='how-are-you-save-button']")
    WebElement continue2;

    @FindBy (xpath = "//div[@class='new-survey-options-item noselect '] [1]")
    List<WebElement> firstAnswers;

    public void answerSurveyQuestions () throws InterruptedException {
        wdWait.until(ExpectedConditions.visibilityOfAllElements(firstAnswers));
        firstAnswers.get(0).click();
        firstAnswers.get(1).click();
        //Thread.sleep(2000);
        wdWait.until(ExpectedConditions.visibilityOf(emotionElement));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        String script = "arguments[0].scrollTop = arguments[1];";
        jsExecutor.executeScript(script, emotionElement, 850);
        firstAnswers.get(2).click();
        firstAnswers.get(3).click();
        jsExecutor.executeScript(script, emotionElement, 850);
        firstAnswers.get(4).click();
        firstAnswers.get(5).click();
        firstAnswers.get(6).click();
        firstAnswers.get(7).click();
        firstAnswers.get(8).click();
        jsExecutor.executeScript(script, emotionElement, 1100);
        firstAnswers.get(9).click();


        //insert scroll inside element
    }






    public void continue2 (){
        wdWait.until(ExpectedConditions.visibilityOf(continue2)).click();
    }
    public void suggestionClick () {
        wdWait.until(ExpectedConditions.visibilityOfAllElements(suggestions));
        suggestions.get(0).click();
        suggestions.get(1).click();
    }

    public void feedbackCloseButtonClick () {
        wdWait.until(ExpectedConditions.visibilityOf(feedbackCloseButton)).click();
    }

    public void notificationCloseButton () {
        wdWait.until(ExpectedConditions.visibilityOf(notificationCloseButton)).click();
    }

    public void buttonSolutionClick () {
        wdWait.until(ExpectedConditions.visibilityOf(buttonSolutions)).click();
    }

    public void answerTrendClickYes () {
        wdWait.until(ExpectedConditions.visibilityOfAllElements(answersPoll));
        int answers = answersPoll.size();
        for (int i = 0; i<answers; i++) {
            String answerYes = answersPoll.get(i).getText();
            if (answerYes.equalsIgnoreCase("Yes")) {
                answersPoll.get(i).click();
                break;
            }
        }
    }

    public String searchResultGetText () {
        wdWait.until(ExpectedConditions.visibilityOf(searchResult));
        return searchResult.getText();
    }

    public void searchInputFieldSendKeys () {
        wdWait.until(ExpectedConditions.visibilityOf(searchInputField)).clear();
        searchInputField.sendKeys("search");
    }
    public void openLinkButtonClick () {
        wdWait.until(ExpectedConditions.visibilityOf(openLinkButton)).click();
    }

    public void emotionStressedClick () {
        wdWait.until(ExpectedConditions.visibilityOf(emotionStressed)).click();
    }

    public void emotionSadClick () {
        wdWait.until(ExpectedConditions.visibilityOf(emotionSad)).click();
    }
    public void schoolIconClick () {
        wdWait.until(ExpectedConditions.visibilityOf(schoolIcon)).click();
    }
    public void socialMediaIcon () {
        wdWait.until(ExpectedConditions.visibilityOf(socialMediaIcon)).click();
    }

    public void wellBeingIconClick () {
        wdWait.until(ExpectedConditions.visibilityOf(wellbeingIcon)).click();
    }

    public void healthIconClick () {
        wdWait.until(ExpectedConditions.visibilityOf(healthIcon)).click();
    }

    public void achievementIconClick () {
        wdWait.until(ExpectedConditions.visibilityOf(achievementIcon)).click();
    }

    public void sleepIconClick () {
        wdWait.until(ExpectedConditions.visibilityOf(sleepIcon)).click();
    }
    public void friendsIconClick () {
        wdWait.until(ExpectedConditions.visibilityOf(friendsIcon)).click();
    }
    public void familyIconClick () {
        wdWait.until(ExpectedConditions.visibilityOf(familyIcon)).click();
    }
    public void emotionLethargicClick () {
        wdWait.until(ExpectedConditions.visibilityOf(emotionLethargic)).click();
    }

    public void emotionWorriedClick () {
        wdWait.until(ExpectedConditions.visibilityOf(emotionWorried)).click();

    }
    public void emotionNumbClick () {
        wdWait.until(ExpectedConditions.visibilityOf(emotionNumb)).click();
    }
    public void emotionGoodClick () {
        wdWait.until(ExpectedConditions.visibilityOf(emotionGood)).click();
    }

    public void emotionCalmClick () {
        wdWait.until(ExpectedConditions.visibilityOf(emotionCalm)).click();
    }

    public void emotionInspiredClick () {
        wdWait.until(ExpectedConditions.visibilityOf(emotionInspired)).click();
    }
    public void emotionStaticClick () {
        wdWait.until(ExpectedConditions.visibilityOf(emotionEstatic)).click();
    }

    public void emotionHappyClick () {
        wdWait.until(ExpectedConditions.visibilityOf(emotionHappy)).click();
    }


    public void loadMoreSuggestionsClick () {
        int loadsuggestions = 21;
        int i;
        for (i=0; i<loadsuggestions; i++){
            wdWait.until(ExpectedConditions.visibilityOf(loadMoreSuggestions)).click();
        }
    }
    public void dialyReflectionClick () {
        wdWait.until(ExpectedConditions.visibilityOf(dialyReflection));
        dialyReflection.click();
    }


    public void firstSectionFirstAnswerSendKeys () {
        wdWait.until(ExpectedConditions.visibilityOf(firstSectionFirstAnswer)).clear();
        firstSectionFirstAnswer.sendKeys("Automated testing");
    }

    public void firstSectionSecondAnswerSendKeys () {
        wdWait.until(ExpectedConditions.visibilityOf(firstSectionSecondAnswer)).clear();
        firstSectionSecondAnswer.sendKeys("Automated testing");
    }

    public void firstSectionThirdAnswerSendKeys () {
        wdWait.until(ExpectedConditions.visibilityOf(firstSectionThirdAnswer)).clear();
        firstSectionThirdAnswer.sendKeys("Automated testing");
    }

    public void secondSectionFirstAnswerSendKeys () {
        wdWait.until(ExpectedConditions.visibilityOf(secondSectionFirstAnswer)).clear();
        secondSectionFirstAnswer.sendKeys("Automated testing");
    }

    public void secondSectionSecondAnswerSendKeys () {
        wdWait.until(ExpectedConditions.visibilityOf(secondSectionSecondAnswer)).clear();
        secondSectionSecondAnswer.sendKeys("Automated testing");
    }

    public void secondSectionThirdAnswerSendKeys () {
        wdWait.until(ExpectedConditions.visibilityOf(secondSectionThirdAnswer)).clear();
        secondSectionThirdAnswer.sendKeys("Automated testing");
    }

    public void thirdSectionInputFieldSendKeys () {
        wdWait.until(ExpectedConditions.visibilityOf(thirdSectionInputField)).clear();
        thirdSectionInputField.sendKeys("Automated testing");
    }

    public void saveAndContinueClick () {
        wdWait.until(ExpectedConditions.visibilityOf(saveAndContinue));
        saveAndContinue.click();
    }

    public void howWasYourDayscroll () {
        wdWait.until(ExpectedConditions.visibilityOf(howWasYourDay));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        String script = "arguments[0].scrollTop = arguments[1];";
        jsExecutor.executeScript(script, howWasYourDay, 400);
    }
    public void profileClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(profile));
        profile.click();
    }


    public boolean homeButtonIsDisplayed () {
        wdWait.until(ExpectedConditions.visibilityOf(homeButton));
        return homeButton.isDisplayed();
    }

    public void continue1ButtonClick () {
        wdWait.until(ExpectedConditions.visibilityOf(continue1Button));
        continue1Button.click();
    }

    public void emotionElementScroll () {
        wdWait.until(ExpectedConditions.visibilityOf(emotionElement));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        String script = "arguments[0].scrollTop = arguments[1];";
        jsExecutor.executeScript(script, emotionElement, 450);
    }
    public void todayNotesSendKeys (String notesName) {
        wdWait.until(ExpectedConditions.visibilityOf(todayNotes)).clear();
        todayNotes.sendKeys(notesName);
    }




    public void improveThingsInputFieldSendKeys (String text) {
        wdWait.until(ExpectedConditions.visibilityOf(improveThingsInputField)).clear();
        improveThingsInputField.sendKeys(text);
    }


    public void personalNotesSendKeys (String Notes) {
        wdWait.until(ExpectedConditions.visibilityOf(personalNotes)).clear();
        personalNotes.sendKeys(Notes);
    }


    public void saveSecretKeyClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(saveSecretKey));
        saveSecretKey.click();
    }

    public void secretKeyEmotionsSendKeys (String SecretKey) {
        wdWait.until(ExpectedConditions.elementToBeClickable(secretKeyEmotions)).clear();
        secretKeyEmotions.sendKeys(SecretKey);
    }

    public void continueButtonClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(continueButton));
        continueButton.click();
    }

    public void muchBetterClick () {
        wdWait.until(ExpectedConditions.visibilityOf(muchBetter));
        muchBetter.click();

    }

    public void sliderButtonMoveToElement () {
        wdWait.until(ExpectedConditions.elementToBeClickable(sliderButton));
        //actions.dragAndDrop(sliderButton,muchBetter).build().perform();
        actions.dragAndDropBy(sliderButton,-300, 0).build().perform();

    }

    public void surveyElementScroll () {
        wdWait.until(ExpectedConditions.visibilityOf(surveyElement));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        String script = "arguments[0].scrollTop = arguments[1];";
        jsExecutor.executeScript(script, surveyElement, 400);
    }
    public boolean notificationStudentIsDisplayed () {
        wdWait.until(ExpectedConditions.visibilityOf(notificationStudent));
        return notificationStudent.isDisplayed();
    }

    public String notificationStudentGetText () {
        wdWait.until(ExpectedConditions.visibilityOf(notificationStudent));
        return notificationStudent.getText();

    }
    public void mySelfIconClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(myselfIcon));
        myselfIcon.click();
    }

    public void textEmotionSendKeys (String text) {
        wdWait.until(ExpectedConditions.elementToBeClickable(textEmotion)).clear();
        textEmotion.sendKeys(text);
    }


    public void dialyEmotionArowClick() {
        wdWait.until(ExpectedConditions.elementToBeClickable(dialyEmotionArow));
        dialyEmotionArow.click();

    }

    public void emotionAngryClick() {
        wdWait.until(ExpectedConditions.visibilityOf(emotionAngry));
        emotionAngry.click();
    }

    public void buttonSubmitEmotionClick() {
        wdWait.until(ExpectedConditions.visibilityOf(buttonSubmitEmotion));
        buttonSubmitEmotion.click();
    }

    public void buttonXEmotionClick() {
        wdWait.until(ExpectedConditions.visibilityOf(buttonXEmotion));
        buttonXEmotion.click();
    }

    public void buttonChatClick() {
        wdWait.until(ExpectedConditions.elementToBeClickable(buttonChat));
        buttonChat.click();

    }

    public void answerSurveyClick() {
        wdWait.until(ExpectedConditions.elementToBeClickable(answerSurvey));
        answerSurvey.click();

    }

    public void buttonTakeItClick() {
        wdWait.until(ExpectedConditions.visibilityOf(buttonTakeIt));
        buttonTakeIt.click();
    }

    public void buttonYesSurveyClick() {
        wdWait.until(ExpectedConditions.visibilityOf(buttonYesSurvey));
        buttonYesSurvey.click();
    }

    public void buttonFinishSurveyClick() {
        wdWait.until(ExpectedConditions.visibilityOf(buttonFinishSurvey));
        buttonFinishSurvey.click();
    }

    public void scrollBarscroll() {
        wdWait.until(ExpectedConditions.visibilityOf(scrollBar));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        String script = "arguments[0].scrollTop = arguments[1];";
        jsExecutor.executeScript(script, scrollBar, 600);

    }

    public void answerQuestionInputFieldSendKeys (String answer) {
        wdWait.until(ExpectedConditions.visibilityOf(answerQUestionInputField)).clear();
        answerQUestionInputField.click();
        answerQUestionInputField.sendKeys(answer);
    }

    public void buttonSubmitQuestionClick() {
        wdWait.until(ExpectedConditions.visibilityOf(buttonSubmitQuestion));
        buttonSubmitQuestion.click();

    }
    public void answerPollYesClick () {
        wdWait.until(ExpectedConditions.visibilityOfAllElements(answerPollYes));
        answerPollYes.get(0).click();
    }

    public void buttonSubmitPollClick () {
        wdWait.until(ExpectedConditions.visibilityOf(buttonSubmitPoll));
        buttonSubmitPoll.click();
    }

    public void answerFirstQuestionAgreeClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(answerFirstQuestionAgree));
        answerFirstQuestionAgree.click();
    }

    public void answerSecondQuestionAgreeClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(answerSecondQuestionAgree));
        answerSecondQuestionAgree.click();
    }

    public void answerThirdQuestionAgreeClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(answerThirdQuestionAgree));
        answerThirdQuestionAgree.click();

    }

    public void answerFourthQuestionAgreeClick () {
        wdWait.until(ExpectedConditions.visibilityOf(answerFourthQuestionAgree));
        answerFourthQuestionAgree.click();
    }

    public void answerFifthQuestionAgreeClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(answerFifthQuestionAgree));
        answerFifthQuestionAgree.click();
    }

    public void answerSixtQuestionAgreeClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(answerSixtQuestionAgree));
        answerSixtQuestionAgree.click();
    }

    public void answerSeventhQuestionAgreeClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(answerSeventhQuestionAgree));
        answerSeventhQuestionAgree.click();
    }

    public void answerEightQuestionAlwaysClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(answerEighthQuestionAlways));
        answerEighthQuestionAlways.click();
    }

    public void answerNineQuestionAgreeClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(answerNineQuestionAgree));
        answerNineQuestionAgree.click();
    }

    public void answerTenthQuestionUsuallyClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(answerTenthQuestionUsually));
        answerTenthQuestionUsually.click();
    }

    public void answerEleventhQuestionAgreeClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(answerEleventhQuestionAgree));
        answerEleventhQuestionAgree.click();
    }

    public void answerTwelvethQuestionAgreeClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(answerTwelvethQuestionAgree));
        answerTwelvethQuestionAgree.click();
    }


}



