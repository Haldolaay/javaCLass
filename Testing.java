import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;



public class Testing {

  
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "location");
 
     WebDriver driver = new ChromeDriver();
    try{
       
    driver.get("url");
    Thread.sleep(1000);  // Let the user actually see something!
   driver.findElement(By.id("name")).sendKeys("hamzah");
    Thread.sleep(1000);  // Let the user actually see something!
   driver.findElement(By.id("age")).sendKeys("30");
   Thread.sleep(1000);
   driver.findElement(By.id("submit")).click();
    Thread.sleep(5000);  // Let the user actually see something!
    }catch(InterruptedException e){
    System.out.println(e);
    }finally{
    driver.quit();
    }
    }
    
}
