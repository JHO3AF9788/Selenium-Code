package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {

	@BeforeSuite
	public void setUp() {
		System.out.println("setup system property for chrome");
	}

	@BeforeTest
	public void launchChromeBrowser() {
		System.out.println("launch chrome Browser");
	}

	@BeforeClass
	public void login() {
		System.out.println("login to app");
	}

	@BeforeMethod
	public void enterURL() {
		System.out.println("enter URL");
	}

	@Test
	public void googleTitleTest() {
		System.out.println("Google Title Test");
	}
	
	@Test
	public void searchTest() {
		System.out.println("search test");
	}

	@Test
	public void GoogleLogo() {
		System.out.println("Google Logo");
	}
	
	@AfterMethod
	public void logOut() {
		System.out.println("logout from app");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("closeBrowser");
	}

	@AfterTest
	public void deleteAllCookies() {
		System.out.println("deleteAllCookies");
	}

	
	@AfterSuite
	public void generateTestReport() {
		System.out.println("generateTestReport");
	}
}
