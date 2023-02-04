package hu.progmatic.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class MakeAppointmentPageSteps {
    WebDriver driver;
    WebDriverWait wait;

    By visitDateFieldBy = By.cssSelector("[name='visit_date']");
    By commentBy = By.cssSelector("[class='form-control'][name='comment'][placeholder='Comment']");
    By bookAppointmentButtonBy = By.id("btn-book-appointment");
    By confirmationMessageBy = By.className("lead");

    public MakeAppointmentPageSteps(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    public void fillVisitDateAndCommentAndBookAppointment() throws InterruptedException {
        WebElement visitDate = driver.findElement(visitDateFieldBy);
        visitDate.sendKeys("04/02/2023");
        WebElement comment = driver.findElement(commentBy);
        comment.sendKeys("teszt");
        WebElement bookAppointmentButton = driver.findElement(bookAppointmentButtonBy);
        bookAppointmentButton.click();
        System.out.println("appintmentbook button is clicked");
        WebElement confimationMessage = driver.findElement(confirmationMessageBy);
        Assert.assertTrue(confimationMessage.isDisplayed());
        System.out.println("Booking is happened and navigate to Appointment Confirmation page.");
    }
}
