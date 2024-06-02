package Task19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.guvi.in/register");

        //id
        driver.findElement(By.id("email")).sendKeys("yaminiraghavan1998@gamil.com");

        //classname
        driver.findElement(By.className("form-control")).sendKeys("Yamini241098$");

        //tagname
        WebElement tagname= driver.findElement(By.tagName("input"));
        tagname.click();

        //cssselector
        WebElement css =driver.findElement(By.cssSelector("#terms"));
        css.click();

        //xpath
        driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Yamini");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("yamini");
        driver.findElement(By.xpath("//input[contains(@name, 'pass')]")).sendKeys("mini2410");
        driver.findElement(By.xpath("//button[text()='Register'] ")).sendKeys("mini2410");
        driver.findElement(By.xpath("//button[1] ")).sendKeys("mini2410");
        driver.findElement(By.xpath("//input[@type='password' and @id='confirmPassword'] ")).sendKeys("yamini$");




        
    }
}
