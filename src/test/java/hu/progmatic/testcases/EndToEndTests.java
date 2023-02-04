package hu.progmatic.testcases;

import hu.progmatic.driverfactory.DriverBaseTest;
import hu.progmatic.pages.HomePage;
import hu.progmatic.pages.LoginPage;
import hu.progmatic.pages.AppointmentPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EndToEndTests extends DriverBaseTest {
    LoginPage loginPage;
    HomePage homePage;
    AppointmentPage makeAppointmentPage;

    @Test(description = "TC08: End-to-end- Login, book an appointment, navigate to sign out and it is successful.", groups = {"smoke", "release", "endtoend"})
    public void successLoginAndAppointmentBookThenSignOutEndToEndTest() throws InterruptedException {
        loginPage = new LoginPage(driver, wait);
        homePage = new HomePage(driver, wait);
        makeAppointmentPage = new AppointmentPage(driver, wait);
        homePage.loadHomePage();
        homePage.clickMakeAppointmentButton();
        loginPage.validUsernameValidPasswordLogin();
        makeAppointmentPage.fillVisitDateAndCommentThenBookAppointment();
        homePage.openHamburgerMenu();
        loginPage.chooseLogout();
        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/");
    }
}
