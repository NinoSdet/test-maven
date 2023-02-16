import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver(); //EdgeDriver
        driver.get("https://www.google.com/");
    }
}
