package hu.progmatic.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomePage {
    WebDriver driver;
    WebDriverWait wait;
    By headerBy = By.id("top");
    By makeAppointmentButtonBy = By.id("btn-make-appointment");
    By footerDisplayBy = By.id("to-top");
    By hamburgerMenuBy = By.id("menu-toggle");
    By sidebarWrapperBy = By.id("sidebar-wrapper");
    By loginBy = By.xpath("//*[@id=\"sidebar-wrapper\"]/ul/li[3]/a");

    public HomePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void loadHomePage() {
        driver.get("https://katalon-demo-cura.herokuapp.com");
        WebElement headerElement = driver.findElement(headerBy);
        Assert.assertTrue(headerElement.isDisplayed());
        System.out.println("Homepage loaded properly.");
    }

    public void clickMakeAppointmentButton() {
        WebElement makeAppointmentButton = driver.findElement(makeAppointmentButtonBy);
        makeAppointmentButton.click();
        WebElement footerDisplay = driver.findElement(footerDisplayBy);
        Assert.assertTrue(footerDisplay.getAttribute("style").contains("block"));
        System.out.println("Appointment Button is clicked.");
    }

    public void openHamburgerMenu() {
        WebElement hamburgerMenu = driver.findElement(hamburgerMenuBy);
        hamburgerMenu.click();
        WebElement sidebar = driver.findElement(sidebarWrapperBy);
        Assert.assertTrue(sidebar.getAttribute("class").contains("active"));
        System.out.println("Hamburger menu is opened.");
    }

    public void chooseLoginTab() {
        WebElement loginTab = driver.findElement(loginBy);
        loginTab.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/profile.php#login");
        System.out.println("Login page is opened.");
    }
}
