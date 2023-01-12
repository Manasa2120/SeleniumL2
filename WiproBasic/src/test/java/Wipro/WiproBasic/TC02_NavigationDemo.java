package Wipro.WiproBasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TC02_NavigationDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdrier.edge.driver",System.getProperty("user.dir")+"/WiproBasic/Driver/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.name("q")).sendKeys("wipro");
		driver.findElement(By.name("q")).sendKeys(Keys.TAB);
		driver.findElement(By.name("q")).sendKeys(Keys.TAB);
		driver.findElement(By.name("q")).sendKeys(Keys.TAB);
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.quit();
		
	}

}
