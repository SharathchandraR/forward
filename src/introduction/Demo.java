package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharath\\Desktop\\hygt\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/maps/@12.9548733,77.5734042,15z");
		driver.findElement(By.id("searchboxinput")).sendKeys("goa");
		driver.findElement(By.id("searchbox-searchbutton")).click();
		driver.findElement(By.xpath("//button[@jstcache='709']")).click();
	}

}
