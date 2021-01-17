package org.task.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OctoPerfTestNg {
	@Parameters({"url","email","password","name","desc","urlValue"})
	@Test
	public void tc1(String url, String email, String password, String name,
			String desc, String urlValue) throws InterruptedException{
		LibGlobal l = new LibGlobal();
		WebDriver driver = l.browserLaunch();
		l.getURL(driver, url);
		
		OctoperfPojo o = new OctoperfPojo(driver);
		PageFactory.initElements(driver, o);
		
		l.click(o.getBtnGetStarted());
		l.switchWindow(driver);
		l.enterVal(o.getTxtEmail(), email);
		l.enterVal(o.getTxtPassword(), password);
		l.click(o.getBtnLogin());
		l.implicitWaitSec(driver, 10);
		l.click(o.getBtnAdd());
		l.enterVal(o.getTxtName(), name);
		l.enterVal(o.getTxtDescritpion(), desc);
		l.click(o.getBtnSave());
		l.click(o.getBtnApi());
		l.click(o.getBtnStaticWeb());
		l.enterVal(o.getTxtUrl(), urlValue);
		l.click(o.getBtnDelete());
		l.enterVal(o.getTxtUrl(), urlValue);
		l.click(o.getBtnCreateVU());
		Thread.sleep(3000);
		l.actionMouseHover(driver, o.getTabRunTime());
		l.click(o.getTabRunTime());
		l.click(o.getBtnAdd());
		l.close(driver);
		
		
	}
	

}
