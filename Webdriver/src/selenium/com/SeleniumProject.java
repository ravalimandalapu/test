package selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumProject {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			WebDriver driver;
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\nCodeIt\\chromedriver_win32\\chromedriver.exe");
			
	        WebDriver d=new ChromeDriver();
	        
	        d.get("http://www.facebook.com");
	        d.findElement(By.name("email")).sendKeys("ravalimandalapu849@gmail.com");
	        d.findElement(By.name("pass")).sendKeys("9705406388");
	        d.findElement(By.id("u_0_3")).click();
	    }
	        catch(Exception e)
	        {
	            System.out.println(e);
	        }


	}

}
