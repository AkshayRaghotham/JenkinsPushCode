package AkshayAutomationCasesProject.jenkinspush;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JenkinsAutomation {
	
	@Test
	public void verifyCheckBox()
	{
		System.setProperty("webdriver.chrome.diver", "D://chromedriver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		
	}

}
