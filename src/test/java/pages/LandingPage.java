package pages;

import managers.FileReaderManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

    WebDriver driver;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(how = How.XPATH, using = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
    private WebElement signInLink;
    
   
    
    public void clickSignInLink() {
    	signInLink.click();
    	
    	
    	
    }
   

    public void navigateToLandingPage() {
        driver.get(FileReaderManager.getInstance().getConfigFileReader().getBaseUrl());
    }

   
}
