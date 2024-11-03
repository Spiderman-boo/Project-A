package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMove {

	public static void main(String[] args) {
		// System.setProperties("webdriver.chrome.driver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Actions act = new Actions(driver);

		act.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList"))).build().perform();
		act.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT)
				.sendKeys("Hello").doubleClick().build().perform();
	}

}
