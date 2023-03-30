package Test1;

public class Democlass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.get("https://www.guru99.com/");
	}

}
