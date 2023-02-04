package hu.progmatic.testcases;

import hu.progmatic.driverfactory.DriverBaseTest;
import hu.progmatic.pages.HomePageSteps;
import org.testng.annotations.Test;

public class HomePageTests extends DriverBaseTest {
    HomePageSteps homePage;

    @Test(description = "TC01: Homepage loaded test that loads the page and validates whether the header is displayed or not.")
    public void homepageLoadedTest() {
        homePage = new HomePageSteps(driver, wait);
        homePage.loadHomePage();
    }

    @Test(description = "TC02: Make appointment button is clickable.", groups = {"smoke", "regression", "release"} )
    public void makeAppointmentButtonClickableTest() {
        homePage = new HomePageSteps(driver, wait);
        homePage.loadHomePage();
        homePage.checkMakeAppointmentButtonIsClickable();
    }

}
