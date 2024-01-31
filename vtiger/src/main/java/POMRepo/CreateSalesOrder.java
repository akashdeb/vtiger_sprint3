package SalesOrder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateSalesOrder {
	WebDriver driver;
	public CreateSalesOrder(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(xpath ="//*[contains(@title ,'Create Sales Order...')]")
	private WebElement ClickOnPlusButton;
	/**
	 * @return the clickOnPlusButton
	 */
	public WebElement getClickOnPlusButton() {
		return ClickOnPlusButton;
	}
	public void CreateSales() {
		ClickOnPlusButton.click();
	}

}
