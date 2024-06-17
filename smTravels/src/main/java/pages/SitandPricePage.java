package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SitandPricePage {
	
	WebDriver driver;
	  
	  //constructor
	  
	  public SitandPricePage(WebDriver driver) {
	  
		  this.driver = driver; 
	  
		  PageFactory.initElements(driver, this); 
	  }
	  
	  @FindBy(xpath = "(//div[@class='col-4 border-left'])[1]") private WebElement availsit;
	  
	  @FindBy(xpath = "//div/label[@class='btn btn-outline-secondary btn-sm' and text()=' 800 ']") private WebElement selectprice;
	  
	  @FindBy(xpath = "//div[@data-code='BLK1PCK5']") private WebElement selectsit;
	  
	  @FindBy(css = "#selected-seat-next") private WebElement nextbtn;
	  
	  @FindBy(xpath = "//li[@class='list-group-item list-group-item-action stationpoint']") private WebElement selectboarding;
	  
	  @FindBy(xpath = "(//li[@class='list-group-item list-group-item-action stationpoint'])[18]") private WebElement justview;
	  
	  @FindBy(xpath = "//*[contains(text(),'Jalahalli Cross near signal ')]") private WebElement selectdroping;

	public WebElement getAvailsit() {
		return availsit;
	}

	public WebElement getSelectprice() {
		return selectprice;
	}

	public WebElement getSelectsit() {
		return selectsit;
	}

	public WebElement getNextbtn() {
		return nextbtn;
	}

	public WebElement getSelectboarding() {
		return selectboarding;
	}

	public WebElement getSelectdroping() {
		return selectdroping;
	}
	public WebElement getJustView() {
		return justview;
	}
	 

	  

}
