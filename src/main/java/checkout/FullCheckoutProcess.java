package checkout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FullCheckoutProcess {

	@Test

	public void CheckoutProcess() {

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

		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("laptop");

		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();

		// String laptopUrl = driver.getCurrentUrl();
		// if (laptopUrl.equals("https://www.amazon.in/s?k=laptop&ref=nb_sb_noss")) {
		// System.out.println("Successful searching search results.");
		// } else {
		// System.out.println("unsuccessful or not redirected to search results. Current
		// URL: " + laptopUrl);
		// }

		driver.findElement(By.xpath("//*[@id=\"a-autoid-1-announce\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).clear();

		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobile");

		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"a-autoid-1-announce\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"ewc-compact-actions-container\"]/div/div[2]/span/span/a")).click();

		driver.findElement(By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input")).click();

	//	driver.findElement(By.xpath("//*[@id=\"shipToThisAddressButton\"]/span/input")).click();

		driver.quit();

	}

}
