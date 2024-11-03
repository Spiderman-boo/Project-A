package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ScrollBar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)"); // Scroll on a Page
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000"); // Scroll on component / means
																					// scroll inside window

		// Getting values from inside window and Sum all these numbers
		List<WebElement> value = driver.findElements(By.xpath("//div[@class='tableFixHead']//td[4]"));
		// WebElement value1 = driver.findElement(By.cssSelector(".tableFixHead td:nth-child(4)"));

		int sum = 0;
		for (int i = 0; i < value.size(); i++) {
			// System.out.println(value.get(i).getText());

			sum = sum + Integer.parseInt(value.get(i).getText());
		}
		System.out.println(sum);

		driver.findElement(By.cssSelector(".totalAmount")).getText();
		int total = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		Assert.assertEquals(sum, total);

	}

}
