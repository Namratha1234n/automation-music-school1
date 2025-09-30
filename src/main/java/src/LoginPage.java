package src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    private By emailInput = By.id("MainContent_contentBody_textboxEmail");
    private By passwordInput = By.id("MainContent_contentBody_textboxPassword");
    private By signInButton = By.id("MainContent_contentBody_buttonLogin");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterEmail(String email) {
        type(emailInput, email);
    }

    public void enterPassword(String password) {
        type(passwordInput, password);
    }

    public void clickSignInButton() {
        click(signInButton);
    }
}