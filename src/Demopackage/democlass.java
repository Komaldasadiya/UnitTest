package Demopackage;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class democlass {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\BrowserDriver\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();   	 
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/input")).click();
	    Thread.sleep(5000);
		driver.findElement(By.linkText("Test.allTheThings() T-Shirt (Red)")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("checkout")).click();
		driver.findElement(By.cssSelector("#first-name")).sendKeys("Komal");
		driver.findElement(By.name("lastName")).sendKeys("Dasadiya_8815063");
		driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("N2A 1R5");
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();

		
		}

	

	}

