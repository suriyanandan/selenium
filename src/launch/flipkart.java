package launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Suriyanandan\\eclipse\\java-2019-12\\eclipse\\New folder\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver flip=new ChromeDriver();
		
        flip.navigate().to("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
        
        flip.findElement(By.id("identifierId")).sendKeys("suriyanandanmohan@gmail.com");
        
        flip.findElement(By.xpath("//span[text()='Next']")).click();
        
        Thread.sleep(5000);
	
        flip.navigate().back();
        
        flip.navigate().forward();
        
        Thread.sleep(3000);
        
        flip.findElement(By.xpath("whsOnd zHQkBf")).sendKeys("9043676250");
	}
	

}
