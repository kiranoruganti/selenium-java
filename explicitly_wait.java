package javaseleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitly_wait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./resources/chromedriver.exe");
		// Start browser
		WebDriver driver = new ChromeDriver();

		// Start application
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");

		// Click on timer button to start
		WebElement e1= driver.findElement(By.xpath("//*[@id=\"post-body-7708391096228750161\"]/button"));
		e1.click();

		// Create object of WebDriverWait class and it will wait max of 20 seconds.
		// By default it will accepts in Seconds
		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("errorelement")));
		// Here we will wait until element is not visible, if element is visible then it will return web element
		// or else it will throw exception
		WebElement element = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));

		// if element found then we will use- In this example I just called isDisplayed method
		boolean status = element.isDisplayed();

		// if else condition
		if (status) {
			System.out.println("===== WebDriver is visible======");
		} else {
			System.out.println("===== WebDriver is not visible======");
		}

	}

}
 

