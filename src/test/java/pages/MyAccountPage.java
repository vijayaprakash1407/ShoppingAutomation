package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.Wait;

public class MyAccountPage {

    WebDriver driver;
    WebDriverWait wait;

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")
    private WebElement customerAccountName;

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/h1")
    private WebElement myAccountText;
    
    @FindBy(how = How.XPATH, using = "//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")
    private WebElement signoutLink;

    public void validateAccountInfo() {
       // wait.until(ExpectedConditions.titleIs("My Account"));
        Assert.assertTrue(customerAccountName.getText().contains("Matt"));
    }

    public void validateMyAccountText() {
       
         Assert.assertTrue(myAccountText.getText().contains("MY ACCOUNT"));
     }

    public void verifySigoutLink() {
        
        Assert.assertTrue(signoutLink.getText().contains("Sign out"));
        signoutLink.click();
    }
}