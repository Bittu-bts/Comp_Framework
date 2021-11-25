package com.Comprehensive1.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Comprehensive1.uiStore.HomeDCui;

public class PageObjectclickDC extends HomeDCui{

	public WebDriver driver;

	public PageObjectclickDC(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public WebElement getClickDc() {
		return driver.findElement(clickDc);
	}
	
	public WebElement getSecondP() {
		return driver.findElement(clickSecpro);
	}
	
	public WebElement getAddtoBag() {
		return driver.findElement(clickAdd);
	}
}
