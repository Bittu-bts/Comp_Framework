package com.Comprehensive1.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Comprehensive1.uiStore.Headerlinkui;

public class PageObjectheaderLink extends Headerlinkui{
	
	public WebDriver driver;
	
	public PageObjectheaderLink(WebDriver driver) {
		this.driver=driver;
		
	}
		
	public WebElement getHeaderlink() {
		return driver.findElement(clickHeaderl);
	}
	
	public WebElement getFproduct() {
		return driver.findElement(clickFpro);
	}
	
	public WebElement getText() {
		return driver.findElement(clickTex);
	}								
	
}
