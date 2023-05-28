package TaskCheckConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class main07 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        driver.findElement(By.className("user_login")).click();
        driver.findElement(By.className("account_input")).sendKeys("coderslabisth@o2.pl");
        driver.findElement(By.id("SubmitCreate")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("marcin");
        driver.findElement(By.xpath("//input[@name='customer_lastname']")).sendKeys("oz");
        driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("secretpass");
        driver.findElement(By.xpath("//button[@id='submitAccount']")).click();
    }
}