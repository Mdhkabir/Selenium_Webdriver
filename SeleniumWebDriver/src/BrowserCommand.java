import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserCommand {

	public static void main(String[] args) throws InterruptedException {
		
		
		String baseDIRPath = System.getProperty("user.dir");
		String FirefoxServerPath = baseDIRPath + "\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver",FirefoxServerPath);
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com");
		
		String Title = driver.getTitle();
		System.out.println(Title);
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		
		driver.close();
		Thread.sleep(5000);
		driver.quit();
		
		
		
		
	

	}

}
