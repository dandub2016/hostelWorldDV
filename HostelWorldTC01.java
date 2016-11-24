
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import org.testng.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class HostelWorldTC01 {
	  private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @BeforeTest(alwaysRun = true)
	  public void setUp() throws Exception {
	    driver = new FirefoxDriver();
	    baseUrl = "http://www.hostelworld.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }
		// TODO Auto-generated method stub
		
		
		
	  @Test
	  public void testHostelWorldTC01() throws Exception {
	    driver.get(baseUrl + "/");
	    driver.findElement(By.id("home-search-keywords")).click();
	    driver.findElement(By.linkText("Dublin, Ireland")).click();
	    driver.findElement(By.id("home-search-keywords")).clear();
	    driver.findElement(By.id("home-search-keywords")).sendKeys("Dublin, Ireland");
	    driver.findElement(By.id("home-search-keywords")).clear();
	    driver.findElement(By.id("home-search-keywords")).sendKeys("Dublin, Ireland");
	    driver.findElement(By.cssSelector("button.radius.orange_button")).click();
	    driver.findElement(By.cssSelector("button.radius.orange_button")).click();
	    driver.findElement(By.xpath("//body[@id='pagebody']/div/div/div/div[15]/div[4]/div/div/div/div/dl/dd[2]/i")).click();
	    driver.findElement(By.id("sortByName")).click();
	  }

	  @AfterTest(alwaysRun = true)
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

	  private void fail(String verificationErrorString) {
		// TODO Auto-generated method stub
		
	}



	private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  @SuppressWarnings("unused")
	private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }
	}


