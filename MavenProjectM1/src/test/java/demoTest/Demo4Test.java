package demoTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Demo4Test {
	@Test
	public void case4() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "./resources/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		System.out.println("Demo4Test");
		Thread.sleep(10000);
		driver.quit();
	}
}
