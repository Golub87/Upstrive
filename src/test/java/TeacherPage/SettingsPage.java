package TeacherPage;

import Base.BaseTestTeacher;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SettingsPage extends BaseTestTeacher {
    public SettingsPage (){
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//input[@class='new-secret-key-input']")
    WebElement inputFieldSecurityKey;

    @FindBy (xpath = "//p[contains(@class,'new-secret-save-text')]")
    WebElement saveButton;

    @FindBy (xpath = "//div[contains(@class,'text-highlightColor font-bold text-xl')]")
    WebElement notifications;

    @FindBy (xpath = "//*[@id=\"home-container\"]/div/div/div[2]/div[3]/div/div/div[2]/form/fieldset[1]/input")
    WebElement typePasswordInputField;

    @FindBy (xpath = "//*[@id=\"home-container\"]/div/div/div[2]/div[3]/div/div/div[2]/form/fieldset[2]/input")
    WebElement retypePasswordInputField;

    @FindBy (xpath = "//*[@id=\"home-container\"]/div/div/div[2]/div[3]/div/div/div[2]/form/button")
    WebElement saveButtonChangePassword;

    @FindBy (xpath = "/html/body/div[8]/div/div/div[1]/div")
    WebElement xButtonSecretKey;

    @FindBy (xpath = "//body/div[@id='root']/div[@id='home']/div[@id='home-container']/div[contains(@class,'bg-lightBG w-full h-full overflow-y-scroll')]/div[contains(@class,'flex gap-4 justify-center')]/div[contains(@class,'flex gap-4 flex-col')]/div[contains(@class,'rounded-xl bg-white grow w-[650px]')]/div[contains(@class,'new-notes-container')]/div[2]/div[2]/div[1]")
    WebElement dailyReview;

    @FindBy (xpath = "//p[normalize-space()='DELETE NOTE']")
    WebElement deletePrivateNote;

    @FindBy (xpath = "//div[contains(@class,'border pointer flex items-center justify-center border-deleteRed text-deleteRed text-base font-semibold rounded-xl w-[250px] h-[55px] transition-all !duration-[250ms] ease-in-out hover:bg-deleteRed hover:text-white')]")
    WebElement confirmDeletePrivateNotes;


    public void confirmDeletePrivateNotesClick () {
        wdWait.until(ExpectedConditions.visibilityOf(confirmDeletePrivateNotes)).click();
    }
    public void deletePrivateNoteClick () {
        wdWait.until(ExpectedConditions.visibilityOf(deletePrivateNote)).click();
    }

    public void dailyReviewClick() {
        wdWait.until(ExpectedConditions.visibilityOf(dailyReview)).click();
    }

    public void xButtonSecretKeyClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(xButtonSecretKey));
        xButtonSecretKey.click();
    }
    public void inputFieldSecurityKeySendKeys (String newSecurityKey) {
        wdWait.until(ExpectedConditions.elementToBeClickable(inputFieldSecurityKey)).clear();
        inputFieldSecurityKey.sendKeys(newSecurityKey);
    }

    public void saveButtonClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(saveButton));
        saveButton.click();
    }

    public boolean notificationsIsDisplayed () {
        wdWait.until(ExpectedConditions.visibilityOf(notifications));
        return notifications.isDisplayed();
    }

    public String notificationsGetText () {
        wdWait.until(ExpectedConditions.visibilityOf(notifications));
        return notifications.getText();
    }


    public void typePasswordSendKeys (String newPassword) {
        wdWait.until(ExpectedConditions.elementToBeClickable(typePasswordInputField)).clear();
        typePasswordInputField.sendKeys(newPassword);

    }

    public void retypePasswordSendKeys (String retypeNewPassword) {
        wdWait.until(ExpectedConditions.elementToBeClickable(retypePasswordInputField)).clear();
        retypePasswordInputField.sendKeys(retypeNewPassword);
    }

    public void saveButtonChangePasswordClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(saveButtonChangePassword));
        saveButtonChangePassword.click();
    }

}
