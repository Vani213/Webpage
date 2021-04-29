package assignment4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykka {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.nykaa.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		JavascriptExecutor Executor= (JavascriptExecutor)driver; 
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@name='search-suggestions-nykaa']").sendKeys("Perfumes");
		driver.findElement(By.name("search-suggestions-nykaa")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement> Vs=driver.findElementsByTagName("h2");
		System.out.println("total no of value"+ Vs.size());
		for (WebElement product : Vs)
		{
			System.out.println(product.getText());
		}
		List<WebElement> CC=driver.findElementsByXPath("//span[@class='post-card__content-price-offer']");
		System.out.println("total no of value"+ CC.size());
		for (WebElement product : CC)
		{
			System.out.println(product.getText());
		}
		driver.findElementByXPath("//img[@class='listing-img']").click();
//		Thread.sleep(2000);
		WebElement add=driver.findElementByXPath("//button[text()='ADD TO BAG']");
		Executor.executeScript("arguments[0].click();",add);
		System.out.println("Item added to Cart");
//		Thread.sleep(5000);
		driver.findElementById("SearchInputBox").sendKeys("Sunglasses", Keys.ENTER); 
		WebElement addgls = driver.findElementByXPath("//button[text()='ADD TO BAG']");    
		Executor.executeScript("arguments[0].click();", addgls);
		WebElement addbag = driver.findElementByClassName("BagItems");       
		Executor.executeScript("arguments[0].click();", addbag); 
		List<WebElement> VV=driver.findElementsByXPath("//div[@class='value medium-strong']");
				for (WebElement product : VV)
		{
			System.out.println(product.getText());
			
		}
				driver.close();				
	}
	}
