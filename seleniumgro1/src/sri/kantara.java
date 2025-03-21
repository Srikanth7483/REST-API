package sri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class kantara {

	public static void main(String[] args)  throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		  WebDriver driver =new ChromeDriver();
		  driver.get("https://www.youtube.com/");
		  driver.findElement(By.xpath("//input[@id='search']")).sendKeys("kantara trailer");
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("//div[@id='video-title']")).click();
	}
}

  