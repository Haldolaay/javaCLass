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
                       class Lamp{
      public String color;
      public String state;
      public Lamp(String color, String state){
             setColor(color);
             setState(state);
      }
      public void setColor(String color){this.color = color;}
      public void setState(String state){this.state = state;}
      public String getColor(){return this.color;}
      public String getState(){return this.state;}
      public static void main(String[] args){
                    Lamp obj = new Lamp("red","on");
      }
}
