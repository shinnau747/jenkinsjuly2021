package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
//import org.testng.Assert;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;
import pages.LoginPage;
import util.TestBase;

public class LoginPageTest {
	//LoginPage loginpageObj;
	//SoftAssert softAssert = new SoftAssert();
	//WebDriver = driver;
	//@BeforeMethod
	//public void setUp() {
		WebDriver driver = TestBase.init();
		LoginPage loginpageObj = PageFactory.initElements(driver, LoginPage.class);
		
	//}
	@Test
	public void loginTest() throws Throwable {
		
		loginpageObj.enterUserName("demo@techfios.com");
		Thread.sleep(2000);
		loginpageObj.enterPassword("abc123");
		Thread.sleep(2000);
		loginpageObj.clickSignInButton();
		TestBase.takeScreenshotAtEndOfTest(driver);
	}
	@Test
	public void loginpageTitleTest () throws Throwable {
		
		loginpageObj.enterUserName("demo@techfios.com");
		Thread.sleep(2000);
		loginpageObj.enterPassword("abc123");
		Thread.sleep(2000);
		loginpageObj.clickSignInButton();
		
		String expectedTitle = "Dashboard- iBilling";
		String actualTitle = loginpageObj.getPageTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		System.out.println(actualTitle);
		
	}
	
}
