package hu.progmatic.testcases;

import hu.progmatic.driverfactory.DriverBaseTest;
import hu.progmatic.pages.HomePage;
import hu.progmatic.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginPageTests extends DriverBaseTest {

    LoginPage loginPage;
    HomePage homePage;

    @Test(description = "TC03: Login with wrong username and wrong password then good error message appears.", groups = {"release", "regression"})
    public void wrongUsernameWrongPasswordLoginTest() {
        loginPage = new LoginPage(driver, wait);
        homePage = new HomePage(driver, wait);
        homePage.loadHomePage();
        homePage.openHamburgerMenu();
        homePage.chooseLoginTab();
        loginPage.wrongUsernameWrongPasswordLogin();
    }

    @Test(description = "TC04: Login with valid username and valid password then login is successful.", groups = {"smoke", "regression", "release"})
    public void validUserNameValidPasswordLoginTest() {
        loginPage = new LoginPage(driver, wait);
        homePage = new HomePage(driver, wait);
        homePage.loadHomePage();
        homePage.openHamburgerMenu();
        homePage.chooseLoginTab();
        loginPage.validUsernameValidPasswordLogin();
    }

    @Test(description = "TC05: Login and after logout from the page and it is success.", groups = {"smoke", "regression", "release"})
    public void logout() {
        loginPage = new LoginPage(driver, wait);
        homePage = new HomePage(driver, wait);
        homePage.loadHomePage();
        homePage.openHamburgerMenu();
        homePage.chooseLoginTab();
        loginPage.validUsernameValidPasswordLogin();
        homePage.openHamburgerMenu();
        loginPage.chooseLogout();
        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/");
    }
}
