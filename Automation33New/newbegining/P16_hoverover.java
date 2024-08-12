package newbegining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P16_hoverover {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		//WebElement hover = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		WebElement hover = driver.findElement(By.xpath("//a[@id='nav-link-amazonprime']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(hover).perform();
		//WebElement signin = driver.findElement(By.xpath("//span[.='Sign in']"));
		Thread.sleep(4000);
		WebElement joinprime = driver.findElement(By.xpath("//img[@id='multiasins-img-link']"));
		//signin.click();
		joinprime.click();	}

}
