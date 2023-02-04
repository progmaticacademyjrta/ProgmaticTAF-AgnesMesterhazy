package hu.progmatic.testcases;

import hu.progmatic.driverfactory.DriverBaseTest;
import hu.progmatic.pages.HomePageSteps;
import hu.progmatic.pages.LoginPageSteps;
import org.testng.annotations.Test;


public class LoginPageTests extends DriverBaseTest {

    LoginPageSteps loginPage;
    HomePageSteps homePage;

    @Test (description = "TC03: Login with wrong username and wrong password and good error message appears.", groups = {"release", "regression"})
    public void wrongUsernameWrongPasswordLoginTest(){
        loginPage = new LoginPageSteps(driver, wait);
        homePage = new HomePageSteps(driver, wait);
        homePage.loadHomePage();
        homePage.openHamburgerMenu();
        homePage.chooseLoginTab();
        loginPage.wrongUsernameWrongPasswordLogin();
    }
    @Test (description = "TC04: Login with valid username and valid password and login is successful.", groups = {"smoke", "regression", "release"})
    public void validUserNameValidPasswordLoginTest(){
        loginPage = new LoginPageSteps(driver, wait);
        homePage = new HomePageSteps(driver, wait);
        homePage.loadHomePage();
        homePage.openHamburgerMenu();
        homePage.chooseLoginTab();
        loginPage.validUsernameValidPasswordLogin();
    }


}
