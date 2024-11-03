package test;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sample_ {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        driver.get("https://www.demoblaze.com/index.html");
        driver.manage().window().maximize();
        

        WebElement logIn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Log in']")));
        logIn.click();
        WebElement userNameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='loginusername']")));
        userNameField.sendKeys("srikar@gmail.com");
        WebElement userPasswordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='loginpassword']")));
        userPasswordField.sendKeys("Password1234");
        WebElement toLogIn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Log in'] ")));
        toLogIn.click();
        

        WebElement logOutButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Log out']")));
        
 
        WebElement productImage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@class='card-img-top img-fluid']")));
        productImage.click();
        
        WebElement addToCart = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn btn-success btn-lg']")));
        addToCart.click();
        

        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
        
 
        WebElement toCart = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='cartur']")));
        toCart.click();
        

        WebElement placeOrder = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-success']")));
        placeOrder.click();
        

        WebElement nameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='name']")));
        nameField.sendKeys("Mohammed Srikar Laieeq");
        WebElement countryField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='country']")));
        countryField.sendKeys("Pakistan");
        WebElement cityField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='city']")));
        cityField.sendKeys("Karachi");
        WebElement cardField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='card']")));
        cardField.sendKeys("9869042098690505");
        WebElement monthField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='month']")));
        monthField.sendKeys("October");
        WebElement yearField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='year']")));
        yearField.sendKeys("2024");
        
        WebElement purchaseButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Purchase']")));
        purchaseButton.click();
        

//        WebElement confirmButton = waitForConfirm.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='confirm btn btn-lg btn-primary']")));
//        confirmButton.click();
        
//        driver.quit();
    }
}
