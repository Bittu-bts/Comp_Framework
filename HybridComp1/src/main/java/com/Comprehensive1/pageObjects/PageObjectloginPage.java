package com.Comprehensive1.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Comprehensive1.uiStore.LoginPageui;

public class PageObjectloginPage extends LoginPageui{
	
	public WebDriver driver;
	
	public PageObjectloginPage(WebDriver driver) {
		this.driver=driver;
		
	}
		
	public WebElement getClickSignin() {
		return driver.findElement(clickSign);
	}
	
	public WebElement getClickEm() {
		return driver.findElement(clickEmail);
	}
	
	public WebElement getClickPas() {
		return driver.findElement(clickPass);
	}
	
	public WebElement getClickButt() {
		return driver.findElement(clickButton);
	}

}
