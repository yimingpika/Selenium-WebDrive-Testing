package hello;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/yimingdai/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///Users/yimingdai/Desktop/Github/annoy.html");
		
		// get alert msg and print it
		String alertmessage = driver.switchTo().alert().getText();
		System.out.print(alertmessage);
		
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("no");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("no");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
		
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("yes");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
	}

}
