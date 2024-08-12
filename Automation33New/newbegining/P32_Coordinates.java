package newbegining;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P32_Coordinates {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement dd = driver.findElement(By.linkText("Amazon Science"));
		Point xa = dd.getLocation();
		int x = xa.getX();
		int y = xa.getY();
		System.out.println(x);
		System.out.println(y);
		Actions a1 = new Actions(driver);
		a1.moveByOffset(x, y).click().perform();
	}

}
