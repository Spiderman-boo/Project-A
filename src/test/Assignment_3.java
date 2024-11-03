package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_3 {

	public static void main(String[] args) {
		// Frames
		WebDriver driver = new ChromeDriver();
		// String url="https://rahulshettyacademy.com/AutomationPractice/";
		String url = "https://the-internet.herokuapp.com/nested_frames";
		driver.get(url);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));
		// driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-left']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-middle']")));

		// System.out.println(driver.findElement(By.xpath("//body[contains(normalize-space(),'LEFT')]")).getText());

		System.out.println(driver.findElement(By.xpath("//body//div[@id='content']")).getText());

	}

}
