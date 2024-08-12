package newbegining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P31_DoubleclickProg {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement dbclk =driver.findElement(By.linkText("Gmail"));
		
		Actions a = new Actions(driver);
		a.doubleClick(dbclk).perform();
	}

}
