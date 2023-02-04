package hu.progmatic.testcases;

import hu.progmatic.driverfactory.DriverBaseTest;
import hu.progmatic.pages.HomePageSteps;
import hu.progmatic.pages.LoginPageSteps;
import hu.progmatic.pages.MakeAppointmentPageSteps;
import org.testng.annotations.Test;

public class MakeAppointmentTests extends DriverBaseTest {
    LoginPageSteps loginPage;
    HomePageSteps homePage;
    MakeAppointmentPageSteps makeAppointmentPage;

    @Test(description = "Go to appointment page and the appointment booking is successful.", groups = {"smoke", "regression", "release"})
    public void makeAppointment() throws InterruptedException {
        loginPage = new LoginPageSteps(driver, wait);
        homePage = new HomePageSteps(driver, wait);
        makeAppointmentPage = new MakeAppointmentPageSteps(driver,wait);
        homePage.loadHomePage();
        homePage.checkMakeAppointmentButtonIsClickable();
        loginPage.validUsernameValidPasswordLogin();
        makeAppointmentPage.fillVisitDateAndCommentAndBookAppointment();
    }
}
