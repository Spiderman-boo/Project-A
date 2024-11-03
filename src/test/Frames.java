package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		// String url="https://the-internet.herokuapp.com/nested_frames";
		String url1 = "https://ui.vision/demo/webtest/frames/";
		// driver.get(url);
		driver.get(url1);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		 /*//Nested Frame 
		 driver.switchTo().frame("frame-top");
		 driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-left']"))); 
		 driver.switchTo().frame("frame-middle");
		 System.out.println(driver.findElement(By.xpath("//body[contains(normalize-space(),'LEFT')]")).getText());
		 System.out.println(driver.findElement(By.xpath("//body//div[@id='content']")).getText());*/
		 

		// Frames
		/*
		 * driver.switchTo().frame(driver.findElement(By.xpath(
		 * "//frame[@src='frame_1.html']")));
		 * driver.findElement(By.cssSelector("input[name='mytext1']")).sendKeys("hello")
		 * ;
		 * 
		 * driver.switchTo().defaultContent();
		 * 
		 * driver.switchTo().frame(driver.findElement(By.xpath(
		 * "//frame[@src='frame_2.html']")));
		 * driver.findElement(By.cssSelector("input[name='mytext2']")).sendKeys(
		 * "testone");
		 */

		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		// WebElement frame2=
		driver.switchTo().frame(frame1);
		driver.findElement(By.cssSelector("input[name='mytext3']")).sendKeys("oneone");

		// its inside a frame iwth Iframe so without any attribute we use index
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@id='i8']")).click();

		WebElement chose = driver.findElement(By.xpath("//div[@role='listbox']"));
		chose.click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,'Yes')]")));

		WebElement yesOption = driver.findElement(By.xpath("//span[contains(.,'Yes')]"));
		yesOption.click();

	}

}
