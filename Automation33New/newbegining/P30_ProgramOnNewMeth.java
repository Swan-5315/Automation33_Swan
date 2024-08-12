package newbegining;

import org.openqa.selenium.chrome.ChromeDriver;

public class P30_ProgramOnNewMeth {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(4000);
		driver.navigate().refresh();
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();
	}

}
