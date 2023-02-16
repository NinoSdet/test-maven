import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WarmUp {

    @Test
    public void warmUp() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://www.instagram.com/");
        Thread.sleep(500);
        driver.findElement(By.name("username")).sendKeys(new Faker().name().username());
       // driver.findElement(By.name ("username")).sendKeys("minnie.mouse");
        Thread.sleep(500);
        driver.findElement(By.name("password")).sendKeys(new Faker().internet().password(), Keys.ENTER);
      //  driver.findElement(By.name ("password")).sendKeys("minnie");
        Thread.sleep(500);
        Assert.assertEquals(driver.findElement(By.id("slfErrorAlert")).getText(), "Sorry, your password was incorrect. Please double-check your password.");

        driver.quit();


    }
}
