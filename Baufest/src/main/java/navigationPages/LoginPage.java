package navigationPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	public LoginPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(id="signin2")
	private WebElement btnSingup;
	@FindBy(id="sign-username")
	private WebElement userNametxt;
	@FindBy(id="sign-password")
	private WebElement passwordtxt;
	@FindBy(xpath = "//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")
	private WebElement btnSingup2;
	@FindBy(id="login2")
	private WebElement btnLogin;
	@FindBy(id="loginusername")
	private WebElement userName2txt;
	@FindBy(id="loginpassword")
	private WebElement password2txt;
	@FindBy(xpath="//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")
	private WebElement btnLogin2;
		
	
	public void singup(String user, String password, WebDriver driver) throws InterruptedException  {
		btnSingup.click();
		Thread.sleep(1000);
		userNametxt.sendKeys(user);
		passwordtxt.sendKeys(password);
		Thread.sleep(1000);
		btnSingup2.click();
		WebDriverWait wait = new WebDriverWait(driver,5);
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();
			
	}

	public void login(String user, String password) throws InterruptedException {
		btnLogin.click();
		Thread.sleep(1000);
		userName2txt.sendKeys(user);
		password2txt.sendKeys(password);
		btnLogin2.click();
		
	}
	
	

}
