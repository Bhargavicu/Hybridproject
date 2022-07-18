package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCartpage {
	
	
	
	@FindBy(id="add")
	private WebElement addbtn;
	
	
	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement addcart;
	
	
	
	public  AddtoCartpage(WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
		  
	  }



	public WebElement getAddbtn() {
		return addbtn;
	}
	
	
	public void addtocartpage() {
		 addcart.click();
		
	}


}
