package TeacherPage;

import Base.BaseTestTeacher;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;


public class CreateFeedPage extends BaseTestTeacher {
    public CreateFeedPage () {
        PageFactory.initElements(driver, this);

    }

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

    @FindBy (xpath = "//button[normalize-space()='Update']")
    WebElement buttonUpdate;


    @FindBy (xpath = "//*[@id=\"home-container\"]/div/div/div[2]/div/div[2]/div[2]/div[1]/div/button")
    WebElement uploadPhotoVideo;

    @FindBy (xpath = "//div[@class='animate-enter max-w-md p-4 w-full rounded-xl pointer-events-auto flex']")
    WebElement notificationContentIsCreated;

    @FindBy (xpath = "//*[@id=\"home-container\"]/div/div/div[2]/div/div[2]/div[1]/div[3]/input")
    WebElement enterLink;

    @FindBy (xpath = "//button[@class='hover:bg-lightBG pointer  !border !border-solid border-mudPurple  rounded-full py-3 flex min-w-[334px] justify-center text-deepPurple deepPurple font-semibold text-lg']")
    WebElement createTemplateFeed;

    @FindBy (xpath = "//div[@class='rounded-full py-2 flex justify-center items-center pointer bg-containerGray']")
    WebElement useTemplateButton;

    @FindBy (xpath = "//span[@class='pointer mr-[10px]']")
    WebElement editTemplateButton;

    @FindBy (xpath = "//span[@class='pointer']")
    List<WebElement> deleteTemplateButton;

    @FindBy (xpath = "//button[@class='hover:bg-lightBG pointer  !border !border-solid border-mudPurple  rounded-full py-3 flex min-w-[334px] justify-center text-deepPurple deepPurple font-semibold text-lg']")
    WebElement updateTemplateButton;

    @FindBy (xpath = "//div[@class='rounded-full bg-[#5E639B] py-3 w-[100px] text-[#FDDF6D] flex items-center justify-center font-semibold pointer']")
    WebElement selectTemplateButton;

    @FindBy (xpath = "//button[normalize-space()='Ok']")
    WebElement confirmDeleteTemplate;


    public void updateFeed () {
        wdWait.until(ExpectedConditions.visibilityOf(buttonUpdate)).click();
    }

    public void confirmDeleteTemplateClick () {
        wdWait.until(ExpectedConditions.visibilityOf(confirmDeleteTemplate)).click();
    }


    public void deleteTemplateButtonClick () {
        wdWait.until(ExpectedConditions.visibilityOfAllElements(deleteTemplateButton));
        deleteTemplateButton.get(0).click();
    }

    public String enterLinkGetAttribute () {
        wdWait.until(ExpectedConditions.visibilityOf(enterLink));
        return enterLink.getAttribute("value");
    }
    public void selectTemplateButtonClick () {
        wdWait.until(ExpectedConditions.visibilityOf(selectTemplateButton)).click();
    }



    public void updateTemplateButtonClick () {
        wdWait.until(ExpectedConditions.visibilityOf(updateTemplateButton)).click();
    }

    public void useTemplateButtonClick () {
        wdWait.until(ExpectedConditions.visibilityOf(useTemplateButton)).click();
    }

    public void editTemplateButtonClick () {
        wdWait.until(ExpectedConditions.visibilityOf(editTemplateButton)).click();
    }


    public void createTemplateFeedClick () {
        wdWait.until(ExpectedConditions.visibilityOf(createTemplateFeed)).click();
    }

    public void enterLinkSendKeys (String Link) {
        wdWait.until(ExpectedConditions.visibilityOf(enterLink)).clear();
        enterLink.sendKeys(Link);
    }

    public boolean contentIsCreatedIsDisplayed () {
        wdWait.until(ExpectedConditions.visibilityOf(notificationContentIsCreated));
        return notificationContentIsCreated.isDisplayed();
    }

    public String contentIsCreatedGetText () {
        wdWait.until(ExpectedConditions.visibilityOf(notificationContentIsCreated));
        return notificationContentIsCreated.getText();
    }


    public void headlineInputFieldSendKeys (String headline) {
        wdWait.until(ExpectedConditions.elementToBeClickable(headlineInputField)).clear();
        headlineInputField.sendKeys(headline);

    }

    public void headLineEDIT () {
        wdWait.until(ExpectedConditions.visibilityOf(headlineInputField)).clear();
        headlineInputField.sendKeys("AUTOMATION EDIT FEED");
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

    public void uploadPhotoVideoClick () {
        wdWait.until(ExpectedConditions.visibilityOf(uploadPhotoVideo));
        uploadPhotoVideo.click();
    }

    public void uploadPhotoVideoSendKeys (String photoPath) {
        wdWait.until(ExpectedConditions.visibilityOf(uploadPhotoVideo));
        uploadPhotoVideo.sendKeys(photoPath);
    }



}
