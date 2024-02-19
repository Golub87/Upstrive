package StudentPage;

import Base.BaseTestStudent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProfileStudentPage extends BaseTestStudent {
    public ProfileStudentPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//*[@id=\"profileId\"]/div[1]/div/div/div[3]")
    WebElement logoutButton;

    @FindBy (xpath = "/html/body/div[7]/div/div/div[2]/div/div[2]/div/div[2]")
    WebElement confirmLogout;

    @FindBy (xpath = "//*[@id=\"profileId\"]/div[2]/div[2]/div[2]/form/input")
    WebElement changeSecurutyKey;

    @FindBy (xpath = "//*[@id=\"profileId\"]/div[2]/div[2]/div[2]/form/button")
    WebElement saveButon;


    @FindBy (xpath = "//*[@id=\"profileId\"]/div[2]/div[3]/div[2]/form/div[2]/input")
    WebElement changePassword;

    @FindBy (xpath = "//*[@id=\"profileId\"]/div[2]/div[3]/div[2]/form/div[3]/input")
    WebElement retypePassword;

    @FindBy (xpath = "//*[@id=\"profileId\"]/div[2]/div[3]/div[2]/form/button")
    WebElement passwordSaveButton;

    @FindBy (xpath = "//div[@class='notify-text-title']")
    WebElement notification;


    @FindBy (xpath = "//span[normalize-space()='Private notes']")
    WebElement privateNotes;

    @FindBy (xpath = "//body/div[@id='root']/div[@id='home']/div[@class='authenticated-section']/div[@id='profileId']/div[@class='profile-right']/div[@id='profileid']/div[2]/div[2]/div[1]")
    WebElement reflectionFeedback;

    @FindBy (xpath = "//p[normalize-space()='DELETE NOTE']")
    WebElement deleteNote;

    @FindBy (xpath = "//div[@class='confirm-ok-button']")
    WebElement confirmDeleteNote;

    @FindBy (xpath = "//input[@placeholder='Enter secret keys']")
    WebElement secretKey;

    @FindBy (xpath = "//p[@class='new-secret-save-text']")
    WebElement saveSecretKey;

    @FindBy (xpath = "//div[@class='notify-close-button']")
    WebElement closeNotificationButton;




    public void closeNotificationButtonClick () {
        wdWait.until(ExpectedConditions.visibilityOf(closeNotificationButton)).click();
    }

    public void secretKeySendKeys () {
        wdWait.until(ExpectedConditions.visibilityOf(secretKey)).clear();
        secretKey.sendKeys("123");
    }

    public void saveSecretKeyClick () {
        wdWait.until(ExpectedConditions.visibilityOf(saveSecretKey));
        saveSecretKey.click();
    }
    public void confirmDeleteNoteClick () {
        wdWait.until(ExpectedConditions.visibilityOf(confirmDeleteNote));
        confirmDeleteNote.click();
    }

    public void privateNotestClick () {
        wdWait.until(ExpectedConditions.visibilityOf(privateNotes));
        privateNotes.click();
    }

    public void reflectionFeedbackClick () {
        wdWait.until(ExpectedConditions.visibilityOf(reflectionFeedback));
        reflectionFeedback.click();
    }

    public void deleteNoteClick () {
        wdWait.until(ExpectedConditions.visibilityOf(deleteNote));
        deleteNote.click();
    }
    public boolean notificationIsDisplayed () {
        wdWait.until(ExpectedConditions.visibilityOf(notification));
        return notification.isDisplayed();

    }

    public String notificationGetText () {
        wdWait.until(ExpectedConditions.visibilityOf(notification));
        return notification.getText();
    }

    public void passwordSaveButtonClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(passwordSaveButton));
        passwordSaveButton.click();
    }
    public void retypePasswordSendKeys (String typePasswordAgain) {
        wdWait.until(ExpectedConditions.visibilityOf(retypePassword));
        retypePassword.sendKeys(typePasswordAgain);
    }
    public void changePasswordSendKeys (String password) {
        wdWait.until(ExpectedConditions.visibilityOf(changePassword)).clear();
        changePassword.sendKeys(password);
    }

    public void saveButtonClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(saveButon));
        saveButon.click();
    }


    public void changeSecurutyKeySendKeys (String securityKey) {
        wdWait.until(ExpectedConditions.visibilityOf(changeSecurutyKey)).clear();
        changeSecurutyKey.sendKeys(securityKey);
    }
    public void confirmLogoutClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(confirmLogout));
        confirmLogout.click();
    }

    public void logoutButtonClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(logoutButton));
        logoutButton.click();
    }










}
