package hu.progmatic.testcases;

import hu.progmatic.driverfactory.DriverBaseTest;
import hu.progmatic.pages.HomePageSteps;
import hu.progmatic.pages.LoginPageSteps;
import hu.progmatic.pages.ProfilPageSteps;
import org.testng.annotations.Test;

public class ProfilPageTests extends DriverBaseTest {
    LoginPageSteps loginPage;
    HomePageSteps homePage;
    ProfilPageSteps profilPage;

    @Test(description = "Open Hamburger menu, choose Profil and the profil page is loaded successfully.")
    public void openProfilPage(){
        homePage = new HomePageSteps(driver,wait);
        loginPage = new LoginPageSteps(driver,wait);
        profilPage = new ProfilPageSteps(driver);
        homePage.loadHomePage();
        homePage.openHamburgerMenu();
        homePage.chooseLoginTab();
        loginPage.validUsernameValidPasswordLogin();
        homePage.openHamburgerMenu();
        profilPage.chooseProfilePageInHamburgerMenu();
    }
}
