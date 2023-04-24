package Quote;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuoteDetails {
	WebDriver driver;
	public QuoteDetails(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver = driver;	
	}
	
	@FindBy(xpath ="//*[contains(@name ,'subject')]")
	private WebElement QuoteSubjectName;
	
	@FindBy(xpath ="//*[contains(@onclick ,'selectPotential()')]")
	private WebElement OpportunityLookUp;
	
	@FindBy(xpath ="//input[@name='search_text']")
	private WebElement OpportunitySearchTextField;
	
	@FindBy(xpath ="//input[@name='search']")
	private WebElement OpportunitySearchButton;
	
	@FindBy(xpath ="//*[contains(@onclick ,'width=640')]")
	private WebElement OgranizationsLookUp;
	
	@FindBy(xpath = "//input[@id ='search_txt']")
	private WebElement OrganizationSearchTextField;
	
	@FindBy(xpath = "//*[contains(@value ,'Search Now')]")
	private WebElement OrganizationSearchButton;
	
	@FindBy(xpath ="//textarea[@name ='bill_street']")
	private WebElement BillingStreetField;
	
	@FindBy(xpath ="//textarea[@name ='ship_street']")
	private WebElement ShippingStreetField;
	
	@FindBy(id = "searchIcon1")
	private WebElement ProductLookUp;
	
	@FindBy(id = "search_txt")
	private WebElement ProductNameTextField;
	
	@FindBy(xpath ="//input[@name = 'search']")
	private WebElement ProductSearchButton;
	
	@FindBy(id = "qty1")
	private WebElement EnterQuantity;
	

	@FindBy(xpath = "//input[@class ='crmbutton small save']")
	private WebElement ClickonSaveButton;
	/**
	 * @return the quoteSubjectName
	 */
	public WebElement getQuoteSubjectName() {
		return QuoteSubjectName;
	}

	/**
	 * @return the opportunityLookUp
	 */
	public WebElement getOpportunityLookUp() {
		return OpportunityLookUp;
	}

	/**
	 * @return the opportunitySearchTextField
	 */
	public WebElement getOpportunitySearchTextField() {
		return OpportunitySearchTextField;
	}

	/**
	 * @return the opportunitySearchButton
	 */
	public WebElement getOpportunitySearchButton() {
		return OpportunitySearchButton;
	}

	/**
	 * @return the ogranizationsLookUp
	 */
	public WebElement getOgranizationsLookUp() {
		return OgranizationsLookUp;
	}

	/**
	 * @return the organizationSearchTextField
	 */
	public WebElement getOrganizationSearchTextField() {
		return OrganizationSearchTextField;
	}

	/**
	 * @return the organizationSearchButton
	 */
	public WebElement getOrganizationSearchButton() {
		return OrganizationSearchButton;
	}

	/**
	 * @return the billingStreetField
	 */
	public WebElement getBillingStreetField() {
		return BillingStreetField;
	}

	/**
	 * @return the shippingStreetField
	 */
	public WebElement getShippingStreetField() {
		return ShippingStreetField;
	}

	/**
	 * @return the productLookUp
	 */
	public WebElement getProductLookUp() {
		return ProductLookUp;
	}

	/**
	 * @return the productNameTextField
	 */
	public WebElement getProductNameTextField() {
		return ProductNameTextField;
	}

	/**
	 * @return the productSearchButton
	 */
	public WebElement getProductSearchButton() {
		return ProductSearchButton;
	}
	
	/**
	 * @return the enterQuantity
	 */
	public WebElement getEnterQuantity() {
		return EnterQuantity;
	}

	/**
	 * @return the clickonSaveButton
	 */
	public WebElement getClickonSaveButton() {
		return ClickonSaveButton;
	}
	
	public void QuoteName(String Name) 
	{
		QuoteSubjectName.sendKeys(Name);
	}
	public void ClickonOpportunityLookUp()
	{
		OpportunityLookUp.click();	
	}
	public void EnterNameOpportunitySearchField(String OpportunityName) 
	{
		OpportunitySearchTextField.sendKeys(OpportunityName);	
	}
	public void ClickonOpportunitySearchButton() {
		OpportunitySearchButton.click();
	}
	public void ClickonAfterOpportunitySearchButton(String OpportunityName)
	{
		driver.findElement(By.xpath("//a[text() ='"+OpportunityName+"']")).click();	
	}
	
	public void ClickonOrganizationLookUp()
	{
		OgranizationsLookUp.click();	
	}
	public void EnterNameonOrganizationSearchField(String OrganizationName)
	{
		OrganizationSearchTextField.sendKeys(OrganizationName);
	}
	public void ClickonOrganizationSearchButton()
	{
		OrganizationSearchButton.click();
	}
	public void ClickonOrganizatioAfterSearch(String OrganizationName)
	{
		driver.findElement(By.xpath("//a[text() ='"+OrganizationName+"']")).click();		
	}
	public void EnterBilliingAddress(String BillingAddress) 
	{
		BillingStreetField.sendKeys(BillingAddress);	
	}
	public void EnterShippingAddress(String ShippingAddress)
	{
		ShippingStreetField.sendKeys(ShippingAddress);
	}
	public void ClickonProductLookUp()
	{
		ProductLookUp.click();
	}
	public void EnterProductNameonSearchField(String ProductName)
	{
		ProductNameTextField.sendKeys(ProductName);
	}
	public void ClickonProductSearchButton()
	{
		 ProductSearchButton.click();	
	}
	public void ClickonAfterProductNameSearch(String ProductName)
	{
		driver.findElement(By.xpath("//a[text() ='"+ProductName+"']")).click();		
	}
	
	public void EnterQuantityValue(String value) {
		EnterQuantity.sendKeys(value);
	}
	
	public void ClickonSaveButton()
	{
		ClickonSaveButton.click();
	}
	
	public void alerts()
	 {
		 driver.switchTo().alert();
		 driver.switchTo().alert().accept();
	 }

}
