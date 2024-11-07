package com.demoexamination.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="txtuser")
	private WebElement stdcode;
	@FindBy(id="txtpass")
	private WebElement pwd;
	@FindBy(id="btnsubmit")
	private WebElement lgbtn;
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setLogin(String std, String pw) {
		stdcode.sendKeys(std);
		pwd.sendKeys(pw);
		lgbtn.click();
		
	}

}
