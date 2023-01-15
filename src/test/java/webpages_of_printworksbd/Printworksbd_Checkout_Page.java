package webpages_of_printworksbd;

import org.openqa.selenium.By;

public class Printworksbd_Checkout_Page extends Base_Page {
	
	private By proceed = By.xpath("//a[normalize-space()='Proceed to checkout']");
	
	  public void checkout() {
		  
		  clickOnElement(proceed);
	  }

}
