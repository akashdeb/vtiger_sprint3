package SalesOrder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesInfo {
	WebDriver driver;
	public SalesInfo(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	@FindBy(xpath="//*[contains(@name ,'subject')]")
	private WebElement SubjectNameTextField;
	
	/**@FindBy(xpath ="//*[contains(@onclick,'general')]")
	private WebElement ContactsLookUp;
	
	@FindBy(xpath ="//*[contains(@name ,'text')]")
	private WebElement ContactSearchField;
	
	@FindBy(xpath ="//*[contains(@class ,'crmbutton small create')]")
	private WebElement ContactSearchButton;**/
	
	
	@FindBy(xpath = "//*[contains(@onclick,'selectPotential()')]")
	private WebElement OrganizationLookUp;
	
	
	
	@FindBy(id ="search_txt")
	private WebElement organizationSearchTxtField;
	
	@FindBy(xpath = "//*[contains(@onclick, 'callSearch')] ")
	private WebElement OrganizationSearchButton;
	
	
	
	
	@FindBy(xpath = "//textarea[@name  = 'bill_street']")
	private WebElement BillingAddress;
	
	@FindBy(xpath = "//textarea[@name  = 'ship_street']")
	private WebElement ShippingAddress;
	
	
	
	@FindBy(xpath = "//img[@src = 'themes/images/products.gif']")
	private WebElement ProductLookupButton;
	
	@FindBy(id ="search_txt")
	private WebElement SearchTextField;
	
	@FindBy(xpath = "//input[@class = 'crmbutton small create']")
	private WebElement SearchButton;
	
	@FindBy(xpath ="//input[@name = 'qty1']")
	private WebElement QuantityItem;
	
	
	@FindBy(xpath = " //*[contains(@accesskey, 'S')]  ")
	private WebElement ClickonSaveButton;
	
	
	//Getters and Setters
	/**
	 * @return the subjectNameTextField
	 */
	public WebElement getSubjectNameTextField() {
		return SubjectNameTextField;
	}
	
	/**
	 * @return the organizationLookUp
	 */
	public WebElement getOrganizationLookUp() {
		return OrganizationLookUp;
	}
	
	/**
	 * @return the productLookupButton
	 */
	
	/**
	 * @return the billingAddress
	 */
	public WebElement getBillingAddress() {
		return BillingAddress;
	}

	/**
	 * @return the shippingAddress
	 */
	public WebElement getShippingAddress() {
		return ShippingAddress;
	}

	/**
	 * @param billingAddress the billingAddress to set
	 */
	public void setBillingAddress(WebElement billingAddress) {
		BillingAddress = billingAddress;
	}

	/**
	 * @param shippingAddress the shippingAddress to set
	 */
	public void setShippingAddress(WebElement shippingAddress) {
		ShippingAddress = shippingAddress;
	}
	
	/**
	 * @return the organizationSearchTxtField
	 */
	public WebElement getOrganizationSearchTxtField() {
		return organizationSearchTxtField;
	}

	/**
	 * @return the organizationSearchButton
	 */
	public WebElement getOrganizationSearchButton() {
		return OrganizationSearchButton;
	}

	public WebElement getProductLookupButton() {
		return ProductLookupButton;
	}
	/**
	 * @return the searchTextField
	 */
	public WebElement getSearchTextField() {
		return SearchTextField;
	}
	/**
	 * @return the searchButton
	 */
	public WebElement getSearchButton() {
		return SearchButton;
	}
	
	/**
	 * @return the quantityItem
	 */
	public WebElement getQuantityItem() {
		return QuantityItem;
	}
	
	
	/**
	 * @return the clickonSaveButton
	 */
	public WebElement getClickonSaveButton() {
		return ClickonSaveButton;
	}
	
	/**
	 * @return the contactsLookUp
	 */
/**	public WebElement getContactsLookUp() {
		return ContactsLookUp;
	}

	/**
	 * @return the contactSearchField
	 */
/**	public WebElement getContactSearchField() {
		return ContactSearchField;
	}

	/**
	 * @return the contactSearchButton
	 */
/**	public WebElement getContactSearchButton() {
		return ContactSearchButton; 
	} **/
	
	
	//Methods 
	public void EnterSubjectName(String SubjectName) {
		SubjectNameTextField.sendKeys(SubjectName);
	}
/**	public void clickContactLookUp() {
		ContactsLookUp.click();
	}
	public void EnterContactName(String Contact) {
		ContactSearchField.sendKeys(Contact);
	}
	
	public void ClickContactSearchButton() {
		ContactSearchButton.click();
	} 
	
	public void ClickonContacNameAfterSearch(String ContactName) {
		driver.findElement(By.xpath("//a[text() ='"+ContactName+"']\"")).click();
	} **/
	
	 public void OrganizationLookup() {
		 OrganizationLookUp.click();
	 }
	 
	 public void EnterOrganizationNameSearchtxt(String OrgName) {
		 organizationSearchTxtField.sendKeys(OrgName);
	 }
	 public void OrgSearchButton() {
		 OrganizationSearchButton.click();
	 }
	 
	 public void clickOnorganizationNameAfterSearch(String organizationName) 
	 {
			driver.findElement(By.xpath("//a[text() ='"+organizationName+"']")).click();
	 }
	 
	 
	 public void EnterBillingAddress(String BillAddress) {
		 BillingAddress.sendKeys(BillAddress);
	 }
	 public void EnterShippingAddress(String ShipAddress) {
		 ShippingAddress.sendKeys(ShipAddress);
	 }
	 
	public void ClickonLooKUp() {
		ProductLookupButton.click();
	}
	public void EnterProductNameSearchTxt(String Name) {
		SearchTextField.sendKeys(Name);
	}
	public void ClickSearchButton() {
		SearchButton.click();
	}
		
	
	public void clickonProductNameAfterSearch(String ProductName) {
		driver.findElement(By.xpath("//a[text() ='"+ProductName+"']")).click();
	}
	
	
	
	public void quantity(String quantity) {
		QuantityItem.sendKeys(quantity);
	}
	
	
	public void SaveButton() {
		ClickonSaveButton.click();
	}

	

}
