package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Calander_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		String Year = "2027";
		String Month = "6";
		String Date = "11";
		
		String[] expected = {Month, Date, Year};

		driver.findElement(By.cssSelector(".react-date-picker__wrapper")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.xpath("//button[text()='" + Year + "']")).click();
		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month"))
				.get(Integer.parseInt(Month) - 1).click();
		driver.findElement(By.xpath("//abbr[text()='"+Date+"']")).click();
		
		
		 List<WebElement> actual =driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
		 for(int i=0; i<actual.size(); i++)
		 {
			 System.out.println(actual.get(i).getAttribute("Value"));
			 Assert.assertEquals(actual.get(i).getAttribute("Value"), expected[i]);
		 }
		

	}

}
