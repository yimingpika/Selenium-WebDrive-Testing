package hello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/yimingdai/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bilibili.com/");
		
		driver.findElement(By.xpath(""));
		
	}
}
