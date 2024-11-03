package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		// String url="https://rahulshettyacademy.com/AutomationPractice/";
		String url1 = "https://the-internet.herokuapp.com/javascript_alerts";
		// String name="Sandeep";
		// driver.get(url);
		driver.get(url1);

		/*
		 * driver.findElement(By.id("name")).sendKeys(name);
		 * driver.findElement(By.id("alertbtn")).click();
		 * System.out.println(driver.switchTo().alert().getText());
		 * driver.switchTo().alert().accept();
		 * 
		 * driver.findElement(By.id("confirmbtn")).click();
		 * System.out.println(driver.switchTo().alert().getText());
		 * driver.switchTo().alert().dismiss();
		 */

		driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.cssSelector("#result")).getText());

		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		System.out.println(driver.findElement(By.cssSelector("#result")).getText());

		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("Hey Anu");
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.cssSelector("#result")).getText());

	}

}
