package hello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoTest{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/yimingdai/chromedriver");
		WebDriver driver = new ChromeDriver();
//		driver.get("");
		driver.navigate().to("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwi8zbSuwoHlAhUHqp4KHWeIDIcQPAgH");
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("bilibili");
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).click();
		
		WebDriverWait waitforsearchresult = new WebDriverWait(driver, 10);//10 sec
		WebElement element = waitforsearchresult.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[1]/a/h3/div")));
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[1]/a/h3/div")).click();
		
		WebDriverWait waitforbilibili = new WebDriverWait(driver, 10);//10 sec
		WebElement element2 = waitforbilibili.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[3]/div[3]/ul/li[1]/a/div/img")));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[3]/div[3]/ul/li[1]/a/div/img")).click();
		
		WebDriverWait waitforlogin = new WebDriverWait(driver, 10);//10 sec
		WebElement element3 = waitforlogin.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'login-app\']/div/div[2]/div[2]/span")));
		driver.findElement(By.xpath("//*[@id=\'geetest-wrap\']/ul/li[4]/label/input")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\'login-username\']")).sendKeys("yimingpika@gmail.com");
		driver.findElement(By.xpath("//*[@id=\'login-passwd\']")).sendKeys("secret");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\'geetest-wrap\']/ul/li[5]/a[1]")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\'login-app\']/div/div[2]/p/a[1]")).click();
		
		Thread.sleep(3000);
//		System.exit(0); // end the java program
		driver.quit();//close all tabs
//		driver.close(); // close the current base url (first one)
		
	}
}
