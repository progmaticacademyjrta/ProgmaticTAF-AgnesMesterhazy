package hu.progmatic.testcases;

import hu.progmatic.driverfactory.DriverBaseTest;
import hu.progmatic.pages.HomePage;
import hu.progmatic.pages.LoginPage;
import hu.progmatic.pages.ProfilPage;
import org.testng.annotations.Test;

public class ProfilPageTests extends DriverBaseTest {
    LoginPage loginPage;
    HomePage homePage;
    ProfilPage profilPage;

    @Test(description = "TC07: Open Hamburger menu, choose 'Profile' and the profile page is loaded successfully.", groups = {"smoke", "release", "regression"})
    public void openProfilPageTest() {
        homePage = new HomePage(driver, wait);
        loginPage = new LoginPage(driver, wait);
        profilPage = new ProfilPage(driver);
        homePage.loadHomePage();
        homePage.openHamburgerMenu();
        homePage.chooseLoginTab();
        loginPage.validUsernameValidPasswordLogin();
        homePage.openHamburgerMenu();
        profilPage.chooseProfilePageInHamburgerMenu();
    }
}
