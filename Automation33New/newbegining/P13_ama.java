package newbegining;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P13_ama {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver tt = new ChromeDriver();
		tt.get("https://www.amazon.in/");
		Thread.sleep(4000);
		tt.manage().window().maximize();
		//tt.findElement(By.linkText("Mobiles")).click();
		WebElement drpdown=tt.findElement(By.id("searchDropdownBox"));
		drpdown.click();
		Select s = new Select(drpdown);
		//s.selectByIndex(5);
		//s.selectByValue("search-alias=nowstore");
		s.selectByVisibleText("Amazon Fresh");
		tt.findElement(By.id("nav-search-submit-button")).sendKeys(Keys.ENTER);
		
		
	}

}
