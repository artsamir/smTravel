package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrintTicketPage {
	
	WebDriver driver;
	  
	  //constructor
	  
	  public PrintTicketPage(WebDriver driver) {
	  
		  this.driver = driver; 
	  
		  PageFactory.initElements(driver, this); 
	  }
	  
	  @FindBy(xpath = "//button[@aria-label='Menu']") private WebElement menubtn;
	  
	  @FindBy(linkText = " Print Tickets") private WebElement printtickets;
	  
	  @FindBy(id = "print-ticket-pnr") private WebElement pnrtxt;
	  @FindBy(id = "print-ticket-btn") private WebElement getdetails;

	public WebElement getMenubtn() {
		return menubtn;
	}
	public WebElement getPrinttickets() {
		return printtickets;
	}
	public WebElement getPnrtxt() {
		return pnrtxt;
	}
	public WebElement getGetdetails() {
		return getdetails;
	}
	
	public void menubtn() {
		menubtn.click();
	}
	
	public void printtickets() {
		printtickets.click();
	}
	
	public void getdetails() {
		getdetails.click();
	}
	  
}
