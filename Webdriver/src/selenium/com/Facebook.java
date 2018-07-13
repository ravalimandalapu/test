package selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			WebDriver driver;
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\nCodeIt\\chromedriver_win32\\chromedriver.exe");
			WebDriver d=new ChromeDriver();
			d.get("http://facebook.com");
			d.findElement(By.name("firstname")).sendKeys("sai");
			d.findElement(By.name("lastname")).sendKeys("m");
			d.findElement(By.name("reg_email__")).sendKeys("9606237957");
			d.findElement(By.name("reg_passwd__")).sendKeys("apr191996");
			d.findElement(By.id("day")).sendKeys("7");
			d.findElement(By.id("month")).sendKeys("Apr");
			d.findElement(By.id("year")).sendKeys("1999");
			d.findElement(By.name("sex")).click();
			d.findElement(By.id("u_0_11")).click();
			d.get("http://magnus2.jalatechnologies.com");
			//d.findElement(By.className(glyphicon glyphicon-user)).click();
		
			
			
			
		}catch(Exception e)
		{
			System.err.println(e);
		}

	}

}
