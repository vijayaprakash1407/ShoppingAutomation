package pages;

import managers.FileReaderManager;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class OrdercompletePage {

    WebDriver driver;

    public OrdercompletePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    	
	
	public void navigateToPayment() {
		driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]")).click();

		
	}



	public void clickWireTransfer() {
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button")).click();
		driver.findElement(By.xpath("//*[@id=\"cgv\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"form\"]/p/button")).click();
		
	}



	public void confirmOrder() {
		driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")).click();
			
	}



	public void confirmOrderPage() {
		driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button")).click();
		
	}


	public void verifyOrdercompleted() {
		String confirmation = driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1")).getText();
		Assert.assertTrue(confirmation.contains("ORDER CONFIRMATION"));
		
	}
   


   
}
