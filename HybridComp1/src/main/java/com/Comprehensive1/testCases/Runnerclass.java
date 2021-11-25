package com.Comprehensive1.testCases;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Comprehensive1.pageObjects.PageObjectcart;
import com.Comprehensive1.pageObjects.PageObjectclickDC;
import com.Comprehensive1.pageObjects.PageObjectclickHomeDecor;
import com.Comprehensive1.pageObjects.PageObjectgiftCard;
import com.Comprehensive1.pageObjects.PageObjectheaderLink;
import com.Comprehensive1.pageObjects.PageObjectheaderhover;
import com.Comprehensive1.pageObjects.PageObjecthomeWhatsNew;
import com.Comprehensive1.pageObjects.PageObjectloginPage;
import com.Comprehensive1.pageObjects.PageObjectsearchBar;
import com.Comprehensive1.pageObjects.PageObjectwishlist;
import com.Comprehensive1.utilities.ExtentLogUtilities;
import com.Comprehesive1.reusablecomponents.Baseclass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Runnerclass extends Baseclass{
	
	static ExtentTest test;
	static ExtentReports report = new ExtentReports(System.getProperty("user.dir") + "\\reports\\" + "ExtentReportResults-"	+ System.currentTimeMillis() + "-.html");
	
	public static Logger log=Logger.getLogger(Baseclass.class.getName());
	
	@BeforeMethod
	public void Dinit() {
		driver=BaseSettings();
		log.info(driver.getTitle());
		driver.get(prop.getProperty("url"));
	}
	
	@Test(dataProvider="getvalue", priority=1)
	public void Clickforlogin(String Em, String Pass) throws InterruptedException, IOException {
		test = report.startTest("Login Page");
		ExtentLogUtilities.pass(driver, test, "URL Opened", log);
		log.info(driver.getTitle());
		PageObjectloginPage lp = new PageObjectloginPage(driver);
		lp.getClickSignin().click();
		log.info("Click Signin Button");
		lp.getClickEm().sendKeys(Em);
		log.info("Enetr mail");
		lp.getClickPas().sendKeys(Pass);
		log.info("Enter password");
		lp.getClickButt().click();
		log.info("Click on login button");
		report.endTest(test);
		report.flush();
		
	}
	
	@DataProvider
	public Object[][] getvalue() {
		String path=System.getProperty("user.dir");
		Exceltakesvalue exc=new Exceltakesvalue(path+"\\ExcelSheet\\ExcelComp1.xlsx","Sheet1");
		Object[][] ob=new Object[1][2];
		ob[0][0]=exc.getData(0, 0);
		ob[0][1]=exc.getData(1, 0);
		System.out.println(Arrays.toString(ob));
		return ob;
	}
	
	
	@Test(dataProvider="getvalue1", priority=2)
	public void ClickSearchBar(String pr) throws InterruptedException, IOException {
		test = report.startTest("Search bar");
		Thread.sleep(3000L);
		ExtentLogUtilities.pass(driver, test, "URL Opened", log);
		log.info(driver.getTitle());
		PageObjectsearchBar sb = new PageObjectsearchBar(driver);
		sb.getSearchBar().sendKeys(pr, Keys.ENTER);
		log.info("Click on search bar");
		sb.getProduct().click();
		log.info("Click On productt");
		sb.getAddtoBag().click();
		log.info("Click On add to bag");
		sb.getCheckout().click();
		log.info("Click On checkout");
		report.endTest(test);
		report.flush();
		
		
		
	}
	
	@DataProvider
	public Object[] getvalue1() {
		String path=System.getProperty("user.dir");
		Exceltakesvalue exc=new Exceltakesvalue(path+"\\ExcelSheet\\ExcelComp1.xlsx","Sheet1");
		Object[] ob=new Object[1];
		ob[0]=exc.getData(2, 0);
		System.out.println(Arrays.toString(ob));
		return ob;
	}
	
	@Test(priority=3)
	public void Headerlink() throws InterruptedException, IOException {
		test = report.startTest("Header Link");
		Thread.sleep(3000L);
		ExtentLogUtilities.pass(driver, test, "URL Opened", log);
		log.info(driver.getTitle());
		PageObjectheaderLink hl = new PageObjectheaderLink(driver);
		//This the Windows Functionality
        hl.getHeaderlink().sendKeys(Keys.CONTROL,Keys.ENTER);
        test.log(LogStatus.PASS, "Click on personalize gift");
        log.info("Click on personalize gift");
        
        //Iterator Window
        Set<String> ab=driver.getWindowHandles();
		Iterator<String> bc=ab.iterator();
		log.info("Handling Multiple Windows");
		String parentid=bc.next();
        driver.switchTo().window(parentid);
		Thread.sleep(3000L);
		hl.getFproduct().click();
		log.info("Click On product");
		Assert.assertTrue(hl.getText().isDisplayed());
	    test.log(LogStatus.PASS, "Verify the text");
	    ExtentLogUtilities.pass(driver, test, "Task Done", log);
	    log.info("Verify the text");
		report.endTest(test);
		report.flush();
		
		
	}
	

	@Test(priority=4)
	public void Headerhover() throws InterruptedException, IOException {
		test = report.startTest("Header hover link");
		Thread.sleep(3000L);
		ExtentLogUtilities.pass(driver, test, "URL Opened", log);
		log.info(driver.getTitle());
		PageObjectheaderhover hh = new PageObjectheaderhover(driver);
		Actions a = new Actions(driver);
		WebElement ele = hh.getHovergifts();
		a.moveToElement(ele).perform();
		Thread.sleep(3000L);
		hh.getFirstHoverPr().click();
		log.info("Click on Header Hover link");
		hh.getFirstProduct().click();
		log.info("Click On product");
		hh.getAddtoBag().click();
		log.info("Click On add to bag");
		report.endTest(test);
		report.flush();
		
		
		
	}
	
	@Test(priority=5)
	public void ClickHomeWhats() throws InterruptedException, IOException {
		test = report.startTest("Home Page Whats New Section");
		Thread.sleep(3000L);
		ExtentLogUtilities.pass(driver, test, "URL Opened", log);
		log.info(driver.getTitle());
		PageObjecthomeWhatsNew wn = new PageObjecthomeWhatsNew(driver);
		wn.getWhatsNew().click();
		log.info("Click on Home Page Whats New");
		wn.getFProduct().click();
		log.info("Click On Product");
		wn.getSelectMonica().click();
		log.info("Click On monica module");
		wn.getClickAddtobag().click();
		log.info("Click On add to bag");
		report.endTest(test);
		report.flush();
		
		
	}
	
	@Test(priority=6)
	public void ClickWishlists() throws InterruptedException, IOException {
		test = report.startTest("WishList");
		Thread.sleep(3000L);
		ExtentLogUtilities.pass(driver, test, "URL Opened", log);
		log.info(driver.getTitle());
		PageObjectwishlist wl = new PageObjectwishlist(driver);
		wl.getClicklat().click();
		log.info("Click On product");
		wl.getClickaddtowish().click();
		log.info("Click On add to Wishlist");
		wl.getClickwishlist().click();
		log.info("Click On Wishlist");
	 	report.endTest(test);
		report.flush();
	   
	  
	}
	
	@Test(priority=7)
	public void ClickGiftCard() throws InterruptedException, IOException {
		test = report.startTest("Gift Card");
		Thread.sleep(3000L);
		ExtentLogUtilities.pass(driver, test, "URL Opened", log);
		log.info(driver.getTitle());
		PageObjectgiftCard gc = new PageObjectgiftCard(driver);
		gc.getClickGift().click();
		log.info("Click on GiftCard");
		gc.getClickMoney().click();
		log.info("Select money");
		gc.getClickAddtoBag().click();
		log.info("Click On add to bag");
	 	report.endTest(test);
		report.flush();
		
		
	}
	
	@Test(priority=8)
	public void ClickCart() throws InterruptedException, IOException {
		test = report.startTest("cart");
		Thread.sleep(3000L);
		ExtentLogUtilities.pass(driver, test, "URL Opened", log);
		log.info(driver.getTitle());
		PageObjectcart c = new PageObjectcart(driver);
		c.getChrist().click();
		log.info("Click on christmas");
		c.getChristFpro().click();
		log.info("Click on christmas first product");
		c.getCarttoadd().click();
		log.info("Click add to cart");
		c.getCutDrawer().click();
		log.info("cut drawer");
		c.getCart().click();
		log.info("Click on Cart");
		report.endTest(test);
		report.flush();
		
		
	}
	
	@Test(priority=9)
	public void ClickHomeDecor() throws InterruptedException, IOException {
		test = report.startTest("Home Page Home Decor Section");
		Thread.sleep(3000L);
		ExtentLogUtilities.pass(driver, test, "URL Opened", log);
		log.info(driver.getTitle());
		PageObjectclickHomeDecor hd = new PageObjectclickHomeDecor(driver);
		hd.getHomeDecor().click();
		log.info("Click on Home page in Home Decor");
	    hd.getFirstPro().click();
	    log.info("Click On product");
	    hd.getClickAddtoBag().click();
	    log.info("Click On add to bag");
	    report.endTest(test);
		report.flush();
		
	   
	}
	
	@Test(priority=10)
	public void ClickDCHome() throws InterruptedException, IOException {	
		test = report.startTest("Home Page DC Page");
		Thread.sleep(3000L);
		ExtentLogUtilities.pass(driver, test, "URL Opened", log);
		log.info(driver.getTitle());
		PageObjectclickDC dc = new PageObjectclickDC(driver);
		dc.getClickDc().sendKeys(Keys.ENTER);
		log.info("Click on Home Page in DC Symbol");
		dc.getSecondP().click();
		log.info("Click On product");
		dc.getAddtoBag().click();
		log.info("Click On add to bag");
		report.endTest(test);
		report.flush();	
	}
	
	@AfterMethod
	public void Dclose() {
		driver.quit();
	}

}
