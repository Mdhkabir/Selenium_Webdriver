import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChackBox_RadioButton {

	public static void main(String[] args) throws InterruptedException {
		String baseDirPath = System.getProperty("user.dir");
		String FirefoxServerPath = baseDirPath + "//geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", FirefoxServerPath);
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().to("https://www.facebook.com/");
		
		WebElement radioButton = driver.findElement(By.xpath("//input[@id='u_0_j']"));
		radioButton.click();
		radioButton.isEnabled();
		
		
		
		Thread.sleep(50000);
		driver.quit();

	}

}
