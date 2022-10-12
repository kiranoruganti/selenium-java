package javaseleniumpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class launchbrowser
{
	public static void main(String args[])
	
	{
		System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "./resources/msedgedriver.exe");
		
		WebDriver driver=new ChromeDriver();//just opens the chrome wont open any webpage until we specify
		
		driver.get("https://www.google.com");// google.com ane site ni chrome lo open chestadi		driver.get("https://www.github.com");// google open ainanka aadhi close ayyi github open ithadi
		driver.get("https://www.instagram.com/kiran_oruganti_/");
		WebDriver driver1= new EdgeDriver();
//		driver1.get("https://www.instagram.com");
		
		
		
		
		
		
		
		//browser open aithadi kani webpage open kadhu
		
			/*Selenium WebDriver instance  is a web framework that permits
			*  you to execute cross-browser tests*/
				
			//driver object lo ChromeDriver instance store aithadi
				
		
		
		/*ippudu kuda error  osthadi google open kadhu ndukante selenium dhani sontanga
		 * browser ni open cheyaledhu madyala oka translator kavali dhaniki
		 * aa translator ne DRIVER EXECUTABLE ani antaru idhi m chestadi ante 
		 * selenium lo rashna code or commands ni ardam cheskoni
		 *  browser ki ardam ayyye language la cheptadi atlane broswer cheppina commands
		 *  ni selenium ki ardam ayyela cheptadi so DRIVER EXECUTABLE download cheskovali
		 *  chrome ki chromeDriver ani untadhi
		 * 
		 */
		
	
	}

}
