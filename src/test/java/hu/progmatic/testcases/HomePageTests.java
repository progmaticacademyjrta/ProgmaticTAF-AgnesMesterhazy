package hu.progmatic.testcases;

import hu.progmatic.driverfactory.DriverBaseTest;
import hu.progmatic.pages.HomePage;
import org.testng.annotations.Test;

public class HomePageTests extends DriverBaseTest {
    HomePage homePage;

    @Test(description = "TC01: Homepage loaded test that loads the page and validates whether the header is displayed or not.", groups = {"smoke", "regression", "release"})
    public void homepageLoadedTest() {
        homePage = new HomePage(driver, wait);
        homePage.loadHomePage();
    }

    @Test(description = "TC02: Check that the appointment button is clickable.", groups = {"smoke", "regression", "release"})
    public void makeAppointmentButtonClickableTest() {
        homePage = new HomePage(driver, wait);
        homePage.loadHomePage();
        homePage.clickMakeAppointmentButton();
    }
}
