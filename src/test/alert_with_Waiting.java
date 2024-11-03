package test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alert_with_Waiting {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		// String url="https://rahulshettyacademy.com/AutomationPractice/";
		String url1 = "https://the-internet.herokuapp.com/javascript_alerts";
		// String url2="https://the-internet.herokuapp.com/basic_auth";
		// String name="Sandeep";
		// driver.get(url);
		driver.get(url1);
		// Explicit_wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]")).click();
		Thread.sleep(2000);
		Alert myalert = wait.until(ExpectedConditions.alertIsPresent()); // using explicit condition
		myalert.accept();

	}

}
