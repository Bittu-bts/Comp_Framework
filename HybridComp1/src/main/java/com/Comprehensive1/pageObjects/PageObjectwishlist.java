package com.Comprehensive1.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Comprehensive1.uiStore.WishListui;

public class PageObjectwishlist extends WishListui{
	
	public WebDriver driver;
	
	public PageObjectwishlist(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public WebElement getClicklat() {
		return driver.findElement(WishListui.clicklatests);
	}
	
	public WebElement getClickaddtowish() {
		return driver.findElement(WishListui.clickaddtowishlist);
	}
	
	
	public WebElement getClickwishlist() {
		return driver.findElement(WishListui.clickwish);
	}
	

}
