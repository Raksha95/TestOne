package Alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	private static Logger log = LogManager.getLogger(Demo.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://drivers//chromedriver6.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		log.debug("I enter url");

		driver.findElement(By.id("email")).sendKeys("shivaprasad");

		log.info("Text field id displayed");

		driver.findElement(By.id("pass")).sendKeys("12345");

		log.error("button is displayed");

		log.fatal("button is missing");

	}

}
