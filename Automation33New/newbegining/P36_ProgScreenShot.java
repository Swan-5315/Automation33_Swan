package newbegining;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class P36_ProgScreenShot {

	public static void main(String[] args) throws IOException {
		ChromeDriver gg = new ChromeDriver();
		gg.get("https://www.google.com/");
		gg.manage().window().maximize();
		TakesScreenshot rr = gg;
		File source = rr.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\91859\\Documents\\Screenshot\\Dms.png");
		FileUtils.copyFile(source, destination);
	}

}
