package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maxmize_Cookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com/");
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().deleteAllCookies();
		// driver.manage().deleteCookieNamed("seassion");
		

	}

}
