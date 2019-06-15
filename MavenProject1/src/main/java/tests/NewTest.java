package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {

	public WebDriver driver;

	@Test
	public void openMyBlog() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ankit shivane\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.softwaretestingmaterial.com/");
		driver.manage().window().maximize();
		driver.quit();
	}

}