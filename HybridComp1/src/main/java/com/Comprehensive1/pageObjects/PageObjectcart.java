package com.Comprehensive1.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Comprehensive1.uiStore.Cartui;

public class PageObjectcart extends Cartui {
	
	public WebDriver driver;

	public PageObjectcart(WebDriver driver) {
		this.driver=driver;
		
	}
	

	public WebElement getChrist() {
		return driver.findElement(Cartui.clickChris);
	}
	public WebElement getChristFpro() {
		return driver.findElement(Cartui.clickFCPr);
	}
	public WebElement getCarttoadd() {
		return driver.findElement(Cartui.clickAC);
	}
	
	public WebElement getCutDrawer() {
		return driver.findElement(Cartui.cutdraw);
	}
	
	public WebElement getCart() {
		return driver.findElement(clickC);
	}
			
}
