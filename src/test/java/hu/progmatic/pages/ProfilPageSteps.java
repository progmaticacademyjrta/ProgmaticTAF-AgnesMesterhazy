package hu.progmatic.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ProfilPageSteps {
    WebDriver driver;

    By profileTabBy = By.xpath("//*[@id=\"sidebar-wrapper\"]/ul/li[4]/a");

    public ProfilPageSteps(WebDriver driver) {
        this.driver = driver;
    }

    public void chooseProfilePageInHamburgerMenu(){
        WebElement profileTab = driver.findElement(profileTabBy);
        profileTab.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/profile.php#profile");
        System.out.println("Profile page is opened.");
    }
}
