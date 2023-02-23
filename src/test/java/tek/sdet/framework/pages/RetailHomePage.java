package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup{

	public RetailHomePage() {
		//we are implementing PageFactory Class to intialize the UI elements
		//using @FindBy annotation of PageFactory
		PageFactory.initElements(getDriver(), this);
	}
	
	//syntax for storing UI elements using @FindBy annotations
	//@FindBy (locatorType = "locator value")
	//public WebElement nameOfElement
	
	
	//header
	
	@FindBy(linkText = "TEKSCHOOL")   //the same driver.findElement()
	public WebElement tekschoolLogo;
	
	@FindBy(id = "search")
	public WebElement departmentDropDown;
	
	@FindBy(id = "searchInput")
	public WebElement searchBarInput;
	 
	@FindBy(id = "searchBtn")
	public WebElement searchButton;
	
	@FindBy(id = "signinLink")
	public WebElement signinButton;
	
	@FindBy(id = "cartBtn")
	public WebElement cartButton;
	
	@FindBy(id = "accountLink")
	public WebElement accountButton;
	
	@FindBy(id = "logoutBtn")
	public WebElement logOutButton;
	
	@FindBy (id = "orderLink")
	public WebElement orderButton;
	
	//SideBar
	   @FindBy (xpath = "//div[@class='sidebar__header']")
	   public WebElement header;
	   
	   @FindBy(id = "closeBtn")
	   public WebElement closeButton;
	   
	   @FindBy(id = "contentHeader")
	   public WebElement contentHeader;
	
	   @FindBy(xpath = "//div[@data-id = '1']")
	   public WebElement electronics;
	   
	     @FindBy (id = "submenuBtn")
	     public WebElement mainMenu;
	     
	     @FindBy (xpath = "//div[@data-id = '6' and @xpath = '1']")
	     public WebElement tvVideo;
	     
	     @FindBy (xpath = "//div[@data-id = '7' and @xpath = '1']")
	     public WebElement videoGames;
	     
	  @FindBy(xpath = "//div[@data-id = '2']")
	  public WebElement computers;
	  
	     @FindBy (xpath = "//div[@data-id = '8' and @xpath = '1']")
	     public WebElement accessories;
	     
	     @FindBy (xpath = "//div[@data-id = '9' and @xpath = '1']")
	     public WebElement networking;
	     
	 @FindBy(xpath = "//div[@data-id = '3']")
	  public WebElement smartHome;
	 
	     @FindBy (xpath = "//div[@data-id = '10']")
	     public WebElement lightning;
	     
	     @FindBy (xpath = "//div[@data-id = '11']")
	     public WebElement outlets;
	     
	 @FindBy (xpath = "//div[@data-id = '4']")
	 public WebElement sports;
	 
	     @FindBy(xpath = "//div[@data-id = '12']")
	     public WebElement clothing;
	     
	     @FindBy (xpath = "//div[@data-id = '13']")
	     public WebElement fitness;
	     
	 @FindBy (xpath = "//div[@data-id = '4']")
      public WebElement automative;
	 
	     @FindBy (xpath = "//div[@data-id = '14']")
          public WebElement partandAccessories;
	     
	     @FindBy (xpath = "//div[@data-id = '15']")
	     public WebElement powersports;
	     
	//header2
	@FindBy(id = "hamburgerBtn")
	public WebElement hamburgerButton;
	
	@FindBy(linkText = "Test Selenium")
	public WebElement testSelenium;
	
	@FindBy(id = "heroImage")
	public WebElement homePageImg;
	
	//Shop by category
	@FindBy (xpath = "(//div[@class='home__category-item'])[1]" )
	public WebElement TVVideoDept;
	
	@FindBy(xpath = "(//div[@class='home__category-item'])[2]")
	public WebElement videogameDept;
	
	@FindBy (xpath = "(//div[@class='home__category-item'])[3]")
	public WebElement accessoriesDept;
	
	@FindBy(xpath = "(//div[@class='home__category-item'])[4]")
	public WebElement networkingDept;
	
	@FindBy(xpath = "(//div[@class='home__category-item'])[5]")
	public WebElement lightningDept;
	
	@FindBy (xpath = "(//div[@class='home__category-item'])[6]")
	public WebElement outletDept;
	
	@FindBy (xpath = "(//div[@class='home__category-item'])[7]")
	public WebElement clothingDept;
	
	@FindBy (xpath = "(//div[@class='home__category-item'])[8]")
	public WebElement fitnessDept;
	
	@FindBy (xpath = "(//div[@class='home__category-item'])[9]")
	public WebElement autoAccessoriesDept;
	
	@FindBy (xpath = "(//div[@class='home__category-item'])[10]")
	public WebElement powerSportDept;
	
	@FindBy(xpath = "//img[@alt='YESLIFE Ski Mask']")
	public WebElement skiMask;
	
	@FindBy(xpath = "//img[@alt='Under Armour Men's Playoff 2.0 Golf Polo']")
	public WebElement poloShirt;
	
	@FindBy (xpath = "//img[@alt='Lutron Pico Smart Remote Control ']")
	public WebElement remote;
	
	@FindBy (xpath = "//img[@alt='X-PRO 125cc Vader Adult Motorcycle Gas Motorcycle']")
	public WebElement motorbike;
	
	@FindBy (xpath = "//img[@alt='USB Microphone']")
	public WebElement microphone;
	
	@FindBy (xpath = "//img[@alt='VIPERTEK VTS-989-1 Billion Heavy Duty Stun Gun']")
	public WebElement stuntGun;
	
	@FindBy (xpath = "//img[@alt='Bike Phone Holder']")
	public WebElement phoneHolder;
	
	@FindBy(xpath = "//img[@alt='Ubiquiti UniFi 6 Pro Access Point']")
	public WebElement accessPoint;
	
	@FindBy(xpath = "//img[@alt='Amazon Fire TV ']")
	public WebElement amazonTV;
	
	@FindBy (xpath = "//img[@alt='TCL 32-inch 3-Series 720p Roku Smart TV - 32S335, 2021 Model']")
	public WebElement tclTV;
	
	@FindBy (xpath = "//img[@alt='WILSON Traditional Soccer Ball']")
	public WebElement soccerBall;
	
	@FindBy(xpath = "//img[@alt='SanDisk 128GB Ultra microSDXC UHS-I Memory Card']")
	public WebElement memoryCard;
	
	@FindBy(xpath = "//img[@alt='Trading Card Binder for Pokemon']")
	public WebElement pokemonItem;
	
	@FindBy (xpath = "//div[text()='For Learning Purposes Only']")
	public WebElement footer;
	
	
	
	
	
}
