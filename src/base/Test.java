package base;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test {

    public static void main(String[] args) {
    	
    	WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://www.amazon.in/");
    	
    	WebElement move=driver.findElement(By.xpath("//span[text()='Account & Lists']"));
    	Actions act = new Actions(driver);
    	act.moveToElement(move).perform();
    	
    	driver.findElement(By.xpath("//span[text()='Sign in']")).click();
    	driver.findElement(By.cssSelector("#ap_email")).sendKeys("sandeepkumar.yadla@gmail.com");
    	driver.findElement(By.xpath("//input[@type='submit']")).click();
    	driver.findElement(By.cssSelector("#ap_password")).sendKeys("Lastone@one1");
    	driver.findElement(By.id("signInSubmit")).click();
    	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
    	driver.findElement(By.id("nav-search-submit-button")).click();
    	
    	driver.findElement(By.xpath("//button[@id='a-autoid-3-announce']")).click();
    	
    	
    }
}
