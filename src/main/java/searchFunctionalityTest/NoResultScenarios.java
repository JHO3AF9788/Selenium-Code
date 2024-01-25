package searchFunctionalityTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NoResultScenarios {

	@Test

	public void NoResultsScenarios() {

		System.setProperty("webdriver.chorome.driver", "C:/Users/champ/Downloads/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id=\"nav-signin-tooltip\"]/a/span")).click();
		driver.findElement(By.name("email")).sendKeys("8102141233");

		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("Ankit@7187");

		driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();

		String currentUrl = driver.getCurrentUrl();
		if (currentUrl.equals("https://www.amazon.in/?ref_=nav_custrec_signin")) {
			System.out.println("Successful login. Redirected to the homepage.");
		} else {
			System.out.println("Login unsuccessful or not redirected to the homepage. Current URL: " + currentUrl);
		}

		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("hvjbjcfghvjbn");

		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();

		WebElement noResultsErrorMessage = driver.findElement(
				By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[1]/div/div/div/div[1]/span[1]"));
		if (noResultsErrorMessage.isDisplayed()) {
			System.out.println("Empty email field. Error message displayed: " + noResultsErrorMessage.getText()
					+ " hvjbjcfghvjbn.");
		}
		driver.quit();
	}
}
