package OpportunitiesModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOpportunities {
	WebDriver driver;
	public CreateOpportunities(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver = driver;	
	}
	@FindBy(xpath ="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement ClickonplusButton;
	
	
	/**
	 * @return the clickonplusButton
	 */
	public WebElement getClickonplusButton() {
		return ClickonplusButton;
	}
	public void ClickonOpportunitiesModule() {
		ClickonplusButton.click();
	}

}
