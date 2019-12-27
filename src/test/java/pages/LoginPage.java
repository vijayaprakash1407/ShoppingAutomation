package pages;


import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.datatable.DataTable;


public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "email")
    private WebElement usernameInputField;

    @FindBy(how = How.ID, using = "passwd")
    private WebElement passwordInputField;

    @FindBy(how = How.ID, using = "SubmitLogin")
    private WebElement loginButton;

    
    public void enterUsername(String email) {
        usernameInputField.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordInputField.sendKeys(password);
    }

    public void clickSignInButton() {
        loginButton.click();
    }

	public void selectProducts(DataTable dataTable) {
		
		List<String> data = dataTable.row(1);
		System.out.println(data.get(0));
		driver.findElement(By.linkText(data.get(0))).click();
		driver.findElement(By.linkText(data.get(1))).click();
		
	}

   

}
