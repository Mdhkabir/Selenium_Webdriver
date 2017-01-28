import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementCommend {

	public static void main(String[] args) throws InterruptedException {
		
		String baseDirPath = System.getProperty("user.dir");
		String FirefoxServerPath = baseDirPath + "//geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", FirefoxServerPath);
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("https://www.wikipedia.org/");
		
		Thread.sleep(3000);
		WebElement imputbox = driver.findElement(By.xpath("//*[@id='searchInput']"));
		imputbox.clear();
		
		Thread.sleep(1000);
		imputbox.sendKeys("www.remote.itunitersity.com");
		
		Thread.sleep(1000);
		WebElement SerchButton = driver.findElement(By.xpath("//button[@type='submit']"));
		SerchButton.click(); 
		//SerchButton.submit(); 
		Thread.sleep(1000);
		
		WebElement textvalidation = driver.findElement(By.xpath("//h1[contains(.,'Search results')]"));
		textvalidation.isDisplayed();
		textvalidation.isEnabled();
		Thread.sleep(1000);
		
		String text = textvalidation.getText();
		System.out.println(text);
		System.out.println(textvalidation.getSize());
		
	
		Thread.sleep(10000);
		driver.quit();
		

	}

}
