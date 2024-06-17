
  package pages;
  
  import org.openqa.selenium.WebDriver; 
  import org.openqa.selenium.WebElement;
  import org.openqa.selenium.support.FindBy; 
  import org.openqa.selenium.support.PageFactory;
  
  public class FindABusPage {
  
  WebDriver driver;
  
  //constructor
  
  public FindABusPage(WebDriver driver) {
  
	  this.driver = driver; 
  
	  PageFactory.initElements(driver, this); 
  }
  
  // defining page objects
  
  // ------------------------- from station text field ----------------------
  @FindBy(id = "search-from-station") private WebElement fromstationclick;
  
  @FindBy(css = ".form-control.shadow-none.search-input") private WebElement fromstationsearch;
  
  @FindBy(xpath = "//li[@data-code='ST2B852758N']") private WebElement fromsuggestion;
  
  // ------------------------- to station text field ------------------------
  @FindBy(id = "search-to-station") private WebElement toStationclick;
  
  @FindBy(xpath = "//input[@id='filter-stations']") private WebElement toStationsearch;
  
  @FindBy(xpath = "//li[@data-code='STF3OEX206']") private WebElement tosuggestion;
  
  // ------------------------- date select from Calender ----------------------------
  @FindBy(id = "search-onward-date") private WebElement onwardDate;
  
  @FindBy(xpath = "//div[@title='Next month']") private WebElement nextbtn;
  
  @FindBy(xpath = "//div[@aria-label='Mon, 15 Jul']") private WebElement selectday;
  
  // ------------------------- search button click ---------------------------------
  @FindBy(id = "search-btn") private WebElement searchBusBtn;

  public WebElement getFromstationclick() {
	  return fromstationclick;
  }


  public WebElement getFromsuggestion() {
	  return fromsuggestion;
  }

  public WebElement getToStationclick() {
	  return toStationclick;
  }


  public WebElement getTosuggestion() {
	  return tosuggestion;
  }

  public WebElement getOnwardDate() {
	  return onwardDate;
  }

  public WebElement getNextbtn() {
	  return nextbtn;
  }

  public WebElement getSelectday() {
	  return selectday;
  }

  public WebElement getSearchBusBtn() {
	  return searchBusBtn;
  }

// set username in text box
  
  public void FromStation(String fromstation) {
	  fromstationsearch.sendKeys(fromstation);
  }
  
  public void ToStation(String tostation) {
	  toStationsearch.sendKeys(tostation);
  }
  


  
  
  }
 