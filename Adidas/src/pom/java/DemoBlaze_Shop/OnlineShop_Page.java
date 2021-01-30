package DemoBlaze_Shop;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import BaseLib.BaseFile;
import jobma_utils.WaitStatementLib;

public class OnlineShop_Page extends BaseFile {
	WebDriver driver;
	public static String amnt;
	
	// Click on Phone
	@FindBy(xpath="//a[contains(text(),'Phones')]")
	private WebElement phone;

	// Click on Laptops
	@FindBy(xpath="//a[contains(text(),'Laptops')]")
	private WebElement laptop;

	// Click on Monitors
	@FindBy(xpath="//a[contains(text(),'Monitors')]")
	private WebElement monitors;
	
	// Select Sony vaio i5
	@FindBy(xpath="//a[@class='hrefch' and contains(text(),'Sony vaio i5')]")
	private WebElement vaioi5;
	
	// Select Dell i7
	@FindBy(xpath="//a[@class='hrefch' and contains(text(),'Dell i7 8gb')]")
	private WebElement delli7;
	
	// Add to cart
	@FindBy(xpath="//a[@class='btn btn-success btn-lg']")
	private WebElement addtoCart;
	
	// Click on Home
	@FindBy(xpath="//ul//a[@href='index.html']")
	private WebElement Homebtn;
	
	// Click on cart
	@FindBy(xpath="//ul//a[@href='cart.html']")
	private WebElement cartBtn;
	
	// Find the device that need to be deleted
	@FindBy(xpath="//tr[@class='success']/td[2]")
	private List<WebElement> deviceName;
	
	// Delete the device
	@FindBy(xpath="//tr[@class='success']/td[4]/a")
	private List<WebElement> deleteDevice;
	
	// Find total amount
	@FindBy(xpath="//h3[@id='totalp']")
	private WebElement totalAmnt;
	
	// Place order
	@FindBy(xpath="//button[@data-target='#orderModal']")
	private WebElement placeOrd;

	// Name on form
	@FindBy(xpath="//input[@id='name']")
	private WebElement name;

	// Enter country
	@FindBy(xpath="//input[@id='country']")
	private WebElement country;

	// Enter city
	@FindBy(xpath="//input[@id='city']")
	private WebElement city;

	// Enter card number
	@FindBy(xpath="//input[@id='card']")
	private WebElement cardNo;

	// Enter month
	@FindBy(xpath="//input[@id='month']")
	private WebElement month;

	// Enter year
	@FindBy(xpath="//input[@id='year']")
	private WebElement year;

	// Purchase the order
	@FindBy(xpath="//button[@onclick='purchaseOrder()']")
	private WebElement purchase;
	
	// Purchase ID
	@FindBy(xpath="//p[@class='lead text-muted ']")
	private WebElement purchaseId;

	// Amount
	@FindBy(xpath="//p[@class='lead text-muted ']/br[2]")
	private WebElement amount;
	
	// Click ok
	@FindBy(xpath="//button[contains(text(),'OK')]")
	private WebElement clickOk;
	
	public OnlineShop_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void ShoppingPage() {
		
		log("Click on Phone");
		phone.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		log("Click on Monitor");
		monitors.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		log("Click on laptops");
		laptop.click();
	}
	
	public void viaoSelect() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		log("Select Sony vaio i5");
		vaioi5.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		log("Click on add to cart for vaio");
		addtoCart.click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		while(true) {
			try {
				driver.switchTo().alert().accept();
				break;
			}
			catch (Exception e) {
				Thread.sleep(1000);
			}
		}
		log("Back to home page");
		Homebtn.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		log("Again click on laptop");
		laptop.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void dellSelect() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		log("Select Sony vaio i5");
		delli7.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		log("Click on add to cart for dell");
		addtoCart.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		while(true) {
			try {
				driver.switchTo().alert().accept();
				break;
			}
			catch (Exception e) {
				Thread.sleep(1000);
			}
		}
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	public void cart() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		log("Navigate to cart");
		cartBtn.click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(3000);
		int size = deviceName.size();
		System.out.println("Total Devices added to cart are " +size);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		log("Loop for device and find out dell");
		for(int i=0;i<size;i++) {
			String dName = deviceName.get(i).getText();
			System.out.println(dName);
			if(dName.contains("Dell i7 8gb")) {
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				deleteDevice.get(i).click();
				Thread.sleep(1000);
				break;
			}
			else {
				log("Check another device");
			}
		}
		
	}
		public void Order() throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			Thread.sleep(3000);
			log("Find out total amount");
			amnt = totalAmnt.getText();
			System.out.println("Total amount displayed is " +amnt);
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			log("Click on place order");
			placeOrd.click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
		}
	
		public void enterDetails() {
			log("Enter name");
			name.sendKeys("Priyanka");
			log("Enter country");
			country.sendKeys("India");
			log("Enter city");
			city.sendKeys("Gurgaon");
			log("Enter card number");
			cardNo.sendKeys("21111111111");
			log("Enter month");
			month.sendKeys("12");
			log("Enter year");
			year.sendKeys("2022");
			log("Click on purchase");
			purchase.click();
		}

		public void DataCheck() {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			log("Print purchase ID and Amount");
			String at = purchaseId.getText();
			System.out.println("Amount to be paid is " +at);
			log("Verify the amount displayed and paid");
			Assert.assertTrue(at.contains(amnt), "Amount displayed at time of purchase and paid is not same");
			log("Amount displayed and paid are same");
			log("Click ok");
			clickOk.click();
		}
	
}
