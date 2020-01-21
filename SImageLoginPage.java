package com.vardhini.siamge.automation.Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.vardhini.simage.automation.pages.SImageHomePage;

public class SImageLoginPage {

	@Test
	public void verifySImageLoginPage() throws InterruptedException  {
		
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium Jars\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(" https://www.sharperimage.com/si/view/category/200007/200007?mainCatId=\"");

			SImageHomePage homepage = new SImageHomePage(driver);
			homepage.getPageTitle();
			System.out.println("Home page title is : " + homepage.getPageTitle());
			Thread.sleep(20000);
			homepage.moveToToggleButton();
			homepage.clickOnLogInButton();
			driver.close();

		
	
	}

}
