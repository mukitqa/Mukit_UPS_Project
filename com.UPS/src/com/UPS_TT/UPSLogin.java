package com.UPS_TT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UPSLogin {

	public static WebDriver driver;

	public static void main(String[] args) {
		driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver.get("https://www.ups.com/lasso/login?");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//driver.findElement(By.partialLinkText("Sign up")).click();
		//WebElement signUP=driver.findElement(By.partialLinkText("Sign up"));
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		String title=driver.getTitle();
		System.out.println(title);
		
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		WebElement cokies=driver.findElement(By.xpath("//*[@id=\"__tealiumImplicitmodal\"]/div"));
		
		WebElement userID=driver.findElement(By.name("userID"));
		WebElement passWD=driver.findElement(By.id("pwd"));
		//WebElement checked=driver.findElement(By.className("ups-form_label ups-checkbox-custom-label"));
        WebElement logIN=driver.findElement(By.name("getTokenWithPassword"));
        
        
        
        userID.clear();
        userID.sendKeys("mohmukit@gmail.com");
        passWD.clear();
        passWD.sendKeys("Shamollik12#");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        cokies.click();
        logIN.click();
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        driver.close();
        
      //  checked.clear();
      //  checked.click();
        
        
        
        
	}

}
