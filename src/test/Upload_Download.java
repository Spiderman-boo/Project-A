package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Upload_Download {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/upload-download-test/index.html");
		
		//Download
		driver.findElement(By.cssSelector("#downloadButton")).click();
		
		//Upload
		WebElement upload = driver.findElement(By.cssSelector("input[type='file']"));
		upload.sendKeys("C:/Users/Sandy/Downloads/download.xlsx");
		
		//Wait for Success message to show up and wait for disappear 
		
		By toastLocator = By.cssSelector(".Toastify__toast-body div:nth-child(2");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(toastLocator));
		String toastText = driver.findElement(toastLocator).getText();
		System.out.println(toastText);
		Assert.assertEquals("Updated Excel Data Successfully.",toastText);
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(toastLocator));
		
		//Verify updated excel data 
		String fruitName = "Apple";
		String updatedValue = "603";
		String priceColumn= driver.findElement(By.xpath("//div[text()='Price']")).getAttribute("data-column-id");
		String actualPrice = driver.findElement(By.xpath("//div[text()='"+fruitName+"']/parent::div/parent::div/div[@id='cell-"+priceColumn+"-undefined']")).getText();
		System.out.println(actualPrice);
		Assert.assertEquals(updatedValue, actualPrice);
		
		driver.close();

	}

}
