package managers;

import org.openqa.selenium.WebDriver;
import pages.*;

public class PageObjectManager {

    private WebDriver driver;

    private LandingPage landingPage;

    private LoginPage loginPage;

    private MyAccountPage myAccountPage;

  

    private RegisterPage registerPage;
    private OrdercompletePage ordercompletePage;
 

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public LandingPage getLandingPage() {
        if (landingPage == null)
            return landingPage = new LandingPage(driver);
        return landingPage;
    }

    public LoginPage getLoginPage() {
        if (loginPage == null)
            return loginPage = new LoginPage(driver);
        return loginPage;
    }

    public MyAccountPage getMyAccountPage() {
        if (myAccountPage == null)
            return myAccountPage = new MyAccountPage(driver);
        return myAccountPage;
    }

    public RegisterPage getRegisterPage() {
        if (registerPage == null)
            return registerPage = new RegisterPage(driver);
        return registerPage;
    }
    public OrdercompletePage getOrdercompletePage() {
        if (ordercompletePage == null)
            return ordercompletePage = new OrdercompletePage(driver);
        return ordercompletePage;
    }
   
}
