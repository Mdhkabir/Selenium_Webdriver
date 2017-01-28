import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		

		String baseDirPath = System.getProperty("user.dir");
		String FirefoxServerPath = baseDirPath + "//geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", FirefoxServerPath);
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.att.com/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement element = driver.findElement(By.xpath("//a[@id='ge5p_z2_p1001']"));
		
		Actions mouseHoverOver = new Actions(driver);
		mouseHoverOver.moveToElement(element).build().perform();
		
		driver.findElement(By.xpath("//a[@id='ge5p_z2_s1001']")).click();
		
		Thread.sleep(3000);
		driver.quit();
		
		

	}

}
