package webpages_of_printworksbd;

import org.openqa.selenium.By;

public class Printworksbd_Home_Page extends Base_Page{
	
	  private By hoveroncategory = By.xpath("(//a[normalize-space()='Story Books'])[1]");
	  private By clickoption = By.xpath("(//a[normalize-space()='Fiction'])[1]");
	  
	  private By selectedpath = By.xpath("(//img[@alt='Star Wars: Phasma., Delilah S. Dawson'])[2]");
	  
	 
//		
	  public void StoryBooks() {
				
	  Hover(hoveroncategory);	

}
	  
	  public void clickfiction() {
		  
		  clickOnElement(clickoption);
	  }
	  
	  public void scrolling() {
		  
		 Scroll(selectedpath);
	  }
	  

	  
	  

}