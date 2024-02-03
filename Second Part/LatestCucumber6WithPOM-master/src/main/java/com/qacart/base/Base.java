package com.qacart.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import lombok.val;
import rst.pdfbox.layout.elements.Dimension;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;


public class Base {
	
public static WebDriver driver;
public static Properties props = new Properties();
//public  ExtentReports extent;
//public static ExtentTest scenarioDef;
//public static ExtentTest features;
public static String reportLocation = "/my-first-system/target/reports";

public Base()
{
			
	try {
		File file = new File("src/main/java/properities/config.properities");
		FileInputStream fis = new FileInputStream(file);
		props.load(fis);
		}
		catch(Error error)
	{
			throw new Error("not a valid file");
	}
		catch(FileNotFoundException e) 
			{
			e.printStackTrace();
			}
	        catch(IOException e) 
	{
	        	e.printStackTrace();
	}
	}

	
	public static void lanuchBrowser() 
	{
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--headless");
		//options.addArguments("start-maximized");
		
		if(props.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(props.getProperty("browser").equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else
		{
			throw new Error("Browser not support");
		}
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(props.getProperty("url"));
	}
	
	public String getReportConfigPath(){
		String reportConfigPath = props.getProperty("reportConfigPath");
		if(reportConfigPath!= null) return reportConfigPath;
		else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");		
	}

}
