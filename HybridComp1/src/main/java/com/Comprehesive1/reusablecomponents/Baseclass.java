package com.Comprehesive1.reusablecomponents;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baseclass {
	public static WebDriver driver;
	public static Properties prop;
	
	
	public WebDriver BaseSettings() {
		try {

			prop = new Properties();

			FileInputStream fis = new FileInputStream(
					".//src//resources//first.properties");

			prop.load(fis);

			String browserName = prop.getProperty("Browser");

			
			if (browserName.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\vivek\\Documents\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
			}

			else if (browserName.equalsIgnoreCase("Edge")) {
				System.setProperty("webdriver.edge.driver", "C:\\Users\\vivek\\Documents\\edgedriver_win64\\msedgedriver.exe");
				WebDriver driver=new EdgeDriver();
			}

			else if (browserName.equalsIgnoreCase("Firefox"))  { 
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\vivek\\Documents\\geckodriver-v0.30.0-win64\\geckodriver.exe");
				WebDriver driver=new FirefoxDriver();
			}

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	}

}




