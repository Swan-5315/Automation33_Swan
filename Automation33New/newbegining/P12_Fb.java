package newbegining;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class P12_Fb {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver db = new ChromeDriver();
		db.get("https://www.facebook.com/");
		Thread.sleep(4000);
		db.manage().window().maximize();
		db.findElement(By.id("email")).sendKeys("nniuiuiuiioo");
		db.findElement(By.id("pass")).sendKeys("nuiuhieoilepopo");
		db.findElement(By.name("login")).click();
	    //db.close();		
	}

}
