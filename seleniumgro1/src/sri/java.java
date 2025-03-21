package sri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
		
public class java {

	public static void main(String[] args)throws InterruptedException {
             System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
            WebDriver driver=new ChromeDriver();
           driver.get("https://demoapps.qspiders.com/ui?scenario=1");
           Thread.sleep(7000);
           driver.findElement(By.id("name")).sendKeys("admin");
           driver.get("https://demoapps.qspiders.com/ui/button");
           Thread.sleep(7000);
           driver.findElement(By.id("btn")).click();
           driver.get("https://demoapps.qspiders.com/ui/link?sublist=0");
           Thread.sleep(7000);
           driver.get("https://demoapps.qspiders.com/ui/radio?sublist=0");
           Thread.sleep(7000);
           driver.findElement(By.id("attended")).click();
           Thread.sleep(7000);
           driver.get("https://demoapps.qspiders.com/ui/checkbox?sublist=0");
           Thread.sleep(7000); 
           driver.findElement(By.id("domain1")).click();
           driver.quit();
           
           
           

           
	}
}


