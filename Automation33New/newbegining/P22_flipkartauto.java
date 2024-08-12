package newbegining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P22_flipkartauto {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		//WebElement crossout = driver.findElement(By.xpath("//span[.='✕']"));
		//crossout.click();
		WebElement searchbox = driver.findElement(By.xpath("//input[@name='q']"));
		searchbox.sendKeys("Oneplus");
		Thread.sleep(4000);
		List<WebElement> auto = driver.findElements(By.xpath("//div[@class='_3NorZ0 _3jeYYh']/form/ul/li"));
		int a = auto.size();
		System.out.println(a);
		auto.get(a-7).click();
		
	}

}
