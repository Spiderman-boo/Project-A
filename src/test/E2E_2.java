package test;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E2E_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		Thread.sleep(3000);
		String[] Items = { "Cucumber", "Brocolli", "Carrot" };
		int j = 0;

		List<WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < product.size(); i++) {
			// Broccoli-1Kg
			// Cucumber-1Kg

			String[] name = product.get(i).getText().split("-");
			String formattedname = name[0].trim();

			List Items1 = Arrays.asList(Items);

			if (Items1.contains(formattedname)) {

				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == Items.length) {
					break;
				}

			}
		}

	}

}
