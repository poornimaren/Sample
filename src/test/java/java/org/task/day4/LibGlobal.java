package org.task.day4;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LibGlobal {
	
	public WebDriver browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "E:\\Poo_Workspace\\TestngSample\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}

	public void getURL(WebDriver driver, String url) {
		driver.get(url);
	}
	
	public String getText(WebElement e) {
		String s = e.getText();
		return s;
	}
	
	public void winMaximize(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	public void click(WebElement e) {
		e.click();
	}
	
	public String getAttr(WebElement e) {
		String s = e.getAttribute("value");
		return s;
		
	}
	
	public void enterVal(WebElement e, String value) {
		e.sendKeys(value);
	}
	
	public void close(WebDriver driver) {
		driver.close();
	}
	
	public void scrollDown(WebDriver driver, WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", e);
		
		}
	
	public void simpleAlert(WebDriver driver) {
		Alert a = driver.switchTo().alert();
		a.accept();
	}
	public void clear(WebElement e) {
		e.clear();
	}
	
	public void implicitWaitSec(WebDriver driver, int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	
	public void explicitWait(WebDriver driver, WebElement e) {
		WebDriverWait w = new WebDriverWait(driver,50);
		WebElement first = w.until(ExpectedConditions.visibilityOf(e));
	}
	
	public void actionMouseHover(WebDriver driver, WebElement e) {
		Actions a = new Actions(driver);
		a.moveToElement(e);
	}
	public void switchWindow(WebDriver driver) {
		String pwin = driver.getWindowHandle();
		Set<String> awin = driver.getWindowHandles();
		
		for (String cwin : awin) {
			if(!(cwin.equals(pwin))) {
				driver.switchTo().window(cwin);
			}
			
		}
	}
	
	
}
