package src;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddStudentPage extends BasePage {
    // Locators
    private By firstName = By.id("mat-input-10");
    private By lastName = By.id("mat-input-11");
    private By email = By.id("mat-input-12");
    private By phone = By.id("mat-input-13");
    private By studentTypeChildRadio = By.id("radioOptionID-mat-radio-7-input");
    private By studentTypeAdultRadio = By.id("radioOptionID-mat-radio-6-input");
    private By familyNewRadio = By.id("radioOptionID-mat-radio-8-input");
    private By familyExistingRadio = By.id("radioOptionID-mat-radio-9-input");
    private By parentFirstName = By.id("mat-input-3");
    private By parentLastName = By.id("mat-input-4");
    private By parentEmail = By.id("mat-input-5");
    private By parentPhone = By.id("mat-input-6");
    private By stepNextButton = By.xpath("//div[@id='step1']//div[contains(@class, 'scss-button-label') and text()='Next']");
    private By saveButton = By.xpath("//div[@id='step2']//div[contains(@class, 'scss-button-label') and text()='Save']");

    public AddStudentPage(WebDriver driver) {
        super(driver);
    }

    public void fillBasicInfo(String fname, String lname, String emailAddress, String phoneNumber) {
        type(firstName, fname);
        type(lastName, lname);
        type(email, emailAddress);
        type(phone, phoneNumber);
    }

    public void selectStudentTypeChild() {
        click(studentTypeChildRadio);
    }

    public void selectStudentTypeAdult() {
        click(studentTypeAdultRadio);
    }

    public void selectFamilyNew() {
        click(familyNewRadio);
    }

    public void selectFamilyExisting() {
        click(familyExistingRadio);
    }

    public void fillParentDetails(String fName, String lName, String email, String phone) {
        type(parentFirstName, fName);
        type(parentLastName, lName);
        type(parentEmail, email);
        type(parentPhone, phone);
    }

    public void clickNext() {
        click(stepNextButton);
    }

    public void clickSave() {
        click(saveButton);
    }

    public void selectStudentType(String type) {
        if (type.equalsIgnoreCase("child")) {
            click(studentTypeChildRadio);
        } else if (type.equalsIgnoreCase("adult")) {
            click(studentTypeAdultRadio);
        }
    }

    public void selectFamilyOption(String option) {
        if (option.equalsIgnoreCase("new")) {
            click(familyNewRadio);
        } else if (option.equalsIgnoreCase("existing")) {
            click(familyExistingRadio);
        }
    }
}