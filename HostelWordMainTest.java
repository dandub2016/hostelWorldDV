import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HostelWordMainTest {

	public static void main (String [] args) throws Exception


	{
		
	 WebDriver driver = new FirefoxDriver();
	 
     /*driver.get("https://www.google.com");
	 WebElement element = driver.findElement(By.name("q"));
	 element.sendKeys("Mysql excel 2013");
	 element.submit();*/
	 
	 HostelWorldTC01 hw = new HostelWorldTC01();
	 
	 hw.testHostelWorldTC01();
	

	}

}