package navigationPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {
	
	public DashboardPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="logout2")
	private WebElement btnLogout;
	@FindBy(xpath="//*[contains(text(),'Laptops')]")
	private WebElement lblLapTops;
	@FindBy(xpath="//*[contains(text(),'MacBook air')]")
	private WebElement lblMcBookair;
	@FindBy(xpath="//*[@id=\"tbodyid\"]/div[2]/div/a")
	private WebElement btnAdd2Cart;
	@FindBy(id="cartur")
	private WebElement btnCart;
	
	
	public void logout() throws InterruptedException {
		Thread.sleep(2000);
		btnLogout.click();
	}
	
	public void add2cart(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		lblLapTops.click();
		Thread.sleep(1000);
		lblMcBookair.click();
		Thread.sleep(2000);
		btnAdd2Cart.click();
		WebDriverWait wait = new WebDriverWait(driver,5);
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();
		btnCart.click();
		Thread.sleep(1000);
		
		
	}

}
