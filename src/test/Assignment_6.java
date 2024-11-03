package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		WebElement checkbox = driver.findElement(By.cssSelector("#checkBoxOption3"));
		checkbox.click();
		String text = driver.findElement(By.xpath("//input[@value='option3']/..")).getText();

		// dropdown
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select s = new Select(dropdown);
		s.selectByVisibleText(text);

		// drop to alertbox
		driver.findElement(By.name("enter-name")).sendKeys(text);
		driver.findElement(By.id("alertbtn")).click();
		String alerttext = driver.switchTo().alert().getText();

		if (alerttext.contains(text)) {
			System.out.println("Task was Done Successfully");
		} else {
			System.out.println("Something you did wrong");
		}

	}

}
