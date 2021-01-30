package BaseLib;


	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Arrays;
	import java.util.HashMap;
	import java.util.Properties;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.Platform;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.testng.ITestContext;
	import org.testng.Reporter;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Parameters;

	import com.relevantcodes.extentreports.ExtentReports;
	import com.relevantcodes.extentreports.ExtentTest;
	import com.relevantcodes.extentreports.LogStatus;

import DemoBlaze_Shop.OnlineShop_Page;
import jobma_utils.ScreenShotsLib;
	import jobma_utils.WaitStatementLib;

	public class BaseFile {

		public static Properties prop;
		public static WebDriver driver;
		public WebElement element;

		public BaseFile(){
			try {
				prop = new Properties();
				FileInputStream ip = new FileInputStream(".\\src\\main\\java\\config\\sample");
				prop.load(ip);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}	
		}		

		public static WebDriver getDriver() {
			System.setProperty("webdriver.chrome.driver", ".\\exeFiles\\chromedriver1.exe");
				driver= new ChromeDriver();
				Reporter.log("Chrome launched",true);
			
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Reporter.log("Naviagate to URL", true);
			WaitStatementLib.implicitwaitforseconds(driver, 20);
			return driver;

		}

		
		public static void log(String Messgae)
		{
			Reporter.log(Messgae, true);

		}

		@AfterSuite
		public void tearDown(){

			driver.quit();
			}
	}
