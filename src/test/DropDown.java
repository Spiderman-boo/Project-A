package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		String url = "https://rahulshettyacademy.com/dropdownsPractise/";
		// String name="Sandeep";
		driver.get(url);

		// Static DropDown with Select Tag
		WebElement Staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(Staticdropdown);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());

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
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		// Dynamic dropdown
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='HYD']")).click();
		Thread.sleep(2000L);
		// driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click(); //Index Here
		// [2] how do you handle this?
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']"))
				.click();
		// using parent to child xpath
		// div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='HYD'] hyd
		// div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']
		// //a[@value='MAA'] chennai without index

		// Auto Suggestion DroDown

		driver.findElement(By.cssSelector("#autosuggest")).sendKeys("indi");
		Thread.sleep(3000);

		List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));

		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("india")) {
				option.click();
				break;
			}

		}

		// Button enable or disable__
		/*
		 * System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")
		 * ).isEnabled());
		 * driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		 * System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")
		 * ).isEnabled());
		 */

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("Style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("Style"));

		if (driver.findElement(By.id("Div1")).getAttribute("Style").contains("0.5")) {
			System.out.println("is enable");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}

}
