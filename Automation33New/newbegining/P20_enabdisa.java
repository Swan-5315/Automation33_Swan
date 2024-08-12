package newbegining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P20_enabdisa {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/91859/Documents/learningHTML1.html");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		//WebElement lstn=driver.findElement(By.id("121"));
		WebElement fstname = driver.findElement(By.id("1"));
		boolean b1 = fstname.isDisplayed();
		System.out.println(b1);
		boolean b2 = fstname.isEnabled();
		System.out.println(b2);
		if(b1 & true)
		{
			if(b2 & true)
			{
				fstname.sendKeys("sardar");
			}
		}

	}

}
