package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchedBrowser {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
		driver =new ChromeDriver();
		driver=new EdgeDriver();
		
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
