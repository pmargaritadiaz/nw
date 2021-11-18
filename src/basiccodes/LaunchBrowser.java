package basiccodes;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	//Set path for Chrome Driver .exe file
	
	public void demo ()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mxpjuarez\\Documents\\SDET\\Tools\\chromedriver_win32\\chromedriver.exe");
		
		//Initialize Chrome Driver
		WebDriver driver= new ChromeDriver();
		
				
		//Launch Application in Browser Window
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		 
	
	}
	
	
	

	
}
