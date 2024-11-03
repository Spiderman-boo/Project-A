package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("#checkBoxOption1")).click();
		System.out.println(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected());
		driver.findElement(By.cssSelector("#checkBoxOption1")).click();
		System.out.println(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected());
		
		//Count of no of checkboxes
		System.out.println(driver.findElements(By.cssSelector("[type='checkbox']")).size());

	}

}
