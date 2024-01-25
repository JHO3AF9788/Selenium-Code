package userLoginProcess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvalidLogin {

	@Test

	public void InvalidLogin() {

		System.setProperty("webdriver.chorome.driver", "C:/Users/champ/Downloads/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id=\"nav-signin-tooltip\"]/a/span")).click();
		driver.findElement(By.name("email")).sendKeys("gbjvc@gmail.com");

		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();

		String currentUrl = driver.getCurrentUrl();
		if (currentUrl.equals("https://www.amazon.in/")) {
			System.out.println("Successful login. Redirected to the homepage.");
		} else {
			System.out.println("Login unsuccessful or not redirected to the homepage. Current URL: " + currentUrl);
		}
		driver.quit();
	}

}
