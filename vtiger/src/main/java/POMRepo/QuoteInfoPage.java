package Quote;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class QuoteInfoPage {
	WebDriver driver;
	public QuoteInfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	public String verifyquote(String OpportunityName) {
		return driver.findElement(By.xpath("(//span[contains(text(), '"+OpportunityName+"')])[1]")).getText();
	}

}
