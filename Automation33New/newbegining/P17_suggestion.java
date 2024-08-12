package newbegining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P17_suggestion {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement imageslintext= driver.findElement(By.linkText("Images"));
		imageslintext.click();
		WebElement searchbox = driver.findElement(By.id("APjFqb"));
		searchbox.sendKeys("INDIA");
		Thread.sleep(4000);
		List<WebElement> auto = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int cntofauto = auto.size();
		System.out.println(cntofauto);
		auto.get(cntofauto-1).click();
		}
	    
}
