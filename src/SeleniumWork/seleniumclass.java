package SeleniumWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumclass {

	public static void main(String[] args) throws InterruptedException {
      WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		driver.manage().window().fullscreen();
		driver.close();
		driver.quit();
		
		
	//	WebDriver driver1 = new EdgeDriver(); //
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.techlearn.in");
		driver1.quit(); 
    
	}

}
