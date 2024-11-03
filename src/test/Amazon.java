package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get("https://www.amazon.in/gp/buy/payselect/handlers/display.html?hasWorkingJavascript=1");

		WebElement username = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#ap_email_login")));
		username.sendKeys("sandeepkumar.yadla@gmail.com");
		// driver.findElement(By.cssSelector("#ap_email_login")).sendKeys("sandeepkumar.yadla@gmail.com");
		driver.findElement(By.cssSelector(".a-button-input")).click();

		WebElement password = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[autocomplete='current-password']")));
		password.sendKeys("Firstone@one123");

		// driver.findElement(By.name("password")).sendKeys("Firstone@one123");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	}

}
