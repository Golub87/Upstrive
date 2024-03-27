package TeacherPage;

import Base.BaseTestTeacher;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

public class UserManagementPage extends BaseTestTeacher {
    public UserManagementPage () {
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//div[contains(@class,'managements-lists-container')]//div[2]//div[1]//div[1]//div[9]//*[name()='svg']")
    WebElement arrowDownButton;

    @FindBy (xpath = "//div[normalize-space()='Add a student']")
    WebElement addStudentButton;

    @FindBy (xpath = "/html/body/div[8]/div/div/div/div[4]/form/div[1]/div[2]/input")
    WebElement enterName;

    @FindBy (xpath = "//input[@placeholder='Enter surname']")
    WebElement enterSurname;

    @FindBy (xpath = "//input[@placeholder='Enter email']")
    WebElement enterEmail;

    @FindBy (xpath = "//p[normalize-space()='Save']")
    WebElement saveButton;

    @FindBy (xpath = "/html/body/div[8]/div/div/div")
    WebElement studentInfo;

    @FindBy (xpath = "//div[@class='transparent-button w-full']//p[1]")
    WebElement setStudentsPasswordManually;

    @FindBy (xpath = "/html/body/div[8]/div/div/div/div[4]/form/div[2]/div[3]/label[1]")
    WebElement letThemSetTheirOwnPassword;

    @FindBy (xpath = "//input[@name='password']")
    WebElement passwordAddStudent;

    @FindBy (xpath = "//input[@name='repeat_password']")
    WebElement repeatPasswordAddStudent;

    @FindBy (xpath = "//body/div[@id='root']/div[@id='home']/div[3]/div[1]/div[1]")
    WebElement notificationClassIsUpdated;

    @FindBy (xpath = "//td[@class='teacher-text-center underline-text'] ")
    List<WebElement> studentNikolaGolubovic;

    @FindBy (xpath = "//p[normalize-space()='Generate new password']")
    WebElement generateNewPassword;

    @FindBy (xpath = "//p[normalize-space()='Delete student']")
    WebElement deleteStudentButton;

    @FindBy (xpath = "//button[normalize-space()='Ok']")
    WebElement confirmDeleteStudent;

    @FindBy (xpath = "//div[@class='text-highlightColor font-bold text-xl']")
    WebElement notificationStudentRemoved;

    @FindBy (xpath = "//div[contains(text(),'Data is saved')]")
    WebElement notificationDataIsSaved;

    @FindBy (xpath = "//div[@id='home']//div//div[@class='text-highlightColor font-bold text-xl'][normalize-space()='New password is generated']")
    WebElement newPasswordIsGenerated;

    @FindBy (xpath = "//button[normalize-space()='Ok']")
    WebElement confirmGeneratePassword;

    @FindBy (xpath = "//div[@class='close-modal-icon ']//*[name()='svg']")
    WebElement xButtonPopUp;

    @FindBy (xpath = "//*[@id=\"managementId\"]/div[2]/div[1]/div[2]")
    WebElement teacherManagement;

    @FindBy (xpath = "//*[@id=\"managementId\"]/div[2]/div[1]/div[4]")
    WebElement addTeacher;

    @FindBy (xpath = "//input[@placeholder='Enter name']")
    WebElement teacherFirstName;

    @FindBy (xpath = "//input[@placeholder='Enter surname']")
    WebElement teacherLastName;

    @FindBy (xpath = "/html/body/div[8]/div/div/div[1]/div[4]/form/div[1]/div[3]")
    WebElement dayOfBirth;

    @FindBy (xpath = "/html/body/div[12]/div[2]/div/div/div/div[1]/div[1]/div")
    WebElement arrowSelectYear;

    @FindBy (xpath = "/html/body/div[12]/div[2]/div/div/div/div[2]/div/div")
    WebElement calendar;

    @FindBy (xpath = "/html/body/div[12]/div[2]/div/div/div/div[2]/div/div/div[88]")
    WebElement chooseYear1987;

    @FindBy (xpath = "/html/body/div[12]/div[2]/div/div/div/div[1]/div[2]/button[2]")
    WebElement arrowSelectMonth;

    @FindBy (xpath = "//button[normalize-space()='8']")
    WebElement dayOfBirth8October;

    @FindBy (xpath = "//body/div[@class='ReactModalPortal']/div[@class='ReactModal__Overlay ReactModal__Overlay--after-open']/div[@role='dialog']/div[@class='student-info-modal']/div/form[@autocomplete='off']/div[@class='student-info-form']/div[4]/div[1]")
    WebElement selectGender;

    @FindBy (xpath = "//div[@class='gender-drop-down']//div//p[contains(text(),'Male')]")
    WebElement genderMale;

    @FindBy (xpath = "//input[@placeholder='Enter email']")
    WebElement emailTeacherInputField;

    @FindBy (xpath = "//p[normalize-space()='Save']")
    WebElement buttonSaveTeacher;

    @FindBy (xpath = "//div[@class='ReactModalPortal']//div[5]//div[1]")
    WebElement selectRole;

    @FindBy (xpath = "//p[normalize-space()='Admin']")
    WebElement selectRoleAdmin;

    @FindBy (xpath = "//button[@class='teacher-role-submit-button']")
    WebElement submitRole;

    @FindBy (xpath = "//div[@class='text-highlightColor font-bold text-xl']")
    WebElement notificationTeacherIsCreated;

    @FindBy (xpath = "//*[@id=\"managementId\"]/div[2]/div[2]/div[1]/div/div[1]/div/input")
    WebElement searchField;

    @FindBy (xpath = "//*[@id=\"managementId\"]/div[2]/div[2]/div/div/div[2]/table/tbody/tr/td[6]")
    WebElement manageTeacher;

    @FindBy (xpath = "/html/body/div[8]/div/div/div[1]/div[4]/form/div[3]/div")
    WebElement deleteTeacher;

    @FindBy (xpath = "//button[normalize-space()='Ok']")
    WebElement confirmDeleteTeacher;

    @FindBy (xpath = "//div[@class='text-highlightColor font-bold text-xl']")
    WebElement notificationTeacherIsDeleted;

    @FindBy (xpath = "//p[normalize-space()='Generate new password']")
    WebElement generateNewPasswordTeacher;

    @FindBy (xpath = "//div[contains(text(),'Add a new class')]")
    WebElement addNewClass;

    @FindBy (xpath = "//div[3]//input[1]")
    WebElement classInputField;

    @FindBy (xpath = "//body//div[@id='root']//div[contains(@class,'managements-lists-container')]//div//div//div[4]//input[1]")
    WebElement yearInputField;

    @FindBy (xpath = "//button[1]//*[name()='svg']//*[name()='path' and contains(@fill-rule,'evenodd')]")
    WebElement saveButtonClass;

    @FindBy (xpath = "//div[@class='animate-enter max-w-md p-4 w-full rounded-xl pointer-events-auto flex']")
    WebElement notificationClassIsMade;

    @FindBy (xpath = "//input[@placeholder='Search']")
    WebElement searchFieldClass;


    @FindBy (xpath = "//div[@class='h-[56px] min-w-[56px] bg-whiteContrast rounded-full cursor-pointer flex items-center justify-center mr-3 border border-[#FC4C59aa] text-[#FC4C59aa] hover:text-[#FC4C59] hover:border-[#FC4C59]']")
    WebElement deleteClass;


    @FindBy (xpath = "//button[normalize-space()='Yes, Delete']")
    WebElement confirmDeleteClass;


    @FindBy (xpath = "//div[@aria-label='Example Modal']//div[2]//*[name()='svg']")
    WebElement classDeletedClosePopupButton;

    @FindBy (xpath = "//div[contains(@class,'items-center justify-between p-10 mt-[30px]')]//*[name()='svg']")
    WebElement notificationPopupClassDeleted;

    @FindBy (xpath = "//div[@class='transparent-button']")
    WebElement loginDataButton;

    @FindBy (xpath = "//div[@class='stroke-deselectPurple hover:stroke-deepPurple flex flex-row items-center border-deselectPurple border py-[0.65rem] px-4 w-[18rem] rounded-full login-data-search']//input[@placeholder='Search']")
    WebElement searchInLoginData;

    @FindBy (xpath = "//td[normalize-space()='James Taylor']")
    WebElement resultInLoginDataJamesTaylor;

    @FindBy (xpath = "//p[normalize-space()='Select all']")
    WebElement selectButton;

    @FindBy (xpath = "//div[@class='my-[10px]']//p[contains(text(),'2-A')]")
    WebElement class2A;

    @FindBy (xpath = "//td[normalize-space()='Mattie Berg']")
    WebElement resultSearchClass2A;

    @FindBy (xpath = "//button[@class='flex items-center justify-center px-8 rounded-full h-[50px] bg-lightBG']")
    WebElement transferToAnotherClass;

    @FindBy (xpath = "//p[@class='text-white text-[18px] leading-[22px] font-semibold']")
    WebElement selectClass;

    @FindBy (xpath = "//p[@class=' text-deepPurple text-[14px] leading-[20px] font-medium text-center']")
    List<WebElement> listOfClasses;

    @FindBy (xpath = "//input[@class=' w-full border-none bg-lightBG']")
    WebElement searchClass;

    @FindBy (xpath = "//p[@class='text-darkenPurple text-[16px] leading-[20px] font-bold ']")
    WebElement selectClass2B;

    @FindBy (xpath = "//button[contains(@class,'h-[65px] bg-deepPurple rounded-full px-5 flex flex-row items-center justify-center gap-[10px] cursor-pointer w-[265px] flex-1')]")
    WebElement saveTransferClass;

    @FindBy (css = "p[class='text-deepPurple text-[32px] leading-[42px] font-bold text-center max-w-[360px] flex-wrap']")
    WebElement popUpWindowStudentTransfer;

    @FindBy (xpath = "//div[@class='close-modal-icon ']")
    WebElement xButtonLoginData;

    @FindBy (xpath = "//div[normalize-space()='Upload user data']")
    WebElement uploadUserData;

    @FindBy (xpath = "//div[@class='mt-[5px]']")
    WebElement attachFile;

    @FindBy (xpath = "//button[normalize-space()='Upload data']")
    WebElement uploadData;

    @FindBy (xpath = "//div[@class='text-highlightColor font-bold text-xl']")
    WebElement notificationUploadedData;

    @FindBy (xpath = "//button[@class='remove-trash'] ")
    List <WebElement> deleteUploadedData;

    @FindBy (xpath = "//a[normalize-space()='File link']")
    List<WebElement> fileLinks;

    @FindBy (xpath = "//a[normalize-space()='Download Template File']")
    WebElement downloadTemplate;

    @FindBy (xpath = "//td[@style='width: 23%;']")
    List<WebElement> students7B;



    public void selectStudentTesterS2 () {
        wdWait.until(ExpectedConditions.visibilityOfAllElements(students7B));
        int classSize = students7B.size();
        for (WebElement studentTesterS2: students7B) {
            String studentS2 = studentTesterS2.getText();
            if (studentS2.equalsIgnoreCase("Student Tester S2"))
            {
                studentTesterS2.click();
            }


        }


    }

    public void downloadTemplate () {
        wdWait.until(ExpectedConditions.visibilityOf(downloadTemplate)).click();
    }


    public void fileLinkClick () {
    wdWait.until(ExpectedConditions.visibilityOfAllElements(fileLinks));
    fileLinks.get(0).click();
    }

    public void deleteUploadedDataClick () {
        wdWait.until(ExpectedConditions.visibilityOfAllElements(deleteUploadedData));
        deleteUploadedData.get(0).click();
    }

    public String notificationUploadedDataGetText() {
        wdWait.until(ExpectedConditions.visibilityOf(notificationUploadedData));
        return notificationUploadedData.getText();
    }

    public void uploadDataClick () {
        wdWait.until(ExpectedConditions.visibilityOf(uploadData)).click();
    }

    public void attachFileClick () {
        wdWait.until(ExpectedConditions.visibilityOf(attachFile)).click();
    }

    public void uploadUserDataClick () {
        wdWait.until(ExpectedConditions.visibilityOf(uploadUserData)).click();
    }


    public void xButtonLoginDataClick () {
        wdWait.until(ExpectedConditions.visibilityOf(xButtonLoginData)).click();
    }

    public void selectClassClick () throws InterruptedException {
        wdWait.until(ExpectedConditions.visibilityOf(selectClass)).click();
        wdWait.until(ExpectedConditions.visibilityOf(searchClass)).clear();
        searchClass.sendKeys("2-B");
        wdWait.until(ExpectedConditions.visibilityOf(selectClass2B)).click();
        Thread.sleep(2000);
        wdWait.until(ExpectedConditions.visibilityOf(saveTransferClass)).click();
        wdWait.until(ExpectedConditions.visibilityOf(popUpWindowStudentTransfer));
        Assert.assertTrue(popUpWindowStudentTransfer.isDisplayed());
        Assert.assertEquals(popUpWindowStudentTransfer.getText(), "Success");
    }

    public void transferToAnotherClassClick () {
        wdWait.until(ExpectedConditions.visibilityOf(transferToAnotherClass)).click();
    }


    public String resultSearchClass2AGetText () {
        wdWait.until(ExpectedConditions.visibilityOf(resultSearchClass2A));
        return resultSearchClass2A.getText();
    }


    public void searchInLoginDataClearText () {
        wdWait.until(ExpectedConditions.visibilityOf(searchInLoginData));
        searchInLoginData.clear();
    }
    public void class2AClick () {
        wdWait.until(ExpectedConditions.visibilityOf(class2A)).click();
    }

    public void selectButtonClick () {
        wdWait.until(ExpectedConditions.visibilityOf(selectButton)).click();

    }

    public String resultInLoginDataJamesTaylorGetText () {
        wdWait.until(ExpectedConditions.visibilityOf(resultInLoginDataJamesTaylor));
        return resultInLoginDataJamesTaylor.getText();
    }


    public void searchInLoginDataSendKeys () {
        wdWait.until(ExpectedConditions.visibilityOf(searchInLoginData)).clear();
        searchInLoginData.sendKeys("James");
    }


    public void loginDataButtonClick () {
        wdWait.until(ExpectedConditions.visibilityOf(loginDataButton)).click();
    }


    public boolean notificationPopupClassDeletedIsDisplayed () {
        wdWait.until(ExpectedConditions.visibilityOf(notificationPopupClassDeleted));
        return notificationPopupClassDeleted.isDisplayed();
    }
    public String notificationPopupClassDeletedGetText () {
        wdWait.until(ExpectedConditions.visibilityOf(notificationPopupClassDeleted));
        return notificationPopupClassDeleted.getText();
    }

    public void classDeletedClosePopupButtonClick () {
        wdWait.until(ExpectedConditions.visibilityOf(classDeletedClosePopupButton)).click();
    }

    public void confirmDeleteClassClick () {
        wdWait.until(ExpectedConditions.visibilityOf(confirmDeleteClass)).click();
    }


    public void deleteClassClick () {
        wdWait.until(ExpectedConditions.visibilityOf(deleteClass)).click();
    }
    public void searchFieldClassSendKeys () {
        wdWait.until(ExpectedConditions.visibilityOf(searchFieldClass)).sendKeys("6");
    }

    public void searchClass () {
        wdWait.until(ExpectedConditions.visibilityOf(searchFieldClass)).sendKeys("7-B");


    }
    public void searchFieldSendKeys () {
        wdWait.until(ExpectedConditions.visibilityOf(searchFieldClass)).clear();
        searchFieldClass.sendKeys("2-B");


    }
    public boolean notificationClassIsDisplayed () {
        wdWait.until(ExpectedConditions.visibilityOf(notificationClassIsMade));
        return notificationClassIsMade.isDisplayed();
    }

    public String notificationClassGetText () {
        wdWait.until(ExpectedConditions.visibilityOf(notificationClassIsMade));
        return notificationClassIsMade.getText();
    }



    public void addNewClass () {
        wdWait.until(ExpectedConditions.visibilityOf(addNewClass)).click();

    }

    public void classInputFieldSendKeys () {
        wdWait.until(ExpectedConditions.visibilityOf(classInputField)).clear();
        classInputField.sendKeys("6-Test");
    }

    public void yearInputFieldSendKeys () {
        wdWait.until(ExpectedConditions.visibilityOf(yearInputField)).clear();
        yearInputField.sendKeys("6");
    }

    public void saveButtonClassClick () {
        wdWait.until(ExpectedConditions.visibilityOf(saveButtonClass)).click();
    }


    public void generateNewPasswordTeacherClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(generateNewPasswordTeacher));
        generateNewPasswordTeacher.click();
    }

    public boolean notificationTeacherIsDeletedIsDisplayed () {
        wdWait.until(ExpectedConditions.visibilityOf(notificationTeacherIsDeleted));
        return notificationTeacherIsDeleted.isDisplayed();}


    public String notificationTeacherIsDeletedGetText () {
        wdWait.until(ExpectedConditions.visibilityOf(notificationTeacherIsDeleted));
        return notificationTeacherIsDeleted.getText();

    }
    public void confirmDeleteTeacherClick () {
        wdWait.until(ExpectedConditions.visibilityOf(confirmDeleteTeacher));
        confirmDeleteTeacher.click();
    }

    public void deleteTeacherClick () {
        wdWait.until(ExpectedConditions.visibilityOf(deleteTeacher));
        deleteTeacher.click();
    }

    public void manageTeacherClick () {
        wdWait.until(ExpectedConditions.visibilityOf(manageTeacher));
        manageTeacher.click();
    }
    public void searchFieldSendKeys (String text) {
        wdWait.until(ExpectedConditions.visibilityOf(searchField)).clear();
        searchField.sendKeys(text);
    }

    public boolean notificationTeacherIsCreatedIsDisplayed () {
        wdWait.until(ExpectedConditions.visibilityOf(notificationTeacherIsCreated));
        return notificationTeacherIsCreated.isDisplayed();
    }

    public String notificationTeacherIsCreatedGetText () {
        wdWait.until(ExpectedConditions.visibilityOf(notificationTeacherIsCreated));
        return notificationTeacherIsCreated.getText();
    }
    public void selectRoleClick () {
        wdWait.until(ExpectedConditions.visibilityOf(selectRole));
        selectRole.click();
    }

    public void selectRoleAdminClick () {
        wdWait.until(ExpectedConditions.visibilityOf(selectRoleAdmin));
        selectRoleAdmin.click();
    }

    public void submitRoleClick () {
        wdWait.until(ExpectedConditions.visibilityOf(submitRole));
        submitRole.click();
    }


    public void teacherManagementClick () {
        wdWait.until(ExpectedConditions.visibilityOf(teacherManagement));
        teacherManagement.click();
    }

    public void addTeacherClick () {
        wdWait.until(ExpectedConditions.visibilityOf(addTeacher));
        addTeacher.click();
    }

    public void teacherFirstNameSendKeys (String Name) {
        wdWait.until(ExpectedConditions.visibilityOf(teacherFirstName)).clear();
        teacherFirstName.sendKeys(Name);
    }

    public void teacherLastNameSendKeys (String LastName) {
        wdWait.until(ExpectedConditions.visibilityOf(teacherLastName)).clear();
        teacherLastName.sendKeys(LastName);
    }

    public void dayOfBirthClick () {
        wdWait.until(ExpectedConditions.visibilityOf(dayOfBirth));
        dayOfBirth.click();
    }

    public void arrowSelectYearClick () {
        wdWait.until(ExpectedConditions.visibilityOf(arrowSelectYear));
        arrowSelectYear.click();
    }

    public void calendarScroll () {
        wdWait.until(ExpectedConditions.visibilityOf(calendar));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        String script = "arguments[0].scrollTop = arguments[1];";
        jsExecutor.executeScript(script, calendar, 80);
    }

    public void chooseYear1987Click () {
        wdWait.until(ExpectedConditions.visibilityOf(chooseYear1987));
        chooseYear1987.click();
    }

    public void xButtonPopUpClick () {
        wdWait.until(ExpectedConditions.visibilityOf(xButtonPopUp));
        xButtonPopUp.click();
    }
    public void confirmGeneratePasswordClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(confirmGeneratePassword));
        confirmGeneratePassword.click();
    }
    public void arrowDownButtonClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(arrowDownButton));
        arrowDownButton.click();
    }

    public void addStudentClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(addStudentButton));
        addStudentButton.click();
    }
    public void enterNameSendKeys (String Name) {
        wdWait.until(ExpectedConditions.elementToBeClickable(enterName)).clear();
        enterName.sendKeys(Name);
    }

    public void enterSurnameSendKeys (String Surname) {
        wdWait.until(ExpectedConditions.elementToBeClickable(enterSurname)).clear();
        enterSurname.sendKeys(Surname);
    }

    public void enterEmailSendKeys (String Email) {
        wdWait.until(ExpectedConditions.elementToBeClickable(enterEmail)).clear();
        enterEmail.sendKeys(Email);
    }
    public void saveButtonClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(saveButton));
        saveButton.click();
    }

    public void studentInfoScroll () {
        wdWait.until(ExpectedConditions.visibilityOf(studentInfo));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        String script = "arguments[0].scrollTop = arguments[1];";
        jsExecutor.executeScript(script, studentInfo, 400);
    }

    public void studentInfoScrollUp () {
        wdWait.until(ExpectedConditions.visibilityOf(studentInfo));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        String script = "arguments[0].scrollTop = arguments[1];";
        jsExecutor.executeScript(script, studentInfo, -400);
    }
    public void setStudentPasswordManuallyClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(setStudentsPasswordManually));
        setStudentsPasswordManually.click();
    }

    public void letThemSetTheirOwnPasswordClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(letThemSetTheirOwnPassword));
        letThemSetTheirOwnPassword.click();
    }

    public void passwordAddStudentSendKeys (String password) {
        wdWait.until(ExpectedConditions.elementToBeClickable(passwordAddStudent)).clear();
        passwordAddStudent.sendKeys(password);
    }

    public void repeatPasswordAddStudentSendKeys (String repeatPassword) {
        wdWait.until(ExpectedConditions.elementToBeClickable(repeatPasswordAddStudent)).clear();
        repeatPasswordAddStudent.sendKeys(repeatPassword);
    }

    public boolean notificationClassIsUpdatedIsDislpayed () {
        wdWait.until(ExpectedConditions.visibilityOf(notificationClassIsUpdated));
        return notificationClassIsUpdated.isDisplayed();
    }

    public String notificationClassIsUpdatedGetText () {
        wdWait.until(ExpectedConditions.visibilityOf(notificationClassIsUpdated));
        return notificationClassIsUpdated.getText();


    }

        public void studentNikolaGolubovicClick () {
        wdWait.until(ExpectedConditions.visibilityOfAllElements(studentNikolaGolubovic));
        studentNikolaGolubovic.get(0).click();
        }

        @FindBy (xpath = "//tbody/tr[1]/td[5]/u[1]")
        WebElement studentClick;
        public void studentClickForDelete (){
            wdWait.until(ExpectedConditions.visibilityOf(studentClick));
            studentClick.click();

        }
        public void generateNewPasswordClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(generateNewPassword));
        generateNewPassword.click();
        }

        public void deleteStudentButtonClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(deleteStudentButton));
        deleteStudentButton.click();
        }

        public void confirmDeleteStudentClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(confirmDeleteStudent));
        confirmDeleteStudent.click();
        }

        public boolean notificationStudentRemovedIsDisplayed () {
        wdWait.until(ExpectedConditions.visibilityOf(notificationStudentRemoved));
        return notificationStudentRemoved.isDisplayed();
        }

        public String notificationStudentRemovedGetText () {
        wdWait.until(ExpectedConditions.visibilityOf(notificationStudentRemoved));
        return notificationStudentRemoved.getText();
        }

        public boolean notificationDataIsSavedIsDisplayed () {
        wdWait.until(ExpectedConditions.visibilityOf(notificationDataIsSaved));
        return notificationDataIsSaved.isDisplayed();
        }

        public String notificationDataIsSavedGetText () {
        wdWait.until(ExpectedConditions.visibilityOf(notificationDataIsSaved));
        return notificationDataIsSaved.getText();

        }

        public boolean newPasswordGeneratedIsDisplayed () {
        wdWait.until(ExpectedConditions.visibilityOf(newPasswordIsGenerated));
        return newPasswordIsGenerated.isDisplayed();
        }

        public String newPasswordGeneratedGetText () {
        wdWait.until(ExpectedConditions.visibilityOf(newPasswordIsGenerated));
        return newPasswordIsGenerated.getText();
        }

        public void arrowSelectMonthClick () {
        wdWait.until(ExpectedConditions.visibilityOf(arrowSelectMonth));
        arrowSelectMonth.click();
        }

        public void dayOfBirth8OctoberClick () {
        wdWait.until(ExpectedConditions.visibilityOf(dayOfBirth8October));
        dayOfBirth8October.click();
        }

        public void genderClick () {
        wdWait.until(ExpectedConditions.visibilityOf(selectGender));
        selectGender.click();
        }

        public void genderMaleClick () {
        wdWait.until(ExpectedConditions.visibilityOf(genderMale));
        genderMale.click();
        }

        public void emailTeacherSendKeys (String Email) {
        wdWait.until(ExpectedConditions.visibilityOf(emailTeacherInputField)).clear();
        emailTeacherInputField.sendKeys(Email);
        }

        public void saveButtonTeacherClick () {
        wdWait.until(ExpectedConditions.visibilityOf(buttonSaveTeacher));
        buttonSaveTeacher.click();
        }






}
