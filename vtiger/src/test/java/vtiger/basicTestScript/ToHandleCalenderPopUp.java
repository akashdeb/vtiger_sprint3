package vtiger.basicTestScript;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToHandleCalenderPopUp {
	
	public static void main(String[] args) throws InterruptedException {
		String month = "July";
		String day = "15";
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//span[@class=\"ic_circularclose_grey\"]")).click();

		for(;;) {
			try {
			driver.findElement(By.xpath("//div[text()='"+month+" 2023']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+day+"']")).click();
			break;
			}
			catch (Exception e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
	
		}
		}

}
