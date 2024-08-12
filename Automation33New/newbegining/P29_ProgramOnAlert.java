package newbegining;

import org.openqa.selenium.chrome.ChromeDriver;

public class P29_ProgramOnAlert {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/91859/Documents/learningHTML1.html");
		driver.switchTo().alert().accept();
		
		driver.manage().window().maximize();
		//Thread.sleep(4000);
	}

}
