package newbegining;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P33_RightClick {

	public static void main(String[] args) throws AWTException, InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co");
		driver.manage().window().maximize();
		WebElement ff = driver.findElement(By.linkText("Gmail"));
		Actions a2 = new Actions(driver);
		a2.contextClick(ff).perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(4000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(4000);
		r.keyPress(KeyEvent.VK_ENTER);
	}

}
