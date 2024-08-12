package newbegining;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P34_Links {

	public static void main(String[] args) throws IOException {
		ChromeDriver gg = new ChromeDriver();
		gg.get("https://www.google.com/");
		gg.manage().window().maximize();
		gg.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> link = gg.findElements(By.tagName("a"));
		int countoflink = link.size();
		System.out.println(countoflink);
		for(int i=0;i < countoflink; i++ )
		{
			WebElement a = link.get(i);
			String u1 = a.getAttribute("href");
			System.out.println(u1);
			createconnectiontofindopenlinks(u1);
		}
	}
	static void createconnectiontofindopenlinks(String u1) throws IOException
	{
		URL url1 = new URL(u1);
		HttpURLConnection a1= (HttpURLConnection)url1.openConnection();
		a1.connect();
		System.out.println(a1.getResponseCode());
		if(a1.getResponseCode()==200)
		{
			System.out.println(u1+"Link is valid");
		}
		else
		{
			System.out.println(u1+"Link is not valid");
		
		}
		
	}

}
