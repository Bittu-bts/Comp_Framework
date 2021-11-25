package com.Comprehensive1.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Comprehensive1.uiStore.Headerhoverui;

public class PageObjectheaderhover extends Headerhoverui {
	
     public WebDriver driver;
	
	public PageObjectheaderhover(WebDriver driver) {
		this.driver=driver;
		
	}
		
	public WebElement getHovergifts() {
		return driver.findElement(hover);
	}
	
	public WebElement getFirstHoverPr() {
		return driver.findElement(clickfhoverPr);
	}
	
	public WebElement getFirstProduct() {
		return driver.findElement(clickFpro);
	}
	
	public WebElement getAddtoBag() {
		return driver.findElement(clickAdd);
	}
	

}
