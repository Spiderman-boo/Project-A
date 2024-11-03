package test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links_ {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		// driver.get("https://the-internet.herokuapp.com/dropdown");
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		/*
		 * WebElement drop = driver.findElement(By.cssSelector("#dropdown")); Select
		 * dropdown= new Select(drop); dropdown.selectByVisibleText("Option 2");
		 */
		// 1. count of links on page

		System.out.println(driver.findElements(By.tagName("a")).size());
		// 2. count of footer section
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		// 3.
		WebElement coloumn = footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(coloumn.findElements(By.tagName("a")).size());

		// 4.click on each link in the coloumn check pages are opening or not
		for (int i = 1; i < coloumn.findElements(By.tagName("a")).size(); i++) {

			String clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);

			coloumn.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(5000L);

		} // opens all the tabs
		Set<String> abc = driver.getWindowHandles();// 4
		Iterator<String> it = abc.iterator();

		while (it.hasNext()) {

			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());

		}
	}

}
