package OpportunitiesModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpportunitiesInfo {
	WebDriver driver;
	public OpportunitiesInfo(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	@FindBy (xpath ="//input[@name='potentialname']")
	private WebElement OpportunityName;
	
	@FindBy(xpath = "//img[@src ='themes/softed/images/select.gif']")
	private WebElement OrganizationLookUP;
	
	@FindBy(xpath = "//input[@class  ='txtBox']")
	private WebElement OpportunitiesSearchTextField;
	
	@FindBy(xpath ="//input[@name ='search']")
	private WebElement SearchNowButton;
	
	@FindBy(xpath= "//input[@name = 'closingdate']")
	private WebElement ExpectedClosingDate;
	
	/**
	 * @return the expectedClosingDate
	 */
	public WebElement getExpectedClosingDate() {
		return ExpectedClosingDate;
	}
	@FindBy(xpath ="//img[@id ='jscal_trigger_closingdate']")
	private WebElement SelectClosingDate;
	
	@FindBy(id = "nextstep")
	private WebElement nextstep;
	
	/**
	 * @return the nextstep
	 */
	public WebElement getNextstep() {
		return nextstep;
	}
	@FindBy(xpath ="//*[contains(@type,'submit')]")
	private WebElement SaveButton;
	/**
	 * @return the opportunityName
	 */
	public WebElement getOpportunityName() {
		return OpportunityName;
	}

	/**
	 * @return the organizationLookUP
	 */
	public WebElement getOrganizationLookUP() {
		return OrganizationLookUP;
	}

	/**
	 * @return the opportunitiesSearchTextField
	 */
	public WebElement getOpportunitiesSearchTextField() {
		return OpportunitiesSearchTextField;
	}

	/**
	 * @return the searchNowButton
	 */
	public WebElement getSearchNowButton() {
		return SearchNowButton;
	}

	/**
	 * @return the selectClosingDate
	 */
	public WebElement getSelectClosingDate() {
		return SelectClosingDate;
	}

	/**
	 * @return the saveButton
	 */
	public WebElement getSaveButton() {
		return SaveButton;
	}
	
	public void EnterOpportunityName(String name) {
		OpportunityName.sendKeys(name);		
	}
	public void LookUpButton() {
		OrganizationLookUP.click();
	}
	public void EnterinSearchTextBox(String organizationName) {
		OpportunitiesSearchTextField.sendKeys(organizationName);
		
	}
	
	public void clickOnorganizationNameAfterSearch(String organizationName) {
		driver.findElement(By.xpath("//a[text() ='"+organizationName+"']")).click();
	}
	public void ClickonSearchButton() {
		SearchNowButton.click();
	}
	
	public void ExpectedCloseDate(String Date) {
		 ExpectedClosingDate.sendKeys(Date);
	}
	
	public void Closingdate(String date) {
		SelectClosingDate.sendKeys(date);
		
	}
	
	public void EnterNextStep(String nextmove) {
		nextstep.sendKeys(nextmove);
	}
	public void ClickonSaveButton() {
		SaveButton.click();
	}
	

}
