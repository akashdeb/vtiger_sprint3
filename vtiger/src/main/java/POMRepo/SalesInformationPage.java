package SalesOrder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SalesInformationPage {
	WebDriver driver;
	public SalesInformationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	public String verifyquote(String Salesname) {
		return driver.findElement(By.xpath("(//span[contains(text(), '"+Salesname+"')])[1]")).getText();
	}

}
