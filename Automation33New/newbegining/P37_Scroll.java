package newbegining;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P37_Scroll {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement amazonsciencelink = driver.findElement(By.linkText("Amazon Science"));
		Point dd= amazonsciencelink.getLocation();
		int y = dd.getY();
		JavascriptExecutor jse = driver;
	    jse.executeScript("window.scrollBy(0,"+y+")");//
		Thread.sleep(2000);
		
		//jse.executeScript("window.scrollBy(0,-1200)");//scrollup back to same place
		
	}

}
