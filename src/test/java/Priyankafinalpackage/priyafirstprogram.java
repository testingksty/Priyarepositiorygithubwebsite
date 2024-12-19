
package Priyankafinalpackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class priyafirstprogram {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(10000);
		System.out.println("all the best");
	//am using firefox
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com");

	}

}
