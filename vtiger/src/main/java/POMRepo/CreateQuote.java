package Quote;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateQuote {
	WebDriver driver;
	public CreateQuote(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver = driver;	
	}
	
	@FindBy(xpath ="//*[contains(@title ,'Create Quote...')]")
	private WebElement CreateQuotePlusButton;
	/**
	 * @return the createQuotePlusButton
	 */
	public WebElement getCreateQuotePlusButton() {
		return CreateQuotePlusButton;
	}
	public void ClickonQuoteplusButton() {
		CreateQuotePlusButton.click();
		
	}

}
