package TeacherPage;

import Base.BaseTestTeacher;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CreateSurveyPage extends BaseTestTeacher {

public CreateSurveyPage () {
    PageFactory.initElements(driver, this);
}

    @FindBy (xpath = "//*[@id=\"home-container\"]/div/div/div[1]/div/div[4]")
    WebElement buttonSurvey;
    @FindBy(xpath = "//div[contains(@class,'mt-5')]//input[contains(@placeholder,'Type headline here')]")
    WebElement headlineInputField;
    @FindBy (xpath = "//body/div[@id='root']/div[@id='home']/div[@id='home-container']/div[contains(@class,'bg-[#ECEBF8] w-full h-full p-12 flex justify-center overflow-y-scroll')]/div[contains(@class,'bg-white w-[800px] rounded-xl flex flex-col px-14 h-max')]/div[contains(@class,'pt-6 pb-14')]/div/div/div[contains(@class,'mt-6')]/textarea[1]")
    WebElement supportiveTextInputField;
    @FindBy (xpath = "//div[contains(@class,'my-5')]//div//input[contains(@placeholder,'Type headline here')]")
    WebElement headLineSection1InputField;
    @FindBy (xpath = "//input[contains(@placeholder,'Enter question here ...')]")
    WebElement question1;
    @FindBy (xpath = "//div[contains(@class,'text-lg text-mudPurple hover:text-deepPurple font-medium rounded-full py-1 px-4 bg-containerGray pointer')]")
    WebElement selectTarget;
    @FindBy (xpath = "//span[normalize-space()='Favorites']")
    WebElement favorites;
    @FindBy (xpath = "//*[@id=\"scroll-inf-target\"]/div/div/div/p/span")
    WebElement favoritesTest;
    @FindBy (xpath = "//div[@class='bg-deepPurple hover:bg-highlightColor text-highlightColor hover:text-deepPurple text-lg font-semibold items-center justify-center flex h-[65px] w-[120px] pointer uppercase rounded-full']")
    WebElement buttonOk;
    @FindBy (xpath = "//div[normalize-space()='Publish']")
    WebElement buttonPublish;

    @FindBy (xpath = "//div[normalize-space()='Update']")
    WebElement buttonUpdate;
    @FindBy (xpath = "//div[@class='animate-enter max-w-md p-4 w-full rounded-xl pointer-events-auto flex']")
    WebElement notificationContentIsCreated;


    public void buttonUpdate () {
        wdWait.until(ExpectedConditions.visibilityOf(buttonUpdate)).click();

    }
    public boolean contentIsCreatedIsDisplayed () {
        wdWait.until(ExpectedConditions.visibilityOf(notificationContentIsCreated));
        return notificationContentIsCreated.isDisplayed();
    }

    public String contentIsCreatedGetText () {
        wdWait.until(ExpectedConditions.visibilityOf(notificationContentIsCreated));
        return notificationContentIsCreated.getText();
    }


    public void buttonSurveyClick () {
    wdWait.until(ExpectedConditions.elementToBeClickable(buttonSurvey));
    buttonSurvey.click();
}
    public void headlineInputFieldSendKeys (String headline) {
        wdWait.until(ExpectedConditions.elementToBeClickable(headlineInputField)).clear();
        headlineInputField.sendKeys(headline);

    }

    public void headlineEdit () {
        wdWait.until(ExpectedConditions.elementToBeClickable(headlineInputField)).clear();
        headlineInputField.sendKeys("AUTOMATION SURVEY EDIT");

    }

    public void supportiveTextInputFieldSendKeys (String text) {
        wdWait.until(ExpectedConditions.elementToBeClickable(supportiveTextInputField)).clear();
        supportiveTextInputField.sendKeys(text);
    }

    public void headLineSection1InputFieldSendKeys (String text) {
        wdWait.until(ExpectedConditions.elementToBeClickable(headLineSection1InputField)).clear();
        headLineSection1InputField.sendKeys(text);
    }

    public void question1SendKeys (String text) {
        wdWait.until(ExpectedConditions.elementToBeClickable(question1)).clear();
        question1.sendKeys(text);

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
