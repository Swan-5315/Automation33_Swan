package newbegining;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class P14_gmail {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver gg = new ChromeDriver();
		gg.get("https://www.google.com/");
		Thread.sleep(4000);
		gg.findElement(By.linkText("Images")).click();//can also use sendKeys(Keys.ENTER);
		gg.findElement(By.id("APjFqb")).sendKeys("INDIA");
		gg.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
	
		
		
	}

}
