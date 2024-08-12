package newbegining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class P30_Browser {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
	}

}
