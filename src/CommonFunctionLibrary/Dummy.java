package CommonFunctionLibrary;

import org.openqa.selenium.WebDriver;

public class Dummy {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		  driver = FunctionLibrary.startBrowser();
		
	    FunctionLibrary.openApplication(driver);
	   
	    
		FunctionLibrary.waitForElement(driver,"id","username","10");
		FunctionLibrary.typeAction(driver, "id", "username", "admin");
		
		FunctionLibrary.waitForElement(driver,"name","password","10");
		FunctionLibrary.typeAction(driver, "name", "password", "master");
		 
		FunctionLibrary.clickAction(driver, "xpath", "//*[@id='btnsubmit']");
		
		FunctionLibrary.waitForElement(driver,"id","logout","10");
		FunctionLibrary.clickAction(driver, "id", "logout");
		Thread.sleep(5000);
		
		FunctionLibrary.waitForElement(driver, "xpath", "//*[text()='OK!']","10");
		Thread.sleep(5000);
		FunctionLibrary.clickAction(driver, "xpath", "//*[text()='OK!']");
		FunctionLibrary.closeBrowser(driver);
		
		
		
		
		
		
		}
	}

