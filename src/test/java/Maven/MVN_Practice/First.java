package Maven.MVN_Practice;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class First {

	@Test
	public void sampleProject(){
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver =  new ChromeDriver(options);		
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		WebDriverWait wait = new WebDriverWait(driver, 30);
//		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id(""))));
//		
		
		Actions act = new Actions(driver);
		act.contextClick();
		act.moveToElement(null).build().perform();
		
		String name =driver.getWindowHandle();
		System.out.println(name);
		
		Assert.assertEquals("", "");
		Assert.assertTrue(true);
		Assert.assertFalse(false);
		
		Select s = new Select(driver.findElement(By.id("")));
		s.selectByValue(name);
		s.selectByIndex(0);
		s.selectByVisibleText("");

	driver.switchTo().alert().accept();
	driver.switchTo().alert().dismiss();
	
	driver.switchTo().frame(0);
	
	
		
		}

}
