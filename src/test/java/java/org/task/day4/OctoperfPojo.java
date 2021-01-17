package org.task.day4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OctoperfPojo {
	WebDriver driver;
	public OctoperfPojo(WebDriver driver1) {
		this.driver = driver1;
	}
	
	@FindBy(xpath="//a[@class='btn btn-sm btn-primary transition-3d-hover']")
	private WebElement btnGetStarted;
	
	@FindBy(id="email")
	private WebElement txtEmail;
	
	@FindBy(id="password")
	private WebElement txtPassword;
	
	@FindBy(xpath="//button[@id='login-button']")
	private WebElement btnLogin;
	
	@FindBy(xpath="//button[@type='button']")
	private WebElement btnAdd;
	
	@FindBy(xpath="//input[@name='name']")
	private WebElement txtName;
	
	@FindBy(xpath="//textarea[@name='description']")
	private WebElement txtDescritpion;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement btnSave;
	
	@FindBy(xpath="//button[@class='btn btn-lg btn-block btn-primary m-t-sm m-b-lg ']")
	private WebElement btnApi;
	
	@FindBy(xpath="(//button[@class='btn btn-lg btn-block btn-primary m-b-lg '])[1]")
	private WebElement btnStaticWeb;
	
	@FindBy(xpath="//input[@class='form-control']")
	private WebElement txtUrl;
	
	@FindBy(xpath="//button[@title='Delete']")
	private WebElement btnDelete;
	
	@FindBy(id="create-vu-button")
	private WebElement btnCreateVU;
	
	@FindBy(xpath="//a[@id='runtime-user-dropdown']")
	private WebElement tabRunTime;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getBtnGetStarted() {
		return btnGetStarted;
	}

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getBtnAdd() {
		return btnAdd;
	}

	public WebElement getTxtName() {
		return txtName;
	}

	public WebElement getTxtDescritpion() {
		return txtDescritpion;
	}

	public WebElement getBtnSave() {
		return btnSave;
	}

	public WebElement getBtnApi() {
		return btnApi;
	}

	public WebElement getBtnStaticWeb() {
		return btnStaticWeb;
	}

	public WebElement getTxtUrl() {
		return txtUrl;
	}
	
	public WebElement getBtnDelete() {
		return btnDelete;
	}

	public WebElement getBtnCreateVU() {
		return btnCreateVU;
	}

	public WebElement getTabRunTime() {
		return tabRunTime;
	}

	
	
	
	
	

}
