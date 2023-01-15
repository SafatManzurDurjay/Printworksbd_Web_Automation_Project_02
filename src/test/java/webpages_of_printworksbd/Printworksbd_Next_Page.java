package webpages_of_printworksbd;

import org.openqa.selenium.By;

public class Printworksbd_Next_Page extends Base_Page{
	
	 private By next = By.xpath("(//a)[260]");
	 private By choosebook = By.xpath("//a[normalize-space()='']//div//img[@alt='Heros of Olympus -The Blood of Olympus']");
	 private By addtocart = By.xpath("//button[@value='10319']");
	 
	 private By viewcart = By.xpath("//a[normalize-space()='View cart']");
	 
	 private By continueshopping = By.xpath("//button[@value='1']");
	 
	 
	
	  public void clicknext() {
		  
		  clickOnElement(next);
	  }
	  
	  public void clickbook() {
		  
		  clickOnElement(choosebook);
	  }
	  
	  public void addoncart() {
		  clickOnElement(addtocart);
	  }
	  
	  public void viewincart() {
		  
		  clickOnElement(viewcart);
	  }
	  
	  public void scrolltoshopping() {
		  
		  Scroll(continueshopping);
		  
	  }


}
