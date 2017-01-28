import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FindElement_Elements {

	public static void main(String[] args) throws InterruptedException {
		
		String baseDirPath = System.getProperty("user.dir");
		String FirefoxServerPath = baseDirPath + "//geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", FirefoxServerPath);
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().to("https://www.wikipedia.org/");
			
		//WebElement button =  driver.findElement(By.xpath("//strong[contains(.,'English')]"));
		//button.click();
		
		List<WebElement> dropdown = driver.findElements(By.tagName("option"));
		for (int i=0; i<dropdown.size(); i++){

			System.out.println(dropdown.get(i).getText());
			System.out.println(dropdown.size());
			
		}
		
		Thread.sleep(3000);
		Select dropdown1= new Select (driver.findElement(By.xpath("//*[@id='searchLanguage']")));
		dropdown1.selectByIndex(3);
		//dropdown1.selectByVisibleText("Latina");
		//dropdown1.selectByValue("be");
		
		
		driver.quit();
		
		
		
	}

}
