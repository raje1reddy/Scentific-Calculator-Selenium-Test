import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class PadmajaSeleniumTest1 {
    public static void main(String[] args){
        //System.setProperty("webdriver.gecko.driver","C:\\Program Files\\geckodriver-v0.24.0-win64\\geckodriver.exe");
       // System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
        //WebDriver driver=new FirefoxDriver();
        WebDriver driver=new ChromeDriver();
        driver.get("http://demo.guru99.com/");
        WebElement element=driver.findElement(By.xpath("//input[@name='emailid']"));
        element.sendKeys("abc@gmail.com");
        driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
       // WebElement button=driver.findElement(By.xpath("//input[@name='btnLogin']"));
       // button.click();
        //driver.findElement(By.xpath("//input[@name='emailid']"))
        //input[@name='emailid']
        ///Access details to demo site.
        //User ID :	mngr26593
        //Password :	abc@123
    }
}