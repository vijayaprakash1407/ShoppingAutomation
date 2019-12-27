package pages;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import testDataTypes.User;

public class RegisterPage {

    WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "customer_firstname")
    private WebElement firstNameInputField;

    @FindBy(how = How.ID, using = "customer_lastname")
    private WebElement lastNameInputField;

    @FindBy(how = How.ID, using = "phone_mobile")
    private WebElement phoneInputField;

    @FindBy(how = How.ID, using = "passwd")
    private WebElement passwordInputField;

    @FindBy(how = How.ID, using = "address1")
    private WebElement addressInputField;
    
    @FindBy(how = How.ID, using = "city")
    private WebElement cityInputField;
    
    @FindBy(how = How.ID, using = "id_state")
    private WebElement stateDropDownField;
    
    @FindBy(how = How.ID, using = "postcode")
    private WebElement postcodeInputField;
    
    
    @FindBy(how = How.ID, using = "id_country")
    private WebElement countryDropDownField;
    
    @FindBy(how = How.ID, using = "alias")
    private WebElement aliasInputField;

    @FindBy(how = How.ID, using = "submitAccount")
    private WebElement registerButton;
    
    @FindBy(how = How.ID, using = "email_create")
    private WebElement emailInputField;
    
    @FindBy(how = How.ID, using = "SubmitCreate")
    private WebElement createButton;
    
    public void enterRegistrationDetails() {
    	Random rand = new Random(); 
    	  
        // Generate random integers in range 0 to 999 
        int rand_int1 = rand.nextInt(1000);
        String str1 = Integer.toString(rand_int1);  
        
    	emailInputField.sendKeys("testuser" + str1 + "@test.com");
        
    	createButton.click();
    	register();
    }

   

    public void register() {
        firstNameInputField.sendKeys("Matt");
        lastNameInputField.sendKeys("Test");
        passwordInputField.sendKeys("Password1");
        addressInputField.sendKeys("BroadSt");
        cityInputField.sendKeys("Richmond");
        Select stateDropdown=new Select(stateDropDownField);
        stateDropdown.selectByVisibleText("Virginia");
        postcodeInputField.sendKeys("23294");
        Select countryDropdown=new Select(countryDropDownField);
        countryDropdown.selectByVisibleText("United States");
        phoneInputField.sendKeys("1041231111");
        aliasInputField.sendKeys("test");
        registerButton.click();
    }

   
}
