package com.Comprehensive1.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Comprehensive1.uiStore.HomeDecorui;

public class PageObjectclickHomeDecor extends HomeDecorui{
	
public  WebDriver driver;
	
	public PageObjectclickHomeDecor(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public WebElement getHomeDecor() {
		return driver.findElement(clickHomeD);
	}
	
	public WebElement getFirstPro() {
		return driver.findElement(clickFpro);
	}
	
	public WebElement getClickAddtoBag() {
		return driver.findElement(clickAdd);
	}
	
	

}
