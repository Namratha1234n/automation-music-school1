package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import src.LoginPage;
import src.AddStudentPage;

public class SchoolManagementTests {
    private WebDriver driver;
    private LoginPage loginPage;
    private AddStudentPage addStudentPage;

    @BeforeClass
    public void setUp() {
        
        WebDriverManager.chromedriver().setup();

        
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
     
        options.addArguments("--disable-web-security");
        options.addArguments("--allow-insecure-localhost");
        options.addArguments("--disable-blink-features=AutomationControlled");
        

        
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        // Navigate to the application URL
        driver.get("https://app.mymusicstaff.com/");

        // Initialize page objects
        loginPage = new LoginPage(driver);
        addStudentPage = new AddStudentPage(driver);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testAddStudent() {
    
        loginPage.enterEmail("your_email@example.com");
        loginPage.enterPassword("your_password");
        loginPage.clickSignInButton();

       
        addStudentPage.fillBasicInfo("John", "Doe", "john.doe@example.com", "1234567890");
        addStudentPage.selectStudentType("child");
        addStudentPage.selectFamilyOption("new");
        addStudentPage.fillParentDetails("Jane", "Doe", "jane.doe@example.com", "0987654321");
        addStudentPage.clickNext();
        addStudentPage.clickSave();
    }
}
