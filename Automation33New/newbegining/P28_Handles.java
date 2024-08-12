package newbegining;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P28_Handles {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand_Login_Register&gad_source=1&gclid=Cj0KCQjw-5y1BhC-ARIsAAM_oKnX5cHS5VAbE0kh03OxPOeuhBMtF8MsLYqtw7SKT-dAvRnae0tOqwkaArPVEALw_wcB&gclsrc=aw.ds");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement ggle = driver.findElement(By.xpath("//span[.='Google']"));
		ggle.click();
		String pid = driver.getWindowHandle();
		Set<String> pidcid = driver.getWindowHandles();
		System.out.println(pid);
		System.out.println(pidcid);
		Iterator<String> p1 = pidcid.iterator();
		String parentid = p1.next();
		System.out.println(parentid);
		String childid = p1.next();
		System.out.println(childid);
		Thread.sleep(3000);
		WebElement uid = driver.findElement(By.id("identifierId"));
		uid.sendKeys("nkiunoiho");
		//driver.switchTo().window(childid);//control to child
		//driver.close();
	}

}
