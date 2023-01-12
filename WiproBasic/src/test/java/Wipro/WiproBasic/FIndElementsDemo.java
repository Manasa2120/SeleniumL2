package Wipro.WiproBasic;

import java.sql.Driver;
import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FIndElementsDemo {

	public static void main(String[]args) {
		
		
		System.setProperty("webdrier.edge.driver",System.getProperty("user.dir")+"/WiproBasic/Driver/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.name("q")).sendKeys("wipro");
		
	ArrayList<WebElement> list=new ArrayList(	driver.findElements(By.xpath("//a")));
	//print links
	for (WebElement webElement1 : list) {
		System.out.println(webElement1.getAttribute("href"));
		//print colur of link
		System.out.println(webElement1.getCssValue("color"));
	}
	
	
	
	System.out.println("Total links available on webPage"+list.size());
	
	ArrayList<WebElement> Three=new ArrayList( driver.findElements(By.xpath("//ul[@class='G43f7e']//li[position()<4]")));
	System.out.println("Size of elements:"+Three.size());
	
	for(WebElement element:Three) {
		System.out.println(element.getText());
	}
	driver.close();
	}
	
}

