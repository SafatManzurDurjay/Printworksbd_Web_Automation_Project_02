package webpages_of_printworksbd;

import static utilities.DriverSetup.getDriver;

//import java.io.ByteArrayInputStream;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.xml.sax.Locator;

//import io.qameta.allure.Allure;

public class Base_Page {
	 public WebElement getElement(By locator) {
			
			WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
			
			return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			
			
		}
		
		public void clickOnElement(By locator) {
			
			getElement(locator).click();
			
		}
		
		public String getElementText(By locator) {
		
			return getElement(locator).getText();
			
		}
		
		public void writeText(By locator, String text) {
			
			getElement(locator).sendKeys(text);
			
		}
		
		public String getAlertText() {
			
			WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
			
			Alert alert = wait.until(ExpectedConditions.alertIsPresent());
			return alert.getText();
				
		}
		
//		public void takescreenshot(String name) {
//			
//			Allure.addAttachment(name, new ByteArrayInputStream(((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES)));
//				
//		}
				
		public void Hover(By locator) {
			
			Actions action = new Actions(getDriver());
			WebElement element = getElement(locator);
			
//			action.moveToElement(element).perform();
//			
//			action.click().build().perform();		
			action.moveToElement(element).perform();
			
		}
//		
		public void Scroll(By locator) {
			
			JavascriptExecutor js = (JavascriptExecutor)getDriver();
			js.executeScript("arguments[0].scrollIntoView();", getDriver().findElement(locator));
			
			
		}

}
