package newbegining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P35_Drpdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement drp = driver.findElement(By.id("searchDropdownBox"));
		Select s = new Select(drp);
		List<WebElement> opt = s.getOptions();
		int countofopt = opt.size();
		System.out.println(countofopt);
		for(int i=0;i < countofopt; i++ )
		{
			WebElement a = opt.get(i);
			String url = a.getAttribute("value");
			System.out.println(url);
		}
	}

}
