package TaskCheckConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class main04 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement hotel_location = driver.findElement(By.id("hotel_location"));
        hotel_location.clear();
        hotel_location.sendKeys("Warsaw");
        WebElement button = driver.findElement(By.id("search_room_submit"));
        WebElement newsletter = driver.findElement(By.id("newsletter-input"));
        newsletter.clear();
        newsletter.sendKeys("test@test.com");

    }

}