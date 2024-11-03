package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_with_authenti {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		/*
		 * String url="https://rahulshettyacademy.com/AutomationPractice/"; String
		 * url1="https://the-internet.herokuapp.com/javascript_alerts"; String
		 * name="Sandeep";
		 */
		// driver.get(url);
		// Syntex:- https://username:password@the-internet.herokuapp.com/basic_auth
		String url2 = "https://admin:admin@the-internet.herokuapp.com/basic_auth";
		driver.get(url2);
		System.out.println(driver.findElement(By.xpath("//p[contains(text(),'Congratulations!')]")).getText());

	}

}
