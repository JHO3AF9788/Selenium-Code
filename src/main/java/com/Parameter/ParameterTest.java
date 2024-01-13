package com.Parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

	WebDriver driver;

	@Test
	@Parameters({ "browser", "hyperlink", "username" })
	public void yahooLoginTest(String browser, String hyperlink, String username) {

		if (browser.equals("chrome")) {

			System.setProperty("webdriver.chorome.driver",
					"C:/Users/champ/Downloads/chromedriver_win32/chromedriver.exe");
			        driver = new ChromeDriver();
			        
		} else if (browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "C:/Users/champ/Downloads/edgeriver_win32/edgedriver.exe");
			 driver = new EdgeDriver();

		}

		driver.get(hyperlink);

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id=\"login-username\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"login-username\"]")).sendKeys(username);

		driver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();

	}

}
