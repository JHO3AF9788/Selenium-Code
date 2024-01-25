package userLoginProcess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EdgeCases {

	@Test

	public void EdgeCases() {

		System.setProperty("webdriver.chorome.driver", "C:/Users/champ/Downloads/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id=\"nav-signin-tooltip\"]/a/span")).click();
		driver.findElement(By.name("email")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();

		WebElement emptyEmailErrorMessage = driver.findElement(By.id("auth-email-missing-alert"));
		if (emptyEmailErrorMessage.isDisplayed()) {
			System.out.println("Empty email field. Error message displayed: " + emptyEmailErrorMessage.getText());
		}

		driver.quit();
	}

}
