package TaskCheckConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class main06 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement singIn = driver.findElement(By.className("user_login"));
        singIn.click() ;

        WebElement email = driver.findElement(By.className("is_required"));
        email.sendKeys("coderslabisth@o2.pl");
        WebElement create = driver.findElement(By.name("SubmitCreate"));
        create.click();



    }

}