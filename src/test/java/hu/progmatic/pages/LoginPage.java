package hu.progmatic.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;

    By usernameFieldBy = By.cssSelector("[name='username']");
    By passwordFieldBy = By.cssSelector("[name='password']");
    By loginButtonBy = By.cssSelector("[type='submit']");
    By loginFailedMessageBy = By.className("text-danger");
    By logoutTabBy = By.linkText("Logout");

    public LoginPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void wrongUsernameWrongPasswordLogin() {
        WebElement usernameField = driver.findElement(usernameFieldBy);
        usernameField.sendKeys("wrongUsername");

        WebElement passwordField = driver.findElement(passwordFieldBy);
        passwordField.sendKeys("wrongPassword");

        WebElement loginButton = driver.findElement(loginButtonBy);
        loginButton.click();

        WebElement loginFailedMessage = driver.findElement(loginFailedMessageBy);

        Assert.assertEquals(loginFailedMessage.getText(), "Login failed! Please ensure the username and password are valid.");
        System.out.println("The correct 'Login failed' message is displayed.");
    }

    public void validUsernameValidPasswordLogin() {
        WebElement usernameField = driver.findElement(usernameFieldBy);
        usernameField.sendKeys("John Doe");

        WebElement passwordField = driver.findElement(passwordFieldBy);
        passwordField.sendKeys("ThisIsNotAPassword");

        WebElement loginButton = driver.findElement(loginButtonBy);
        loginButton.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/#appointment");
        System.out.println("Login was successful.");
    }

    public void chooseLogout() {
        WebElement logoutTab = driver.findElement(logoutTabBy);
        logoutTab.click();
        System.out.println("Logout was successful.");
    }
}
