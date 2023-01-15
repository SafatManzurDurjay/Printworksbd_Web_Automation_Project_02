package webtests;

import static org.testng.Assert.assertEquals;
import static utilities.DriverSetup.getDriver;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

//import io.qameta.allure.Description;
import utilities.DriverSetup;
import webpages_of_printworksbd.Printworksbd_Checkout_Page;
import webpages_of_printworksbd.Printworksbd_Home_Page;
import webpages_of_printworksbd.Printworksbd_Next_Page;


public class LoginTest extends DriverSetup {
	
	Printworksbd_Home_Page printworksbd_Home_Page = new Printworksbd_Home_Page();
	Printworksbd_Next_Page printworksbd_Next_Page = new Printworksbd_Next_Page();
	Printworksbd_Checkout_Page printworksbd_Checkout_Page = new Printworksbd_Checkout_Page();
	
		
	@Test
	public void loginTest() {

		getDriver().get("https://www.printworksbd.com/");

		JavascriptExecutor js = (JavascriptExecutor) getDriver();

////		rokomari_Home_Page.clickONLoginButton();
//
//		js.executeScript("window.scrollBy(0,200)");
		

		// rokomari_Login_Page.cliONLoginButton();
		assertEquals(getDriver().getTitle(), "Printworks BD- The Best Place to Shop Books Online in Bangladesh");

		
		
//		JavascriptExecutor js1 = (JavascriptExecutor)getDriver();
	
		
//		js.executeScript("window.scrollBy(0,5700)","");

		
		printworksbd_Home_Page.StoryBooks();
		printworksbd_Home_Page.clickfiction();
		printworksbd_Home_Page.scrolling();
		printworksbd_Next_Page.clicknext();
		printworksbd_Next_Page.clickbook();
		printworksbd_Next_Page.addoncart();
		printworksbd_Next_Page.viewincart();
		printworksbd_Next_Page.scrolltoshopping();
		printworksbd_Checkout_Page.checkout();
		
		WebElement element = getDriver().findElement(By.xpath("//body/div/div/div/div/div/div[@role='main']/article/div/div/form[@method='post']/div/div/div[1]/div[1]/p[1]/input[1]"));
		element.sendKeys("S.M. Safat Manzur");
		
		element = getDriver().findElement(By.xpath("(//input[@type='text'])[6]"));
		element.sendKeys("Durjay");
		
		element = getDriver().findElement(By.xpath("(//input[@placeholder='Street address'])[1]"));
		element.sendKeys("GOALTEK MOSJID ROAD");
		
		element = getDriver().findElement(By.xpath("(//input[@placeholder='Apartment, suite, unit etc. (optional)'])[1]"));
		element.sendKeys("H#83");
		
		element = getDriver().findElement(By.xpath("(//input[@type='text'])[9]"));
		element.sendKeys("1230");
		
		element = getDriver().findElement(By.xpath("(//input[@type='tel'])[1]"));
		element.sendKeys("01790891807");
		
		element = getDriver().findElement(By.xpath("(//input[@autocomplete='email username'])[1]"));
		element.sendKeys("safatmanzur@gmail.com");
		
		element = getDriver().findElement(By.xpath("(//textarea[@placeholder='Notes about your order, e.g. special notes for delivery.'])[1]"));
		element.sendKeys("Please take my order in place");
		

	}

}
