package newbegining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P15_Paths {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/91859/Documents/learningHTML1.html");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		//WebElement lastname = driver.findElement(By.xpath("(//input)[4]"));
		WebElement lastname = driver.findElement(By.xpath("//input[@name='fname']"));
		lastname.sendKeys("sardar");
	}

}
