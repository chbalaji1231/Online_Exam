package com.demoexamination.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.demoexamination.pom.HomePage;
import com.demoexamination.pom.LoginPage;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static WebDriver driver;
	@BeforeTest
	public void openBrowser() {
		Reporter.log("Open Browser", true);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@AfterTest
	public void closeBrowser() {
		Reporter.log("Close Browser", true);
		driver.close();
	}
	@BeforeMethod
	public void login() throws IOException {
		Reporter.log("Login", true);
		FileLib f= new FileLib();
		String url=f.getPropertyData("url");
		String studentcode=f.getPropertyData("studentcode");
		String password=f.getPropertyData("password");
		driver.get(url);
		LoginPage l=new LoginPage(driver);
		l.setLogin(studentcode, password);
	}
	@AfterMethod
	public void logout() {
		Reporter.log("Log out", true);
		HomePage h=new HomePage(driver);
		h.setLogout();;;
	}
	

}
