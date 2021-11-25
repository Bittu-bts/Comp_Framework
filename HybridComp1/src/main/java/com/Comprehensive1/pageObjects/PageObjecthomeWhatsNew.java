package com.Comprehensive1.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Comprehensive1.uiStore.HomeWhatsNewui;

public class PageObjecthomeWhatsNew extends HomeWhatsNewui{
	
	public WebDriver driver;
   
    public PageObjecthomeWhatsNew(WebDriver driver) {
		this.driver=driver;
		
	}
    
    public WebElement getWhatsNew() {
    	return driver.findElement(clickWhats);
    }
    
    public WebElement getFProduct() {
    	return driver.findElement(clickFpro);
    }
    
    public WebElement getSelectMonica() {
    	return driver.findElement(selectM);
    }
    public WebElement getClickAddtobag() {
    	return driver.findElement(clickAdd);
    }
}
