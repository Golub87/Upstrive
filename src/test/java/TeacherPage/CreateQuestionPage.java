package TeacherPage;

import Base.BaseTestTeacher;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CreateQuestionPage extends BaseTestTeacher {

public CreateQuestionPage () {
    PageFactory.initElements(driver, this);

}
    @FindBy (xpath = "//*[@id=\"home-container\"]/div/div/div[1]/div/div[2]/span")
    WebElement buttonQuestion;

    @FindBy (xpath = "//input[@placeholder='Type headline here']")
    WebElement headlineInputField;

    @FindBy (xpath = "//textarea[@placeholder='Type any additional text here']")
    WebElement supportiveTextInputField;

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


    public boolean contentIsCreatedIsDisplayed () {
        wdWait.until(ExpectedConditions.visibilityOf(notificationContentIsCreated));
        return notificationContentIsCreated.isDisplayed();
    }

    public String contentIsCreatedGetText () {
        wdWait.until(ExpectedConditions.visibilityOf(notificationContentIsCreated));
        return notificationContentIsCreated.getText();
    }

    public void buttonQuestionClick () {
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"home-container\"]/div/div/div[1]/div/div[2]/span")));
        buttonQuestion.click();

    }
    public void headlineInputFieldSendKeys (String headline) {
        wdWait.until(ExpectedConditions.elementToBeClickable(headlineInputField)).clear();
        headlineInputField.sendKeys(headline);

    }

    public void supportiveTextInputFieldSendKeys (String text) {
        wdWait.until(ExpectedConditions.elementToBeClickable(supportiveTextInputField)).clear();
        supportiveTextInputField.sendKeys(text);
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


