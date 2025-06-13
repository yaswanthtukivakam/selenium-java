package SeleniumWork;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class TestingJavaTest {
	
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.quit();
	}

        @Disabled
		@Test
		void test1() {
			driver.get("https://www.google.com");
		}

		@Test
		void test2() {
			driver.get("https://www.facebook.com");
		}
        @Ignore
		@Test
		void test3() {
			driver.get("https://www.amazon.com");
		}
        @Disabled
		@Test
		void test4() {
			driver.get("https://www.selenium.dev");
		}

		@Test
		void test5() {
			driver.get("https://www.flipkart.com");
		}

	
		
	}


