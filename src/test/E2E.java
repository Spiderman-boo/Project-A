package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class E2E {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		String url = "https://rahulshettyacademy.com/dropdownsPractise/";
		// String name="Sandeep";
		driver.get(url);

		// Static DropDown with Select Tag
		// WebElement
		// Staticdropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_rbtnl_Trip_0\"]")).click();

		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='HYD']")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']"))
				.click();

		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();

		if (driver.findElement(By.id("Div1")).getAttribute("Style").contains("0.5")) {
			System.out.println("its disable");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);

		int i = 1;
		/*
		 * while(i<5) { driver.findElement(By.id("hrefIncAdt")).click(); i++; }
		 */

		for (i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}

		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

		WebElement Staticdropdown1 = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(Staticdropdown1);
		dropdown.selectByIndex(3);

		driver.findElement(By.cssSelector("#autosuggest")).sendKeys("indi");
		Thread.sleep(3000);

		List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));

		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("india")) {
				option.click();
				break;
			}

		}

		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

	}

}
