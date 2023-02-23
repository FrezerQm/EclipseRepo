package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class AccountPage extends BaseSetup{
	
	public AccountPage() {
		PageFactory.initElements(getDriver(), this);

	}

	//HEADER
	
	@FindBy(linkText = "TEKSCHOOL")   //the same driver.findElement()
	public WebElement tekschoolLogo;
	
	@FindBy(id = "search")
	public WebElement departmentDropDown;
	
	@FindBy(id = "searchInput")
	public WebElement searchBarInput;
	 
	@FindBy(id = "searchBtn")
	public WebElement searchButton;
	
	@FindBy(id = "accountLink")
	public WebElement accountButton;
	
	@FindBy(id = "orderLink")
	public WebElement orderButton;
	
	@FindBy(id = "logoutBtn")
	public WebElement logoutButton;
	
	@FindBy(id = "cartBtn")
	public WebElement cartButton;
	
//Body
	//Your Profile
	@FindBy(id = "profileImage")
	public WebElement profileImage;
	
	@FindBy(className = "account__information-username")
	public WebElement userName;
	
	@FindBy(className = "account__information-email")
	public WebElement email;
	
	@FindBy(id = "nameInput")
	public WebElement nameInput;
	
	@FindBy (id = "personalPhoneInput")
	public WebElement phoneInput;
	
	@FindBy(id = "emailInput")
	public WebElement emailInput;
	
	@FindBy (id = "personalUpdateBtn")
	public WebElement personalUpdateBtn;
	
	@FindBy(id = "previousPasswordInput")
	public WebElement previousPasswordInput;
	
	@FindBy(id = "newPasswordInput")
	public WebElement newPasswordInput;
	
	@FindBy (id = "confirmPasswordInput")
	public WebElement confirmPasswordInput;
	
	@FindBy(id = "credentialsSubmitBtn")
	public WebElement credentialsSubmitBtn;
	
	//Wallet
	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]")
	public WebElement addPaymentMethod;
	
	@FindBy(id = "cardNumberInput")
	public WebElement cardNumberInput;
	
	@FindBy(id = "nameOnCardInput")
	public WebElement nameOnCardInput;
	
	@FindBy(id = "expirationMonthInput")
	public WebElement expirationMonth;
	
	@FindBy(id = "expirationYearInput")
	public WebElement expirationYear;
	
	@FindBy(id = "securityCodeInput")
	public WebElement securityCodeInput;
	
	@FindBy(id = "paymentSubmitBtn")
	public WebElement addYourCardButton;
	
	@FindBy(className = "account__address-new")
	public WebElement addAddressButton;
	
	
//Add Address window
	@FindBy(id = "countryDropdown")
	public WebElement country;
	
	@FindBy(id = "fullNameInput")
	public WebElement fullNameInput;
	
	@FindBy(id = "phoneNumberInput")
	public WebElement phoneNumberInput;
	
	@FindBy(id = "streetInput")
	public WebElement streetInput;
	
	@FindBy (id = "apartmentInput")
	public WebElement apartmentInput;
	
	@FindBy(id = "cityInput")
	public WebElement cityInput;
	
	@FindBy(className = "account__address-new-dropdown")
	public WebElement state;
	
	@FindBy(id = "zipCodeInput")
	public WebElement zipCodeInput;
	
	@FindBy(id = "addressBtn")
	public WebElement addressButton;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
