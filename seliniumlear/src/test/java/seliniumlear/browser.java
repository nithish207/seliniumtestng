package seliniumlear;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browser {
	public static WebDriver driver;
 public static void main(String[] args) {
	 WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://frontdesk.corp.ojas-it.com/");
}

}
