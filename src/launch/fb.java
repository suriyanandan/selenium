package launch;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fb {
	
	public static void main(String[] args) throws Exception {
		
     System.setProperty("webdriver.chrome.driver","C:\\Users\\Suriyanandan\\eclipse\\java-2019-12\\eclipse\\New folder\\Selenium\\Driver\\chromedriver.exe");
		
	WebDriver fb=new ChromeDriver();
	
	JavascriptExecutor js=(JavascriptExecutor)fb;
	
	fb.navigate().to("https://www.facebook.com");
	
	fb.manage().window().maximize();
	
	WebElement first = fb.findElement(By.id("u_0_m"));
	
	first.sendKeys("suriya");
	
	WebElement last = fb.findElement(By.id("u_0_o"));
	
	last.sendKeys("mohan");
	
	js.executeScript("arguments[0].setAttribute('value','mohan')",last);
	
	WebElement mob = fb.findElement(By.id("u_0_r"));
	
	mob.sendKeys("9043676250");
	
	WebElement pass = fb.findElement(By.id("u_0_w"));
	
	pass.sendKeys("Suriya90$");
	
	Thread.sleep(5000);
	
	WebElement date = fb.findElement(By.id("day"));
	
	
	
	Select a =new Select(date);
	
	a.selectByValue("14");
	
	Thread.sleep(3000);
	WebElement mon = fb.findElement(By.id("month"));

    Select b=new Select(mon);
	
	b.selectByIndex(6);
	
	Thread.sleep(3000);
	WebElement ye = fb.findElement(By.id("year"));

    Select c=new Select(ye);
	
	c.selectByVisibleText("1990");
	
	WebElement gen = fb.findElement(By.id("u_0_6"));
	
	gen.click();
	
	WebElement sign = fb.findElement(By.id("u_0_13"));
	
	sign.click();
	
	
	
	
	}
}