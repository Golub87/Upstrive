package TeacherPage;

import Base.BaseTestTeacher;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

public class ReadyToGoContentPage extends BaseTestTeacher {
    public ReadyToGoContentPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(@class,'pointer rounded-xl max-w-[340px] flex flex-col bg-[#5E639B]')]//div[contains(@class,'flex flex-row justify-start items-center')]")
    WebElement programs;

    @FindBy(xpath = "//div[contains(@class,'type-home-container')]//div[1]//div[2]//button[1]")
    WebElement programsGratitudeUpstrived;

    @FindBy(xpath = "//div[contains(@class,'text-highlightColor hover:text-deepPurple bg-deepPurple hover:bg-highlightColor rounded-full text-lg font-semibold pointer w-[300px] h-[65px] flex items-center justify-center')]")
    WebElement runProgram;

    @FindBy(xpath = "//*[@id=\"home-container\"]/div")
    WebElement readyToGoPage;

    @FindBy(xpath = "//div[normalize-space()='Mon']")
    WebElement dayMonday;

    @FindBy(xpath = "//p[contains(@class,'text-base text-deepPurple font-semibold pointer')]")
    WebElement selectTarget;
    @FindBy(xpath = "//span[contains(@class,'ml-2')]")
    WebElement favorites;

    @FindBy(xpath = "//span[normalize-space()='Test']")
    WebElement favoritesTest;

    @FindBy(xpath = "//div[contains(@class,'bg-deepPurple hover:bg-highlightColor text-highlightColor hover:text-deepPurple text-lg font-semibold items-center justify-center flex h-[65px] w-[120px] pointer uppercase rounded-full')]")
    WebElement buttonOk;

    @FindBy(xpath = "//div[@id='cy-program-run-modal']")
    WebElement runProgramButton;

    @FindBy (xpath = "//*[@id=\"home-container\"]/div/div[1]/div/div[2]/div[2]/div[1]")
    WebElement surveyReadyToGo;

    @FindBy (xpath = "//div[contains(@class,'type-home-container')]//div[1]//div[2]//button[1]")
    WebElement resilienceSurvey;

    @FindBy (xpath = "//div[contains(@class,'text-[#5E639B] text-lg hover:text-deepPurple font-semibold rounded-full py-1 px-4 bg-containerGray pointer')]")
    WebElement selectTargetReadyToGo;

    @FindBy (xpath = "//span[normalize-space()='Favorites']")
    WebElement selectFavoritesReadyToGo;

    @FindBy (xpath = "//span[normalize-space()='Test']")
    WebElement selectTestReadyToGo;

    @FindBy (xpath = "//div[contains(@class,'bg-deepPurple hover:bg-highlightColor text-highlightColor hover:text-deepPurple text-lg font-semibold items-center justify-center flex h-[65px] w-[120px] pointer uppercase rounded-full')]")
    WebElement buttonOkReadyToGo;

    @FindBy (xpath = "//div[contains(@class,'text-highlightColor hover:text-deepPurple bg-deepPurple hover:bg-highlightColor rounded-full text-lg font-semibold pointer w-[300px] h-[50px] flex items-center justify-center')]")
    WebElement runSurveyReadyToGo;

    @FindBy (xpath = "//div[@class='animate-enter max-w-md p-4 w-full rounded-xl pointer-events-auto flex']")
    WebElement notificationContentIsCreated;

    @FindBy (xpath = "//div[contains(@class,'border border-[#BEBECE] text-[#BEBECE] hover:border-[#5E639B] hover:text-[#5E639B]')]")
    WebElement manageRuningPrograms;

    @FindBy (xpath = "//div[@class='bg-containerGray rounded-xl w-full h-[80px] flex justify-between items-center px-4']")
    WebElement managePrograms;

    @FindBy (xpath = "//*[name()='path' and contains(@d,'M2.63635 2')]")
    WebElement deleteProgramButton;

    @FindBy (xpath = "//div[@class='border pointer flex items-center justify-center border-deleteRed text-deleteRed text-base font-semibold rounded-xl w-[250px] h-[55px] transition-all !duration-[250ms] ease-in-out hover:bg-deleteRed hover:text-white']")
    WebElement confirmDeletionProgram;

    @FindBy (xpath = "//div[@class='border pointer flex items-center justify-center border-deleteRed text-deleteRed text-base font-semibold rounded-xl w-[250px] h-[55px] transition-all !duration-[250ms] ease-in-out hover:bg-deleteRed hover:text-white']")
    WebElement programRunningOkButton;

    @FindBy (xpath = "//input[@placeholder='Search']")
    WebElement searchPrograms;

    @FindBy (xpath = "//p[@class='single-type-item-title text-left']")
    List<WebElement> programsTitles;


    public void searchPrograms () throws InterruptedException {
        wdWait.until(ExpectedConditions.visibilityOf(searchPrograms)).clear();
        searchPrograms.sendKeys("creating ");
        Thread.sleep(2000);
    }

    public void assertSearch () {
        List<WebElement> filteredProgramTitles = programsTitles.stream().filter(program->program.getText().contains("Creating")).toList();
        Assert.assertEquals(programsTitles.size(), filteredProgramTitles.size());
    }



    public void programRunningOkButtonClick () {
        wdWait.until(ExpectedConditions.visibilityOf(programRunningOkButton)).click();
    }

    public void confirmDeletionProgramClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(confirmDeletionProgram));
        confirmDeletionProgram.click();
    }

    public void deleteProgramButtonClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(deleteProgramButton));
        deleteProgramButton.click();

    }

    public void manageProgramsHover () {
        wdWait.until(ExpectedConditions.visibilityOf(managePrograms));
        actions.moveToElement(managePrograms).perform();
    }


    public void manageRuningProgramClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(manageRuningPrograms));
        manageRuningPrograms.click();
    }


    public boolean contentIsCreatedIsDisplayed () {
        wdWait.until(ExpectedConditions.visibilityOf(notificationContentIsCreated));
        return notificationContentIsCreated.isDisplayed();
    }

    public String contentIsCreatedGetText () {
        wdWait.until(ExpectedConditions.visibilityOf(notificationContentIsCreated));
        return notificationContentIsCreated.getText();
    }

    public void programsGratitudeUpstrivedClick() {
        wdWait.until(ExpectedConditions.visibilityOf(programsGratitudeUpstrived));
        programsGratitudeUpstrived.click();
    }

    public void runProgramClick() {
        wdWait.until(ExpectedConditions.visibilityOf(runProgram));
        runProgram.click();
    }

    public void programsClick() {
        wdWait.until(ExpectedConditions.visibilityOf(programs));
        programs.click();
    }

    public void readyToGoPageScrool() {
        wdWait.until(ExpectedConditions.visibilityOf(readyToGoPage));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        String script = "arguments[0].scrollTop = arguments[1];";
        jsExecutor.executeScript(script, readyToGoPage, 400);
    }

    public void runProgramButtonClick() {
        wdWait.until(ExpectedConditions.visibilityOf(runProgramButton));
        runProgramButton.click();
    }

    public void dayMondayClick() {
        wdWait.until(ExpectedConditions.visibilityOf(dayMonday));
        dayMonday.click();

    }

    public void selectTargetClick() {
        wdWait.until(ExpectedConditions.visibilityOf(selectTarget));
        selectTarget.click();
    }

    public void selectFavoritesClick() {
        wdWait.until(ExpectedConditions.elementToBeClickable(favorites));
        favorites.click();

    }

    public void selectFavoritesTestClick() {
        wdWait.until(ExpectedConditions.elementToBeClickable(favoritesTest));
        favoritesTest.click();

    }

    public void buttonOkClick() {
        wdWait.until(ExpectedConditions.elementToBeClickable(buttonOk));
        buttonOk.click();
    }

    public void readyToGoPageScroolUp() {
        wdWait.until(ExpectedConditions.visibilityOf(readyToGoPage));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        String script = "arguments[0].scrollTop = arguments[1];";
        jsExecutor.executeScript(script, readyToGoPage, -600);
    }

    public void surveyReadyToGoClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(surveyReadyToGo));
        surveyReadyToGo.click();
    }

    public void resilienceSurveyReadyToGoClick () {
        wdWait.until(ExpectedConditions.visibilityOf(resilienceSurvey));
        resilienceSurvey.click();
    }

    public void selectTargetReadyToGoClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(selectTargetReadyToGo));
        selectTargetReadyToGo.click();
    }

    public void selectFavoritesReadyToGoClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(selectFavoritesReadyToGo));
        selectFavoritesReadyToGo.click();
    }

    public void selectTestReadyToGoClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(selectTestReadyToGo));
        selectTestReadyToGo.click();
    }

    public void buttonOkReadyToGoClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(buttonOkReadyToGo));
        buttonOkReadyToGo.click();
    }

    public void runSurveyReadyToGoClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(runSurveyReadyToGo));
        runSurveyReadyToGo.click();
    }

}