import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.junit.Test;

public class GettingStarted {
  //google chrome small test 
  public void testGoogleSearch() throws InterruptedException {
    // Optional. If not specified, WebDriver searches the PATH for chromedriver.
    System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

    WebDriver driver = new ChromeDriver();
    driver.get("http://www.google.com/");
    Thread.sleep(1000);  // Let the user actually see something!
    driver.findElement(By.class("gLFyf")).sendKeys("top ten songs 2019");
    driver.findElement(By.id("gNO89b").click();
    Thread.sleep(5000);  // Let the user actually see something!
    driver.quit();
  }
}