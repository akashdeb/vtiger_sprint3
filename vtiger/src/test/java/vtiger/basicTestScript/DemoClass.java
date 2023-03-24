package vtiger.basicTestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POMRepo.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import vtiger.genericUtility.WebDriverUtility;

public class DemoClass {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://localhost:8888/");
		
		LoginPage login = new LoginPage(driver);
		login.loginAction("admin", "admin");
	}
		

	}
