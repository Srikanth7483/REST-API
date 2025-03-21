package sri;

import java.nio.file.DirectoryIteratorException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java2 {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("0624sreekanthc@gmail.com");
		Thread.sleep(7000);
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("Sree@1203");
		Thread.sleep(7000);
         driver.findElement(By.cssSelector("button[name='login']")).click();
	}

}
