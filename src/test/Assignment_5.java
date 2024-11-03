package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("//span[text()=' User']/..")).click();

		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		// wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//button[@id='okayBtn']")));
		Thread.sleep(2000); // whay thread its working? why implict wait not working?
		driver.findElement(By.xpath("//button[@id='okayBtn']")).click();

		Select drop = new Select(driver.findElement(By.xpath("//select[@class='form-control']")));
		drop.selectByVisibleText("Consultant");

		driver.findElement(By.id("terms")).click();
		driver.findElement(By.cssSelector("input[name='signin']")).click();
		// driver.switchTo().alert().accept();

	}

}
