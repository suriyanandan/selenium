package launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class url {
	
	public static void main(String[] args) throws Exception {
		
     System.setProperty("webdriver.chrome.driver","C:\\Users\\Suriyanandan\\eclipse\\java-2019-12\\eclipse\\New folder\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver flipkart=new ChromeDriver();
		
		flipkart.navigate().to("https://www.flipkart.com/");
		
		flipkart.manage().window().maximize();
		
		Thread.sleep(5000);
		
		WebElement user = flipkart.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ'][1]"));
		
		user.sendKeys("suriyanandan@gmail.com");
		
		WebElement pass = flipkart.findElement(By.xpath("//input[@type='password']"));
		
		pass.sendKeys("Suriya90$");
		
		WebElement login = flipkart.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']"));
		
		login.click();			
		
		Thread.sleep(5000);
		
		WebElement logout = flipkart.findElement(By.xpath("(//div[text()='Suriyanandan'])"));
						
		Actions mouse=new Actions(flipkart);
				
	   mouse.moveToElement(logout).perform();
		
		logout.click();
		
		
	}
	
	

}
