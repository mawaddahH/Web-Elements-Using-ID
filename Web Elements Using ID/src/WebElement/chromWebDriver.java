package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class chromWebDriver {
	
	public WebDriver driver;

  @Test
  public void chrom() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\lo0ol\\"
		  		+ "Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
				  driver = new ChromeDriver();
				  
				  // Navigate to a website
				  driver.navigate().to("https://www.codingdojo.com/");
				  
				  //Mazimize current window
				  driver.manage().window().maximize();
				  
				  //to scroll down on a web page
				  JavascriptExecutor js = (JavascriptExecutor) driver;
				  
				  //define the web element to find it
				  WebElement IdMethod = driver.findElement(By.id("alumni_employer_section"));
				  
				  //scroll horizontally on a web page to a specific web element using Selenium
				  js.executeScript("arguments[0].scrollIntoView();", IdMethod);
				  
				  //Delay execution for 5 seconds after find specific web element
				  Thread.sleep(5000);

				  //Close the browser
				  driver.quit();
  }
}
