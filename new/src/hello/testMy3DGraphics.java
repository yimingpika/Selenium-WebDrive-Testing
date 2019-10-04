package hello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testMy3DGraphics {
	
	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver","/Users/yimingdai/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///Users/yimingdai/Desktop/Github/Computer Graphics/-Computer-Graphics/Project C/DaiYiming_ProjC/DaiYiming_ProjC.html");
		// driver.navigate().to("url"); another method
		// open the instruction
		driver.findElement(By.xpath("/html/body/div[3]/button")).click();
		Thread.sleep(3000);//5 sec
		// test User-adjustabl R, G, B values (from 0 to 1.0) 
		// for ambient, diffuse, and specular light:
		driver.findElement(By.id("Lamp_Ambient_R")).clear();
		driver.findElement(By.id("Lamp_Ambient_R")).sendKeys("0");
		driver.findElement(By.id("Lamp_Diffuse_R")).clear();
		driver.findElement(By.id("Lamp_Diffuse_R")).sendKeys("0");
		driver.findElement(By.id("Lamp_Specular_R")).clear();
		driver.findElement(By.id("Lamp_Specular_R")).sendKeys("0");
		Thread.sleep(1000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(3000);//3 sec
		driver.navigate().refresh();
		
		// test lighting button
		driver.findElement(By.xpath("/html/body/div[1]/p[1]/button[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/p[1]/button[1]")).click();
		Thread.sleep(3000);
		
		
		//test shading button
		driver.findElement(By.xpath("/html/body/div[1]/p[1]/button[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/p[1]/button[2]")).click();
		Thread.sleep(3000);
		
		// test pick list
//		driver.findElement(By.xpath(xpathExpression))
		

	}

}
