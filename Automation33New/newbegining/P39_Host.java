package newbegining;

import java.net.MalformedURLException;
import java.net.URL;

public class P39_Host {

	public static void main(String[] args) throws MalformedURLException {

		URL u1 = new URL("https://www.flipkart.com/flipkart-flag-ship-sale-store");
		System.out.println(u1.getHost());
		System.out.println(u1.getPort());
		System.out.println(u1.getProtocol());
		System.out.println(u1.getFile());
	}

}
