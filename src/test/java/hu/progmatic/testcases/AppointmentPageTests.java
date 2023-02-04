package hu.progmatic.testcases;

import hu.progmatic.driverfactory.DriverBaseTest;
import hu.progmatic.pages.HomePage;
import hu.progmatic.pages.LoginPage;
import hu.progmatic.pages.AppointmentPage;
import org.testng.annotations.Test;

public class AppointmentPageTests extends DriverBaseTest {
    LoginPage loginPage;
    HomePage homePage;
    AppointmentPage makeAppointmentPage;

    @Test(description = "TC06: Go to appointment page, fill date and comment data and book appointment which is successful.", groups = {"smoke", "regression", "release"})
    public void makeAppointment() throws InterruptedException {
        loginPage = new LoginPage(driver, wait);
        homePage = new HomePage(driver, wait);
        makeAppointmentPage = new AppointmentPage(driver, wait);
        homePage.loadHomePage();
        homePage.clickMakeAppointmentButton();
        loginPage.validUsernameValidPasswordLogin();
        makeAppointmentPage.fillVisitDateAndCommentThenBookAppointment();
    }
}
