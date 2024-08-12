package newbegining;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P18_Autoamazon {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("Shoes");
		Thread.sleep(3000);
		List<WebElement> auto1 = driver.findElements(By.xpath("//div[@id='nav-flyout-searchAjax']/div/div/div/div"));
		int cunt= auto1.size();
		System.out.println(cunt);
		auto1.get(cunt-9).click();
		WebElement firstshoe = driver.findElement(By.xpath("//a[@class='a-link-normal s-no-outline'][1]"));
		firstshoe.click();
		Set<String> pid = driver.getWindowHandles();
		Iterator<String> pc = pid.iterator();
		String parent = pc.next();//parent id of browser
		System.out.println(parent);
		String c1 = pc.next();//child id
		System.out.println(c1);
		driver.switchTo().window(c1);//control move to child
		Thread.sleep(4000);
		driver.quit();
		
	}

}
