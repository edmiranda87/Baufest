package loginTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driverSetup.DriverSetup;
import globalVariables.GlobalVariables;
import navigationPages.LoginPage;

public class TC_01_CorrectSingUp {
	
	WebDriver driver = DriverSetup.setupDriver();
	LoginPage singup = new LoginPage(driver);
	
	
	
  @BeforeTest
  public void startWebDriver() {
	  driver.get(GlobalVariables.HOME_PAGE);
	  driver.manage().window().maximize();
  }
	
  @Test
  public void TC_01() throws InterruptedException {
	  singup.singup(GlobalVariables.USDER_ADMIN, GlobalVariables.PASSWORD_ADMIN, driver);
	  
  }
  
  @AfterTest
	public void closeDriver() {
	driver.quit();
}
  
}
