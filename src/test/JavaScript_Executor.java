package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Executor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// 1 ScrollDown by Pixel Number
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)");

		Thread.sleep(2000L);
		// 2 Scrow the page till element visible
		WebElement elem = driver.findElement(By.xpath("//a[normalize-space()='Latest News']"));
		js.executeScript("arguments[0].scrollIntoView();", elem);

		// 3 Scroll page till end of the page

		js.executeScript("window.scrollBy(0,'document.body.scrollHight')");
		System.out.println(js.executeScript("return window.pageYOffset;"));

	}

}
