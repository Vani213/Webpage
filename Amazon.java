package assignment4;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
		driver.findElementById("twotabsearchtextbox").sendKeys("Redmi mobiles",Keys.ENTER);
		JavascriptExecutor Executor= (JavascriptExecutor)driver; 
		List<WebElement> aa=driver.findElementsByTagName("h2"); 
		System.out.println("total no of value" +aa.size());
		for(WebElement product:aa)
		{
			System.out.println(product.getText());
		}
		List<WebElement> bb=driver.findElementsByXPath("//span[@class='a-price-whole']");
		System.out.println("total no of value" +bb.size());
		for(WebElement product:bb)
		{
			System.out.println(product.getText());
		}
		driver.findElementByXPath("//span[@class='a-button-text a-declarative']").click();
		WebElement add = driver.findElementByLinkText("Price: High to Low");   
		Executor.executeScript("arguments[0].click();", add);
		List<WebElement> dd=driver.findElementsByXPath("//span[@class='a-size-medium a-color-base a-text-normal']");
		for (WebElement product : dd)
		{
			System.out.println(product.getText());
			
		}
		driver.close();
	}

	}


