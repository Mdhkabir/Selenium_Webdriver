import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationCommend {

	private static Object[] ExpectedURL;

	public static void main(String[] args) throws InterruptedException {
		
		String baseDri = System.getProperty("user.dir");
		String FirefoxServerPath = baseDri + "\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", FirefoxServerPath);
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("https://www.att.com");
		Thread.sleep(3000);
	
		WebElement shop = driver.findElement(By.xpath("//*[@id='ge5p_z2_p1001']"));
		shop.click();
		Thread.sleep(3000);
		
		driver.navigate().forward();
		String ActualURL = driver.getCurrentUrl();
		
		Assert.assertEquals(ActualURL, ExpectedURL);
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		driver.navigate().back();
		
		
		
		
		Thread.sleep(3000);
		driver.quit();

		

	}

}
